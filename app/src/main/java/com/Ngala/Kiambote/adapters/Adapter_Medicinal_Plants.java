package com.Ngala.Kiambote.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Ngala.Kiambote.R;
import com.Ngala.Kiambote.models.Model_MedicinalPlants;
import com.Ngala.Kiambote.receive_data.Receive_Data_Medicinal_Plants;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Medicinal_Plants extends RecyclerView.Adapter<Adapter_Medicinal_Plants.Holder_Medicinal_Plants> {

    private final Context context;
    private final List<Model_MedicinalPlants> model_medicinal_plantsList;
    private final ArrayList<Model_MedicinalPlants>  arrayList;

    public Adapter_Medicinal_Plants(Context context, List<Model_MedicinalPlants> model_medicinal_plantsList) {
        this.context = context;
        this.model_medicinal_plantsList = model_medicinal_plantsList;
        this.arrayList = new ArrayList<>();
        this.arrayList.addAll(model_medicinal_plantsList);
    }

    @NonNull
    @Override
    public Holder_Medicinal_Plants onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.structure_plants_medical, null);
        return new Holder_Medicinal_Plants(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder_Medicinal_Plants holder, int pos) {

        Glide.with(context).load(model_medicinal_plantsList.get(pos).getImage()).into(holder.holder_image);
        holder.holder_name.setText(model_medicinal_plantsList.get(pos).getName());
        holder.holder_common_name.setText(model_medicinal_plantsList.get(pos).getCommon_name());
        holder.holder_geographical_localization.setText(model_medicinal_plantsList.get(pos).getGeographical_location());
        holder.holder_habitat.setText(model_medicinal_plantsList.get(pos).getHabitat());
        holder.holder_species_description.setText(model_medicinal_plantsList.get(pos).getSpecies_description());
        holder.holder_use.setText(model_medicinal_plantsList.get(pos).getUtility());
        holder.holder_parts_used.setText(model_medicinal_plantsList.get(pos).getParts_used());

        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        holder.setItemClickListener(new ItemClick_Medicinal_Plants() {
            @Override
            public void onMedicinalPlantsClick(View view, int pos) {
                String name_plants_medical = model_medicinal_plantsList.get(pos).getName();
                String common_name_plants_medical = model_medicinal_plantsList.get(pos).getCommon_name();
                String geographical_location_plants_medical = model_medicinal_plantsList.get(pos).getGeographical_location();
                String habitat_plants_medical = model_medicinal_plantsList.get(pos).getHabitat();
                String specie_description_plants_medical = model_medicinal_plantsList.get(pos).getSpecies_description();
                String use_plants_medical = model_medicinal_plantsList.get(pos).getUtility();
                String part_use_plants_medical = model_medicinal_plantsList.get(pos).getParts_used();

                Intent intent = new Intent(context, Receive_Data_Medicinal_Plants.class);
                intent.putExtra("image", model_medicinal_plantsList.get(pos).getImage());
                intent.putExtra("name", name_plants_medical);
                intent.putExtra("common_name", common_name_plants_medical);
                intent.putExtra("geographical_location", geographical_location_plants_medical);
                intent.putExtra("habitat", habitat_plants_medical);
                intent.putExtra("specie_description", specie_description_plants_medical);
                intent.putExtra("use", use_plants_medical);
                intent.putExtra("part_used", part_use_plants_medical);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return model_medicinal_plantsList.size();
    }

    public class Holder_Medicinal_Plants extends RecyclerView.ViewHolder implements View.OnClickListener {

        final ImageView holder_image;
        final TextView holder_name;
        final TextView holder_common_name;
        final TextView holder_geographical_localization;
        final TextView holder_habitat;
        final TextView holder_species_description;
        final TextView holder_use;
        final TextView holder_parts_used;

        ItemClick_Medicinal_Plants itemClickListener;

        Holder_Medicinal_Plants(@NonNull View itemView) {
            super(itemView);

            this.holder_image = itemView.findViewById(R.id.structure_plants_image);
            this.holder_name = itemView.findViewById(R.id.structure_plants_name);
            this.holder_common_name = itemView.findViewById(R.id.structure_plants_common_name);
            this.holder_geographical_localization = itemView.findViewById(R.id.structure_plants_geographical_location);
            this.holder_habitat = itemView.findViewById(R.id.structure_plants_habitat);
            this.holder_species_description = itemView.findViewById(R.id.structure_plants_species_description);
            this.holder_use = itemView.findViewById(R.id.structure_plants_use);
            this.holder_parts_used = itemView.findViewById(R.id.structure_plants_parts_used);

            itemView.setOnClickListener(this);
        }

        void setItemClickListener(ItemClick_Medicinal_Plants itemClickMedicinalPlants) {
            this.itemClickListener = itemClickMedicinalPlants;
        }

        @Override
        public void onClick(View view) {
            this.itemClickListener.onMedicinalPlantsClick(view, getLayoutPosition());
        }
    }

    interface ItemClick_Medicinal_Plants {
        void onMedicinalPlantsClick(View view, int position);
    }

    public void filter(String text) {
        if(text.isEmpty()){
            model_medicinal_plantsList.clear();
            model_medicinal_plantsList.addAll(arrayList);
        } else{
            ArrayList<Model_MedicinalPlants> result = new ArrayList<>();
            text = text.toLowerCase();
            for(Model_MedicinalPlants item: arrayList){

                if(item.getName().toLowerCase().contains(text) ||
                        item.getCommon_name().toLowerCase().contains(text)){
                    result.add(item);
                }
            }
            model_medicinal_plantsList.clear();
            model_medicinal_plantsList.addAll(result);
        }
        notifyDataSetChanged();
    }
}
package com.NFA.NgalaKiambote.adapters;

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

import com.NFA.NgalaKiambote.R;
import com.NFA.NgalaKiambote.models.Model_Medicinal_Plants;
import com.NFA.NgalaKiambote.receive_data.Receive_Data_Medicinal_Plants;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Medicinal_Plants extends RecyclerView.Adapter<Adapter_Medicinal_Plants.Holder_Medicinal_Plants> {

    private Context context;
    private List<Model_Medicinal_Plants> model_medicinal_plantsList;
    private ArrayList<Model_Medicinal_Plants>  arrayList;

    public Adapter_Medicinal_Plants(Context context, List<Model_Medicinal_Plants> model_medicinal_plantsList) {
        this.context = context;
        this.model_medicinal_plantsList = model_medicinal_plantsList;
        this.arrayList = new ArrayList<Model_Medicinal_Plants>();
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

        Picasso.get().load(model_medicinal_plantsList.get(pos).getImages()).into(holder.holder_image);
        holder.holder_name.setText(model_medicinal_plantsList.get(pos).getName());
        holder.holder_common_name.setText(model_medicinal_plantsList.get(pos).getCommon_name());
        holder.holder_geographical_localization.setText(model_medicinal_plantsList.get(pos).getGeographical_location());
        holder.holder_habitat.setText(model_medicinal_plantsList.get(pos).getHabitat());
        holder.holder_species_description.setText(model_medicinal_plantsList.get(pos).getSpecies_description());
        holder.holder_use.setText(model_medicinal_plantsList.get(pos).getUse());
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
                String use_plants_medical = model_medicinal_plantsList.get(pos).getUse();
                String part_use_plants_medical = model_medicinal_plantsList.get(pos).getParts_used();

                Intent intent = new Intent(context, Receive_Data_Medicinal_Plants.class);
                intent.putExtra("image", model_medicinal_plantsList.get(pos).getImages());
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

        ImageView holder_image;
        TextView holder_name, holder_common_name, holder_geographical_localization, holder_habitat, holder_species_description, holder_use, holder_parts_used;

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

    public interface ItemClick_Medicinal_Plants {
        void onMedicinalPlantsClick(View view, int position);
    }

    public void filter(String text) {
        if(text.isEmpty()){
            model_medicinal_plantsList.clear();
            model_medicinal_plantsList.addAll(arrayList);
        } else{
            ArrayList<Model_Medicinal_Plants> result = new ArrayList<>();
            text = text.toLowerCase();
            for(Model_Medicinal_Plants item: arrayList){

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
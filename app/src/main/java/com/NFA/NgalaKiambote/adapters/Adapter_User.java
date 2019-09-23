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
import com.NFA.NgalaKiambote.models.Model_User;
import com.NFA.NgalaKiambote.receive_data.Receive_Data_User_Telemedicine;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter_User extends RecyclerView.Adapter<Adapter_User.ViewHolder> {

    private Context mContext;
    private ArrayList<Model_User> modelUserArrayList;

    public Adapter_User(Context mContext, ArrayList<Model_User> modelUserArrayList) {
        this.mContext = mContext;
        this.modelUserArrayList = modelUserArrayList;
    }

    @NonNull
    @Override
    public Adapter_User.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View view = LayoutInflater.from(mContext).inflate(R.layout.structure_user_telemedicine, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter_User.ViewHolder holder, final int position) {

        Picasso.get().load(modelUserArrayList.get(position).getImage()).into(holder.mImgUser);
        holder.mTxtName.setText(modelUserArrayList.get(position).getName());
        holder.mTxtOccupation.setText(modelUserArrayList.get(position).getUser_doctor());

        Animation animation = AnimationUtils.loadAnimation(mContext, android.R.anim.slide_out_right);
        holder.itemView.startAnimation(animation);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mUserId = modelUserArrayList.get(position).getId();

                Intent intent = new Intent(mContext, Receive_Data_User_Telemedicine.class);
                intent.putExtra("id", mUserId);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelUserArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mImgUser;
        TextView mTxtName, mTxtOccupation, mTxtId;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            mImgUser = itemView.findViewById(R.id.structure_user_img);
            mTxtName = itemView.findViewById(R.id.structure_user_name);
            mTxtOccupation = itemView.findViewById(R.id.structure_user_occupation);
            mTxtId = itemView.findViewById(R.id.structure_user_id);
        }
    }
}

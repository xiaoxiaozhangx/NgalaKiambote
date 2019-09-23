package com.NFA.NgalaKiambote.receive_data;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.NFA.NgalaKiambote.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Receive_Data_User_Telemedicine extends AppCompatActivity {

    CircleImageView receiveImgUserProfile, mImgUserStatus;
    TextView receiveNameUserProfile, receiveOccupationsUserProfile, receiveStatusUserProfile;
    ImageView mImgCallUser, mImgVideoCallUser;

    /*int user_id = getIntent().getIntExtra("id", 0);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_data_user_telemedicine);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        receiveImgUserProfile = findViewById(R.id.receiveImgUserProfile);
        mImgUserStatus = findViewById(R.id.mImgUserStatus);
        receiveNameUserProfile = findViewById(R.id.receiveNameUserProfile);
        receiveOccupationsUserProfile = findViewById(R.id.receiveOccupationsUserProfile);
        receiveStatusUserProfile = findViewById(R.id.receiveStatusUserProfile);
        mImgCallUser = findViewById(R.id.mImgCallUser);
        mImgVideoCallUser = findViewById(R.id.mImgVideoCallUser);



    }

}

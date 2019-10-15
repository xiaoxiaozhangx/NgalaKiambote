package com.Ngala.Kiambote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class Activity_Register_User extends AppCompatActivity {

    private EditText mEdtName, mEditPassword, mEdtConfirmPassword;
    private RadioGroup mRdGroup;
    private RadioButton mRdBtnDoctor, mRdBtnNurse, mRdBtnPatient;
    private AutoCompleteTextView mActListDoctor, mActListNurse;
    private Button mBtnRegisterUser;
    private TextView mtxtLoginUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mEdtName = findViewById(R.id.mEdtName);
        mEditPassword = findViewById(R.id.mEditPassword);
        mEdtConfirmPassword = findViewById(R.id.mEdtConfirmPassword);
        mRdGroup = findViewById(R.id.mRdGroup);
        mRdBtnDoctor = findViewById(R.id.mRdBtnDoctor);
        mRdBtnNurse = findViewById(R.id.mRdBtnNurse);
        mRdBtnPatient = findViewById(R.id.mRdBtnPatient);
        mActListDoctor = findViewById(R.id.mActListDoctor);
        mActListNurse = findViewById(R.id.mActListNurse);
        mBtnRegisterUser = findViewById(R.id.mBtnRegisterUser);
        mtxtLoginUser = findViewById(R.id.mtxtLoginUser);

        final String[] mTypeDoctor = getResources().getStringArray(R.array.list_type_doctor);
        final ArrayAdapter<String> mAdapterDoctor = new ArrayAdapter<>(this, R.layout.structure_autocomplete_list_doctor, R.id.text_view_list_item, mTypeDoctor);
        mActListDoctor.setAdapter(mAdapterDoctor);
        mActListDoctor.setThreshold(1);

        String[] mTypeNurse = getResources().getStringArray(R.array.list_type_nurse);
        ArrayAdapter<String> mAdapterNurse = new ArrayAdapter<>(this, R.layout.structure_autocomplete_list_doctor, R.id.text_view_list_item, mTypeNurse);
        mActListNurse.setAdapter(mAdapterNurse);
        mActListNurse.setThreshold(1);

        mBtnRegisterUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mtxtLoginUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Register_User.this, Activity_Login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        mRdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.mRdBtnDoctor) {
                    mActListDoctor.setVisibility(View.VISIBLE);
                    mActListNurse.setVisibility(View.GONE);

                } else if (checkedId == R.id.mRdBtnNurse) {
                    mActListNurse.setVisibility(View.VISIBLE);
                    mActListDoctor.setVisibility(View.GONE);

                } else if (checkedId == R.id.mRdBtnPatient) {
                    mActListDoctor.setVisibility(View.GONE);
                    mActListNurse.setVisibility(View.GONE);
                }
            }
        });
    }
}
package com.Ngala.Kiambote;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Activity_Register_User extends AppCompatActivity {

    EditText mEdtName, mEditPassword, mEdtConfirmPassword;
    RadioGroup mRdGroup;
    RadioButton mRdBtnDoctor, mRdBtnNurse, mRdBtnPatient;
    AutoCompleteTextView mActListDoctor, mActListNurse;
    Button mBtnRegisterUser;
    TextView mtxtLoginUser;
    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

        mProgressBar = new ProgressBar(this);

        final String name = mEdtName.getText().toString().trim();
        final String password = mEditPassword.getText().toString();
        final String confirmPassword = mEdtConfirmPassword.getText().toString();
        final String professionDoctor = mActListDoctor.getText().toString();
        final String professionNurse = mActListNurse.getText().toString();
        final String patient = mRdBtnPatient.getText().toString();
        final String image = "", email = "", status = "";
        final double weight = 1.00, height = 1.00;
        final int bodyTemperature = 1, hearthBeat = 1;

        /************************************ AutocompleteText List Type Doctor and Nurse ***********************************************/

        final String[] mTypeDoctor = getResources().getStringArray(R.array.list_type_doctor);
        final ArrayAdapter<String> mAdapterDoctor = new ArrayAdapter<>(this, R.layout.structure_autocomplete_list_doctor, R.id.text_view_list_item, mTypeDoctor);
        mActListDoctor.setAdapter(mAdapterDoctor);
        mActListDoctor.setThreshold(1);

        String[] mTypeNurse = getResources().getStringArray(R.array.list_type_nurse);
        ArrayAdapter<String> mAdapterNurse = new ArrayAdapter<>(this, R.layout.structure_autocomplete_list_doctor, R.id.text_view_list_item, mTypeNurse);
        mActListNurse.setAdapter(mAdapterNurse);
        mActListNurse.setThreshold(1);

        /************************************ Button Register User ***********************************************/

        mBtnRegisterUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(name) || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)) {

                    Toast.makeText(Activity_Register_User.this, "Fill the spaces", Toast.LENGTH_SHORT).show();
                } else {
                    if (password.equals(confirmPassword)) {

                        if (mRdBtnDoctor.isChecked() && !professionDoctor.isEmpty()) {
                            registerDoctor(name, password, professionDoctor, image, email, status, weight, height, bodyTemperature, hearthBeat);
                        }

                        if (mRdBtnNurse.isChecked() && !professionNurse.isEmpty()) {
                            registerNurse(name, password, professionNurse, image, email, status, weight, height, bodyTemperature, hearthBeat);
                        }

                        if (mRdBtnPatient.isChecked()) {
                            registerPatient(name, password, patient, image, email, status, weight, height, bodyTemperature, hearthBeat);
                        }

                    } else {
                        Toast.makeText(Activity_Register_User.this, "Passwords differents", Toast.LENGTH_SHORT).show();
                    }
                }

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

        /************************************ Radio Group Check ***********************************************/
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

    /************************************ Method Register User ***********************************************/
    private void registerDoctor(String name, String password, String professionDoctor, String image, String email, String status, double weight, double height, int bodyTemperature, int hearthBeat) {

    }

    private void registerNurse(String name, String password, String professionNurse, String image, String email, String status, double weight, double height, int bodyTemperature, int hearthBeat) {
    }

    private void registerPatient(String name, String password, String patient, String image, String email, String status, double weight, double height, int bodyTemperature, int hearthBeat) {
    }
}

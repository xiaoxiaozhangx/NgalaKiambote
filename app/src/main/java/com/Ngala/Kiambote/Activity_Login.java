package com.Ngala.Kiambote;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class Activity_Login extends AppCompatActivity {

    private EditText mEditName;
    private EditText mEditPassword;
    private Button mBtnLogin;
    private TextView mTextForgetPassword;
    private TextView mTextRegisterUser;
    private ProgressDialog mLoadingBar;
    private Dialog mDialog;

    private final String mFileName = "myFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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

        mEditName = findViewById(R.id.mEditName);
        mEditPassword = findViewById(R.id.mEditPassword);
        mBtnLogin = findViewById(R.id.mBtnLogin);
        mTextForgetPassword = findViewById(R.id.mTextForgetPassword);
        mTextRegisterUser = findViewById(R.id.mTextRegisterUser);

        mLoadingBar = new ProgressDialog(Activity_Login.this);

        readNameInCache();

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user_name = mEditName.getText().toString();
                String user_password = mEditPassword.getText().toString();

                if (TextUtils.isEmpty(user_name)) {
                    mEditName.setError(getString(R.string.fill_name));

                } else if (TextUtils.isEmpty(user_password)) {
                    mEditPassword.setError(getString(R.string.fill_password));

                } else {

                    enterInAccount(user_name, user_password);

                    mLoadingBar.setTitle(getString(R.string.processing_account));
                    mLoadingBar.setMessage(getString(R.string.please_wait));
                    mLoadingBar.setCanceledOnTouchOutside(false);
                    mLoadingBar.show();
                }
            }
        });

        mTextForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDialog = new Dialog(Activity_Login.this);
                mDialog.setContentView(R.layout.layout_recover_password);
                mDialog.setTitle(R.string.recover_password);

                final EditText mEditRecoverPass = mDialog.findViewById(R.id.mEditRecoverPass);
                final Button mBtnRecoverPass = mDialog.findViewById(R.id.bmBtnRecoverPass);

                mBtnRecoverPass.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = mEditRecoverPass.getText().toString();

                        if (name.isEmpty()) {
                            mEditRecoverPass.setError(getString(R.string.fill_name));

                        } else {
                            mLoadingBar.setMessage(getString(R.string.loading));
                            mLoadingBar.show();

                        }
                    }
                });
                mDialog.show();

            }
        });

        mTextRegisterUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Login.this, Activity_Register_User.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }

    private void enterInAccount(String user_name, String user_password) {


    }

    @Override
    protected void onResume() {
        super.onResume();
        checkInternetStatus();
    }

    /*********************** Method for to check internet status ****************************************/
    private void checkInternetStatus() {

    }

    /*********************** Method for to save name in cache  by SharedPreferences ****************************************/
    private void saveNameInCache() {
        String saveName = mEditName.getText().toString();
        SharedPreferences sharedPref = getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("name", saveName);
        editor.apply();
    }

    /*********************** Method for to read name in cache  by SharedPreferences ****************************************/
    private void readNameInCache() {
        SharedPreferences sharedPref = getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        String readName = mEditName.getText().toString();
        String email = sharedPref.getString("name", readName);
        mEditName.setText(email);
    }

}

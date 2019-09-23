package com.NFA.NgalaKiambote;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Activity_User_Profile extends AppCompatActivity {

    CircleImageView mCircleImgProfile;
    CardView mCardWeight, mCardHeight, mCardHealthBeat, mCardTemperatureBody;
    TextView mTxtNameUser, mTxtTypeUser, mTxtWeightUser, mTxtUserHeight, mTxtUserHealthBeat, mTxtUserTemperatureBody, mTxtStatusUser;
    Dialog addItemDialog;

    Uri mImageUri;

    private static final int IMAGE_PICK_GALLERY_CODE = 100;
    private static final int IMAGE_PICK_CAMERA_CODE = 200;
    private static String NOS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
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

        mCircleImgProfile = findViewById(R.id.mCircleImgProfile);
        mTxtNameUser = findViewById(R.id.mTxtNameUser);
        mTxtTypeUser = findViewById(R.id.mTxtTypeUser);
        mCardWeight = findViewById(R.id.mCardWeight);
        mCardHeight = findViewById(R.id.mCardHeight);
        mCardHealthBeat = findViewById(R.id.mCardHealthBeat);
        mCardTemperatureBody = findViewById(R.id.mCardTemperatureBody);
        mTxtWeightUser = findViewById(R.id.mTxtWeightUser);
        mTxtUserHeight = findViewById(R.id.mTxtUserHeight);
        mTxtUserHealthBeat = findViewById(R.id.mTxtUserHealthBeat);
        mTxtUserTemperatureBody = findViewById(R.id.mTxtUserTemperatureBody);
        mTxtStatusUser = findViewById(R.id.mTxtStatusUser);

        mCardHealthBeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_User_Profile.this, Activity_Diagnose_Heartbeat.class);
                startActivity(intent);
            }
        });

        mCardTemperatureBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_User_Profile.this, Activity_Diagnose_Body_Temperature.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_edit_profile) {
            editUserProfile();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void editUserProfile() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Deseja Editar: ");

        String[] options = {"Imagem", "Nome", "Profissão", "Status"};

        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (which == 0) {
                    chooseOperation();

                } else if (which == 1) {
                    NOS = "Nome";
                    editNOS(NOS);

                } else if (which == 2) {
                    NOS = "Ocupacao";
                    editNOS(NOS);

                } else if (which == 3) {
                    NOS = "Status";
                    editNOS(NOS);

                }
            }
        });
        builder.create().show();
    }

    private void chooseOperation() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pegar imagem pela: ");

        String[] options = {"Camera", "Galeria"};

        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (which == 0) {

                    requestCameraPermission();

                } else if (which == 1) {

                    requestStoragePermission();

                }
            }
        });

        builder.create().show();
    }

    public void editNOS(final String nos) {
        addItemDialog = new Dialog(Activity_User_Profile.this);
        addItemDialog.setContentView(R.layout.layout_edit_profile);
        addItemDialog.setTitle("Editar " + nos + ":");

        final EditText edit_refresh = addItemDialog.findViewById(R.id.edit_refresh);
        final Button btn_refresh = addItemDialog.findViewById(R.id.btn_refresh);

        btn_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = edit_refresh.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(Activity_User_Profile.this, "Preencha a Palavra", Toast.LENGTH_SHORT).show();

                } else {

                    if (nos.equals("Nome")) {
                        Toast.makeText(Activity_User_Profile.this, "nome", Toast.LENGTH_SHORT).show();

                    }
                    if (nos.equals("Ocupacao")) {
                        Toast.makeText(Activity_User_Profile.this, "Ocupacao", Toast.LENGTH_SHORT).show();

                    }
                    if (nos.equals("Status")) {
                        Toast.makeText(Activity_User_Profile.this, "Status", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
        addItemDialog.show();
    }

    private void requestStoragePermission() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            Dexter.withActivity(this).withPermissions(Manifest.permission_group.STORAGE).withListener(new MultiplePermissionsListener() {
                @Override
                public void onPermissionsChecked(MultiplePermissionsReport report) {
                    if (report.areAllPermissionsGranted()) {
                        pickFromGallery();

                    } else {
                        Toast.makeText(Activity_User_Profile.this, "Erro", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                    token.continuePermissionRequest();
                }
            }).check();

        } else {
            pickFromGallery();
        }
    }

    private void requestCameraPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Dexter.withActivity(this).withPermissions(Manifest.permission.CAMERA).withListener(new MultiplePermissionsListener() {
                @Override
                public void onPermissionsChecked(MultiplePermissionsReport report) {
                    if (report.areAllPermissionsGranted()) {
                        pickFromCamera();

                    } else {
                        Toast.makeText(Activity_User_Profile.this, "Erro", Toast.LENGTH_SHORT).show();

                    }
                }

                @Override
                public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                    token.continuePermissionRequest();
                }
            }).check();

        } else {
            pickFromCamera();
        }
    }

    private void pickFromCamera() {
        try {
            if (this.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
                ContentValues values = new ContentValues();
                values.put(MediaStore.Images.Media.TITLE, "Temp Pic");
                values.put(MediaStore.Images.Media.DESCRIPTION, "Temp Description");

                mImageUri = this.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, mImageUri);
                startActivityForResult(cameraIntent, IMAGE_PICK_CAMERA_CODE);

            } else {
                Toast.makeText(this, "Don't have camera", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Exception", e.getMessage());
        }
    }

    private void pickFromGallery() {
        try {
            Intent galleryIntent = new Intent(Intent.ACTION_PICK);
            galleryIntent.setType("image/*");
            startActivityForResult(galleryIntent, IMAGE_PICK_GALLERY_CODE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (resultCode == RESULT_OK) {

            if (requestCode == IMAGE_PICK_GALLERY_CODE) {
                mImageUri = data.getData();

                mCircleImgProfile.setImageURI(mImageUri);

                uploadImgProfile(mImageUri);
            }

            if (requestCode == IMAGE_PICK_CAMERA_CODE) {

                uploadImgProfile(mImageUri);
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    private void uploadImgProfile(Uri image_uri) {

    }
}
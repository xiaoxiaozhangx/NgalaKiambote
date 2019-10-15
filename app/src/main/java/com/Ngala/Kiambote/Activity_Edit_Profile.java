package com.Ngala.Kiambote;

import android.Manifest;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class Activity_Edit_Profile extends AppCompatActivity {

    private CircleImageView mCircleImgProfile;
    private EditText mTxtNameUser;
    private EditText mTxtTypeUser;

    private Uri mImageUri;

    private static final int IMAGE_PICK_GALLERY_CODE = 100, IMAGE_PICK_CAMERA_CODE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
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

        mCircleImgProfile = findViewById(R.id.mCircleImgProfile);
        mTxtNameUser = findViewById(R.id.mTxtNameUser);
        mTxtTypeUser = findViewById(R.id.mTxtTypeUser);

        mCircleImgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseOperation();
            }
        });

    }

    private void chooseOperation() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pegar imagem pela: ");

        String[] options = {"Camera", "Galeria"};

        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        requestCameraPermission();
                    case 1:
                        requestStoragePermission();
                }
            }
        });
        builder.create().show();
    }

    private void requestStoragePermission() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            Dexter.withActivity(this).withPermissions(Manifest.permission_group.STORAGE).withListener(new MultiplePermissionsListener() {
                @Override
                public void onPermissionsChecked(MultiplePermissionsReport report) {
                    if (report.areAllPermissionsGranted()) {
                        pickFromGallery();

                    } else {
                        Toast.makeText(Activity_Edit_Profile.this, "Erro", Toast.LENGTH_SHORT).show();

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
                        Toast.makeText(Activity_Edit_Profile.this, "Erro", Toast.LENGTH_SHORT).show();

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
            Log.d("Exception", Objects.requireNonNull(e.getMessage()));
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
                if (data != null) {
                    mImageUri = data.getData();
                    mCircleImgProfile.setImageURI(mImageUri);
                    uploadImgProfile(mImageUri);
                }
            }
            if (requestCode == IMAGE_PICK_CAMERA_CODE) {
                if (data != null) {
                    mImageUri = data.getData();
                    mCircleImgProfile.setImageURI(mImageUri);
                    uploadImgProfile(mImageUri);
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void uploadImgProfile(Uri image_uri) {

    }
}
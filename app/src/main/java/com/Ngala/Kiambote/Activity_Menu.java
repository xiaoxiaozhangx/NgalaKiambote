package com.Ngala.Kiambote;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.io.File;

import de.hdodenhof.circleimageview.CircleImageView;

public class Activity_Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView mNavigationView;
    DrawerLayout mDrawerLayout;
    ImageView mNavImgUser;

    CircleImageView mCircleImgProfile;
    CardView mCardWeight, mCardHeight, mCardHealthBeat, mCardTemperatureBody;
    TextView mTxtNameUser, mTxtTypeUser, mTxtWeightUser, mTxtUserHeight, mTxtUserHealthBeat, mTxtUserTemperatureBody, mTxtStatusUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(getApplicationContext(), R.style.Toolbar);

        mNavigationView = findViewById(R.id.mNavigationView);
        mDrawerLayout = findViewById(R.id.mDrawerLayout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        View view = mNavigationView.inflateHeaderView(R.layout.nav_header_main);
        mNavImgUser = view.findViewById(R.id.mNavImgUser);

        mNavigationView.setNavigationItemSelectedListener(this);

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
                startActivity(new Intent(Activity_Menu.this, Activity_Diagnose_Heartbeat.class));
            }
        });

        mCardTemperatureBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity_Menu.this, Activity_Diagnose_Body_Temperature.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkInternetConnection();
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            new AlertDialog.Builder(this).setTitle("Deseja sair da Aplicação?")
                    .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }

                    })
                    .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).create().show();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_store) {
            startActivity(new Intent(Activity_Menu.this, Activity_Store_Maps.class));

        } else if (id == R.id.nav_plants) {
            startActivity(new Intent(Activity_Menu.this, Activity_Medicinal_Plants.class));

        } else if (id == R.id.nav_share_app) {
            shareApp();

        } else if (id == R.id.nav_about_us) {

        } else if (id == R.id.nav_terms_and_conditions) {

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
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
            startActivity(new Intent(Activity_Menu.this, Activity_Edit_Profile.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void checkInternetConnection() {

    }

    private void shareApp() {
        ApplicationInfo api = getApplicationContext().getApplicationInfo();
        String apkPath = api.sourceDir;

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("application/vnd.android.package-archive");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkPath)));
        startActivity(Intent.createChooser(intent, "Partilhar Aplicação"));
    }
}
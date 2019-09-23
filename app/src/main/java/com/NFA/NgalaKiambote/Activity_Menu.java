package com.NFA.NgalaKiambote;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.NFA.NgalaKiambote.adapters.Adapter_Medicinal_Plants;
import com.NFA.NgalaKiambote.fragments.Fragment_Diagnostic;
import com.NFA.NgalaKiambote.fragments.Fragment_Telemedicine;
import com.NFA.NgalaKiambote.models.Model_Medicinal_Plants;
import com.NFA.NgalaKiambote.receive_data.Receive_Data_User_Telemedicine;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Activity_Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView mNavigationView;
    DrawerLayout mDrawerLayout;
    CircleImageView mNavImgUser;
    TextView mNavTextNameUser, mNavTextEmailUser;
    Button mNavBtnUserLogout;

    RecyclerView mRecyclerMedicinalPlants;
    Adapter_Medicinal_Plants mAdapterMedicinalPlants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
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

        mNavigationView = findViewById(R.id.mNavigationView);
        mDrawerLayout = findViewById(R.id.mDrawerLayout);

       /* mViewPager = findViewById(R.id.mViewPager);
        setupViewPager(mViewPager);*/

       /* mTabLayout = findViewById(R.id.mTabLayout);
        mTabLayout.setupWithViewPager(mViewPager);*/

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        View view = mNavigationView.inflateHeaderView(R.layout.nav_header_main);
        mNavImgUser = view.findViewById(R.id.mNavImgUser);
        mNavTextNameUser = view.findViewById(R.id.mNavTextNameUser);
        mNavTextEmailUser = view.findViewById(R.id.mNavTextEmailUser);
        mNavBtnUserLogout = view.findViewById(R.id.mNavBtnUserLogout);

        Picasso.get().load(R.drawable.image_user).into(mNavImgUser);

        mNavBtnUserLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mNavBtnUserLogout.getText().toString().equals("Entrar")) {
                    Intent intent = new Intent(Activity_Menu.this, Activity_Login.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(Activity_Menu.this, "False", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        checkInternetConnection();
    }

    private void checkInternetConnection() {

    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Deseja sair da Aplicação?")
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

        if (id == R.id.nav_profile) {
            Intent intent = new Intent(Activity_Menu.this, Activity_User_Profile.class);
            startActivity(intent);

        } else if (id == R.id.nav_share_app) {
            shareApp();

        } else if (id == R.id.nav_about_us) {
            Intent intent = new Intent(Activity_Menu.this, Activity_Medicinal_Plants.class);
            startActivity(intent);

        } else if (id == R.id.nav_terms_and_conditions) {
            Intent intent = new Intent(Activity_Menu.this, Receive_Data_User_Telemedicine.class);
            startActivity(intent);

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);

        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                mAdapterMedicinalPlants.filter(query);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                mAdapterMedicinalPlants.filter(newText);

                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        /*if (id == R.id.action_settings) {
            return true;
        }
*/
        return super.onOptionsItemSelected(item);
    }
    
   /* private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
       *//* adapter.addFrag(new Fragment_Diagnostic(),getString(R.string.diagnose));*//*
        adapter.addFrag(new Fragment_Telemedicine(),getString(R.string.telemedicine));
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }*/

    private void shareApp() {
        ApplicationInfo api = getApplicationContext().getApplicationInfo();
        String apkPath = api.sourceDir;

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("application/vnd.android.package-archive");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkPath)));
        startActivity(Intent.createChooser(intent, "Partilhar Aplicação"));
    }

}

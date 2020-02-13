package com.Ngala.Kiambote.receive_data;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.Ngala.Kiambote.R;
import com.bumptech.glide.Glide;
import com.jsibbold.zoomage.ZoomageView;

import java.util.Objects;

public class Receive_Data_Medicinal_Plants extends AppCompatActivity {

    private ZoomageView receive_image_plants_medical;
    private TextView receive_name_plants_medical, receive_common_name_plants_medical, receive_geographical_location_plants_medical, receive_habitat_plants_medical, receive_species_description_plants_medical, receive_use_plants_medical, receive_parts_used_plants_medical;
    private ClipboardManager myClipboard;
    private ClipData myClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_data_medicinal_plants);
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

        receive_image_plants_medical = findViewById(R.id.receive_image_plants_medical);
        receive_name_plants_medical = findViewById(R.id.receive_name_plants_medical);
        receive_common_name_plants_medical = findViewById(R.id.receive_common_name_plants_medical);
        receive_geographical_location_plants_medical = findViewById(R.id.receive_geographical_location_plants_medical);
        receive_habitat_plants_medical = findViewById(R.id.receive_habitat_plants_medical);
        receive_species_description_plants_medical = findViewById(R.id.receive_species_description_plants_medical);
        receive_use_plants_medical = findViewById(R.id.receive_use_plants_medical);
        receive_parts_used_plants_medical = findViewById(R.id.receive_parts_used_plants_medical);

        try {

            Intent intent = getIntent();
            String title_plants_medical = intent.getStringExtra("name");
            String traditional_name_plants_medical = intent.getStringExtra("common_name");
            String location_plants_medical = intent.getStringExtra("geographical_location");
            String habitat_plants_medical = intent.getStringExtra("habitat");
            String description_specie_plants_medical = intent.getStringExtra("specie_description");
            String utility_plants_medical = intent.getStringExtra("use");
            String peace_utility_plants_medical = intent.getStringExtra("part_used");

            int image_plants_medical = intent.getIntExtra("image", 0);

            Glide.with(this).load(image_plants_medical).into(receive_image_plants_medical);
            receive_name_plants_medical.setText(title_plants_medical);
            receive_common_name_plants_medical.setText(traditional_name_plants_medical);
            receive_geographical_location_plants_medical.setText(location_plants_medical);
            receive_habitat_plants_medical.setText(habitat_plants_medical);
            receive_species_description_plants_medical.setText(description_specie_plants_medical);
            receive_use_plants_medical.setText(utility_plants_medical);
            receive_parts_used_plants_medical.setText(peace_utility_plants_medical);

            myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_share_information, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.menu_share) {

            String get_utility = receive_use_plants_medical.getText().toString();

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, get_utility);
            intent.setType("text/plain");
            Intent share_utility = Intent.createChooser(intent, "Partilhar utilidade da Planta");
            startActivity(share_utility);
        }

        if (id == R.id.menu_copy) {

            String get_utility = receive_use_plants_medical.getText().toString();
            String get_name = receive_common_name_plants_medical.getText().toString();

            myClip = ClipData.newPlainText("text", get_utility);
            myClipboard.setPrimaryClip(myClip);

            Toast.makeText(getApplicationContext(), get_name + " Copiado", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
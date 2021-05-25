package com.example.oxymeter_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details"+ AffectedCountry.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCountry = findViewById(R.id.tv1Country);
        tvCases = findViewById(R.id.tv1Cases);
        tvRecovered = findViewById(R.id.tv1Critical);
        tvCritical = findViewById(R.id.tv1Critical);
        tvActive = findViewById(R.id.tv1Active);
        tvTodayCases = findViewById(R.id.tv1TodayCases);
        tvTotalDeaths = findViewById(R.id.tv1TotalDeath);
        tvTodayDeath = findViewById(R.id.tv1TodaysDeath);

        tvCountry.setText(AffectedCountry.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountry.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountry.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountry.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountry.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountry.countryModelList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountry.countryModelList.get(positionCountry).getTodayDeaths());
        tvTodayDeath.setText(AffectedCountry.countryModelList.get(positionCountry).getTodayDeaths());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}
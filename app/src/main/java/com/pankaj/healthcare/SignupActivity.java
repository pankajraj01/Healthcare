package com.pankaj.healthcare;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    Spinner country_spinner, city_spinner;

    String[] country_name = {"India", "America", "pakistan", "Bangladesh", "Japan"};
    String[] city_name = {"Pali", "Jodhpur", "Siohi", "Udaipur", "Delhi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        country_spinner = findViewById(R.id.country_spinner);
        city_spinner = findViewById(R.id.city_spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(SignupActivity.this, R.layout.support_simple_spinner_dropdown_item, country_name);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        country_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SignupActivity.this, country_name[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> arrayAdaptera = new ArrayAdapter<String>(SignupActivity.this, R.layout.support_simple_spinner_dropdown_item, city_name);
        arrayAdaptera.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        city_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SignupActivity.this, city_name[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        country_spinner.setAdapter(arrayAdapter);
        city_spinner.setAdapter(arrayAdaptera);
    }
}


package com.example.banbajio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Search extends AppCompatActivity {

    Spinner dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        /*dato = findViewById(R.id.lvDato);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.datos, android.R.layout.simple_spinner_item);

        dato.setAdapter(adapter);;*/
    }
}

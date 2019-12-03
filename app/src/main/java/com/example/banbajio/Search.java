package com.example.banbajio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {

    Button btnSearch;
    ListView lvDatos;
    //EditText edtSearch;
    List<Valija> valijaList, listaDatos;
    Datasource dataSource;
    TextView tvP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        valijaList = new ArrayList<Valija>();
        Bundle parametros = getIntent().getExtras();

        String depEnvio = parametros.getString("depenvio");
        String depRecibe = parametros.getString("deprecibe");
        String ciudadEnvio = parametros.getString("ciudadenvio");
        String ciudadDestino = parametros.getString("ciudaddestino");
        String fechaCreacion = parametros.getString("fechacreacion");
        String fechaEnvio = parametros.getString("fechacreacion");
        final String descripcion = parametros.getString("descripcion");

        Valija valija = new Valija(depEnvio,depRecibe,"Leon",ciudadDestino,
                fechaCreacion,fechaEnvio,descripcion);
        //valija.setId();
        //valija.setNumValija();
        valija.setDepEnvio(depEnvio);
        valija.setDepRecibe(depRecibe);
        valija.setCiudadEnvio("Leon");
        valija.setCiudadDestino(ciudadDestino);
        valija.setFechaCreacion(fechaCreacion);
        valija.setFechaEnvio(fechaEnvio);
        valija.setDescripcion(descripcion);
        valijaList.add(valija);
        dataSource = new Datasource(this);

        btnSearch = findViewById(R.id.btnSearch);
        lvDatos = findViewById(R.id.lvDatos);
        //tvP = findViewById(R.id.tvP);
        //edtSearch = findViewById(R.id.edSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //valijaList = dataSource.findAll();
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "", Toast.LENGTH_LONG);
                //tvP.setText(descripcion);
                toast1.show();
                refreshDisplay();
            }
        });
    }

    public void refreshDisplay(){
        ArrayAdapter<Valija> adapter = new ArrayAdapter<Valija>(this,
                android.R.layout.simple_expandable_list_item_1, valijaList);
        lvDatos.setAdapter(adapter);


    }
}

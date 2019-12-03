package com.example.banbajio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Add extends AppCompatActivity {

    Datasource dataSource;
    EditText etDepEnvio, etDepRecibe, etCiudadEnvio, etCiudadDest, etFechaCreacion,
            etFechaEnvio, etDesc;
    Button btnReg;

    private String depEnvio, depRecibe, ciudadEnvio, ciudadDestino, fechaCreacion, fechaEnvio,
            descripcoin;
    private double guia;

    List<Valija> listaDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        listaDatos = new ArrayList<Valija>();

        etDepEnvio = findViewById(R.id.etDepEnvio);
        etDepRecibe = findViewById(R.id.etDepRecibe);
        etCiudadEnvio = findViewById(R.id.etCiudadEnvio);
        etCiudadDest = findViewById(R.id.etCiudadDest);
        etFechaCreacion = findViewById(R.id.fechaCreacion);
        etFechaEnvio = findViewById(R.id.etFechaEnvio);
        etDesc = findViewById(R.id.etDesc);
        btnReg = findViewById(R.id.btnReg);

        etCiudadEnvio.setText("Leon");
        etCiudadEnvio.setFocusable(false);
        etCiudadEnvio.setEnabled(false);
        etCiudadEnvio.setCursorVisible(false);
        etCiudadEnvio.setKeyListener(null);
        etCiudadEnvio.setBackgroundColor(Color.TRANSPARENT);

        //guia = Math.random()*100000+1;
        depEnvio = etDepEnvio.getText().toString();
        depRecibe = etDepRecibe.getText().toString();
        ciudadEnvio = etCiudadEnvio.getText().toString();
        ciudadDestino = etCiudadDest.getText().toString();
        fechaCreacion = etFechaCreacion.getText().toString();
        fechaEnvio = etFechaEnvio.getText().toString();
        descripcoin = etDesc.getText().toString();
        dataSource = new Datasource(this);
        dataSource.open();

        Valija valija = new Valija();
        //valija.setId();
        //valija.setNumValija();
        valija.setDepEnvio(depEnvio);
        valija.setDepRecibe(depRecibe);
        valija.setCiudadEnvio("Leon");
        valija.setCiudadDestino(ciudadDestino);
        valija.setFechaCreacion(fechaCreacion);
        valija.setFechaEnvio(fechaEnvio);
        valija.setDescripcion(descripcoin);
        //listaDatos.add(valija);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Search.class);

                i.putExtra("depenvio", etDepEnvio.getText().toString());
                i.putExtra("deprecibe", etDepRecibe.getText().toString());
                i.putExtra("ciudadenvio", "Leon");
                i.putExtra("ciudaddestino", etCiudadDest.getText().toString());
                i.putExtra("fechacreacion", etFechaCreacion.getText().toString());
                i.putExtra("fechacreacion", etFechaEnvio.getText().toString());
                i.putExtra("descripcion", etDesc.getText().toString());
                startActivity(i);

                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                etCiudadDest.getText().toString(), Toast.LENGTH_LONG);
                toast1.show();
                createData();
            }
        });


    }

    public void createData(){
        dataSource.create(new Valija(depEnvio, depRecibe, ciudadEnvio,
                ciudadDestino, fechaCreacion, fechaEnvio, descripcoin));

        Log.i("LOGTAG", "created data");
    }
}

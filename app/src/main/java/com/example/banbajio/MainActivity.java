package com.example.banbajio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = user.getText().toString();
                String password = pass.getText().toString();

                if((usuario.equals("paco") && password.equals("pass123"))){
                    Intent i = new Intent(v.getContext(), Inicio.class);
                    startActivityForResult(i,0);
                }else{
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "Usuario invalido", Toast.LENGTH_LONG);
                    toast1.show();
                }


            }
        });

    }
}

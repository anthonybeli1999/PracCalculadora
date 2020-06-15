package com.example.praccalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.edt_num1);
        num2 = (EditText) findViewById(R.id.edt_num2);
        result = (EditText) findViewById(R.id.edt_result);

        ((Button)findViewById(R.id.btn_suma)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServicioOperaciones ServicioSuma = new ServicioOperaciones(getApplicationContext());
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                } else {
                    double a = Integer.parseInt(num1.getText().toString());
                    double b = Integer.parseInt(num2.getText().toString());
                    double resultado = ServicioSuma.realizarSuma(a,b);
                    result.setText(String.valueOf(resultado));
                }
            }
        });

        ((Button)findViewById(R.id.btn_resta)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServicioOperaciones ServicioResta = new ServicioOperaciones(getApplicationContext());
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                } else {
                    double a = Integer.parseInt(num1.getText().toString());
                    double b = Integer.parseInt(num2.getText().toString());
                    double resultado = ServicioResta.realizarResta(a,b);
                    result.setText(String.valueOf(resultado));
                }
            }
        });

        ((Button)findViewById(R.id.btn_multiplicacion)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServicioOperaciones ServicioMultiplicacion = new ServicioOperaciones(getApplicationContext());
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                } else {
                    double a = Integer.parseInt(num1.getText().toString());
                    double b = Integer.parseInt(num2.getText().toString());
                    double resultado = ServicioMultiplicacion.realizarMultiplicacion(a,b);
                    result.setText(String.valueOf(resultado));
                }
            }
        });

        ((Button)findViewById(R.id.btn_division)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServicioOperaciones ServicioDivision = new ServicioOperaciones(getApplicationContext());
                if(num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                } else {
                    double a = Integer.parseInt(num1.getText().toString());
                    double b = Integer.parseInt(num2.getText().toString());
                    double resultado = ServicioDivision.realizarDivision(a,b);
                    result.setText(String.valueOf(resultado));
                }
            }
        });

        ((Button)findViewById(R.id.btn_play)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(getApplicationContext(), ServicioMusica.class));
            }
        });

        ((Button)findViewById(R.id.btn_stop)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getApplicationContext(), ServicioMusica.class));
            }
        });


    }
}

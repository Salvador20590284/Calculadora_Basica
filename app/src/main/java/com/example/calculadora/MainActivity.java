package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = (EditText) findViewById(R.id.Numeros1);
        numero2 = (EditText) findViewById(R.id.Numeros2);
        resultado = (TextView) findViewById(R.id.Resultado);
    }

    public void suma(View view){
        Log.i("info","Boton Suma Presionado");
        numero1 = findViewById(R.id.Numeros1);
        numero2 = findViewById(R.id.Numeros2);
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();
        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);
        int resul=0;
        resul = entero1 + entero2;
        resultado.setText("" +resul);
    }
    public void resta(View view){
        Log.i("info","Boton Suma Presionado");
        numero1 = findViewById(R.id.Numeros1);
        numero2 = findViewById(R.id.Numeros2);
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();
        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);
        int resul=0;
        resul = entero1 - entero2;
        resultado.setText("" +resul);
    }
    public void multi(View view){
        Log.i("info","Boton Suma Presionado");
        numero1 = findViewById(R.id.Numeros1);
        numero2 = findViewById(R.id.Numeros2);
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();
        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);
        int resul=0;
        resul = entero1 * entero2;
        resultado.setText("" +resul);
    }
    public void div(View view){
        Log.i("info","Boton Suma Presionado");
        numero1 = findViewById(R.id.Numeros1);
        numero2 = findViewById(R.id.Numeros2);
        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();
        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);
        int resul=0;
        resul = entero1 / entero2;
        resultado.setText("" +resul);
    }
    public void limpiar (View view){
        numero1.setText("0");
        numero2.setText("0");
        resultado.setText("00");
    }

}
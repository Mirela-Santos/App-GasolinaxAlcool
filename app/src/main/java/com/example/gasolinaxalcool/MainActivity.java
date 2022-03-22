package com.example.gasolinaxalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editGasolina;
    private EditText editAlcool;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editGasolina = findViewById(R.id.editGasolina);
        editAlcool = findViewById(R.id.editAlcool);
        resultado = findViewById(R.id.resultado);

    }

    public void calcularpreco (View view){

        Double precoGasolina = Double.parseDouble(editGasolina.getText().toString());
        Double precoAlcool = Double.parseDouble(editAlcool.getText().toString());

        Double Resultado = precoAlcool/precoGasolina;

        if(Resultado >= 0.7){

            resultado.setText("A melhor escolha é: GASOLINA");

        } else {

            resultado.setText("A melhor escolha é: ÁLCOOL");

        }




    }

}
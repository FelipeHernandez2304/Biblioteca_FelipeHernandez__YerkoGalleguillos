package com.example.biblioteca_felipehernandez_yerkogalleguillos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Intercambio_valores.Valores;

public class github_act extends AppCompatActivity {

    private Spinner sp1;
    private TextView tv;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        sp1 = (Spinner) findViewById(R.id.sp1);
        tv = (TextView) findViewById(R.id.tv1);
        button = (Button) findViewById(R.id.bttn);

        ArrayList<String> intercambioValores = (ArrayList<String>) getIntent().getSerializableExtra("intercambioValores");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, intercambioValores);

        sp1.setAdapter(adapt);
    }
    public void spnnr(View v)
    {
        String valores = sp1.getSelectedItem().toString();
        Valores valor = new Valores();

        int fare = valor.getFarenheith();
        int revi = valor.getRevival();
        int alqui = valor.getAlquimista();
        int desp = valor.getDespertar();
        int pod = valor.getPoder();




        if(valores.equals("Farenheith"))
        {
            tv.setText("El valor de Farenheith es: " + fare);
        }
        if(valores.equals("Revival"))
        {
            tv.setText("El valor de Revival es: " + revi);
        }
        if(valores.equals("El Alquimista"))
        {
            tv.setText("El valor de El Alquimista es: " + alqui);
        }
         if(valores.equals("El Poder"))
        {
            tv.setText("El valor de El Poder es: " + pod);
        }
        if(valores.equals("El Despertar"))
        {
            tv.setText("El valor de El Despertar es: " + desp);
        }
    }
}
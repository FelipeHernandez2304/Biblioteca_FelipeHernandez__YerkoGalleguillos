package com.example.biblioteca_felipehernandez_yerkogalleguillos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Intercambio_valores.Valores;

public class github_act extends AppCompatActivity {

    private Spinner sp1;
    private TextView tv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        sp1 = (Spinner) findViewById(R.id.sp1);
        tv = (TextView) findViewById(R.id.tv1);

        ArrayList<String> intercambioValores = (ArrayList<String>) getIntent().getSerializableExtra("intercambioValores");
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, intercambioValores);
        sp1.setAdapter(adapt);
    }

    public void spnnr(View v)
    {
        Valores valor = new Valores();
        String valores = sp1.getSelectedItem().toString();
        int fare = Integer.parseInt(valor.getFarenheith());
        int revi = Integer.parseInt(valor.getRevival());
        int alqui = Integer.parseInt(valor.getAlquimista());


        if(valores.equals("Farenheith"))
        {
            tv.setText("El valor de Farenheith es: " + valor.getFarenheith());
        }
        if(valores.equals("Revival"))
        {
            tv.setText("El valor de Revival es: " + valor.getRevival());
        }
        if(valores.equals("El Alquimista"))
        {
            tv.setText("El valor de El Alquimista es: " + valor.getAlquimista());
        }
    }
}
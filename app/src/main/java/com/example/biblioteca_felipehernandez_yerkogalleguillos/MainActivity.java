package com.example.biblioteca_felipehernandez_yerkogalleguillos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pb;
    private EditText et1, et2;
    private Button btt1;
    private ImageButton ib1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = (ProgressBar)findViewById(R.id.pb1);
        et1 = (EditText)findViewById(R.id.edt1);
        et2 = (EditText)findViewById(R.id.edt2);
        btt1 = (Button)findViewById(R.id.bt1);
        ib1 = (ImageButton)findViewById(R.id.ib1);
    }

    public void github(View v)
    {
        ArrayList<String> valores = new ArrayList<String>();

        valores.add("Farenheith");
        valores.add("Revival");
        valores.add("El Alquimista");
        valores.add("El Poder");
        valores.add("El Despertar");



        Intent i = new Intent(this,github_act.class);
        i.putExtra("intercambioValores", valores);
        startActivity(i);
    }

    public void home(View v)
    {
        Intent e = new Intent(this,home_act.class);
        startActivity(e);
    }


}
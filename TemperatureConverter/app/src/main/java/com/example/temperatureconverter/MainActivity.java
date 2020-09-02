package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import at.markushi.ui.CircleButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    CircleButton btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickMe = (CircleButton) findViewById(R.id.botao);
        btnClickMe.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v)
    {
        EditText textC = (EditText)findViewById(R.id.editC);
        EditText textF = (EditText)findViewById(R.id.editF);
        EditText textK = (EditText)findViewById(R.id.editK);

        Log.v("EditText", textC.getText().toString());

        if(textC.getText().toString().trim().length() == 0)
            return;

        double c = Double.parseDouble(textC.getText().toString());
        double f   =  (c   *  (9/5)) + 32;
        double k = c + 273.15;

        textF.setText(String.valueOf(f));
        textK.setText(String.valueOf(k));
    }
}
package com.max.controlspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
private EditText et1,et2;
private TextView tv1;
private Button botonOperar;
private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        botonOperar=findViewById(R.id.botonOperar);

        spinner=findViewById(R.id.spinner);
        String[]opciones={"Suma","Resta","Dividir","Multiplicar"};
        ArrayAdapter<String>stringArrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        spinner.setAdapter(stringArrayAdapter);
    }
    public void operar(View voperar){
        
    }
}

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
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String selec=spinner.getSelectedItem().toString();
        if(selec.equals("Suma")){
        int suma=nro1 + nro2;
        String resultado=String.valueOf(suma);
        tv1.setText(resultado);}
        else if(selec.equals("Resta")){
            int resta=nro1 - nro2;
            String resultado=String.valueOf(resta);
            tv1.setText(resultado);
        }
        else if (selec.equals("Dividir")){
            int dividir=nro1/nro2;
            String resultado=String.valueOf(dividir);
            tv1.setText(resultado);
        }
        else if (selec.equals("Multiplicar")){
            int multiplicar=nro1*nro2;
            String resultado=String.valueOf(multiplicar);
            tv1.setText(resultado);
        }
    }

}

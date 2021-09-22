package com.example.lenovo.operacionesbasicas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText txt1;
    EditText txt2;
    TextView txtVResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         txt1 = findViewById(R.id.txt1);
         txt2 = findViewById(R.id.txt2);
         txtVResult=findViewById(R.id.textVResult);


    }

    public void sumarClick(View V){

String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado de suma: "+(num1+num2));
    }
    public void restaClick(View V){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado de suma: "+(num1-num2));
    }
    public void multiplicarClick(View V){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado de suma: "+(num1*num2));
    }
    public void dividirClick(View V){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado de suma: "+(num1/num2));
    }
    public void potenciaClick(View V){

        String n1 =txt1.getText().toString();
        String n2 =txt2.getText().toString();
        float num1= Float.parseFloat(n1);
        float num2= Float.parseFloat(n2);
        txtVResult.setText("resultado de suma: "+(Math.pow(num1, num2)));
    }
}






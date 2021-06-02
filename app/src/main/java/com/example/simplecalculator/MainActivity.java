package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.math.*;

public class MainActivity extends AppCompatActivity {
    private EditText Num1;
    private EditText Num2;
    private TextView Results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1 = (EditText) findViewById(R.id.Num1);

        Num2 = (EditText) findViewById(R.id.Num2);
        Results = (TextView) findViewById(R.id.Results);


    }

    public void btnsum(View view) {
        int numb1 = Integer.parseInt(Num1.getText().toString());
        int numb2 = Integer.parseInt(Num2.getText().toString());
        int ans = numb1 + numb2;

        Results.setText(String.valueOf(ans));

    }

    public void btnsub(View view) {
        int numb1 =Integer.parseInt(Num1.getText().toString());
        int numb2 =Integer.parseInt(Num2.getText().toString());
        int ans = numb1 - numb2;

        Results.setText(String.valueOf(ans));
    }

    public void btnmulti(View view) {
        int numb1 =Integer.parseInt(Num1.getText().toString());
        int numb2 =Integer.parseInt(Num2.getText().toString());
        int ans = numb1 * numb2;

        Results.setText(String.valueOf(ans));
    }

    public void btndiv(View view) {
        int numb1 =Integer.parseInt(Num1.getText().toString());
        int numb2 =Integer.parseInt(Num2.getText().toString());
        int ans = numb1 / numb2;

        Results.setText(String.valueOf(ans));
    }

    public void btnrem(View view) {
        int numb1 =Integer.parseInt(Num1.getText().toString());
        int numb2 =Integer.parseInt(Num2.getText().toString());
        int ans = numb1 % numb2;

        Results.setText(String.valueOf(ans));
    }

    public void clearOnClick(View view) {
        Num1.getText().clear();
        Num2.getText().clear();
        Results.setText("RESULTS");


    }


    public void btnExponent(View view) {
        int numb1 =Integer.parseInt(Num1.getText().toString());
        int numb2 =Integer.parseInt(Num2.getText().toString());
        double ans = Math.pow(numb1,numb2);

        Results.setText(String.valueOf(ans));
    }
}
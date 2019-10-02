package com.example.ps10814_androidlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Bundle bundle = getIntent().getBundleExtra("go");
        float firstNumber = bundle.getFloat("firstOperand");
        float secondNumber = bundle.getFloat("secondOperand");
        int choice = bundle.getInt("choice");
        switch (choice){
            case 0:
                Toast.makeText(this, firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber), Toast.LENGTH_LONG).show();
            case 1:
                Toast.makeText(this, firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber), Toast.LENGTH_LONG).show();
            case 2:
                Toast.makeText(this, firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber), Toast.LENGTH_LONG).show();
            case 3:
                Toast.makeText(this, firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber), Toast.LENGTH_LONG).show();
        }
    }
}

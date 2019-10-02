package com.example.ps10814_androidlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private final String Tag = "CallFunction";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapComponent();
        SetOnClickListener();
    }
    private static int CAL = 0;
    private EditText etFirstOperand = null;
    private EditText etSecondOperand = null;
    private Button btnPlus = null;
    private Button btnSub = null;
    private Button btnMul = null;
    private Button btnDevi = null;
    //MAPPING
    private void mapComponent() {
        if (etFirstOperand == null)
            etFirstOperand = findViewById(R.id.etFirstOperand);
        if (etSecondOperand == null)
            etSecondOperand = findViewById(R.id.etSecondOperand);
        if (btnPlus == null)
            btnPlus = findViewById(R.id.btnPlus);
        if(btnSub == null)
            btnSub    = findViewById(R.id.btnSub);
        if(btnMul == null)
            btnMul = findViewById(R.id.btnMul);
        if(btnDevi == null)
            btnDevi = findViewById(R.id.btnDevi);
    }

    private void SetOnClickListener() {
        if (btnPlus == null)
            mapComponent();
        if (btnSub == null)
            mapComponent();
        if (btnMul == null)
            mapComponent();
        if (btnDevi == null)
            mapComponent();
        //Plus bundle
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAL = 0;
                float firstOperand = Float.parseFloat(etFirstOperand.getText().toString());
                float secondOperand = Float.parseFloat(etSecondOperand.getText().toString());
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                Bundle bundle = new Bundle();
                bundle.putFloat("firstOperand", firstOperand);
                bundle.putFloat("secondOperand", secondOperand);
                bundle.putInt("choice",CAL);
                intent.putExtra("go", bundle);
                startActivity(intent);
            }
        });
        //Subtract bundle
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAL = 1;
                float firstOperand = Float.parseFloat(etFirstOperand.getText().toString());
                float secondOperand = Float.parseFloat(etSecondOperand.getText().toString());
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                Bundle bundle = new Bundle();
                bundle.putFloat("firstOperand", firstOperand);
                bundle.putFloat("secondOperand", secondOperand);
                bundle.putInt("choice",CAL);
                intent.putExtra("go", bundle);
                startActivity(intent);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAL = 2;
                float firstOperand = Float.parseFloat(etFirstOperand.getText().toString());
                float secondOperand = Float.parseFloat(etSecondOperand.getText().toString());
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                Bundle bundle = new Bundle();
                bundle.putFloat("firstOperand", firstOperand);
                bundle.putFloat("secondOperand", secondOperand);
                bundle.putInt("choice",CAL);
                intent.putExtra("go", bundle);
                startActivity(intent);
            }
        });
        btnDevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAL = 3;
                float firstOperand = Float.parseFloat(etFirstOperand.getText().toString());
                float secondOperand = Float.parseFloat(etSecondOperand.getText().toString());
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                Bundle bundle = new Bundle();
                bundle.putFloat("firstOperand", firstOperand);
                bundle.putFloat("secondOperand", secondOperand);
                bundle.putInt("choice",CAL);
                intent.putExtra("go", bundle);
                startActivity(intent);
            }
        });
    }
}


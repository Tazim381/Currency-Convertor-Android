package com.example.moneyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btnClear,btnCalculate;
    EditText edtInput;
    RadioButton rdUSDtoBDT,rdBDTtoUSD,rdINRtoUSD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtInput = findViewById(R.id.edtInput);
        btnCalculate = findViewById(R.id.btnCalculate);
                btnClear = findViewById(R.id.btnClear);
                rdBDTtoUSD = findViewById(R.id.rdBDToUSD);
        rdUSDtoBDT= findViewById(R.id.rdUSDtoBDT);
        rdINRtoUSD = findViewById(R.id.rdINRtoUSD);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input = new Double((edtInput.getText().toString()));
                if(rdBDTtoUSD.isChecked()) {
                    double result = ConvertCurrency.bdtUSD(input);
                    edtInput.setText(new Double(result).toString());
                } else if(rdUSDtoBDT.isChecked()) {
                    double result = ConvertCurrency.usdBDT(input);
                    edtInput.setText(new Double(result).toString());
                } else if(rdINRtoUSD.isChecked()) {
                    double result = ConvertCurrency.inrUSD(input);
                    edtInput.setText(new Double(result).toString());
                }


            }
        });

    }
}
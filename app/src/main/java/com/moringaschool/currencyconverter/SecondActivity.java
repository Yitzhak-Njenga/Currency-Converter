package com.moringaschool.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.btn) Button mButton;
    @BindView(R.id.userInput) EditText mCurrencyToConverted;
    @BindView(R.id.result) EditText mCurrencyConverted;
    @BindView(R.id.from_currency) Spinner mConvertedFromDropDown;
    @BindView(R.id.converter_to) Spinner mConvertToDropDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);




        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
package com.moringaschool.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.btn) Button mButton;
    @BindView(R.id.userInput) EditText mCurrencyToConverted;
    @BindView(R.id.result) EditText mCurrencyConverted;
    @BindView(R.id.converter_from) Spinner mConvertedFromDropDown;
    @BindView(R.id.converter_to) Spinner mConvertToDropDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);


        //setting the adapter list to the dropdown menu
        String[] dripDownList = {"USD","TZS","KES","JAP"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,dripDownList);
        mConvertedFromDropDown.setAdapter(adapter);
        mConvertToDropDown.setAdapter(adapter);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
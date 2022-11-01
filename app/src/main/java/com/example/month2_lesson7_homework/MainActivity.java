package com.example.month2_lesson7_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private Integer first, second;
    private boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        newIntent();

        ImageButton back = findViewById(R.id.backspace);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String backs = null;
                if (result.getText().length()>0){
                    StringBuilder stringBuilder =  new StringBuilder(result.getText());
                    stringBuilder.deleteCharAt(result.getText().length()-1);
                    backs = stringBuilder.toString();
                    result.setText(backs);
                }
            }
        });

        }

public void newIntent(){
    Button res = findViewById(R.id.res_btn);
    res.setVisibility(View.INVISIBLE);
        res.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("Result", result.getText().toString());
            startActivity(intent);

        });
}

    public void onNumberClick(View view) {
        switch (view.getId()){

            case R.id.one:
                if (result.getText().toString().equals("0")){
                    result.setText("1");
                } else if(isOperationClick){
                    result.setText("1");
                } else {
                    result.append("1");
                }
                Button resOne = findViewById(R.id.res_btn);
                    resOne.setVisibility(View.INVISIBLE);

                isOperationClick = false;

                break;
            case R.id.two:
                Button resTwo = findViewById(R.id.res_btn);
                    resTwo.setVisibility(View.INVISIBLE);

                if (result.getText().toString().equals("0")){
                    result.setText("2");
                } else if(isOperationClick){
                    result.setText("2");
                } else {
                    result.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.three:
                Button resThree = findViewById(R.id.res_btn);
                    resThree.setVisibility(View.INVISIBLE);

                if (result.getText().toString().equals("0")){
                    result.setText("3");
                } else if(isOperationClick){
                    result.setText("3");
                } else {
                    result.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.four:
                Button resFour = findViewById(R.id.res_btn);
                    resFour.setVisibility(View.INVISIBLE);


                if (result.getText().toString().equals("0")){
                    result.setText("4");
                } else if(isOperationClick){
                    result.setText("4");
                } else {
                    result.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.five:
                Button resFive = findViewById(R.id.res_btn);
                    resFive.setVisibility(View.INVISIBLE);

                if (result.getText().toString().equals("0")){
                    result.setText("5");
                } else if(isOperationClick){
                    result.setText("5");
                } else {
                    result.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.six:
                Button resSix = findViewById(R.id.res_btn);
                    resSix.setVisibility(View.INVISIBLE);


                if (result.getText().toString().equals("0")){
                    result.setText("6");
                } else if(isOperationClick){
                    result.setText("6");
                } else {
                    result.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.seven:
                Button resSeven = findViewById(R.id.res_btn);
                    resSeven.setVisibility(View.INVISIBLE);

                if (result.getText().toString().equals("0")){
                    result.setText("7");
                } else if(isOperationClick){
                    result.setText("7");
                } else {
                    result.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.eight:
                Button resEight = findViewById(R.id.res_btn);
                    resEight.setVisibility(View.INVISIBLE);
                if (result.getText().toString().equals("0")){
                    result.setText("8");
                } else if(isOperationClick){
                    result.setText("8");
                } else {
                    result.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.nine:
                Button resNine = findViewById(R.id.res_btn);
                    resNine.setVisibility(View.INVISIBLE);
                if (result.getText().toString().equals("0")){
                    result.setText("9");
                } else if(isOperationClick){
                    result.setText("9");
                } else {
                    result.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.zero:
                Button resZero = findViewById(R.id.res_btn);
                    resZero.setVisibility(View.INVISIBLE);

                result.append("0");
                break;
            case R.id.ac:
                Button resAc = findViewById(R.id.res_btn);
                    resAc.setVisibility(View.INVISIBLE);

                result.setText("0");
                first = 0;
                second = 0;
                break;


        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()){

            case R.id.plus:

                first = Integer.parseInt(result.getText().toString());
                operation = "+";
                Button resPlus = findViewById(R.id.res_btn);
                resPlus.setVisibility(View.INVISIBLE);

                isOperationClick = true;
                break;
            case R.id.minus:



                first = Integer.parseInt(result.getText().toString());
                operation = "-";
                Button resMinus = findViewById(R.id.res_btn);
                resMinus.setVisibility(View.INVISIBLE);
                isOperationClick = true;
                break;
            case R.id.multi:

                first = Integer.parseInt(result.getText().toString());
                operation = "*";
                Button resMulti = findViewById(R.id.res_btn);
                resMulti.setVisibility(View.INVISIBLE);

                isOperationClick = true;
                break;
            case R.id.divide:

                first = Integer.parseInt(result.getText().toString());
                operation = "/";
                Button resDivide = findViewById(R.id.res_btn);
                resDivide.setVisibility(View.INVISIBLE);

                isOperationClick = true;
                break;

            case R.id.equals:
                second = Integer.parseInt(result.getText().toString());
                switch (operation){
                    case "+":
                        Button res = findViewById(R.id.res_btn);
                        res.setVisibility(View.VISIBLE);
                        second = Integer.parseInt(result.getText().toString());
                        Integer plusResult = first + second;
                        result.setText(plusResult.toString());
                        isOperationClick = true;
                        break;
                    case "-":
                        Button resM = findViewById(R.id.res_btn);
                        resM.setVisibility(View.VISIBLE);
                        second = Integer.parseInt(result.getText().toString());
                        Integer minusResult = first - second;
                        result.setText(minusResult.toString());
                        isOperationClick = true;
                        break;
                    case "*":
                        Button resMl = findViewById(R.id.res_btn);
                        resMl.setVisibility(View.VISIBLE);
                        second = Integer.parseInt(result.getText().toString());
                        Integer multiResult = first * second;
                        result.setText(multiResult.toString());
                        isOperationClick = true;

                        break;
                    case "/":
                        Button resDv = findViewById(R.id.res_btn);
                        resDv.setVisibility(View.VISIBLE);
                             second = Integer.parseInt(result.getText().toString());
                             Integer divideResult = first / second;
                             result.setText(divideResult.toString());
                             isOperationClick = true;
                        }
                        break;

                }




                isOperationClick = true;
        }

    }

package com.example.month2_lesson7_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
                isOperationClick = false;

                break;
            case R.id.two:
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
                result.append("0");
                break;
            case R.id.ac:
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
                isOperationClick = true;
                break;
            case R.id.minus:
                first = Integer.parseInt(result.getText().toString());
                operation = "-";
                isOperationClick = true;
                break;
            case R.id.multi:
                first = Integer.parseInt(result.getText().toString());
                operation = "*";
                isOperationClick = true;
                break;
            case R.id.divide:
                first = Integer.parseInt(result.getText().toString());
                operation = "/";
                isOperationClick = true;
                break;
            case R.id.equals:
                second = Integer.parseInt(result.getText().toString());
                switch (operation){
                    case "+":
                        second = Integer.parseInt(result.getText().toString());
                        Integer plusResult = first + second;
                        result.setText(plusResult.toString());
                        isOperationClick = true;
                        break;
                    case "-":
                        second = Integer.parseInt(result.getText().toString());
                        Integer minusResult = first - second;
                        result.setText(minusResult.toString());
                        isOperationClick = true;
                        break;
                    case "*":
                        second = Integer.parseInt(result.getText().toString());
                        Integer multiResult = first * second;
                        result.setText(multiResult.toString());
                        isOperationClick = true;

                        break;
                    case "/":

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

package com.example.witold.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private double numberOne = Double.NaN;
    private double numberTwo;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    private void calculation() {
        TextView result = (TextView) findViewById(R.id.result);
        String res = (String) result.getText();

        if (!Double.isNaN(numberOne)) {
            numberTwo = Double.parseDouble(res);

            if (CURRENT_ACTION == ADDITION)
                numberOne = this.numberOne + numberTwo;
            else if (CURRENT_ACTION == SUBTRACTION)
                numberOne = this.numberOne + numberTwo;
            else if (CURRENT_ACTION == MULTIPLICATION)
                numberOne = this.numberOne + numberTwo;
            else if (CURRENT_ACTION == DIVISION)
                numberOne = this.numberOne + numberTwo;
        } else {
            try {
                numberOne = Double.parseDouble(res);
            }
            catch (Exception e) {}
        }
    }

    public void onClickDivide(View view) {
    }

    public void onClickMultiple(View view) {
    }

    public void onClickSubtract(View view) {
    }

    public void onClickAdd(View view) {
        calculation();
        CURRENT_ACTION = ADDITION;
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("+");
    }

    public void onClickEqual(View view) {
    }

    public void onClickClear(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText("");
    }
    public void onClickSeven(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("7");
    }

    public void onClickEight(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("8");
    }

    public void onClickNine(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("9");
    }

    public void onClickFour(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("4");
    }

    public void onClickFive(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("5");
    }

    public void onClickSix(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("6");
    }

    public void onClickOne(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("1");
    }

    public void onClickTwo(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("2");
    }

    public void onClickThree(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("3");
    }

    public void onClickDot(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append(".");
    }

    public void onClickZero(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        result.append("0");
    }

}

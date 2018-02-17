package com.latnok.bestcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button nine,eight,seven,six,five,four,three,two,one,zero,dot,plus,minus,divide,multiply,equals,clear;
    TextView et;
    java.lang.String s = "0";
    int result = 0;
    char io = ' ';

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nine = (Button)findViewById(R.id.b9);
        eight = (Button)findViewById(R.id.b8);
        seven = (Button)findViewById(R.id.b7);
        six = (Button)findViewById(R.id.b6);
        five = (Button)findViewById(R.id.b5);
        four = (Button)findViewById(R.id.b4);
        three = (Button)findViewById(R.id.b3);
        two = (Button)findViewById(R.id.b2);
        one = (Button)findViewById(R.id.b1);
        zero = (Button)findViewById(R.id.b0);
        dot = (Button)findViewById(R.id.bd);
        plus = (Button)findViewById(R.id.bp1);
        minus = (Button)findViewById(R.id.bmin);
        divide = (Button)findViewById(R.id.bdiv);
        multiply = (Button)findViewById(R.id.bmul);
        equals = (Button)findViewById(R.id.beq);
        clear = (Button)findViewById(R.id.bcl);
        et = (TextView) findViewById(R.id.Etext);
        nine.setOnClickListener(this);
        eight.setOnClickListener(this);
        seven.setOnClickListener(this);
        six.setOnClickListener(this);
        five.setOnClickListener(this);
        four.setOnClickListener(this);
        three.setOnClickListener(this);
        two.setOnClickListener(this);
        one.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        equals.setOnClickListener(this);
        clear.setOnClickListener(this);
        et.setOnClickListener(this);


    }


    public void onClick(View v){

        switch(v.getId()){
            case R.id.b0:
            case R.id.b1:
            case R.id.b2:
            case R.id.b3:
            case R.id.b4:
            case R.id.b5:
            case R.id.b6:
            case R.id.b7:
            case R.id.b8:
            case R.id.b9:
            case R.id.bd:

                java.lang.String inDigit;
                switch (inDigit = ((Button) v).getText().toString()) {
                }
                if (s.equals("0")){
                    s= inDigit;
                }
                else{
                    s+=inDigit;
                }

                et.setText(s);
                if(io =='-'){
                result=0;
                io=' ';
            }
            break;
            case R.id.bp1:
                compute();
                io = '+';

                break;
            case R.id.bmin:
                compute();
                io = '-';

                break;

            case R.id.bdiv:
                compute();
                io = '/';

                break;
            case R.id.bmul:
                compute();
                io = '*';

                break;
            case R.id.beq:
                compute();
                io = '=';

                break;
            case R.id.bcl:
                result = 0;
                s= "0";
                io = ' ';
                et.setText("0");
                break;
        }
    }

    private void compute() {
        int inNum =Integer.parseInt(s);
        s = "0";
        if (io == ' '){
            result = inNum;
        }
        else if (io == '+'){
            result +=inNum;
        }
        else if (io == '-'){
            result -=inNum;
        }
        else if (io == '*'){
            result *=inNum;
        }
        else if (io == '/'){
            result /=inNum;
        }

        else if (io == '='){

        }
        et.setText(String.valueOf(result));
    }


}


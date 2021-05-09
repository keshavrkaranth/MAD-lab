package com.keshavrkaranth.caluclator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,dot;
    Button add,substract,multiply,divide,exp,not,mod,clear,eqs;
    double num1,num2,res;
    TextView txt;
    Boolean addd,subs,mul,div,expp,modd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button) findViewById(R.id.zero);
        b1=(Button) findViewById(R.id.one);
        b2=(Button) findViewById(R.id.two);
        b3=(Button) findViewById(R.id.three);
        b4=(Button) findViewById(R.id.four);
        b5=(Button) findViewById(R.id.five);
        b6=(Button) findViewById(R.id.six);
        b7=(Button) findViewById(R.id.seven);
        b8=(Button) findViewById(R.id.eight);
        b9=(Button) findViewById(R.id.nine);
        clear=(Button) findViewById(R.id.clr);
        dot = (Button) findViewById(R.id.dot);
        txt = findViewById(R.id.res);
        add = findViewById(R.id.plus);
        substract = findViewById(R.id.min);
        multiply = findViewById(R.id.mult);
        divide = findViewById(R.id.divide);
        mod = findViewById(R.id.mod);
        exp = findViewById(R.id.exp);
        not = findViewById(R.id.not);
        eqs = findViewById(R.id.eqs);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"9");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString() + ".");

            }
        });
        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num = Double.parseDouble(txt.getText().toString())*-1;
                txt.setText(num.toString());
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    addd=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                }
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    subs=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    mul=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");

                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    div=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    modd=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");

                }
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    expp=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");

                }
            }
        });

        eqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {

                    num2 = Double.parseDouble(txt.getText().toString());

                   if(addd){
                       try{
                           res = num1+num2;
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       addd=false;
                       txt.setText(Double.toString(res));
                   }else if(subs){
                       try{
                           res = num1-num2;
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       subs=false;
                       txt.setText(Double.toString(res));
                   }else if(mul){
                       try{
                           res = num1*num2;
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       mul=false;
                       txt.setText(Double.toString(res));
                   }else if(div){
                       try{
                           res = num1/num2;
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       div=false;
                       txt.setText(Double.toString(res));
                   }else if(expp){
                       try{
                           res = Math.pow(num1,num2);
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       expp=false;
                       txt.setText(Double.toString(res));
                   }else if(modd){
                       try{
                           res = num1%num2;
                       }
                       catch (Exception e){
                           System.out.println(e);
                       }
                       modd=false;
                       txt.setText(Double.toString(res));
                   }
                }



            }
        });


    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText ed1;
        boolean isNewOpe =true;
        String op= "+";
        String oldNum= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1= (findViewById(R.id.editTextText));
    }

    public void numberEvent(View view){

        if (isNewOpe)
            ed1.setText(" ");
        isNewOpe= false;
        String number = ed1.getText().toString();
        switch (view.getId()){

            case R.id.btn1:
                number += "1";
                break;
                case R.id.btn2:
                number += "2";
                break;
                case R.id.btn3:
                number += "3";
                break;
                case R.id.btn4:
                number += "4";
                break;
                case R.id.btn5:
                number += "5";
                break;
                case R.id.btn6:
                number += "6";
                break;
                case R.id.btn7:
                number += "7";
                break;
                case R.id.btn8:
                number += "8";
                break;
            case R.id.btn9:
                number += "9";
                break;
            case R.id.btn0:
                number += "0";
                break;
            case R.id.btnAC:
                number += "AC";
                break;
            case R.id.btnAdd:
                number += "+";
                break;
            case R.id.btnDot:
                number += ".";
                break;
            case R.id.btnEquals:
                number += "=";
                break;
            case R.id.btnMultu:
                number += "x";
                break;
            case R.id.btnSub:
                number += "-";
                break;
//            case R.id.btnDelete:
//                String del= "";
//                for (int i=0; i< ed1.length()-1; i++ );
//                del += ed1.Substring(i);
//                break;
        }
        ed1.setText(number);



    }

    public void operatorEvent(View view) {
        isNewOpe=true;
        oldNum=ed1.getText().toString();
        switch (view.getId()){
            case R.id.btnSub: op= "-"; break;
            case R.id.btnMultu: op= "x"; break;
            case R.id.btnAdd: op= "+"; break;
            case R.id.btnDiv: op= "/"; break;



        }
    }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result= Double.parseDouble(oldNum)+ Double.parseDouble(newNumber);
                break;
            case "-":
                result= Double.parseDouble(oldNum)- Double.parseDouble(newNumber);
                break;
            case "x":
                result= Double.parseDouble(oldNum)* Double.parseDouble(newNumber);
                break;
            case "/":
                result= Double.parseDouble(oldNum)/ Double.parseDouble(newNumber);
                break;
        }

        ed1.setText(result+"");
    }

    public void ACEvent(View view) {
        ed1.setText("0");
        isNewOpe= true;
    }

    public void percentEvent(View view) {
        double num= Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(num+"");
        isNewOpe=true;
    }

//    public void deleteEvent(View view) {
//       String del= "";
//       for (int i=0; i< ed1.length()-1; i++ );
//            del += ed1.charAt(i);
//    }
}
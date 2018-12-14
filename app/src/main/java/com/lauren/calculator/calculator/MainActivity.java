/****************************************************************************
 *
 *  Copyright (C) 2018 "Lauren Brown" <lsbrown@captechu.edu>
 *
 *  This file is subject to the terms and conditions defined in
 *  file 'LICENSE.txt', which is part of this source code package.
 *
 *	Date Modified: 1/22/2018
 *  Author: Lauren Brown
 *  Version: 1.0
 *
 ****************************************************************************/

package com.lauren.calculator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


//Main Activity Class with Backwards App Compatibility
public class MainActivity extends AppCompatActivity {


    /*******Notice to Instructor
    * If I move the edit text and boo lean variables inside the on create it does not like that,
    *  it complains that
    * it must be in the inner class.
     * So I've left it here.
    */

    //Declare our UserInput
    EditText edit; // Value for user input on the soft keys
    float num1, num2;

    //For second activity
    Button second;
    public static String sometext = "1.0"; //Pass some data
    String value; // Return the final value from Second Activity
    TextView number; // Final converted number

    //Set the conditions
    boolean Add, Sub, Mul, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare our Buttons
        Button button7, button8, button9, button4, button5, button6,
                button1, button2, button3, button0, button10, button_clear, button_equal,
                button_sub, button_mul, button_add, button_div;


        //Assign Our Buttons to an ID
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button_clear = findViewById(R.id.button_clear);
        button_equal = findViewById(R.id.button_equal);
        button_sub = findViewById(R.id.button_sub);
        button_mul = findViewById(R.id.button_mul);
        button_add = findViewById(R.id.button_add);
        button_div = findViewById(R.id.button_div);

        second = findViewById(R.id.second); //Assign the Second Variable to the Bottom right hand button.
        edit = findViewById(R.id.edit);
        
        
        //Set Listeners for the Button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+"0");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edit == null){
                    edit.setText("");
                }else {
                    num1 = Float.parseFloat(edit.getText() + "");
                    Add = true;
                    edit.setText(null);
                }
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edit.getText() + "");
                Sub = true ;
                edit.setText(null);
            }
        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edit.getText() + "");
                Mul = true ;
                edit.setText(null);
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edit.getText()+"");
                Div = true ;
                edit.setText(null);
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(edit.getText() + "");

                if (Add == true){

                    edit.setText(num1 + num2 +"");
                    Add=false;
                }


                if (Sub == true){
                    edit.setText(num1 - num2+"");
                    Sub=false;
                }

                if (Mul == true){
                    edit.setText(num1 * num2+"");
                    Mul=false;
                }

                if (Div == true){
                    edit.setText(num1 / num2+"");
                    Div=false;
                }
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText()+".");
            }
        });



       //On Click go to the second activity
        // This is disabled because it's causing the program to crash, if you have the solution to
        // this issue please let me know and I'll correct it asap.
        /*
        second.setOnClickListener(new View.OnClickListener()
        {   public void onClick(View v)
        {
            Intent intent = new Intent(MainActivity.this, Second.class);
            startActivity(intent);
            finish();
        }
        });
*/

        /* Disabled because it's causing the app to crash, if you know how to fix it let me know

        value = Second.go; //Return the data from Second.java class

        number.setText(value); // Set the text from the passed variable
        number = findViewById(R.id.returned); // Attach it to the text view id for display
        */
    }



}



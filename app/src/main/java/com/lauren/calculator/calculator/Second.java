package com.lauren.calculator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {

/* Disabled due to crashing
    Button Back;
    public static String go;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
/* Disabled due to crashing
        String pass;



        pass = MainActivity.sometext; //Get the set value from the Main Activity and put it here.

        go = pass+1; //Add 1 from the original value from main activity pass and send it to go.
            */

        //Disabled since it's causing the app to crash
        /*
        //On Click go back to the first activity
        Back.setOnClickListener(new View.OnClickListener()
        {   public void onClick(View v)
        {
            Intent intent = new Intent(Second.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        });
*/

    }
}

package com.shikhastudio.examquiz;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    // define the global variable
    TextView question3;
    // Add button Move previous activity
    Button previous_button,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // by ID we can use each component which id is assign in xml file
        // use findViewById() to get the Button and textview.

        previous_button = (Button)findViewById(R.id.third_activity_previous_button);
        next_button=(Button)findViewById(R.id.third_activity_next_button);
        question3 = (TextView)findViewById(R.id.question3_id);

        // In question1 get the TextView use by findViewById()
        // In TextView set question Answer for message

        question3.setText("Q 3 - How to store heavy structured data in android?\n"
                + "\n"
                + "Ans- SQlite database");
        // Add_button add clicklistener
        previous_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}
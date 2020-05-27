package com.shikhastudio.examquiz;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
public class FourthActivity extends AppCompatActivity {
    TextView question_4;
    Button next_button,previous_button;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        next_button=(Button)findViewById(R.id.fourth_activity_previous_button);
        previous_button=(Button)findViewById(R.id.fourth_activity_next_button);
        question_4=(TextView)findViewById(R.id.question4_id);
        question_4.setText("Q 4 - No. of key components in android architecture?\n"
                + "\n"
                + "Ans- 4");
        next_button.setOnClickListener(new View.OnClickListener() {

                                           public void onClick(View v) {
                                               Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                                               startActivity(intent);
                                           }
                                       });
        previous_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FourthActivity.this,ThirdActivity.class);
            }
        });
    }
}

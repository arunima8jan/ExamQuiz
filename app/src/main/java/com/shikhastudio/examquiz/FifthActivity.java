package com.shikhastudio.examquiz;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
public class FifthActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        TextView question_5;
        Button first_button,previous_button;
        question_5=(TextView)findViewById(R.id.question5_id);
        first_button=(Button) findViewById(R.id.fifth_activity_first_button);
        previous_button=(Button)findViewById(R.id.fifth_activity_previous_button);
        question_5.setText("Q 5 -How many ports are accomodated for a new emulator?\n"
                + "\n"
                + "Ans- 2");
        first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FifthActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
  previous_button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent=new Intent(FifthActivity.this,FourthActivity.class);
          startActivity(intent);
      }
  });
    }
}

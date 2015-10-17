package studio.teddev.com.colortest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int answer;
    Button btn_answer;
    EditText text_input;
    TextView text_noti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_answer = (Button) findViewById(R.id.btn_answer);
        text_input = (EditText) findViewById(R.id.text_input);
        text_noti = (TextView) findViewById(R.id.text_answer);

        btn_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answer = Integer.parseInt(text_input.getText().toString());
                if (answer == 45){
                    text_noti.setText("Correct");
                    text_noti.setTextColor(Color.GREEN);
                }else {
                    text_noti.setText("Incorrect !");
                    text_noti.setTextColor(Color.RED);
                }
            }
        });
    }
}
package com.shineprincess.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText  editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.btn_convert);
        textView = findViewById(R.id.convertedNumber);
        editText = findViewById(R.id.userText);



//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this, "Conveter Button Works", Toast.LENGTH_SHORT).show();
//
//                String s= editText.getText().toString();
//                int Kg= Integer.parseInt(s);
//                double pound = 2.205 * Kg;
//                textView.setText("The corresponding value in Pounds is " + pound);
//            }
//        });


    }
    public void calculateKgToPounds(View view) {
        String s = editText.getText().toString();
        int Kg= Integer.parseInt(s);
        double pound = 2.205 * Kg;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        textView.setText("The corresponding value in Pounds is " + df.format(pound));
        Toast.makeText(this,"Thanks for using my app",Toast.LENGTH_SHORT).show();
    }
}

package com.androidlabs.firstproject;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @SuppressLint({"ResourceAsColor", "SetTextI18n", "NonConstantResourceId"})
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        textView.setText("Change text");
                        break;
                    case R.id.btn2:
                        btn2.setBackgroundColor(R.color.purple_200);
                        break;
                    case R.id.btn3:
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Третья кнопка нажата!", Toast.LENGTH_SHORT);
                        toast.show();
                        break;
                }
            }
        };

        btn1.setOnClickListener(oclBtnOk);
        btn2.setOnClickListener(oclBtnOk);
        btn3.setOnClickListener(oclBtnOk);
    }


}
package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greetingMessage;
    Button btnHello, btnBye;
    EditText uesrMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connecting the XML to this Java file
        greetingMessage=findViewById(R.id.greetingMessage);
        btnHello=findViewById(R.id.btnHello);
        btnBye=findViewById(R.id.btnBye);
        uesrMsg=findViewById(R.id.userMsg);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //greetingMessage.setText("Hello, there");
                String msg = uesrMsg.getText().toString();
                String
            }
        });

        btnBye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                greetingMessage.setText(" ");
            }
        });

    }
}
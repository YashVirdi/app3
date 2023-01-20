package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greetingMessage;
    Button btnHello, btnBye;
    EditText uesrMsg;
    CheckBox chkGreen,chkBlue,chkRed;
    RadioButton btnRadioBlack,btnRadioBrown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connecting the XML to this Java file
        greetingMessage=findViewById(R.id.greetingMessage);
        btnHello=findViewById(R.id.btnHello);
        btnBye=findViewById(R.id.btnBye);
        uesrMsg=findViewById(R.id.userMsg);
        chkGreen=findViewById(R.id.chkGreen);
        chkBlue=findViewById(R.id.chkBlue);
        chkRed=findViewById(R.id.chkRed);
        btnRadioBrown=findViewById(R.id.btnRadioBrown);
        btnRadioBlack=findViewById(R.id.btnRadioBlack);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //greetingMessage.setText("Hello, there");
                //String msg = uesrMsg.getText().toString();
               // greetingMessage.setText(msg);
                //if the user does not choose anything
                String colours = "";
                if(chkRed.isChecked())
                    colours = colours + "Red";
                if(chkBlue.isChecked())
                    colours = colours + "Blue";
                if(chkGreen.isChecked())
                    colours = colours + "Green";
                greetingMessage.setText(colours);
            }
        });

        btnBye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //greetingMessage.setText(" ");
                String hairColour = "";
                if (btnRadioBlack.isChecked()){
                    hairColour ="Black";
                }
                if (btnRadioBrown.isChecked()){
                    hairColour="Brown";
                }
                greetingMessage.setText(hairColour);

            }
        });

    }
}
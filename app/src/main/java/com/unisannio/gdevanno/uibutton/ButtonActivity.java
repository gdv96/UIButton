package com.unisannio.gdevanno.uibutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        //Get a reference to the Press Me Button
        final Button button = (Button) findViewById(R.id.button);
        //Set OnClickListener on this Button
        //Called each time the user clicks the Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Mantein a count of user presses
                //Display count as text on the Button
                button.setText("Got Pressed:" + ++count);
            }
        });
    }
}
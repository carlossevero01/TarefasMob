package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TV = (TextView) findViewById(R.id.textview);
        Button B = (Button) findViewById(R.id.button);
        EditText ET = (EditText) findViewById(R.id.edittext);

        Toast Ts = Toast.makeText(getApplicationContext(), ET.getText(), Toast.LENGTH_SHORT);
        Ts.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  TV.setText(ET.getText());
                Ts.show();
            }
        });
    }
}
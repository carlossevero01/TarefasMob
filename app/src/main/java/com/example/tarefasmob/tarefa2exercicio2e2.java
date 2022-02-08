package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tarefa2exercicio2e2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa2exercicio2e2);
        EditText ET = (EditText) findViewById(R.id.informa);
        Button B = (Button) findViewById(R.id.Enviar);
        Intent returnIntent = new Intent();
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==B.getId()){
                    returnIntent.putExtra("informa",ET.getText().toString());
                    setResult(Activity.RESULT_OK,returnIntent);
                    finish();
                }
            }
        });

    }
}
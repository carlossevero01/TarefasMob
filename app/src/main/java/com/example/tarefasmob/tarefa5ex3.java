package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tarefa5ex3 extends AppCompatActivity {
    private EditText valormassa;
    private EditText valoraltura;
    private Button btnimc;
    private TextView valorIMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa5ex3);
        valormassa = (EditText) findViewById(R.id.editmassa);
        valoraltura = (EditText) findViewById(R.id.editaltura);
        btnimc = (Button) findViewById(R.id.btnimc);
        valorIMC = (TextView) findViewById(R.id.valorimc);
        btnimc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==btnimc.getId()){
                    Double massa= Double.valueOf(valormassa.getText().toString().trim());
                    Double altura= Double.valueOf(valoraltura.getText().toString().trim());
                    Double imc = (massa/(altura*altura));
                    valorIMC.setText(imc.toString());
                }
            }
        });


    }
}
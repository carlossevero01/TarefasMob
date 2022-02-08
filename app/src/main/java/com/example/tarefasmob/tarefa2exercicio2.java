package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tarefa2exercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this,tarefa2exercicio2e2.class);

        setContentView(R.layout.activity_tarefa2exercicio2);

        Button proximo = (Button) findViewById(R.id.proximo);
        Intent base = new Intent(this,MainActivity.class);
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==proximo.getId()){

                    startActivity(base);
                }
            }
        });
        startActivityForResult(intent,1);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String informa=data.getStringExtra("informa");
                TextView caixa = (TextView) findViewById(R.id.caixa);
                caixa.setText(informa);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                // Write your code if there's no result
            }
        }
    } //onActivityResult
}
package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Modifier;

public class tarefa2e2 extends AppCompatActivity
{
  private String mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_tarefa2e2);

        TextView TVbemvindo = (TextView) findViewById(R.id.bemvindo);
        EditText message = (EditText) findViewById(R.id.message);
        TextView mostrar = (TextView) findViewById(R.id.mostrar);
        Button salvar = (Button) findViewById(R.id.salvar);

        if(savedInstanceState != null){

            mensagem=savedInstanceState.getString("message");
        }
        mostrar.setText(mensagem);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==salvar.getId()){
                    mostrar.setText(message.getText());
                    mensagem=message.getText().toString();
                }
            }
        });
        Intent intent = getIntent();
        Bundle args = getIntent().getExtras();
        String usu =args.getString("usuario");
        TVbemvindo.setText("Bem Vindo "+usu);

    }
    protected void onSaveInstanceState(Bundle savedInstaceState){
        super.onSaveInstanceState(savedInstaceState);

        savedInstaceState.putString("message",mensagem);


    }




}
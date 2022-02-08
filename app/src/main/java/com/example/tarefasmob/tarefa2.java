package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class tarefa2 extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa2);

        EditText ETu = (EditText) findViewById(R.id.usuario);
        EditText ETs = (EditText) findViewById(R.id.senha);
        Button Btlogin = (Button) findViewById(R.id.bt1);
        TextView tv = (TextView) findViewById(R.id.titulo);
        String usuario = "carlos";
        String senha = "1234";
        Intent taref2e2 = new Intent(this,tarefa2e2.class);


        Bundle args = new Bundle();
        Btlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(view.getId()==Btlogin.getId())
                {

                    if(ETu.getText().toString().equals(usuario)&&ETs.getText().toString().equals(senha)){
                    args.putString("usuario", usuario);
                    taref2e2.putExtras(args);
                    startActivity(taref2e2);
                }else
                    {
                        Toast.makeText(getApplicationContext(), "Dados Incorretos", Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });

    }
}
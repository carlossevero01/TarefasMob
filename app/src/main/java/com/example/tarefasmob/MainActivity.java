package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button) findViewById(R.id.tarefa1);
        Button bt2 = (Button) findViewById(R.id.tarefa2);
        Button bt3 = (Button) findViewById(R.id.tarefa2exercicio2);
        Button bt4 = (Button) findViewById(R.id.tarefa4);
        Button bt5 = (Button) findViewById(R.id.tarefa4exerc2);


        bt2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.tarefa2){
                intent(2);
            }
        }

        });
        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.tarefa1){
                   intent(1);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==bt3.getId()){
                    intent(3);
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==bt4.getId()){
                    intent(4);
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==bt5.getId()){
                    intent(5);
                }
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.exercicio1){
            intent(1);
            return true;
        }
        if(id == R.id.exercicio2){
            intent(2);
            return true;
        }
        return super. onOptionsItemSelected(item);
    }
    private void intent(int ind){
        Intent tarefa1 = new Intent(this,tarefa1e2.class);
        Intent tarefa2 = new Intent(this,tarefa2.class);
        Intent tarefa2exercicio2 = new Intent(this, tarefa2exercicio2.class);
        Intent tarefa4 = new Intent(this, com.example.tarefasmob.tarefa4.class);
        Intent tarefa4exerc2 = new Intent(this, com.example.tarefasmob.tarefa4exerc2.class);
        switch(ind){
            case 1: startActivity(tarefa1); break;
            case 2: startActivity(tarefa2); break;
            case 3: startActivity(tarefa2exercicio2); break;
            case 4: startActivity(tarefa4); break;
            case 5: startActivity(tarefa4exerc2); break;
            default: break;
        }

    }
}
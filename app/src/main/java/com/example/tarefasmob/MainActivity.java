package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
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

        Button bt1 = (Button) findViewById(R.id.tarefa1);
        Button bt2 = (Button) findViewById(R.id.tarefa2);
        Button bt3 = (Button) findViewById(R.id.tarefa2exercicio2);



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
        if(ind==1){
           startActivity(tarefa1);
        }
        if(ind==2){
            startActivity(tarefa2);
        }
        if(ind==3){
            startActivity(tarefa2exercicio2);
        }
    }
}
package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class tarefa4conversaoR extends AppCompatActivity implements View.OnClickListener{
    private MenuItem itemSearch;
    private SearchView search;
    protected EditText ValorER;
    protected EditText ValorEP;
    protected EditText ValorED;
    protected Button btnCRP;
    protected Button btnCRD;
    protected Button btnCPR;
    protected Button btnCPD;
    protected Button btnCDR;
    protected Button btnCDP;
    protected TextView ResultCRP;
    protected TextView ResultCRD;
    protected TextView ResultCPR;
    protected TextView ResultCPD;
    protected TextView ResultCDR;
    protected TextView ResultCDP;
    protected String ValorP, ValorD, valorED, valorEP, valorER;
    protected String CDP="0.00", CDR="0.00", CPD="0.00", CRP="0.00", CRD="0.00", CPR="0.00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa4conversao_r);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle args = getIntent().getExtras();
        if(args!= null){
            ValorP = args.getString("peso");
            ValorD = args.getString("dolar");
        }else {
            ValorP = "8.37";
            ValorD = "0.19";
        }


        ValorER = (EditText) findViewById(R.id.valorEntReal);
        ValorEP = (EditText) findViewById(R.id.valorEntPeso);
        ValorED = (EditText) findViewById(R.id.valorEntDolar);
        ResultCRP = (TextView) findViewById(R.id.resultCRP);
        ResultCRD = (TextView) findViewById(R.id.resultCRD);
        ResultCPR = (TextView) findViewById(R.id.resultCPR);
        ResultCPD = (TextView) findViewById(R.id.resultCPD);
        ResultCDR = (TextView) findViewById(R.id.resultCDR);
        ResultCDP = (TextView) findViewById(R.id.resultCDP);
        btnCRP = (Button) findViewById(R.id.btnCRP);
        btnCRD = (Button) findViewById(R.id.btnCRD);
        btnCPR = (Button) findViewById(R.id.btnCPR);
        btnCPD = (Button) findViewById(R.id.btnCPD);
        btnCDR = (Button) findViewById(R.id.btnCDR);
        btnCDP = (Button) findViewById(R.id.btnCDP);
        btnCRP.setOnClickListener(this);
        btnCRD.setOnClickListener(this);
        btnCPR.setOnClickListener(this);
        btnCPD.setOnClickListener(this);
        btnCDR.setOnClickListener(this);
        btnCDP.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        DecimalFormat df = new DecimalFormat("#,###.00");

        if(view.getId()==R.id.btnCRP){
            valorER = (String )ValorER.getText().toString();
            if(valorER.equals("")){
                ResultCRP.setText(CRP);
            }else{
                CRP = (String) df.format(Double.valueOf(valorER)*Double.valueOf(ValorP));
                ResultCRP.setText(CRP);
            }

        }else if(view.getId()==R.id.btnCRD){
            valorER = (String )ValorER.getText().toString();
            if(valorER.equals("")){
                ResultCRD.setText(CRD);
            }else{
                CRD = (String) df.format(Double.valueOf(valorER)*Double.valueOf(ValorD));
                ResultCRD.setText(CRD);
            }

        }else if(view.getId()==R.id.btnCPR){
            valorEP = (String )ValorEP.getText().toString();
            if(valorEP.equals("")){
                ResultCPR.setText(CPR);
            }else{
                CPR = (String) df.format(Double.valueOf(valorEP)/Double.valueOf(ValorP));
                ResultCPR.setText(CPR);
            }

        }else if(view.getId()==R.id.btnCPD){
            valorEP = (String )ValorEP.getText().toString();
            if(valorEP.equals("")){
                ResultCPD.setText(CPD);
            }else{
                CPD = (String) df.format(Double.valueOf(valorEP)*Double.valueOf("0.023"));
                ResultCPD.setText(CPD);
            }

        }else if(view.getId()==R.id.btnCDR){
            valorED = (String)ValorED.getText().toString();
            if(valorED.equals("")){
                ResultCDR.setText(CDR);
            }else{
                CDR = (String) df.format(Double.valueOf(valorED)*Double.valueOf("5.14"));
                ResultCDR.setText(CDR);
            }


        }else if(view.getId()==R.id.btnCDP){
            valorED = (String)ValorED.getText().toString();
            if(valorED.equals("")){
                ResultCDP.setText(CDP);
            }else{
                CDP = (String) df.format(Double.valueOf(valorED)*Double.valueOf("43.04"));
                ResultCDP.setText(CDP);
            }

        }


    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_exerc4,menu);

        itemSearch = menu.findItem(R.id.action_search);
        search = (SearchView) itemSearch.getActionView();
        search.setOnQueryTextListener(onSearch());

        MenuItem shareItem = menu.findItem(R.id.action_share);
        ShareActionProvider share = (ShareActionProvider)
                MenuItemCompat.getActionProvider(shareItem);
        share.setShareIntent(getDefaultIntent());
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        finish();

        return super.onOptionsItemSelected(item);
    }

    private Intent getDefaultIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT,"Texto para Compartilhar");
        return intent;
    }

    public SearchView.OnQueryTextListener onSearch()
    {
        SearchView.OnQueryTextListener s = new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getApplicationContext(), "Buscar o texto:" + query, Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        };
        return s;
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString("CRP", CRP);
        savedInstanceState.putString("CRD", CRD);
        savedInstanceState.putString("CPR", CPR);
        savedInstanceState.putString("CPD", CPD);
        savedInstanceState.putString("CDR", CDR);
        savedInstanceState.putString("CDP", CDP);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
            if(savedInstanceState!=null){

                CRP = savedInstanceState.getString("CRP");
                CRD = savedInstanceState.getString("CRD");
                CPR = savedInstanceState.getString("CPR");
                CPD = savedInstanceState.getString("CPD");
                CDR = savedInstanceState.getString("CDR");
                CDP = savedInstanceState.getString("CDP");
                    ResultCRP.setText(CRP);
                    ResultCRD.setText(CRD);
                    ResultCPR.setText(CPR);
                    ResultCPD.setText(CPD);
                    ResultCDR.setText(CDR);
                    ResultCDP.setText(CDP);
                }





    }

}


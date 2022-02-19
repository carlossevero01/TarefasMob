package com.example.tarefasmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class tarefa4 extends AppCompatActivity {
    private MenuItem itemSearch;
    private SearchView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
}
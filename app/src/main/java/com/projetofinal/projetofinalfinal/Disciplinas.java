package com.projetofinal.projetofinalfinal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Disciplinas extends ActionBarActivity {

    //ListView pro menu
    private ListView menuDisci;

    //Conteúdo da lista
    String[] menuDisciOptions = new String[] { "Grade","Andamento", "Qualidade"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas);

        menuDisci = (ListView) findViewById(R.id.menuDisci);


        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuDisciOptions);

        menuDisci.setAdapter(adapter);

        menuDisci.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i;
                switch (position) {
                    case 0:
                        i = new Intent(getApplicationContext(), Grade.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(getApplicationContext(), Andamento.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(getApplicationContext(), Qualidade.class);
                        startActivity(i);
                        break;
                }
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_disciplinas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

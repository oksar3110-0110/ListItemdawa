package com.oksareinaldi.abah.listitemdawa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] presidents = {
      "Soekarno",
            "Soeharto",
            "B.J. Habibie",
            "Megawati Soekarno Putri",
            "Susilo Bambang Yudhoyono",
            "Jokowidodo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, presidents));

    }
    public void onListItemClick(ListView parent, View view, int Position, long id){
        Toast.makeText(this, "You Have Selected : "+ presidents[Position],
                Toast.LENGTH_SHORT).show();
    }
}

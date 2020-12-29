package com.company.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =findViewById(R.id.toolbar);
        toolbar.setTitle("Hello Toolbar");
        toolbar.inflateMenu(R.menu.menu_main);

        toolbar.setOnMenuItemClickListener(item -> {
            if(item.getItemId()==R.id.android){
                Toast.makeText(this, "Hello Android!", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });
        /*
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
        @override
        public boolean onMenuItemClick(MenuItem item){
        if(item.getItemId() ==R.id.android){
        Toast.makeText(this, "Hello Android!", Toast.LENGTH_SHORT).show();
        return true;
        }
        return false;
        }
        });
         */

    }
}
package com.example.context_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   ListView lv;
   String name[]={"pen","pencil","scale","eraser","sharpener"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.list_item);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.buy){
            Toast.makeText(getApplicationContext(),"item bought",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.wl){
            Toast.makeText(getApplicationContext(),"added to wishlist",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"added to cart",Toast.LENGTH_LONG).show();
        }
        return true;
    }
}
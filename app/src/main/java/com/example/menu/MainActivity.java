package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.img);
        txt=(TextView)findViewById(R.id.txt);
        registerForContextMenu(txt);
        registerForContextMenu(img);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,0,1,"复制");
        menu.add(1,1,1,"转发");
        menu.add(2,2,1,"保存");
        super.onCreateContextMenu(menu, v, menuInfo);
    }//创建菜单

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Toast.makeText(MainActivity.this,"点击复制",Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(MainActivity.this,"点击转发",Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this,"点击保存",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onContextItemSelected(item);
    }//菜单事件响应
}
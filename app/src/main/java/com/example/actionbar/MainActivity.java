package com.example.actionbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.act_add){
            Toast.makeText(this, R.string.add_message, Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.act_edit) {
            Toast.makeText( this, R.string.edit_message, Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.act_help){
            Toast.makeText(this, R.string.help_message, Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.act_remove){
            Toast.makeText(this, R.string.remove_message, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

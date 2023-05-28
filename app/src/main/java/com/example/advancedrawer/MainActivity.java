package com.example.advancedrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialToolbar toolbar = findViewById(R.id.topAppBar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);

                switch (id){
                    case R.id.new_home:
                        Toast.makeText(MainActivity.this, "Home is clicked", Toast.LENGTH_SHORT).show();break;

                    case R.id.new_message:
                        Toast.makeText(MainActivity.this, "Message is clicked", Toast.LENGTH_SHORT).show();break;

                    case R.id.new_sync:
                        Toast.makeText(MainActivity.this, "Sync is clicked", Toast.LENGTH_SHORT).show();break;

                    case R.id.new_trash:
                        Toast.makeText(MainActivity.this, "Trash is clicked", Toast.LENGTH_SHORT).show();break;

                    case R.id.new_settings:
                        Toast.makeText(MainActivity.this, "Settings is clicked", Toast.LENGTH_SHORT).show();break;

                    case R.id.new_login:
                        Toast.makeText(MainActivity.this, "Login is clicked", Toast.LENGTH_SHORT).show();break;

                    case R.id.new_share:
                        Toast.makeText(MainActivity.this, "Share is clicked", Toast.LENGTH_SHORT).show();break;

                    case R.id.new_rate:
                        Toast.makeText(MainActivity.this, "Rate is clicked", Toast.LENGTH_SHORT).show();break;

                    default:
                        return true;
                }

                return true;

            }
        });
    }
}
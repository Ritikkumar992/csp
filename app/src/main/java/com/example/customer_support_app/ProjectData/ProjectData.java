package com.example.customer_support_app.ProjectData;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Toast;
import com.example.customer_support_app.Activity.HomeActivity;
import com.example.customer_support_app.R;
import com.example.customer_support_app.Adapter.ViewProjectDataAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ProjectData extends AppCompatActivity {
    private final String[] titles = {"Project Overview", "Scope & Stack", "Escalation Matrix", "Version History", "Files"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_data);


        // =================== ToolBar implementation and its parent class is set to HomeActivity =======================//
        Toolbar  toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // remove title bar
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            WindowInsetsController windowInsetsController = getWindow().getInsetsController();
            if(windowInsetsController != null){
                windowInsetsController.hide(WindowInsets.Type.statusBars());
            }
        }
        else{
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        //------------------------------------Pager-------------------------------//
        TabLayout tabLayout = findViewById(R.id.project_tabLayout);
        ViewPager2 viewPager2 = findViewById(R.id.project_data_viewPager);

        // accessing ViewProjectDataAdapter.java class to attach adapter to fetch data.
        ViewProjectDataAdapter adapterClass = new ViewProjectDataAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapterClass);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) ->{
            tab.setText(titles[position]);
        }).attach();

        //------------------------------ EventListener on BottomNavigation Item----------------------//
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            if(item.getItemId() == R.id.home){
                Intent iHome = new Intent(ProjectData.this, HomeActivity.class);
                startActivity(iHome);
            }
            else if(item.getItemId() == R.id.search){
                Toast.makeText(ProjectData.this,"Search", Toast.LENGTH_SHORT).show();
            }
            else if(item.getItemId() == R.id.account){
                Toast.makeText(ProjectData.this,"Account", Toast.LENGTH_SHORT).show();
            }
            else if(item.getItemId() == R.id.setting){
                Toast.makeText(ProjectData.this,"Setting", Toast.LENGTH_SHORT).show();
            }
            return false;
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);
    }

}
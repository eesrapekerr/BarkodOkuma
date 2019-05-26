package com.example.barkodokuma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class AnaSayfaActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button btngida;
    Button btntemizlik;
    Button btnkozmetik;
    Button btndiger;
    Button btnbizeulasin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btngida =findViewById(R.id.gida);
        btngida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gida = new Intent(AnaSayfaActivity.this, GidaActivity.class);
                startActivity(gida);
            }
        });

        btntemizlik = findViewById(R.id.temizlik);
        btntemizlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temizlik = new Intent(AnaSayfaActivity.this,TemizlikActivity.class);
                startActivity(temizlik);
            }
        });

        btnkozmetik = findViewById(R.id.kozmetik);
        btnkozmetik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kozmetik = new Intent(AnaSayfaActivity.this,KozmetikActivity.class);
                startActivity(kozmetik);
            }
        });

        btndiger = findViewById(R.id.diger);
        btndiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diger = new Intent(AnaSayfaActivity.this,DigerActivity.class);
                startActivity(diger);
            }
        });

        btnbizeulasin = findViewById(R.id.bizeulasin);
        btnbizeulasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bizeulasin = new Intent(AnaSayfaActivity.this, BizeUlasinActivity.class);
                startActivity(bizeulasin);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ana_sayfa, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

package com.alfian.malfianazhari_1202154200_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MenuAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private List<Minuman> minumanList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvListMaem);

        populateList();

        MenuAdapter menuAdapter = new MenuAdapter(minumanList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(menuAdapter);
    }

    private void populateList(){
        minumanList.add(new Minuman("Aqua", "Ini Aqua", R.drawable.aqua));
        minumanList.add(new Minuman("Ades", "Ini Ades", R.drawable.ades));
        minumanList.add(new Minuman("Evian", "Ini Evian", R.drawable.evian));
        minumanList.add(new Minuman("Cleo", "Ini Cloe", R.drawable.cleo));
        minumanList.add(new Minuman("Club", "Ini Club", R.drawable.club));
        minumanList.add(new Minuman("Leminerale", "Ini Leminerale", R.drawable.leminerale));
        minumanList.add(new Minuman("Nestle", "Ini Nestle", R.drawable.nestle));
        minumanList.add(new Minuman("Pristine", "Ini Pristine", R.drawable.pristine));
        minumanList.add(new Minuman("Vit", "Ini Vit", R.drawable.vit));
    }

    @Override
    public void onItemClick(Minuman item) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("detailminuman", item);
        startActivity(intent);
    }
}

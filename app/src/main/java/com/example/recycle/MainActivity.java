package com.example.recycle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerViews
        RecyclerView verticalRecyclerView = findViewById(R.id.verticalRecyclerView);
        RecyclerView horizontalRecyclerView = findViewById(R.id.horizontalRecyclerView);

        // Set up LayoutManagers with different orientations
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Create item data list with images chs1.jpg through chs8.jpg
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", R.drawable.chs1));
        items.add(new Item("Item 2", R.drawable.chs2));
        items.add(new Item("Item 3", R.drawable.chs3));
        items.add(new Item("Item 4", R.drawable.chs4));
        items.add(new Item("Item 5", R.drawable.chs5));
        items.add(new Item("Item 6", R.drawable.chs6));
        items.add(new Item("Item 7", R.drawable.chs7));
        items.add(new Item("Item 8", R.drawable.chs8));

        // Set up the adapter and attach to both RecyclerViews
        ItemAdapter adapter = new ItemAdapter(items);
        verticalRecyclerView.setAdapter(adapter);
        horizontalRecyclerView.setAdapter(adapter);
    }
}


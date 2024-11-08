// MainActivity.java
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
        RecyclerView topImageRecyclerView = findViewById(R.id.topImageRecyclerView);
        RecyclerView verticalRecyclerView = findViewById(R.id.verticalRecyclerView);
        RecyclerView horizontalRecyclerView = findViewById(R.id.horizontalRecyclerView);

        // Set up LayoutManagers with different orientations
        topImageRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Create image data list for top scroller
        List<Integer> imageResources = new ArrayList<>();
        imageResources.add(R.drawable.scrl1);
        imageResources.add(R.drawable.scrl2);
        imageResources.add(R.drawable.scrl3);
        imageResources.add(R.drawable.scrl4);
        imageResources.add(R.drawable.scrl5);
        imageResources.add(R.drawable.scrl6);

        // Set up ImageAdapter and attach it to topImageRecyclerView
        ImageAdapter imageAdapter = new ImageAdapter(imageResources);
        topImageRecyclerView.setAdapter(imageAdapter);

        // Create item data list for other RecyclerViews
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1", R.drawable.chs1));
        items.add(new Item("Item 2", R.drawable.chs2));
        items.add(new Item("Item 3", R.drawable.chs3));
        items.add(new Item("Item 4", R.drawable.chs4));
        items.add(new Item("Item 5", R.drawable.chs5));
        items.add(new Item("Item 6", R.drawable.chs6));
        items.add(new Item("Item 7", R.drawable.chs7));
        items.add(new Item("Item 8", R.drawable.chs8));

        // Set up the adapter and attach to both main RecyclerViews
        ItemAdapter adapter = new ItemAdapter(items);
        verticalRecyclerView.setAdapter(adapter);
        horizontalRecyclerView.setAdapter(adapter);
    }
}

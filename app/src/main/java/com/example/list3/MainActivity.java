package com.example.list3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView productsRecyclerView;
    private ArrayList<String> productsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productsRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        ProductsAdapter adapter = new ProductsAdapter(productsList);
        productsRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        productsList.add("Enzyme powder");
        productsList.add("Hydrophilic oil");
        productsList.add("Balm");
        productsList.add("Cleansing foam");
        productsList.add("Toner");
        productsList.add("Mask");
        productsList.add("Serum");
        productsList.add("Eye cream");
        productsList.add("Cream");
        productsList.add("Sunscreen");
    }
}
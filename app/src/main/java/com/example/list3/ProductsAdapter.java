package com.example.list3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsViewHolder> {
    private ArrayList<String> productsList;

    public ProductsAdapter(ArrayList<String> productsList) {
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_products, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        holder.bind(productsList.get(position));
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }
}

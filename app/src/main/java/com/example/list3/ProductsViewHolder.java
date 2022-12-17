package com.example.list3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvProducts;
    public ProductsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvProducts = itemView.findViewById(R.id.tv_products);
    }
    public void bind(String products){
        tvProducts.setText(products);
    }
}

package com.example.foodentertainmenet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ProductViewHolder> {
    // context to inflate the layout
    private Context mCtx;

    //we are storing all the items in a list
    private List<FoodItems> productList;

    //getting the context and product list with constructor


    public FoodAdapter(Context mCtx, List<FoodItems> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.fooditems, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        FoodItems product = productList.get(position);
        //binding the data with the viewholder views
        holder.DishName.setText(product.getDishName());
        holder.DishDesc.setText(product.getFoodDesc());
        holder.DishPrice.setText(product.getPrice());
        holder.DishImage.setImageDrawable(mCtx.getResources().getDrawable(product.getDishimg()));
    }


    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView DishName,DishDesc,DishPrice;
        ImageView DishImage;

        public ProductViewHolder(View itemView) {
            super(itemView);
            DishName = itemView.findViewById(R.id.dishname);
            DishDesc = itemView.findViewById(R.id.dishdesc);
            DishPrice = itemView.findViewById(R.id.dishprice);
            DishImage = (ImageView)itemView.findViewById(R.id.dishimage);

        }
    }
}
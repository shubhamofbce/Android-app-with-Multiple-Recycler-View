package com.example.foodentertainmenet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewArrivalsAdapter extends RecyclerView.Adapter<NewArrivalsAdapter.ProductViewHolder2> {
    // context to inflate the layout
    private Context mCtx;

    //we are storing all the items in a list
    private List<NewArrivalsItems> ArrivalItems;

    //getting the context and product list with constructor


    public NewArrivalsAdapter(Context mCtx, List<NewArrivalsItems> productList) {
        this.mCtx = mCtx;
        this.ArrivalItems = productList;
    }

    @Override
    public ProductViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.content_entertainment, null);
        return new ProductViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder2 holder, int position) {
        //getting the product of the specified position
        NewArrivalsItems product = ArrivalItems.get(position);
        //binding the data with the viewholder views
        holder.ArrivalName.setText(product.getArrivalsName());
        holder.ArrivalImage.setImageDrawable(mCtx.getResources().getDrawable(product.getArrivalsImage()));
    }


    @Override
    public int getItemCount() {
        return ArrivalItems.size();
    }

    class ProductViewHolder2 extends RecyclerView.ViewHolder {

        TextView ArrivalName;
        ImageView ArrivalImage;

        public ProductViewHolder2(View itemView) {
            super(itemView);
            ArrivalName = itemView.findViewById(R.id.activitytxt);
            ArrivalImage = (ImageView)itemView.findViewById(R.id.activityimg);
        }
    }
}
package com.example.foodentertainmenet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PastActivityAdapter extends RecyclerView.Adapter<PastActivityAdapter.ProductViewHolder> {
    // context to inflate the layout
    private Context mCtx;

    //we are storing all the items in a list
    private List<PastActivityItems> PastActivityList;

    //getting the context and product list with constructor


    public PastActivityAdapter(Context mCtx, List<PastActivityItems> productList) {
        this.mCtx = mCtx;
        this.PastActivityList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.content_entertainment, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        PastActivityItems product = PastActivityList.get(position);
        //binding the data with the viewholder views
        holder.PastActivityName.setText(product.getPastName());
        holder.PastActivityImage.setImageDrawable(mCtx.getResources().getDrawable(product.getPastimg()));
    }


    @Override
    public int getItemCount() {
        return PastActivityList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView PastActivityName;
        ImageView PastActivityImage;

        public ProductViewHolder(View itemView) {
            super(itemView);
            PastActivityName = itemView.findViewById(R.id.activitytxt);
            PastActivityImage = (ImageView)itemView.findViewById(R.id.activityimg);
        }
    }
}
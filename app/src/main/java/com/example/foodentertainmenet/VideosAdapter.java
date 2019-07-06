package com.example.foodentertainmenet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.ProductViewHolder> {
    // context to inflate the layout
    private Context mCtx;

    //we are storing all the items in a list
    private List<VideosItems> VideosList;

    //getting the context and product list with constructor


    public VideosAdapter(Context mCtx, List<VideosItems> productList) {
        this.mCtx = mCtx;
        this.VideosList = productList;
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
        VideosItems product = VideosList.get(position);
        //binding the data with the viewholder views
        holder.VideosName.setText(product.getVideoName());
        holder.VideosImage.setImageDrawable(mCtx.getResources().getDrawable(product.getVideoimg()));
    }


    @Override
    public int getItemCount() {
        return VideosList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView VideosName;
        ImageView VideosImage;

        public ProductViewHolder(View itemView) {
            super(itemView);
            VideosName = itemView.findViewById(R.id.activitytxt);
            VideosImage = (ImageView)itemView.findViewById(R.id.activityimg);
        }
    }
}
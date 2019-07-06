package com.example.foodentertainmenet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ProductViewHolder1> {
    // context to inflate the layout
    private Context mCtx;

    //we are storing all the items in a list
    private List<GameItems> GameList;

    //getting the context and product list with constructor


    public GamesAdapter(Context mCtx, List<GameItems> productList) {
        this.mCtx = mCtx;
        this.GameList = productList;
    }

    @Override
    public ProductViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.content_entertainment, null);
        return new ProductViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder1 holder, int position) {
        //getting the product of the specified position
        GameItems product = GameList.get(position);
        //binding the data with the viewholder views
        holder.GameName.setText(product.getGameName());
        holder.GameImage.setImageDrawable(mCtx.getResources().getDrawable(product.getGameimg()));
    }


    @Override
    public int getItemCount() {
        return GameList.size();
    }

    class ProductViewHolder1 extends RecyclerView.ViewHolder {

        TextView GameName;
        ImageView GameImage;

        public ProductViewHolder1(View itemView) {
            super(itemView);
            GameName = itemView.findViewById(R.id.activitytxt);
            GameImage = (ImageView)itemView.findViewById(R.id.activityimg);
        }
    }
}
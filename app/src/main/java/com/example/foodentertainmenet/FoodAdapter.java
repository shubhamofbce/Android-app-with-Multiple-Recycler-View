package com.example.foodentertainmenet;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ProductViewHolder> {
    // context to inflate the layout
    private Context mCtx;

    //we are storing all the items in a list
    private List<FoodItems> productList;

   // SharedPreferences sharedpreferences;
/*

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String NumItems = "numitems";
    public static final String Price = "price";

*/


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
    public void onBindViewHolder(final ProductViewHolder holder, int position) {
        //getting the product of the specified position
        final FoodItems product = productList.get(position);
        //binding the data with the viewholder views
        holder.DishName.setText(product.getDishName());
    //    final Editor editor = holder.sharedPreferences.edit();
        holder.DishDesc.setText(product.getFoodDesc());
        holder.DishPrice.setText("$"+product.getPrice());
        holder.DishImage.setImageDrawable(mCtx.getResources().getDrawable(product.getDishimg()));
        holder.AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.AddButton.setVisibility(View.GONE);
                holder.PlusButton.setVisibility(View.VISIBLE);
                holder.MinusButton.setVisibility(View.VISIBLE);
            }
        });
        holder.PlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = holder.OrderCount.getText().toString();
                int orderprice = Integer.parseInt(product.getPrice());

                int norder = Integer.parseInt(s);

                norder=norder+1;
                String Ordercnt = Integer.toString(norder);
               /* editor.putString("numitems",Ordercnt);
                editor.commit();*/
                holder.OrderCount.setText(Ordercnt);
            }
        });
        holder.MinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = holder.OrderCount.getText().toString();
                int norder = Integer.parseInt(s);
                norder-=1;
                if(norder>0){
                    String Ordercnt = Integer.toString(norder);
                    holder.OrderCount.setText(Ordercnt);
                }
                else{
                    holder.AddButton.setVisibility(View.VISIBLE);
                    holder.PlusButton.setVisibility(View.GONE);
                    holder.MinusButton.setVisibility(View.GONE);
                }
            }
        });


    }


    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView DishName,DishDesc,DishPrice,OrderCount;
        ImageView DishImage;
        Button AddButton,PlusButton,MinusButton;
        //SharedPreferences sharedPreferences;

        public ProductViewHolder(View itemView) {
            super(itemView);
            DishName = itemView.findViewById(R.id.dishname);
            DishDesc = itemView.findViewById(R.id.dishdesc);
            DishPrice = itemView.findViewById(R.id.dishprice);
            DishImage = (ImageView)itemView.findViewById(R.id.dishimage);
            AddButton = (Button) itemView.findViewById(R.id.addbtn);
            PlusButton = (Button) itemView.findViewById(R.id.plusbtn);
            MinusButton = (Button) itemView.findViewById(R.id.minusbtn);
            OrderCount = (TextView) itemView.findViewById(R.id.itemcount);
          //  sharedPreferences = (SharedPreferences) mCtx.getSharedPreferences("MyPrefs",0);
        }
    }
}
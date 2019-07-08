package com.example.foodentertainmenet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<FoodItems> productList;
    List<GameItems> GameList;
    List<NewArrivalsItems> ArrivalList;
    List<PastActivityItems> PastList;
    List<VideosItems> VideoList;

    //the recyclerview
    RecyclerView recyclerView;
  //  TextView NumItem,BillAmount;
  //  SharedPreferences settings;


    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.foodrecyclerview);
       // CartRl = (RelativeLayout) findViewById(R.id.cartlayout);



        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        productList = new ArrayList<>();

        productList.add(
                new FoodItems(
                        "Chicken",
                        "Masala and curry",
                        "25",
                        R.drawable.doodc
                ));

        productList.add(
                new FoodItems(
                        "Masala Dosa",
                        "South Indian Dish",
                        "50",
                        R.drawable.fooddosa
                ));
        productList.add(
                new FoodItems(
                        "Idli Sambhar",
                        "Soth Indian Breakfast",
                        "10",
                        R.drawable.food2
                ));
        productList.add(
                new FoodItems(
                        "Paneer Masala",
                        "Indian Paneer curry",
                        "30",
                        R.drawable.fooda
                ));
        productList.add(
                new FoodItems(
                        "Mushroom Curry",
                        "Mushroom masala and curry",
                        "40",
                        R.drawable.foode
                ));
        productList.add(
                new FoodItems(
                        "Veg Fried Rice",
                        "Seasonal vegetables fried with Rice",
                        "25",
                        R.drawable.foodf
                ));

        //creating recyclerview adapter
        FoodAdapter adapter = new FoodAdapter(this, productList);
        recyclerView.setAdapter(adapter);

    }
}

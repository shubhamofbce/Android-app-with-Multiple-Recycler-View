package com.example.foodentertainmenet;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Entertainment extends AppCompatActivity {

    RecyclerView na_rv,pa_rv,gamerv,videosrv;
    Button next_Activity_button;
    List<NewArrivalsItems> ArrivalList;
    List<PastActivityItems>PastList;
    List<GameItems>GameList;
    List<VideosItems>VideoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        next_Activity_button = (Button)findViewById(R.id.donebtn);
        next_Activity_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                Intent intent = new Intent(Entertainment.this, MainActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });


        na_rv = (RecyclerView) findViewById(R.id.new_arrivals_rv);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        na_rv.setLayoutManager(layoutManager1);
        ArrivalList = new ArrayList<>();

        pa_rv = (RecyclerView) findViewById(R.id.past_activity_rv);
        pa_rv.setHasFixedSize(true);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView myList2 = (RecyclerView) findViewById(R.id.past_activity_rv);
        myList2.setLayoutManager(layoutManager2);
        PastList = new ArrayList<>();

        gamerv = (RecyclerView) findViewById(R.id.gamesrv);
        gamerv.setHasFixedSize(true);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView myList3 = (RecyclerView) findViewById(R.id.gamesrv);
        myList3.setLayoutManager(layoutManager3);
        GameList = new ArrayList<>();

        videosrv = (RecyclerView) findViewById(R.id.videosrv);
        videosrv.setHasFixedSize(true);
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView myList4 = (RecyclerView) findViewById(R.id.videosrv);
        myList4.setLayoutManager(layoutManager4);
        VideoList = new ArrayList<>();



        ArrivalList.add(
                new NewArrivalsItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        ArrivalList.add(
                new NewArrivalsItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        ArrivalList.add(
                new NewArrivalsItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        ArrivalList.add(
                new NewArrivalsItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );

        GameList.add(
                new GameItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        GameList.add(
                new GameItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        GameList.add(
                new GameItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        VideoList.add(
                new VideosItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        VideoList.add(
                new VideosItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        VideoList.add(
                new VideosItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        PastList.add(
                new PastActivityItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );
        PastList.add(
                new PastActivityItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );

        PastList.add(
                new PastActivityItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );

        PastList.add(
                new PastActivityItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );

        PastList.add(
                new PastActivityItems(
                        "Cricket",
                        R.drawable.doodc
                )

        );



        NewArrivalsAdapter adapter1 = new NewArrivalsAdapter(this, ArrivalList);
        na_rv.setAdapter(adapter1);
        PastActivityAdapter adapter2 = new PastActivityAdapter(this, PastList);
        pa_rv.setAdapter(adapter2);
        GamesAdapter adapter3 = new GamesAdapter(this, GameList);
        gamerv.setAdapter(adapter3);
        VideosAdapter adapter4 = new VideosAdapter(this,VideoList);
        videosrv.setAdapter(adapter4);
    }

}

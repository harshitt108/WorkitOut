package com.example.workitout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity {

    private ArrayList <String> mNames = new ArrayList <> ( );
    private ArrayList <String> mImageUrls = new ArrayList <> ( );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        Log.d("TAG","onCreate started");

        Intent intent =getIntent ();

        initBitmaps ();

    }
    private  void initBitmaps(){

        Log.d ( "" , "initBitmaps preparing bitmaps" );

        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );



        mImageUrls.add ( "https://picsum.photos/200" );



        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mImageUrls.add ( "https://picsum.photos/200" );


        mNames.add ( "Random1" );
        mNames.add ( "Random2" );
        mNames.add ( "Random3" );
        mNames.add ( "Random4" );
        mNames.add ( "Random5" );
        mNames.add ( "Random6" );
        mNames.add ( "Random7" );
        mNames.add ( "Random8" );
        mNames.add ( "Random9" );
        mNames.add ( "Random10" );
        mNames.add ( "Random11" );
        mNames.add ( "Random12" );






        initRecyclerView ();
    }

    private void initRecyclerView() {
        Log.d ( "TAG", "initRecyclerView : init recyclerView" );
        RecyclerView recyclerView = findViewById ( R.id.recycler_view );
        RecyclerViewAdapter adapter = new RecyclerViewAdapter ( this , mNames , mImageUrls );
        recyclerView.setAdapter ( adapter );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this , RecyclerView.VERTICAL , false ) );


    }
}
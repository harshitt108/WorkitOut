package com.example.workitout;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.ContentValues.TAG;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList <String> imageName = new ArrayList <> (  );
    private ArrayList<String> mImages = new ArrayList <> (  );
    private Context mContext;

    public RecyclerViewAdapter(Context context,  ArrayList <String> images ,ArrayList <String> imageName ) {
        this.imageName = imageName;
        mImages = images;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {

        View view = LayoutInflater.from ( parent.getContext ()).inflate (R.layout.layout_list,parent,false  ) ;
        ViewHolder holder = new ViewHolder ( view );
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder , final int position) {

        Log.d(TAG,"onBinViewHolder called.");
        Log.d("position.",Integer.toString (  position));


        Glide.with ( mContext)
                .asBitmap ()
                .load(mImages.get(position))
                .into ( holder.workoutImage);
        holder.imageName.setText ( imageName.get ( position ) );

        holder.parentLayout.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Log.d ( TAG,"onClick clicked on:"+imageName.get ( position ) );

                Toast.makeText ( mContext,imageName.get(position),Toast.LENGTH_SHORT).show ();
            }
        } );


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView workoutImage;
        TextView imageName;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super ( itemView );

            workoutImage = itemView.findViewById ( R.id.imageView );
            imageName = itemView.findViewById ( R.id.workout_name );
            parentLayout = itemView.findViewById ( R.id.parent_layout );



        }
    }
}

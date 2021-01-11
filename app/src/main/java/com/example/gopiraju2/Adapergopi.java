package com.example.gopiraju2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class Adapergopi extends PagerAdapter {


    Context context;
ArrayList<Models> images;
    public Adapergopi(Context context, ArrayList<Models> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view =View.inflate(context,R.layout.items,container);


        ImageView imageView=view.findViewById(R.id.imageView);
      imageView.setImageResource(images.get(position).getImag());





        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        
    }
}

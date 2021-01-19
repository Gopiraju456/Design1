package com.example.gopiraju2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.Objects;


public class Adapergopi extends PagerAdapter {
    TextView title,descr;
    LayoutInflater gopi;
    ArrayList<String> titles,Des;
    ArrayList<Integer> imagess;
    Context context;

    public Adapergopi(ArrayList<Integer> imagess,ArrayList<String> titles,ArrayList<String> Des, Context context) {
        this.imagess = imagess;
        this.titles=titles;
        this.Des=Des;
        this.context = context;
    }

    @Override
    public int getCount() {
        return imagess.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        gopi=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =gopi.inflate(R.layout.raju,container,false);



        title=view.findViewById(R.id.title);

        descr=view.findViewById(R.id.des);

        ImageView imageView=view.findViewById(R.id.imageView);
        imageView.setImageResource(imagess.get(position));

        title.setText(titles.get(position));
        descr.setText(Des.get(position));

        Objects.requireNonNull(container).addView(view);


        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
        
    }
}

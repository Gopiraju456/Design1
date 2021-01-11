package com.example.gopiraju2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider=findViewById(R.id.imageeslider);
        method();

    }

public void method(){



    ArrayList<SlideModel> imageliste=new ArrayList<SlideModel>();
        imageliste.add(new SlideModel("https://images.pexels.com/photos/414102/pexels-photo-414102.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        imageliste.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCx4XeN-LxflHf9m-8YBcHfVUXTSfNyVKTyw&usqp=CAU"));
        imageliste.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJRotGKB72KC5UuLqeh6Ca04QP5gkxdDwuBA&usqp=CAU"));

        imageSlider.setImageList(imageliste);
       // imageSlider.setupDots(3);


        imageSlider.setItemClickListener(new ItemClickListener() {
        @Override
        public void onItemSelected(int i) {
            Toast.makeText(MainActivity.this, "Click Image slider", Toast.LENGTH_SHORT).show();
        }
    });


}


}
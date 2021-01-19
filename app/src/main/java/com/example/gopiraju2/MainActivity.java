package com.example.gopiraju2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView iv1;


    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider=findViewById(R.id.imageeslider);

        method();


        iv1=findViewById(R.id.iv1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.ic_launcher_background);
            }
        });

    }

public void method(){



    ArrayList<SlideModel> imageliste=new ArrayList<SlideModel>();
    //ur wish get drawable or url
        imageliste.add(new SlideModel(R.drawable.v));
        imageliste.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCx4XeN-LxflHf9m-8YBcHfVUXTSfNyVKTyw&usqp=CAU"));
        imageliste.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJRotGKB72KC5UuLqeh6Ca04QP5gkxdDwuBA&usqp=CAU"));

        imageSlider.setImageList(imageliste);

        imageSlider.setItemClickListener(new ItemClickListener() {
        @Override
        public void onItemSelected(int i) {
            Toast.makeText(MainActivity.this, "Click Image slider", Toast.LENGTH_SHORT).show();
        }
    });


}

}
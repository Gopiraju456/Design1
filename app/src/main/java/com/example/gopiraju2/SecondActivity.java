package com.example.gopiraju2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    ViewPager vpager;
    private static final Integer[] IMAGES= {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.v};
    private  static final  String[] TITLES={"GOPI 1","GOPI 2","GOPI 3","GOPI 4"};
    private static final String[] Des={"Give your living space a vibrant appeal with this poster from the house of Eli Decor" ,
            "Duck is the common name for numerous species in the waterfowl family Anatidae which also includes swans and geese" ,
            "Water is a polar inorganic compound that is at room temperature a tasteless and odorless liquid, nearly colorless with a hint of blue" ,
            "Among the most beautiful treasures offered by nature, natural tunnels reflect unpredictable and powerful vegetation"};
    private ArrayList<Integer> ImagesArray;
    private ArrayList<String> ImagesArray1,ImagesArray2;

    ImageView close;
    CircleIndicator dotlayout;
    TextView[] dotviews;
    Button back,next;
    private  int currentpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        vpager=findViewById(R.id.viewpagers);
        close=findViewById(R.id.close);
        dotlayout=findViewById(R.id.llllllllllll);
        dotlayout.createIndicators(4,0);


        back=findViewById(R.id.back);
        back.setVisibility(View.INVISIBLE);
        next=findViewById(R.id.next);
        back.setOnClickListener(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vpager.setCurrentItem(currentpage + 1);
                if (next.getText().toString()=="START"){
                    startActivity(new Intent(SecondActivity.this,MainActivity.class));
                }
            }
        });

        close.setOnClickListener( this);

        ImagesArray = new ArrayList<Integer>();
        ImagesArray1 = new ArrayList<String>();
        ImagesArray2=new ArrayList<String>();

        for(int i=0;i<IMAGES.length;i++) {
            ImagesArray.add(IMAGES[i]);
        }
        for (int i=0;i<TITLES.length;i++){
            ImagesArray1.add(TITLES[i]);}
        for (int i=0;i<Des.length;i++){
            ImagesArray2.add(Des[i]);}


        vpager.setAdapter(new Adapergopi(ImagesArray,ImagesArray1,ImagesArray2,SecondActivity.this));
        dotlayout.setViewPager(vpager);



     vpager.addOnPageChangeListener(viewwwwwwwwwwww);
    }



    ViewPager.OnPageChangeListener viewwwwwwwwwwww=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {


            currentpage =i;
            if (i==0){
                back.setEnabled(false);
                next.setEnabled(true);
                back.setVisibility(View.INVISIBLE);
                back.setText("");
                next.setText("NEXT");

            }else  if (currentpage==TITLES.length-1){
                back.setEnabled(true);
                next.setEnabled(true);
                back.setVisibility(View.VISIBLE);
                back.setText("BACK");
                next.setText("START");
            }else{
                back.setEnabled(true);
                next.setEnabled(true);
                back.setVisibility(View.VISIBLE);
                back.setText("BACK");
                next.setText("NEXT");
            }




        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.close:
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
                finish();

            case R.id.back: {
                vpager.setCurrentItem(currentpage - 1);
            }



        }
    }
}
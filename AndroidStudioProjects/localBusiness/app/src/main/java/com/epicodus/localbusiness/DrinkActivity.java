package com.epicodus.localbusiness;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DrinkActivity extends AppCompatActivity {
    @Bind(R.id.drinkMenu) TextView mDrinkMenu;
    @Bind(R.id.drinkList) ListView mDrinkList;
    @Bind(R.id.drinkImage) ImageView mDrinkImage;
    private String[] drinks = new String[] {"Blonde Roast", "Caffe Misto", "Clover Brewed Coffee", "Coffee Traveler", "Decaf Pike Place Roast", "Featured Dark Roast", "Iced Coffee", "Iced Coffee with Milk", "Pike Place Roast", "Starbucks Cold Brew Coffee","Starbucks Cold Brew Coffee with Milk"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        ButterKnife.bind(this);
        Picasso.with(this).load(R.drawable.background).fit().centerCrop().into(mDrinkImage);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, drinks);
        mDrinkList.setAdapter(adapter);

        Typeface santanaFont = Typeface.createFromAsset(getAssets(), "fonts/Santana-Black.ttf");
        mDrinkMenu.setTypeface(santanaFont);
    }
}

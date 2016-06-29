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

public class FoodActivity extends AppCompatActivity {
    @Bind(R.id.foodListView) ListView mFoodListView;
    @Bind(R.id.foodTextView) TextView mFoodTextView;
    @Bind(R.id.foodImage) ImageView mFoodImage;

    private String[] food = new String[] {"Bacon, Gouda & Egg Breakfast", "Classic Whole-Grain Oatmeal", "Hearty Blueberry Oatmeal", "Classic Whole Grain Oatmeal", "Slow-Roasted Ham, Swiss & Egg", "Almond Croissant", "Butterfly Coffee", "Devil's Food Donut", "Apple Fritter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ButterKnife.bind(this);

        Picasso.with(this).load(R.drawable.background).fit().centerCrop().into(mFoodImage);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, food);
        mFoodListView.setAdapter(adapter);

        Typeface santanaFont = Typeface.createFromAsset(getAssets(), "fonts/Santana-Black.ttf");
        mFoodTextView.setTypeface(santanaFont);

    }
}

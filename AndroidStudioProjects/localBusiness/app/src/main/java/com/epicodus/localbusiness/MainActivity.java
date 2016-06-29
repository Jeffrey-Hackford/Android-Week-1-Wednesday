package com.epicodus.localbusiness;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.headlineTextView) TextView mHeadlineTextView;
    @Bind(R.id.foodButton) Button mFoodButton;
    @Bind(R.id.drinkButton) Button mDrinkButton;
    @Bind(R.id.imageView) ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Picasso.with(this).load(R.drawable.background).fit().centerCrop().into(mImageView);

        Typeface santanaFont = Typeface.createFromAsset(getAssets(), "fonts/Santana-Black.ttf");
        mHeadlineTextView.setTypeface(santanaFont);
        mFoodButton.setTypeface(santanaFont);
        mDrinkButton.setTypeface(santanaFont);

        mFoodButton.setOnClickListener(this);
        mDrinkButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if(v == mFoodButton) {
            Intent intent = new Intent(MainActivity.this, FoodActivity.class);
            startActivity(intent);
        } else if (v == mDrinkButton){
            Intent intent = new Intent(MainActivity.this, DrinkActivity.class);
            startActivity(intent);
        }
    }
}

package com.epicodus.localbusiness;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.headlineTextView) TextView mHeadlineTextView;
    @Bind(R.id.foodButton) Button mFoodButton;
    @Bind(R.id.drinkButton) Button mDrinkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

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

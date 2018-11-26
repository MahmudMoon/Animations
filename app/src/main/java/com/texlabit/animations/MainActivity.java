package com.texlabit.animations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    ObjectAnimator animate_x,animate_fade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.frame);

        //move in left right up down
        animate_x = ObjectAnimator.ofFloat(frameLayout,"x",420f);


        //fade in
        animate_fade = ObjectAnimator.ofFloat(frameLayout, View.ALPHA,0.0f,1.0f);
        //animate_fade.setDuration(2000);


        AnimatorSet animationSet = new AnimatorSet();
        animationSet.playTogether(animate_x,animate_fade);
        animationSet.setDuration(4000);
        animationSet.start();



    }
}

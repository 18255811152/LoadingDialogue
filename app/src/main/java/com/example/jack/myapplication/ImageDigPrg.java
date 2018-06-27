package com.example.jack.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;


public class ImageDigPrg {
    private Handler handler = new Handler();
    private ImageView imagepro;
    private Dialog dialog;
    private int mAnimation;
    private int startAnimation = R.mipmap.icon_loading_1;

    public ImageDigPrg(Context mContext) {
        dialog = new Dialog(mContext, R.style.CustomDialogStyle);
        dialog.setContentView(R.layout.dig_pro);
        dialog.setCancelable(false);
        initView();
    }

    private void initView() {
        imagepro = dialog.findViewById(R.id.imagepro);
        mAnimation = R.drawable.dig_pro_animation_list;
        dialog.show();
        startAnimation();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                stopAnimation();
                dialog.cancel();
            }
        }, 3000);
    }

    public void startAnimation() {
        imagepro.setImageResource(mAnimation);
        AnimationDrawable animationDrawable = (AnimationDrawable) imagepro.getDrawable();
        animationDrawable.start();

    }

    public void stopAnimation() {
        Drawable drawable = imagepro.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imagepro.setImageResource(startAnimation);
    }


}

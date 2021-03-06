package com.raoj.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.raoj.customview.view.AnimationButton;

public class MainActivity extends AppCompatActivity {

    private AnimationButton animationButton;
    private PayPsdInputView payPsdInputView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationButton = (AnimationButton) findViewById(R.id.animation_btn);
        payPsdInputView = (PayPsdInputView) findViewById(R.id.payPsdInputView);
        payPsdInputView = new PayPsdInputView(getApplicationContext());
        animationButton.setAnimationButtonListener(new AnimationButton.AnimationButtonListener() {
            @Override
            public void onClickListener() {
                animationButton.start();
            }

            @Override
            public void animationFinish() {
                Toast.makeText(MainActivity.this,"动画执行完毕",Toast.LENGTH_SHORT).show();
//                finish();
            }
        });

    }
}

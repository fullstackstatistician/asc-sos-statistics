package com.humzaman.asc_sos_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    public void backUpClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
    }

    public void maleClick(View view) {
        Bundle bundle = getIntent().getExtras();
        Intent intent = new Intent(this, Main3Activity.class);
        if (bundle != null) {
            intent.putExtra("numSiblings", (int) bundle.get("numSiblings"));
        }
        intent.putExtra("sex", true);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void femaleClick(View view) {
        Bundle bundle = getIntent().getExtras();
        Intent intent = new Intent(this, Main3Activity.class);
        if (bundle != null) {
            intent.putExtra("numSiblings", (int) bundle.get("numSiblings"));
        }
        intent.putExtra("sex", false);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }
}

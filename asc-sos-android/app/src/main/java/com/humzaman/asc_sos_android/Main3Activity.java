package com.humzaman.asc_sos_android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

public class Main3Activity extends AppCompatActivity {
    TextView textView;
    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        doStuff();
    }

    private void doStuff() {
        Bundle bundle = getIntent().getExtras();
        textView = findViewById(R.id.endTextView);

        int sibNum = 0;
        boolean gender = true;

        if (bundle != null) {
            sibNum = (int) bundle.get("sibNum");
            gender = (boolean) bundle.get("gender");
        }

        if (sibNum == 1)
            textView.setText("1 sibling\n");
        else
            textView.setText(sibNum + " siblings\n");

        Drawable img = getResources().getDrawable(R.drawable.female);

        if (gender)
            img = getResources().getDrawable(R.drawable.male);

        textView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, scaleImage(img, 0.1f));
    }

    public void checkClick(View view) {
        sendData();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
    }

    public void xClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
    }

    private void sendData() {

    }


    private Drawable scaleImage (Drawable image, float scaleFactor) {

        if (!(image instanceof BitmapDrawable)) {
            return image;
        }

        Bitmap b = ((BitmapDrawable)image).getBitmap();

        int sizeX = Math.round(image.getIntrinsicWidth() * scaleFactor);
        int sizeY = Math.round(image.getIntrinsicHeight() * scaleFactor);

        Bitmap bitmapResized = Bitmap.createScaledBitmap(b, sizeX, sizeY, false);

        image = new BitmapDrawable(getResources(), bitmapResized);

        return image;
    }



}

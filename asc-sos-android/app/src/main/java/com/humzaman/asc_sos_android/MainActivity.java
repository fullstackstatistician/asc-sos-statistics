package com.humzaman.asc_sos_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        checkAccount();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        checkAccount();
    }

    @Override
    protected void onResume() {
        super.onResume();

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    private void checkAccount() {
        final ImageButton settingsButton = findViewById(R.id.settingsButton);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);

        if (account != null) {
            settingsButton.setImageDrawable(null);
            settingsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast toast = Toast.makeText(getBaseContext(),"Long press to access settings", Toast.LENGTH_LONG);
                    toast.show();
                }
            });
            settingsButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    settingsClick();
                    return true;
                }
            });
        } else {
            settingsButton.setImageDrawable(getDrawable(R.drawable.ic_settings_black_48dp));
            settingsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    settingsClick();
                }
            });
        }
    }

    private void settingsClick() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void zeroClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 0);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void oneClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 1);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void twoClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 2);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void threeClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 3);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void fourClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 4);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void fiveClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 5);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void sixClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 6);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void sevenClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 7);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void eightClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 8);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }

    public void nineClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("sibNum", 9);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_up);
    }
}

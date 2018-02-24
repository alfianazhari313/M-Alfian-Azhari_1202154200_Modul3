package com.alfian.malfianazhari_1202154200_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(SplashScreen.this,"Selamat Datang di Alfamart",Toast.LENGTH_LONG).show(); //menampilkan isi pesan toast
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Login.class)); //menunjukkan kelas berikutnya setelah splash
                finish();
            }
        }, 3000); // 3 detik
    }
}

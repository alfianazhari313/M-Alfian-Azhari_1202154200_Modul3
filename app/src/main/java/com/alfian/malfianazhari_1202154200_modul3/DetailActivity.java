package com.alfian.malfianazhari_1202154200_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    Minuman data;
    TextView merk,tv_isi;
    ImageView iv_foto, iv_galon;
    Button plus, minus;

    int status_galon = 0;

    int[] galons = {
            R.drawable.ic_battery_20_black_24dp,
            R.drawable.ic_battery_30_black_24dp,
            R.drawable.ic_battery_50_black_24dp,
            R.drawable.ic_battery_60_black_24dp,
            R.drawable.ic_battery_80_black_24dp,
            R.drawable.ic_battery_90_black_24dp,
            R.drawable.ic_battery_full_black_24dp
    };

    int status_isi=0 ;
    String[] isi={
            "1L","2L","3L","4L","5L","6L","7L"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(getIntent() != null)
            data = (Minuman) getIntent().getSerializableExtra("detailminuman");

        merk = findViewById(R.id.tv_merk);
        merk.setText(data.getMerk());
        iv_foto = findViewById(R.id.iv_foto);
        iv_foto.setImageResource(data.getFoto());
        tv_isi = findViewById(R.id.tv_Isi);

        iv_galon = findViewById(R.id.iv_galon);
        iv_galon.setImageResource(galons[status_galon]);

        plus = findViewById(R.id.btn_plus);
        minus = findViewById(R.id.btn_minus);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == plus.getId()){
            if (status_galon < 6) {
                status_galon++;
                status_isi++;
            }
            iv_galon.setImageResource(galons[status_galon]);
            tv_isi.setText(isi[status_isi]);
            if(status_galon==6){
                Toast.makeText(this,"Isi FULL",Toast.LENGTH_SHORT).show();
            }
        } else if(view.getId() == minus.getId()){
            if (status_galon > 0) {
                status_galon--;
                status_isi--;
            }
            iv_galon.setImageResource(galons[status_galon]);
            tv_isi.setText(isi[status_isi]);
            if(status_galon==0){
                Toast.makeText(this,"Isi Galon Sedikit",Toast.LENGTH_SHORT).show();
            }
        }
    }
}

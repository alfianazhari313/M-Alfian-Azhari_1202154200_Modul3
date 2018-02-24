package com.alfian.malfianazhari_1202154200_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{
    EditText et_Password,et_Username;
    Button btn_Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_Password = (EditText) findViewById(R.id.et_Password);
        et_Username = (EditText) findViewById(R.id.et_Username);
        btn_Login = (Button) findViewById(R.id.btn_Login);
        btn_Login.setOnClickListener(this);
    }

    public void onClickOrder(View view) {


    }

    @Override
    public void onClick(View view) {
        if (et_Password.getText().toString().equalsIgnoreCase("EAD") &&
                et_Username.getText().toString().equalsIgnoreCase("EAD")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (et_Password.getText().toString().isEmpty() || et_Username.getText().toString().isEmpty()){
            Toast.makeText(this,"Silahkan isi terlebih dahulu",Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(this,"Username atau password salah",Toast.LENGTH_SHORT).show();
        }
    }
}

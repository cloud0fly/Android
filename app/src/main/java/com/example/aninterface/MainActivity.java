package com.example.aninterface;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        name = findViewById(R.id.editTextText);
        pwd = findViewById(R.id.editTextText2);

    }

    public void login(View v){
        String u_name = "admin";
        String u_pwd = "123456";

        String username = name.getText().toString().trim();
        String password = pwd.getText().toString().trim();

        if(username.equals(u_name)&&password.equals(u_pwd)){
            Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "账号不存在！", Toast.LENGTH_SHORT).show();
        }
    }
}
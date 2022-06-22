package com.example.yenisayfaolusturma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView benimTextview;
    private Button benimButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        benimTextview= findViewById(R.id.benimTextview);
        benimButton= findViewById(R.id.benimButtom);
        benimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                benimTextview.setText("Abdulmuttalip Atasayar");
                Log.e("Mesaj", "Merhaba");
            }
        });
    }
}
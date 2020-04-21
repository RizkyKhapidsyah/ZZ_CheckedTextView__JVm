package com.rk.ctv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckedTextView CTV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CTV_1_IDJAVA = findViewById(R.id.CTV_1_IDXML);
        CTV_1_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTV_1_IDJAVA.toggle();

                if (CTV_1_IDJAVA.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Terceklist!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Tidak Terceklist!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

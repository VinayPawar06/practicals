package com.example.intent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class alertdialogActivity2 extends AppCompatActivity {

    Button alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alertdialog2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        alert=findViewById(R.id.alert);
        alert.setOnClickListener(v -> {
            AlertDialog.Builder builder=new  AlertDialog.Builder(this);
            builder.setTitle("Exit")
                    .setMessage("Pakku?")
                    .setPositiveButton("yes",(dialog, which) -> {
                        finish();
                        Toast.makeText(this, "Yes button clicked", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("No",(dialog, which) -> {
                        Toast.makeText(this, "No button clicked", Toast.LENGTH_SHORT).show();
                    })
                    .show();
        });
    }
}
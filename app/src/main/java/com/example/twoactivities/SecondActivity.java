package com.example.twoactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        button = findViewById(R.id.act2_button);
        editText = findViewById(R.id.act2_edit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("et", str1);
                setResult(0, intent);
                finish();
            }
        });
        String str = getIntent().getStringExtra("ett");
        editText.setText(str);
    }
}

package com.example.atoi;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivitySlide1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);

        final RadioGroup rgGender = (RadioGroup) findViewById(R.id.rg_slide1);
        Button btSubmit = (Button) findViewById(R.id.selanjutnya);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rgGender.getCheckedRadioButtonId();
                switch (id) {
                    case R.id.rb_mobil:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_teka:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_tim:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_hal:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_sesuatu:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_eksperimen:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_melatih:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_musik:
                        Toast.makeText(ActivitySlide1.this, "Clicked " + ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}

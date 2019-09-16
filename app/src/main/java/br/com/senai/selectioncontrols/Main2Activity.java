package br.com.senai.selectioncontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    private AppCompatImageButton imgButton;
    private AppCompatImageButton galeria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setTitle("Activity 2");

        imgButton = findViewById(R.id.img_button_2);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mudarActivity3 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(mudarActivity3);
            }
        });

        galeria = findViewById(R.id.img_fotos);
        galeria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent foto = new Intent();
                foto.setType("image/*");
                foto.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(foto, 0);
            }
        }
    }
}

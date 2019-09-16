package br.com.senai.selectioncontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SwitchCompat switchLocalizacao;
    private AppCompatCheckBox checkJava;
    private AppCompatButton btnTestar;
    private AppCompatCheckBox checkPhp;
    private AppCompatImageButton btnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchLocalizacao = findViewById(R.id.switch_ativar_localizacao);
        /*switchLocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean estado = switchLocalizacao.isChecked();
                Toast.makeText(MainActivity.this, "Mudou para " + estado , Toast.LENGTH_SHORT).show();
            }
        });*/

        switchLocalizacao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, " " + b, Toast.LENGTH_SHORT).show();
            }
        });

        checkJava = findViewById(R.id.check_java);
        checkJava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "Ligado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Desligado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkPhp = findViewById(R.id.check_php);
        btnTestar = findViewById(R.id.btn_testar);
        btnTestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String estado = "";
                if (checkPhp.isChecked()){
                    estado = "marcado";
                } else {
                    estado = "desmarcado";
                }

                Toast.makeText(MainActivity.this, "PHP está " + estado, Toast.LENGTH_SHORT).show();
            }
        });

        btnImage = findViewById(R.id.img_button);
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirActivity2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(abrirActivity2);
            }
        });
    }
}

package com.udemy.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtFrase;
    private Button btnFrase;

    private String[] frase = {
            "Tudo posso naquele que me fortalece. (Filipenses 4:13)",
            "Honra teu pai e tua mãe, a fim de que tenhas vida longa na terra que o Senhor,o teu Deus, te dá. (Êxodo 20:12)",
            "Assim, eles já não são dois, mas sim uma só carne. Portanto, o que Deus uniu, ninguém separe. (Mateus 19:6)",
            "Então disse Jesus: Deixem vir a mim as crianças e não as impeçam; pois o Reino dos céus pertence aos que são semelhantes a elas. (Mateus 19:14)",
            "Portanto, não se preocupem com o amanhã, pois o amanhã trará as suas próprias preocupações. Basta a cada dia o seu próprio mal. (Mateus 6:34)",
            "Porque Deus tanto amou o mundo que deu o seu Filho Unigênito, para que todo o que nele crer não pereça, mas tenha a vida eterna. (João 3:16)",
            "Respondeu Jesus: Eu sou o caminho, a verdade e a vida. Ninguém vem ao Pai, a não ser por mim. (João 14:6)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFrase = findViewById(R.id.txtFraseId);
        btnFrase = findViewById(R.id.btnFraseId);

        btnFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();

                int randomNumber = random.nextInt(frase.length);

                txtFrase.setText(frase[randomNumber]);

            }
        });


    }
}

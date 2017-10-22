package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoNovaFrase;
    private TextView textNovaFrase;

    private String [] frases={
           "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
            "Agir, eis a inteligência verdadeira. Serei o que quiser. Mas tenho que querer o que for. O êxito está em ter êxito, e não em ter condições de êxito. Condições de palácio tem qualquer terra larga, mas onde estará o palácio se não o fizerem ali?",
            "Determinação, coragem e auto-confiança são fatores decisivos para o sucesso. Se estamos possuídos por uma inabalável determinação, conseguiremos superá-los. Independentemente das circunstâncias, devemos ser sempre humildes, recatados e despidos de orgulho.",
            "A persistência é o caminho do êxito.",
            "Apesar dos nossos defeitos, precisamos enxergar que somos pérolas únicas no teatro da vida e entender que não existem pessoas de sucesso ou pessoas fracassadas. O que existe são pessoas que lutam pelos seus sonhos ou desistem deles.",
            "Jamais sofra antecipadamente. Pense positivo. Acredite nos seus sonhos. Nunca desista de lutar. A vida é generosa para aqueles que acreditam nela.",
            "Lute incessantemente pelos seus sonhos, supere-se, arrisque, mas quando alcançar seu objetivo, lembre-se do preço de continuar no pódio.",
            "Lute pelos sonhos, busque seus objetivos; batalhe pelos seus ideais e mostre que você é um guerreiro.",
            "Quando voê diz \"desisto\".As lutas imediatamente se acabam,porém ,seus sonhos nunca se realizaram.",
            "Lutar por seus sonhos contra o mundo indiferente já é uma vitória. Fracasso, é um fantasma do qual não devemos ter medo. E estratégia é a palavra que mostrará que os limites são impostos pelo nosso próprio pensamento."

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoNovaFrase= (Button) findViewById(R.id.botaoNovaFraseId);

        textNovaFrase=  (TextView) findViewById(R.id.textoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
                 @Override
           public void onClick(View v) {
                     Random randomico= new Random();
                     int numeroaleatorio=randomico.nextInt(frases.length);
                     textNovaFrase.setText(frases[numeroaleatorio]);

                                              }
         }
        );

    }
}

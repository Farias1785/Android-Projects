package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botaoVerificar;
    private EditText valorAlcool;
    private EditText valorGasolina;
    private TextView resultado;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         valorGasolina= (EditText) findViewById(R.id.precogasolinaid);
         valorAlcool= (EditText) findViewById(R.id.precoalcoolid);
         resultado= (TextView) findViewById(R.id.resultadoid);
         botaoVerificar= (Button) findViewById(R.id.verificarid);


       botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuperar valores digitados
                String PrecoAlcool=valorAlcool.getText().toString();
                String PrecoGasolina=valorGasolina.getText().toString();

                //convertendo valores para double
                Double valorAlcool=Double.parseDouble(PrecoAlcool);
                Double valorGasolina=Double.parseDouble(PrecoGasolina);

                //calculo= alcool/gasolina

                double resultadocalc=(valorAlcool/valorGasolina);

                if(resultadocalc >= 0.7){
                    resultado.setText("A melhor opção é a gasolina");

                }else{
                    resultado.setText("A melhor opção é o alcool");
                }


            }
        });



    }
}

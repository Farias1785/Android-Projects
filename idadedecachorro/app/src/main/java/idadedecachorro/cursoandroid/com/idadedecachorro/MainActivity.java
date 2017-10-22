package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixadetexto;
    private Button descobrir;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixadetexto=(EditText) findViewById(R.id.idadeid);
        descobrir=(Button) findViewById(R.id.descobririd);
        resultado= (TextView) findViewById(R.id.resultadoid);

        descobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegar dado digitado
                String textodigitado=caixadetexto.getText().toString();

                if(textodigitado.isEmpty()){

                    resultado.setText("Nenhum numero Digitado!");


                }else{
                   int valordigitado=Integer.parseInt(textodigitado);
                   int resultadofinal=valordigitado*7;

                   resultado.setText("O resultado é:"+ resultadofinal+ "Anos");

                }


            }
        });
    }
}

package advinha.cursoandroid.com.advinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button botaoJogar;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar= (Button)findViewById(R.id.botaojogarid);
        textResultado= (TextView) findViewById(R.id.resultadoid);

        //textResultado.setText("Texto alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico= new Random();

                int numeroaleatorio=randomico.nextInt(10);
                textResultado.setText("Numero escolhido:"+" "+numeroaleatorio);
            }
        });
    }
}

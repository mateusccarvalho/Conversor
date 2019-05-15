package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class REALActivity extends AppCompatActivity {

    private EditText etNumero1, etNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);

        etNumero1 = (EditText) findViewById(R.id.qtdReal);
        etNumero2 = (EditText) findViewById(R.id.qtdDol);
        final TextView ResultadoR = (TextView) findViewById(R.id.ResultadoR);
        Button CalculaR = (Button) findViewById(R.id.CalculaR);

        CalculaR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double Result = null;
                Double d1 =  null;
                Double r1 =  null;


                if((etNumero1.getText().toString().length() > 0 )&& (etNumero1.getText().toString().length() > 0)  )
                {
                    d1 =   Double.parseDouble(etNumero1.getText().toString());
                    r1 = Double.parseDouble(etNumero2.getText().toString());
                    Result = d1 / r1;
                    ResultadoR.setText("Resultado: R$ "+ Result);


                }else
                {

                    Toast.makeText(getApplicationContext(),"Dados incorretos!",Toast.LENGTH_SHORT).show();

                }


                /*

                Double d1 = Double.parseDouble(etNumero1.getText().toString());
                Double r1 = Double.parseDouble(etNumero2.getText().toString());

                Double Result = d1 / r1;

                ResultadoR.setText("Resultado: $ "+ Result);
*/
            }
        });

    }








    public void startmainActivity (View view){
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);

    }
}

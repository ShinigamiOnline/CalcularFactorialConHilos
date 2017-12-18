package shinigami.balanza.balanza;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shinigami on 27/11/2017.
 */

public class FrutasArticulos extends Activity {

    private Button btnPlatano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articulos_frutas);
        btnPlatano = findViewById(R.id.btn_platano);

        btnPlatano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(FrutasArticulos.this,CalculaPrecio.class);

                // creamos la informacion que vamos a enviar
                Bundle info = new Bundle();
                info.putDouble("platano", 2.25);

                //Añadimos la información al intent

                intento.putExtras(info);
                //lanzamos la actividad
                startActivity(intento);
            }
        });

    }
/**
    private void calcularPrecio (View vista){
        Intent intentCalcularPrecio = new Intent(this, CalculaPrecio.class);
        startActivity(intentCalcularPrecio);
    }
 */
}

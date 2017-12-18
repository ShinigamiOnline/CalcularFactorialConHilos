package shinigami.balanza.balanza;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Shinigami on 28/11/2017.
 */

public class CalculaPrecio extends Activity {

    private EditText txtKilos;
    private Button btnCalcular;
    private TextView txtPrecio;
    private TextView txtTotal;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcula_precio);
        txtKilos = findViewById(R.id.edtxt_kilos);
        btnCalcular = findViewById(R.id.btn_calcular);
        txtPrecio = findViewById(R.id.txt_precio);
        txtTotal = findViewById(R.id.txt_total);

        //recogo la informacion del bundle que está en el intent.
        Bundle nuevaInfo = getIntent().getExtras();
        Double precio = nuevaInfo.getDouble("platano");

        txtPrecio.setText(precio + " €");


    }

    public void calcularTotal(View vista){

        Double total = Double.parseDouble(txtPrecio.getText().toString()) * Double.parseDouble(txtKilos.getText().toString());
        txtTotal.setText("" + total);


        InputMethodManager miteclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(txtKilos.getWindowToken(), 0);

    }

}

package shinigami.balanza.balanza;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shinigami on 28/11/2017.
 */

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolderDatos> {
    private LayoutInflater inflater;
    private ArrayList<String> listaDatos;

    public MiAdaptador(Context contexto, ArrayList<String> listaDatos) {
        this.listaDatos = listaDatos;
        inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = inflater.inflate(R.layout.articulo, parent, false);

        return new ViewHolderDatos(vista);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int i) {
        holder.txtNombre.setText(listaDatos.get(i));


    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        public TextView txtNombre, txtPrecio;
        public ImageView imagen;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombre_ticket);
            txtPrecio = itemView.findViewById(R.id.txtPrecio_ticket);
            imagen = itemView.findViewById(R.id.img_ticket);


        }
    }
}

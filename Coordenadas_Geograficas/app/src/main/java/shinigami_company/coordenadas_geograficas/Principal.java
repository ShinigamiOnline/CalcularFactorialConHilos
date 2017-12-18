package shinigami_company.coordenadas_geograficas;

/**
 * Created by Shinigami on 13/11/2017.
 */

public class Principal {
    public static void main(String[] main) {
        Geopunto z, w;
        z = new Geopunto(-1.5, 3.0);
        w = new Geopunto(-1.2, 2.4);
        z.distancia(w);
        System.out.println("Distancia entre coordenadas: " + z.toString());
    }


}

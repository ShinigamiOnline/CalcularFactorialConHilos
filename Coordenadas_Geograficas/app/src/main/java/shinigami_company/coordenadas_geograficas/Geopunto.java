package shinigami_company.coordenadas_geograficas;



public class Geopunto {
    private double longitud,latitud,distancia;

    public Geopunto (double longitud, double latitud){
        this.longitud = longitud;
        this.latitud = latitud;

    }
    public double distancia(Geopunto punto){
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        this.distancia = c * RADIO_TIERRA;
        return c * RADIO_TIERRA;
    }


    @Override
    public String toString() {
        return "Geopunto: " + "longitud=" + longitud + ", latitud=" + latitud + " Distancia = "+ distancia;
    }
}

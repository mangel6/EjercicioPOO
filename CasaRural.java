// Clase CasaRural que extiende Casa
class CasaRural extends Casa {
    private double distanciaCabecera;
    private boolean cercaDelMar;

    public CasaRural(String identificador, double area, String direccion, int numHabitaciones, int numBaños,
            int numPisos, double distanciaCabecera, boolean cercaDelMar) {
        super(identificador, area, direccion, numHabitaciones, numBaños, numPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.cercaDelMar = cercaDelMar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Distancia a cabecera: " + distanciaCabecera + "km, Cerca del mar: "
                + (cercaDelMar ? "Sí" : "No");
    }
}
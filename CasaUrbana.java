// Clase CasaUrbana que extiende Casa
class CasaUrbana extends Casa {
    private boolean tieneAdministracion;

    public CasaUrbana(String identificador, double area, String direccion, int numHabitaciones, int numBaños, int numPisos, boolean tieneAdministracion) {
        super(identificador, area, direccion, numHabitaciones, numBaños, numPisos);
        this.tieneAdministracion = tieneAdministracion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Administración: " + (tieneAdministracion ? "Sí" : "No");
    }
}
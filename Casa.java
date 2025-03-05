// Clase Casa que extiende InmuebleVivienda
class Casa extends InmuebleVivienda {
    private int numPisos;

    public Casa(String identificador, double area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
        super(identificador, area, direccion, numHabitaciones, numBaños);
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pisos: " + numPisos;
    }
}
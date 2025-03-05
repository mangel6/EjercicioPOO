// Clase Apartamento que extiende InmuebleVivienda
class Apartamento extends InmuebleVivienda {
    private boolean tieneAdministracion;

    public Apartamento(String identificador, double area, String direccion, int numHabitaciones, int numBaños,
            boolean tieneAdministracion) {
        super(identificador, area, direccion, numHabitaciones, numBaños);
        this.tieneAdministracion = tieneAdministracion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Administración: " + (tieneAdministracion ? "Sí" : "No");
    }
}
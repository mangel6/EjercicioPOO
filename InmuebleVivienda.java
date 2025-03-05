// Clase InmuebleVivienda que extiende Inmueble
abstract class InmuebleVivienda extends Inmueble {
  protected int numHabitaciones;
  protected int numBaños;

  public InmuebleVivienda(String identificador, double area, String direccion, int numHabitaciones, int numBaños) {
    super(identificador, area, direccion);
    this.numHabitaciones = numHabitaciones;
    this.numBaños = numBaños;
  }

  @Override
  public String toString() {
    return super.toString() + ", Habitaciones: " + numHabitaciones + ", Baños: " + numBaños;
  }
}
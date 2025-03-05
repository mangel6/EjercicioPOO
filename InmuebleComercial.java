// Clase base InmuebleComercial
abstract class InmuebleComercial extends Inmueble {
    protected String localizacion;

    public InmuebleComercial(String identificador, double area, String direccion, String localizacion) {
        super(identificador, area, direccion);
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Localización: " + localizacion;
    }
}
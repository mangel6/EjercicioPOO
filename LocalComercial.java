// Clase LocalComercial que extiende InmuebleComercial
class LocalComercial extends InmuebleComercial {
    private String centroComercial;

    public LocalComercial(String identificador, double area, String direccion, String localizacion, String centroComercial) {
        super(identificador, area, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return super.toString() + ", Centro Comercial: " + centroComercial;
    }
}
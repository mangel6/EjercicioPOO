// Clase Oficina que extiende InmuebleComercial
class Oficina extends InmuebleComercial {
    private boolean esGobierno;

    public Oficina(String identificador, double area, String direccion, String localizacion, boolean esGobierno) {
        super(identificador, area, direccion, localizacion);
        this.esGobierno = esGobierno;
    }

    @Override
    public String toString() {
        return super.toString() + ", Es gobierno: " + (esGobierno ? "Sí" : "No");
    }
}
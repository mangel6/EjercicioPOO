// Clase ApartaEstudio que extiende Apartamento
class ApartaEstudio extends Apartamento {
    public ApartaEstudio(String identificador, double area, String direccion, boolean tieneAdministracion) {
        super(identificador, area, direccion, 1, 1, tieneAdministracion);
    }
}
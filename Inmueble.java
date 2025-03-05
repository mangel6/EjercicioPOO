// Clase base Inmueble
public abstract class Inmueble {
    protected String identificador;
    protected double area;
    protected String direccion;
    protected double valorCompra;

    public Inmueble(String identificador, double area, String direccion) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
        this.valorCompra = calcularValorCompra();
    }

    protected double calcularValorCompra() {
        return area * 5000; // Ejemplo: Precio base de 5000 por metro cuadrado
    }

    public String getIdentificador() { return identificador; }
    public double getArea() { return area; }
    public String getDireccion() { return direccion; }
    public double getValorCompra() { return valorCompra; }

    @Override
    public String toString() {
        return "ID: " + identificador + ", Área: " + area + "m², Dirección: " + direccion + ", Valor: $" + valorCompra;
    }
}
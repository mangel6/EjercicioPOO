// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
      CasaRural casaRural = new CasaRural("CR123", 200, "Vereda San José", 3, 2, 1, 10, true);
      CasaUrbana casaUrbana = new CasaUrbana("CU456", 150, "Calle 10 #5-20", 4, 3, 2, true);
      Apartamento apartamento = new Apartamento("A789", 80, "Carrera 15 #30-50", 2, 2, true);
      ApartaEstudio apartaEstudio = new ApartaEstudio("AE101", 40, "Avenida 8 #12-34", false);
      LocalComercial local = new LocalComercial("LC202", 60, "Centro de la ciudad", "Interno", "Mall Plaza");
      Oficina oficina = new Oficina("OF303", 100, "Edificio Empresarial", "Externo", false);

      System.out.println(casaRural);
      System.out.println(casaUrbana);
      System.out.println(apartamento);
      System.out.println(apartaEstudio);
      System.out.println(local);
      System.out.println(oficina);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
public class ProductionPrinter implements Printer {
  @Override
  public void print(String message) {
    System.out.println("PRODUCTION: " + message);
  }
}

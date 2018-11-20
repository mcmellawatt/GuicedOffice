public class TestPrinter implements Printer {
  @Override
  public void print(String message) {
    System.out.println("TEST: " + message);
  }
}

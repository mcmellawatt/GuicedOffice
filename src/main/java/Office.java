import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Office {
  private Printer printer;
  private int documentsPrinted;

  public int getDocumentsPrinted() {
    return documentsPrinted;
  }

  @Inject
  public Office(Printer printer) {
    this.printer = printer;
  }

  public void sendToPrinter(String message) {
    System.out.println("Sending message to printer...");
    printer.print(message);
    ++documentsPrinted;
    System.out.println("Sent message to printer");
  }
}

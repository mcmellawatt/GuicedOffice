import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SampleGuiceApp {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a message: ");
    String message = reader.nextLine();

    Injector injector = Guice.createInjector(new ProductionOfficeModule());
    Office office = injector.getInstance(Office.class);

    office.sendToPrinter(message);

    reader.close();
  }
}
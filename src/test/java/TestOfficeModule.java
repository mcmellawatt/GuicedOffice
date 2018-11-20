import com.google.inject.AbstractModule;

public class TestOfficeModule extends AbstractModule {
  @Override
  protected void configure() {
    /*
     * This tells Guice that whenever it sees a dependency on a Printer,
     * it should satisfy the dependency using a ProductionPrinter.
     */
    bind(Printer.class).to(TestPrinter.class);
  }
}
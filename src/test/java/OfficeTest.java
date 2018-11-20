import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;

public class OfficeTest {
  @Test
  public void sendToPrinter() {
    Injector injector = Guice.createInjector(new TestOfficeModule());
    Office office = injector.getInstance(Office.class);
    office.sendToPrinter("Won't do expensive printing work");
    Assert.assertEquals(1, office.getDocumentsPrinted());
  }
}

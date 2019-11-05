import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

Printer printer;

@Before
    public void setUp() {
    printer = new Printer(100, 100);
}

@Test
    public void printerReduction(){
    printer.print(5, 10);
    assertEquals(50, printer.getSheetsLeft());
}

}

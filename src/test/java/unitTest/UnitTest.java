package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Ticket;

public class UnitTest {
    @Test
    public void testExample(){
        System.out.println("just test");
    }
    @Test
    public void ticket_infant_freePrice() {
        //Arrange = Given = Precondition
        Ticket passanger = new Ticket(1,1000);
        //Act = When= Test
        double result = passanger.calculate();
        //Assert =Then =Compare expected and actual
        Assert.assertEquals(result,0.0);

    }
    @Test
    public void ticket_child_fiftyPercentDiscount(){
        Ticket passanger = new Ticket(8,1000);
        double result = passanger.calculate();
        Assert.assertEquals(result,500.00);
    }
    @Test
    public void ticket_adult_fullPrice(){
        Ticket passanger = new Ticket(25,1000);
        double result = passanger.calculate();
        Assert.assertEquals(result,1000);
    }
    @Test
    public void ticket_senior_twentyPercentDiscount() {
        Ticket passanger = new Ticket(66, 1000);
        double result = passanger.calculate();
        Assert.assertEquals(result, 800);
    }
}

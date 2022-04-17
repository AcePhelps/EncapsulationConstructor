package unitTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.Ticket;

public class Parametraizer {
 @DataProvider(name="tickets")
 public Object[][] getdata(){
     return new Object[][]{
             {1,1000,0.0},
             {2,1000,0.0},
             {3,1000,500.0},
             {12,1000,500.0},
             {13,1000,1000.0},
             {3,1000,500.0},
             {8,1000,500.0},
             {25,1000,1000.0},
             {70,1000,800.0}
     };
    }
    @Test(dataProvider = "tickets")
public void Ticket_infat_freePrice(int age,int basePrice,double res ){
        Ticket passanger = new Ticket(age,basePrice);
        //Act = When= Test
       double result = passanger.calculate();
        Assert.assertEquals(result,res);
 }
}
//    public void ticket_infant_freePrice() {
        //Arrange = Given = Precondition
//        Ticket passanger = new Ticket(1,1000);
//        //Act = When= Test
//        double result = passanger.calculate();
//        //Assert =Then =Compare expected and actual
//        Assert.assertEquals(result,0.0);

//    }
//    @Test
//    public void ticket_child_fiftyPercentDiscount(){
//        Ticket passanger = new Ticket(8,1000);
//        double result = passanger.calculate();
//        Assert.assertEquals(result,500.0);
//    }
//    @Test
//    public void ticket_adult_fullPrice(){
//        Ticket passanger = new Ticket(25,1000);
//        double result = passanger.calculate();
//        Assert.assertEquals(result,1000);
//    }
//    @Test
//    public void ticket_senior_twentyPercentDiscount() {
//        Ticket passanger = new Ticket(66, 1000);
//        double result = passanger.calculate();
//        Assert.assertEquals(result, 800);
//    }
//}

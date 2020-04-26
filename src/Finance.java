import java.sql.SQLOutput;

public class Finance {
    public void checkCoustomer(Coustomer coustomer ,Houses houses) {
            Mortgage_banker mortgage_banker = new Mortgage_banker();
           int payment = mortgage_banker.calculateMortgagePrequalification(coustomer);

           if (payment >= houses.getHousePrice() && payment == 5000){
               System.out.println("With your Mortgage money to this "+ payment +"   You can afford a Villa House " +
                       coustomer.getCustomer_name());
           }else if(payment >= houses.getHousePrice() && payment == 10000){
               System.out.println("With your Mortgage money to this "+ payment +"   You can afford a G + 1 House "+
                       coustomer.getCustomer_name());
           }else if(payment >= houses.getHousePrice() && payment == 15000){
               System.out.println("With your Mortgage money to this "+ payment + "  You can afford a G + 2 House " +
                       coustomer.getCustomer_name());
           }else if(payment < houses.getHousePrice()){
               System.out.println("With your Mortgage money to this "+ payment +"   You cant afford a house Sorry! " +
                       coustomer.getCustomer_name());
           }
//the payment is always gratter than the price i give it so i have to find a way to check if both
// my conditions are true or false

    }
}

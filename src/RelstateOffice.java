public class RelstateOffice {
    public static void main (String [] args){

        Coustomer coustomer = new Coustomer("Nitsuh",16000,1000);

        Finance finance = new Finance();

        Houses houses = new Houses(5000);

        finance.checkCoustomer(coustomer,houses);


    }
}

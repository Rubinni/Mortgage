public class Mortgage_banker {

    public int calculateMortgagePrequalification (Coustomer coustomer){
        int amount = coustomer.getCoustomer_income() - coustomer.getGetCoustomer_debt();

        return amount;

    }

}

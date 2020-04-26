public class Coustomer {

    private String customer_name;
    private String customer_address;
    private int    coustomer_cashInHand;
    private int    coustomer_income;

    public Coustomer(String customer_name, int coustomer_income, int getCoustomer_debt) {
        this.customer_name = customer_name;
        this.coustomer_income = coustomer_income;
        this.getCoustomer_debt = getCoustomer_debt;
    }

    public int getCoustomer_income() {
        return coustomer_income;
    }

    public void setCoustomer_income(int coustomer_income) {
        this.coustomer_income = coustomer_income;
    }

    public int getGetCoustomer_debt() {
        return getCoustomer_debt;
    }

    public void setGetCoustomer_debt(int getCoustomer_debt) {
        this.getCoustomer_debt = getCoustomer_debt;
    }

    private int    getCoustomer_debt;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getCoustomer_cashInHand() {
        return coustomer_cashInHand;
    }

    public void setCoustomer_cashInHand(int coustomer_cashInHand) {
        this.coustomer_cashInHand = coustomer_cashInHand;
    }
}

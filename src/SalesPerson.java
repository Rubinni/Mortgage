public class SalesPerson {

    private String SalesName;
    private int SalesId;
    private String SalesType;

    public String getSalesName() {
        return SalesName;
    }

    public void setSalesName(String salesName) {
        SalesName = salesName;
    }

    public int getSalesId() {
        return SalesId;
    }

    public SalesPerson(String salesName) {
        SalesName = salesName;
    }

    public void setSalesId(int salesId) {
        SalesId = salesId;
    }

    public String getSalesType() {
        return SalesType;
    }

    public void setSalesType(String salesType) {
        SalesType = salesType;
    }


}

public class Houses {
    private String houseLocation;
    private int houseFloors;
    private int houseSize;
    private int housePrice;

    public String getHouseLocation() {
        return houseLocation;
    }

    public Houses(int housePrice) {
        this.housePrice = housePrice;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public int getHouseFloors() {
        return houseFloors;
    }

    public void setHouseFloors(int houseFloors) {
        this.houseFloors = houseFloors;
    }

    public int getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(int houseSize) {
        this.houseSize = houseSize;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public boolean isMorage() {
        return morage;
    }

    public void setMorage(boolean morage) {
        this.morage = morage;
    }

    private boolean morage;
}

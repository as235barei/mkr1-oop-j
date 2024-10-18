public class House {
    private String id;
    private int number;
    private String address;
    private String buildingType;
    private int floors;
    private int apartmentsCount;
    private int termOfUse;

    public House(String id, int number, String address, String buildingType, int floors, int apartmentsCount, int termOfUse) {
        this.id = id;
        this.number = number;
        this.address = address;
        this.buildingType = buildingType;
        this.floors = floors;
        this.apartmentsCount = apartmentsCount;
        this.termOfUse = termOfUse;
    }

    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public int getFloors() {
        return floors;
    }

    public int getApartmentsCount() {
        return apartmentsCount;
    }

    public int getTermOfUse() {
        return termOfUse;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setApartmentsCount(int apartmentsCount) {
        this.apartmentsCount = apartmentsCount;
    }

    public void setTermOfUse(int termOfUse) {
        this.termOfUse = termOfUse;
    }


    public void show (){
        System.out.println("House ID: " + id +
                "\nNumber: " + number +
                "\nAddress: " + address +
                "\nBuilding type: " + buildingType +
                "\nFloors: " + floors +
                "\nApartments count: " + apartmentsCount +
                "\nTerm of use: " + termOfUse);
    }

    public boolean isOldBuilding() {
        return termOfUse > 30;
    }
}

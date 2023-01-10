public class Car {
    String Name;
    int numOfHours;
    boolean isSportCar;
    int numofYear;
    boolean parkingInStreet;


    public Car(String name, int numOfHours, boolean isSportCar, int numofYear, boolean parkingInStreet) {
        Name = name;
        this.numOfHours = numOfHours;
        this.isSportCar = isSportCar;
        this.numofYear = numofYear;
        this.parkingInStreet = parkingInStreet;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public int getnumofYear() {
        return numofYear;
    }

    public void setnumofYear(int numofYear) {
        this.numofYear = numofYear;
    }

    public boolean isParkingInStreet() {
        return parkingInStreet;
    }

    public void setParkingInStreet(boolean parkingInStreet) {
        this.parkingInStreet = parkingInStreet;
    }
}

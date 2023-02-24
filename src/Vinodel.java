import java.time.LocalDate;

public class Vinodel {
    private String nameOfCompany;
    private double staj;
    private String Address;

    public Vinodel(String nameOfCompany, double staj, String address) {
        this.nameOfCompany = nameOfCompany;
        this.staj = staj;
        Address = address;
    }

    public String getNameOfVine() {
        return nameOfCompany;
    }

    public void setNameOfVine(String nameOfVine) {
        this.nameOfCompany = nameOfVine;
    }

    public double getStaj() {
        return staj;
    }

    public void setStaj(double staj) {
        this.staj = staj;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Vinodel{" +
                "nameOfVine='" + nameOfCompany + '\'' +
                ", staj=" + staj +
                ", Address='" + Address + '\'' +
                '}';
    }
}

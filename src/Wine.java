import java.time.LocalDate;

public class Wine{
    private String name;
    private String brend;
    private String country;
    private LocalDate dateOfMade;

    public Wine(String name, String brend, String country, LocalDate dateOfMade) {
        this.name = name;
        this.brend = brend;
        this.country = country;
        this.dateOfMade = dateOfMade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    @Override
    public String toString() {
        return "Vine{" +
                "name='" + name + '\'' +
                ", brend='" + brend + '\'' +
                ", country='" + country + '\'' +
                ", dateOfMade=" + dateOfMade +
                '}';
    }
}

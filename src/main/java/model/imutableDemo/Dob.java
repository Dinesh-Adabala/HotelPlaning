package model.imutableDemo;

public class Dob {
    private String day;
    private String month;
    private String year;

    public Dob(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Dob{" +
                "day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

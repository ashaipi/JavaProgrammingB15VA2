package day42_encapsulation;

public class JobOffer {
    private int hourlyPay;
    private String location;

    public String toString() {
        return "JobOffer{" +
                "hourlyPay=" + hourlyPay +
                ", location='" + location + '\'' +
                '}';
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

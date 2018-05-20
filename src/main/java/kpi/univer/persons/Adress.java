package kpi.univer.persons;

import java.util.Objects;

public class Adress {
    private String country;
    private final String region;
    private final String city;
    private final String street;
    private String index;
    private final String phoneNumber;

    public Adress(String region, String city, String street, String phoneNumber) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getIndex() {
        return index;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(country, adress.country) &&
                Objects.equals(region, adress.region) &&
                Objects.equals(city, adress.city) &&
                Objects.equals(street, adress.street) &&
                Objects.equals(index, adress.index) &&
                Objects.equals(phoneNumber, adress.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country, region, city, street, index, phoneNumber);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", index='" + index + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

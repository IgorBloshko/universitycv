package Build;

import java.util.Objects;

public class Address {
    private int BuildingNumber;
    private String street;
    private int addressNumber;

    public Address(int BuildingNumber, String street, int addressNumber) {

        this.BuildingNumber = BuildingNumber;
        this.street = street;
        this.addressNumber = addressNumber;
    }

    public int getNumberBuild() {
        return BuildingNumber;
    }

    public void setNumberBuild(int BuildingNumber) {
        this.BuildingNumber = BuildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber() {
        this.addressNumber = addressNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "numberBuild=" + BuildingNumber +
                ", street='" + street + '\'' +
                ", addressNumber=" + addressNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return BuildingNumber == address.BuildingNumber && addressNumber == address.addressNumber && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BuildingNumber, street, addressNumber);
    }
}

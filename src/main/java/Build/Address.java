package Build;

import java.util.Objects;

public class Address {
    private int numberBuild;
    private String street;
    private int addressNumber;

    public Address(int numberBuild, String street, int addressNumber) {

        this.numberBuild = numberBuild;
        this.street = street;
        this.addressNumber = addressNumber;
    }

    public int getNumberBuild() {
        return numberBuild;
    }

    public void setNumberBuild(int numberBuild) {
        this.numberBuild = numberBuild;
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
                "numberBuild=" + numberBuild +
                ", street='" + street + '\'' +
                ", addressNumber=" + addressNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return numberBuild == address.numberBuild && addressNumber == address.addressNumber && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberBuild, street, addressNumber);
    }
}

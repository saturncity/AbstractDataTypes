public class AbstractDataTypes {
    public static void main(String[] args) {
        Address address = new Address("University Pkwy", "Taguig", "NCR", "1671");
        PersonAddress person = new PersonAddress("David Birchenall", 30, address);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getFullAddress());
    }
}

class PersonAddress {
    private String name;
    private int age;
    private Address address;

    public PersonAddress(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return address.getStreet() + ", " + address.getCity() + ", " + address.getState() + " " + address.getZipCode();
    }
}

class Address {
    private String street, city, state, zipCode;
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
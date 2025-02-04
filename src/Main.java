public class Main {
    public static void main(String[] args) {
        Country country = new Country(1, "Venezuela");
        State state = new State(101, "España", country);
        Address address = new Address("Main St", "Los Angeles", "900061", state);
        Person person = new Person("John Fernández", "722345079", "john@gmail.com", true);
        person.setAddress(address);
        AddressBook addressBook = new AddressBook("AB123");
        System.out.println(country);
        System.out.println(state);
        System.out.println(address);
        System.out.println(person);
        System.out.println(addressBook);
    }
}
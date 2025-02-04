public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private boolean purchaseParkingPass;
    private Address address;

    public Person(String name, String phoneNumber, String emailAddress, boolean purchaseParkingPass) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.purchaseParkingPass = purchaseParkingPass;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isPurchaseParkingPass() {
        return purchaseParkingPass;
    }

    public void setPurchaseParkingPass(boolean purchaseParkingPass) {
        this.purchaseParkingPass = purchaseParkingPass;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", purchaseParkingPass=" + purchaseParkingPass +
                ", address=" + address +
                '}';
    }
}

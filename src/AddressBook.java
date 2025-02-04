public class AddressBook {
    private String code;

    public AddressBook(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "code='" + code + '\'' +
                '}';
    }
}

package Lab6_1.human;

public class person {
    String name, address, phone, emailAddress;
    public person() {}
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return String.format("person\nname: %s\naddress: %s\nemail: %s\nphone: %s",
                getName(),
                getAddress(),
                getEmailAddress(),
                getPhone());
    }
}

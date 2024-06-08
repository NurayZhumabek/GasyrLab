package module1.project;

import module1.hashcodeANDequals.LostAndFoundOffice;

public abstract class User {
    private String fullname;
    private Long IIN;
    private String phoneNumber;

    public User() {
    }

    public User(String fullname, Long IIN, String phoneNumber) {
        this.fullname = fullname;
        this.IIN = IIN;
        this.phoneNumber = phoneNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Long getIIN() {
        return IIN;
    }

    public void setIIN(Long IIN) {
        this.IIN = IIN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    abstract void changeNumber(String number);
    abstract void changeFullname(String data);

}

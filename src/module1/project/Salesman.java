package module1.project;

public class Salesman extends User{
    private TypeOfLegalEntity typeOfLegal;
    private long bankAccount;
    private String creditCardNumber;
    Laptop laptops[] = new Laptop[5];
    Mobile mobile[]=new Mobile[5];
    int counterLaptops =0;
    int counterMobile=0;



    public Salesman() {
    }

    @Override
    void changeNumber(String number) {
     setPhoneNumber(number);
    }

    @Override
    void changeFullname(String data) {
    setFullname(data);
    }


    public Salesman(String fullname, Long IIN, String phoneNumber, TypeOfLegalEntity typeOfLegal, Long bankAccount,
                    String creditCardNumber, Laptop[] laptops, Mobile[] mobile, int counterLaptops, int counterMobile) {
        super(fullname, IIN, phoneNumber);
        this.typeOfLegal = typeOfLegal;
        this.bankAccount = bankAccount;
        this.creditCardNumber = creditCardNumber;
        this.laptops = laptops;
        this.mobile = mobile;
        this.counterLaptops = counterLaptops;
        this.counterMobile = counterMobile;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public TypeOfLegalEntity getTypeOfLegal() {
        return typeOfLegal;
    }

    public void setTypeOfLegal(TypeOfLegalEntity typeOfLegal) {
        this.typeOfLegal = typeOfLegal;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Laptop[] getLaptops() {
        return laptops;
    }

    public void setLaptops(Laptop[] laptops) {
        this.laptops = laptops;
    }

    public Mobile[] getMobile() {
        return mobile;
    }

    public void setMobile(Mobile[] mobile) {
        this.mobile = mobile;
    }


    public boolean buyLaptop() {
        if (counterLaptops < laptops.length) {
            counterLaptops++;
            return true;
        } else {
            System.out.println("Purchase failed. No laptops available.");
            return false;
        }
    }
    public boolean buyMobile() {
        if (counterMobile < mobile.length) {
            counterMobile++;
            return true;
        } else {
            System.out.println("Purchase failed. No moble devices available.");
            return false;
        }
    }



}





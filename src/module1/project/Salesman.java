package module1.project;

import org.w3c.dom.ls.LSOutput;

public class Salesman extends User{
    private TypeOfLegalEntity typeOfLegal;
    private Long bankAccount;
    Laptop laptops[] = new Laptop[5];
    Mobile mobile[]=new Mobile[5];


    public Salesman() {
    }

    @Override
    void changeNumber(String number) {

    }

    @Override
    void changeFullname(String data) {

    }


    public Salesman(String fullname, Long IIN, String phoneNumber, TypeOfLegalEntity typeOfLegal, Long bankAccount, Laptop[] laptops, Mobile[] mobile) {
        super(fullname, IIN, phoneNumber);
        this.typeOfLegal = typeOfLegal;
        this.bankAccount = bankAccount;
        this.laptops = laptops;
        this.mobile = mobile;
    }

    public TypeOfLegalEntity getTypeOfLegal() {
        return typeOfLegal;
    }

    public void setTypeOfLegal(TypeOfLegalEntity typeOfLegal) {
        this.typeOfLegal = typeOfLegal;
    }

    public Long getBankAccount() {
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


    public boolean sellLaptop(int countOfItem) throws LenghtOutOfBand {
        int counter=laptops.length;
        if (countOfItem > laptops.length) {
            throw new LenghtOutOfBand("This operation has been cancelled! Not enough laptops in stock.");
        }

        return true;
    }


        }


    }


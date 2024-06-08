package module1.project;

import org.w3c.dom.ls.LSOutput;

public class Buyer extends User{
    TypeOfCard typeOfCard;
    String creditCardNumber;
    long balance;

    public Buyer() {
    }

    public Buyer(String fullname, Long IIN, String phoneNumber, TypeOfCard typeOfCard, String creditCardNumber,
                 long balance) {
        super(fullname, IIN, phoneNumber);
        this.typeOfCard = typeOfCard;
        this.creditCardNumber = creditCardNumber;
        this.balance=balance;
    }

    public TypeOfCard getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(TypeOfCard typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber)  {
        if (creditCardNumber.length()==16){
            this.creditCardNumber = creditCardNumber;

        }
        else {
            System.out.println("Invalid card number");
    }}



    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    void changeNumber(String number) {
        setCreditCardNumber(number);
    }

    @Override
    void changeFullname(String data) {
        setFullname(data);
    }
}

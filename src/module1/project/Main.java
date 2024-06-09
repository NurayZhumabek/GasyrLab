package module1.project;

public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("John Doe", 123456789012L, "7-707-543-44-32", TypeOfCard.VISA, "1234567812345678", 200000);
        Salesman salesman = new Salesman("Jane Smith", 987654321098L, "7-701-123-45-67", TypeOfLegalEntity.LLP, 5000L, "8765432187654321");
        Bucket bucket = new Bucket();

        Device laptop1 = new Laptop("Dell XPS 13", 2000);
        Device laptop2 = new Laptop("MacBook Pro", 3000);
        Device mobile1 = new Mobile("iPhone 12", 1000);

        bucket.addItem(laptop1, buyer);
        bucket.addItem(laptop2, buyer);
        bucket.addItem(mobile1, buyer);

        Device laptop3 = new Laptop("HP Spectre", 8000);
        bucket.addItem(laptop3, buyer);

        System.out.println("Баланс покупателя перед покупкой: " + buyer.getBalance());

        bucket.checkout(salesman, buyer);

        System.out.println("Баланс покупателя после покупки: " + buyer.getBalance());

        System.out.println("Баланс продавца после покупки: " + salesman.getBankAccount());
    }
}


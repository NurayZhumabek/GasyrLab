package module1.project;

public class Main {
    public static void main(String[] args) {
        // Инициализация объектов
        Buyer buyer = new Buyer("John Doe", 123456789012L, "7-707-543-44-32", TypeOfCard.VISA, "1234567812345678", 200000);
        Salesman salesman = new Salesman("Jane Smith", 987654321098L, "7-701-123-45-67", TypeOfLegalEntity.LLP, 5000L, "8765432187654321",
                new Laptop[5], new Mobile[5], 0, 0);
        Bucket bucket = new Bucket();

        // Добавление товаров в корзину
        Device laptop1 = new Laptop("Dell XPS 13", 2000);
        Device laptop2 = new Laptop("MacBook Pro", 3000);
        Device mobile1 = new Mobile("iPhone 12", 1000);

        bucket.addItem(laptop1, buyer);
        bucket.addItem(laptop2, buyer);
        bucket.addItem(mobile1, buyer);

        // Попытка добавить товар при недостаточном балансе
        Device laptop3 = new Laptop("HP Spectre", 8000);
        bucket.addItem(laptop3, buyer);

        // Проверка баланса покупателя перед покупкой
        System.out.println("Баланс покупателя перед покупкой: " + buyer.getBalance());

        // Завершение покупки
        bucket.checkout(salesman, buyer);

        // Проверка баланса покупателя после покупки
        System.out.println("Баланс покупателя после покупки: " + buyer.getBalance());

        // Проверка баланса продавца после покупки
        System.out.println("Баланс продавца после покупки: " + salesman.getBankAccount());
    }
}


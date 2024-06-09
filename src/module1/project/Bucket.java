package module1.project;

import java.util.ArrayList;
import java.util.List;



    public class Bucket {
        private List<Object> items=new ArrayList<>();



        public void addItem(Object item,Buyer buyer) {
            if (item instanceof Device) {
                Device device = (Device) item;
                if (buyer.getBalance() >= device.getPrice()) {
                    items.add(item);
                    System.out.println("Item has been added to bucket: " + device.getModel());
                } else {
                    System.out.println("Is not enough balance in the card: " + device.getModel());
                }
            } else {
                System.out.println("There is no such product: " + item);
            }
        }

        public void checkout(Salesman salesman,Buyer buyer) {
            long total = 0;

            for (Object item : items) {
                if (item instanceof Device) {
                    Device device = (Device) item;
                    total += device.getPrice();
                }
            }

            if (buyer.getBalance() >= total) {
                for (Object item : items) {
                    if (item instanceof Device) {
                        Device device = (Device) item;
                        if (item instanceof Laptop) {
                            salesman.buyLaptop();
                        } else if (item instanceof Mobile) {
                            salesman.buyMobile();
                        }
                    }
                }

                // Списание денег с кредитной карты покупателя и перевод их на счет продавца
                buyer.setBalance(buyer.getBalance() - total);
                salesman.setBankAccount(salesman.getBankAccount()+total);
                System.out.println("Покупка завершена. Сумма: " + total);

                items.clear();
            } else {
                System.out.println("Недостаточно денег на кредитной карте для завершения покупки.");
            }
        }
    }




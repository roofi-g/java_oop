package lesson66.srp2;

import lesson66.srp2.Order;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        order.inputFromConsole();
        File file = new File(order);
        file.saveToJson();
    }

}

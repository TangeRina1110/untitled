package T3_0;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        MenuItem dish1 = new Dish(3, "Роллы", "Описание1");
        MenuItem dish2 = new Dish(3, "Нагетсы", "Описание2");
        MenuItem dish3 = new Dish(2, "Бургер", "Описание3");
        MenuItem dish4 = new Dish(3, "Попкорн", "Описание4");
        MenuItem dish5 = new Dish(4, "Пицца", "Описание5");
        MenuItem drink1 = new Drink(1, "Липтон", "Описание6", 0, DrinkTypeEnum.GREEN_TEA);
        MenuItem drink2 = new Drink(4, "Вино", "Описание7", 0.15, DrinkTypeEnum.WINE);
        MenuItem drink3 = new Drink(9, "Вода негазированная", "Описание8", 0, DrinkTypeEnum.WATER);
        TableOrdersManager tm = new TableOrdersManager();
        tm.add(new TableOrder(), 3);
        tm.add(new TableOrder(), 5);
        tm.add(dish1, 3);
        tm.add(dish3, 3);
        tm.add(dish5, 3);
        tm.add(drink1, 3);
        tm.add(drink1, 3);

        tm.add(dish2, 5);
        tm.add(dish4, 5);
        tm.add(drink2, 5);
        System.out.println("3й столик");
        tm.getOrder(3).print();
        System.out.println();
        System.out.println("5й столик");
        System.out.println("Свободные столики");
        System.out.println(Arrays.toString(tm.freeTableNumbers()));
        tm.remove(3);
        System.out.println(Arrays.toString(tm.freeTableNumbers()));

        InternetOrdersManager im = new InternetOrdersManager();
        Address a =new Address("moscow", 32, "lenina", 32, 'a', 4);
        Customer c = new Customer("ivan", "ivanov", 20, a);
        InternetOrder io = new InternetOrder();
        io.add(drink3);
        io.add(dish1);
        im.addOrder(io);
        System.out.println("\nИнтерент заказ");
        im.print();

    }
}

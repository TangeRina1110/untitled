package T3_2;

import T3_0.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class task1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MenuItem dish1 = new Dish(3, "Стейк", "Описание1");
        MenuItem dish2 = new Dish(3, "Цезарь", "Описание2");
        MenuItem dish3 = new Dish(2, "Суп грибной", "Описание3");
        MenuItem dish4 = new Dish(3, "Плов", "Описание4");
        MenuItem dish5 = new Dish(4, "Пельмени", "Описание5");
        MenuItem drink1 = new Drink(1, "Липтон", "Описание6", 0, DrinkTypeEnum.GREEN_TEA);
        MenuItem drink2 = new Drink(4, "Вино красное", "Описание7", 0.15, DrinkTypeEnum.WINE);
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

        InternetOrdersManager im = new InternetOrdersManager();
        Address a =new Address("Moscow", 32, "lenina", 32, 'a', 4);
        Customer c = new Customer("Ivan", "Ivanov", 20, a);
        InternetOrder io = new InternetOrder();
        io.add(drink3);
        io.add(dish1);
        im.addOrder(io);
        // создаем два потока
        // один из них записывает в файл
        // другой преобразует объекты в байты
        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Екатерина\\IdeaProjects\\untitled\\src\\T3_2\\save.txt"); // сериализация
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        //objectOutputStream.writeChars(gson.toJson(im));
        //objectOutputStream.writeChars(gson.toJson(tm));
        objectOutputStream.writeObject(im);
        objectOutputStream.writeObject(tm);

        //закрываем поток и освобождаем ресурсы

        objectOutputStream.close();
        System.out.println("Интеренет заказ");
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Екатерина\\IdeaProjects\\untitled\\src\\T3_2\\save.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        InternetOrdersManager internet = (InternetOrdersManager) objectInputStream.readObject();
        TableOrdersManager table = (TableOrdersManager) objectInputStream.readObject();
        internet.print();
        System.out.println("\nЗаказы в ресторане");
        table.getOrder(5).print();
        System.out.println();
        table.getOrder(3).print();
        System.out.println("\n---Удалим липтон (все позиции)---\n");
        table.getOrder(3).removeAll("Липтон");
        table.getOrder(3).print();
    }
}

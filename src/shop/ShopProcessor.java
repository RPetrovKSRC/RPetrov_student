package shop;

import java.util.HashMap;
import java.util.Scanner;

public class ShopProcessor {
    private static final String BUY_CMD = "buy";
    private static final String LOGIN_CMD = "login";
    private static final String LOGOUT_CMD = "logout";
    private static final String REG_CMD = "reg";
    private static final String DEPOSIT_CMD = "deposit";
    private static final String ADD_CMD = "add";
    private static final String REMOVE_CMD = "remove";
    private static final String SHOWP_CMD = "listp";
    private static final String SHOWT_CMD = "listt";
    private static final String SHOWU_CMD = "listu";
    private static final String EXIT_CMD = "q";
    
    private static HashMap usersMap = new HashMap();
    private static HashMap productsMap = new HashMap();
    private static double account = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopProcessor processor = new ShopProcessor();

        initShop();
        
        System.out.println("Ready to service. Welcome!");
        while (true) {
            String line = scanner.nextLine().trim();
            String [] params = line.split(" ");
            String command = params[0];

            if (null == command)
                System.out.println("Unknown command. Try again");

            else switch (command) {
                case EXIT_CMD:
                    return;
                case BUY_CMD:
                    System.out.println("Command = " + command);
                    break;
                case LOGIN_CMD:
                    System.out.println("Command = " + command);
                    break;
                case LOGOUT_CMD:
                    System.out.println("Command = " + command);
                    break;
                case REG_CMD:
                    //System.out.println("Command = " + command);
                    User newUser = new User(params[1], params[2]);
                    usersMap.put(newUser.hashCode(), newUser);
                    break;
                case DEPOSIT_CMD:
                    System.out.println("Command = " + command);
                    break;
                case ADD_CMD:
                    System.out.println("Command = " + command);
                    break;
                case REMOVE_CMD:
                    System.out.println("Command = " + command);
                    break;
                case SHOWP_CMD:
                   //System.out.println("Command = " + command);
                    for (Object p : productsMap.values()){
                        System.out.println(p.toString());
                    }
                    break;
                case SHOWT_CMD:
                    System.out.println("Command = " + command);
                    break;
                case SHOWU_CMD:
                   //System.out.println("Command = " + command);
                    for (Object p : usersMap.values()){
                        System.out.println(p.toString());
                    }
                    break;
                default:
                    System.out.println("Unknown command. Try again");
                    break;
            }

        }
    }

    private static void initShop(){
        Product product;
        product = new Product(1, "Ручка", "Обычная синяя ручка", 1000, 15);
        productsMap.put(1, product);
        product = new Product(2, "Карандаш", "Простой карандаш", 1000, 10);
        productsMap.put(2, product);
        product = new Product(3, "Учебник", "Русский язык", 100, 200);
        productsMap.put(3, product);
        product = new Product(4, "Учебник", "Математика", 1000, 15);
        productsMap.put(4, product);
        product = new Product(5, "Ручка", "Красный цвет для двоек", 10, 15);
        productsMap.put(5, product);
        product = new Product(6, "Тетрадь", "В клеточку", 200, 60);
        productsMap.put(6, product);
        product = new Product(7, "Тетрадь", "В полосочку", 200, 45);
        productsMap.put(7, product);
    }
}

package shop;

import java.util.Scanner;

public class ShopProcessor {
    private static final String BUY_CMD = "buy";
    private static final String LOGIN_CMD = "login";
    private static final String LOGOUT_CMD = "logout";
    private static final String REG_CMD = "register";
    private static final String DEPOSIT_CMD = "deposit";
    private static final String ADD_CMD = "add";
    private static final String REMOVE_CMD = "remove";
    private static final String SHOWP_CMD = "listProducts";
    private static final String SHOWT_CMD = "listTransactions";
    private static final String EXIT_CMD = "exit";

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        ShopProcessor processor = new ShopProcessor();

        System.out.println("Welcome!");
        while (true) {
            String line = scanner.nextLine().trim();
            String [] params = line.split(" ");
            String command = params[0];

            if (EXIT_CMD.equals(command))
                return;

            else if (BUY_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(LOGIN_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(LOGOUT_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(REG_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(DEPOSIT_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(ADD_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(REMOVE_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(SHOWP_CMD.equals(command))
                System.out.println("Command = " + command);

            else if(SHOWT_CMD.equals(command))
                System.out.println("Command = " + command);

            else
                System.out.println("Unknown command. Try again");

        }
    }

    private static void initShop(){

    }
}

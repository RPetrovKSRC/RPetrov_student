package exam;

import java.util.*;

import static java.lang.Thread.sleep;

public class Bank {
   private static List<Account> accounts = new ArrayList<>(10);
   private static Map<Integer, String> userMap = new HashMap();

    public synchronized TxResult transferMoney(Account src, Account dest, int amount) {
        if (src.balance < amount) {
//            System.out.println( src.id +" - not enough money");
            return TxResult.NOT_ENOUGH;
        } else {
//            System.out.println(src.id + " - > " + dest.id);
//            System.out.println(src.balance + " - > " + dest.balance);
            dest.balance = dest.balance + amount;
            src.balance = src.balance - amount;
//            System.out.println(src.balance + " - > " + dest.balance + "\n");
            return TxResult.SUCCESS;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        for (int i = 0; i < 10; i++) {
            User user = new User(i + 1, "User - " + (i + 1));
            userMap.put(user.id, user.name);
            accounts.add(new Account(user, i*100));
        }

        for (Account a: accounts) {
            System.out.println("Account - " + a.id + " belongs to " + userMap.get(a.userId) + " with balance " + a.balance );
        }

        Random rand = new Random();
        for (int i = 0; i < 100 ; i++) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            if (x!=y) {
                new Thread(() -> bank.transferMoney(accounts.get(x), accounts.get(y), 20)).start();
            }
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    for (Account a: accounts) {
                        System.out.println("Account - " + a.id + " belongs to " + userMap.get(a.userId) + " with balance " + a.balance );
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

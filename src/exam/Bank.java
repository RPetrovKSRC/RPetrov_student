package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
   private static List<Account> accounts = new ArrayList<>(10);
   private static Map<Integer, String> userMap = new HashMap();

    public synchronized TxResult transferMoney(Account src, Account dest, int amount) {
        if (src.balance < amount) {
            return TxResult.NOT_ENOUGH;
        } else {
            dest.balance = dest.balance + amount;
            System.out.println(dest.balance);
            src.balance = src.balance - amount;
            System.out.println(src.balance);
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

        Transaction1 t1 = bank.new Transaction1();
        Transaction2 t2 = bank.new Transaction2();

        t2.run();
        t1.run();
        System.out.println(" ");
        System.out.println("Account - " + accounts.get(2).id + " belongs to " + userMap.get(accounts.get(2).userId) + " with balance " + accounts.get(2).balance );
        System.out.println("Account - " + accounts.get(3).id + " belongs to " + userMap.get(accounts.get(3).userId) + " with balance " + accounts.get(3).balance );
        System.out.println("Account - " + accounts.get(4).id + " belongs to " + userMap.get(accounts.get(4).userId) + " with balance " + accounts.get(4).balance );
        System.out.println("Account - " + accounts.get(5).id + " belongs to " + userMap.get(accounts.get(5).userId) + " with balance " + accounts.get(5).balance );

    }


    private class Transaction1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
               TxResult result =  transferMoney(accounts.get(2), accounts.get(5), 10);
            }
        }
    }

    private class Transaction2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                TxResult result =  transferMoney(accounts.get(3), accounts.get(4), 20);
            }
        }
    }
}

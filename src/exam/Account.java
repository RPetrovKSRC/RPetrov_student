package exam;

public class Account {
    private static int count;
    int id;
    int balance;
    int userId;

    Account (User user, int balance) {
        id = count++;
        userId = user.id;
        this.balance = balance;
    }
}

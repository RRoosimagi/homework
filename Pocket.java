package Bank;

public class Pocket {

    private Integer Money;

    public Pocket(Integer money) {
        setMoney(money);
    }

    public Integer getMoney() {
        if (Money <= 10) {
            return 0;
        } else {
            return Money;
        }
    }

    public void setMoney(Integer money) {
        if (money < 0) {
            System.out.println("Money cannot be negative.");
        } else if (money > 3000) {
            System.out.println("I don't have enough space in my pocket for as much money!");
            return;
        } else {
            Money = money;
        }
    }
}


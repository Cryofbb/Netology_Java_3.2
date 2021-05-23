public class Main {
    public static void main(String[] args) {
        int balance = 0;
        int transfer = 999;
        int bonus = (transfer/100);
        int totalBalance;
        if (transfer >= 1000){
            totalBalance = balance + transfer + bonus;
        }
        else {
            totalBalance = balance + transfer;
        }
        System.out.println("Текущий баланс: " + totalBalance);
    }
}

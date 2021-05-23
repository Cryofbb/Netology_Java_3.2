public class Main {
    public static void main(String[] args) {
        int balance = 0;
        int transfer = 999;
        int bonus = (transfer/100);
        int total_balance;
        if (transfer >= 1000){
            total_balance = balance + transfer + bonus;
        }
        else {
            total_balance = balance + transfer;
        }
        System.out.println("Текущий баланс: " + total_balance);
    }
}

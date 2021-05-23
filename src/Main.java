public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int transfer = 1000;
        int totalBalance;
        if (transfer > 1000){
            totalBalance = balance + transfer + (transfer / 100); // Total balance with bonus
        }
        else {
            totalBalance = balance + transfer; // Total balance without bonus
        }
        System.out.println("Текущий баланс: " + totalBalance);
    }
}

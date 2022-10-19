public class BankAbstraction {
    public static void main(String[] args) {
        centralBank cb = new centralBank("Maya", 765940, "Savings", "Hosur");
        cb.withdraw();
        cb.deposit();
        cb.getinterest();
    }
}
public class main {
    public static void main(String[] args) {

        int start = 100;
        int payment = 900;
        int bonus;
        int afterPayment;
        if (payment > 1000) {
            bonus = payment / 100;
            afterPayment = start + payment + bonus;
        } else {
            bonus = 0;
            afterPayment = start + payment;
        }
        System.out.println("Бонус:" + bonus);
        System.out.println("Счёт итог:" + afterPayment);

    }
}

public class SecondClass {
    public static void main(String[] args) {
        int clientAge = 20;
        int balance = 200;
        int price = 150;

        if((clientAge >= 18) && (balance >= price)) {
            System.out.println("You can buy beer");
        }

        if((clientAge < 18) || (balance < price)) {
            System.out.println("You can't buy beer");
        }

        boolean balancePlus = balance > 0 ? true : false;

        if(balancePlus) {
            System.out.println("That's nice");
        }
    }
}

public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello, Kacper");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 90;
        if (topScore >= 90) {
            System.out.println("You have high score!");
        }

        int secondTopScore = 80;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater then second top score but less then 100!");
        }
    }
}

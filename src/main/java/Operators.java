public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;

        System.out.println("1 + 2 equals : " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1  = " + result);

        result = result * 10;
        System.out.println(previousResult + " * 10  = " + result);

        result = result / 5;
        System.out.println(previousResult + " / 5  = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3  = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false) System.out.println("\n \t It is not an alien! \n");

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!\n");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100. \n");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of this tests is true \n");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true \n");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("warCar is true \n");

        //Exercise
        double value20 = 20d;
        double value80 = 80d;
        double myTotal = (double) (value20 + value80) * 25;
        System.out.println("My total: " + myTotal);
        double theReminder = myTotal % 40;
        System.out.println("reminder vaulue is :  " + theReminder);
        if (theReminder <= 20)
            System.out.println("Total was over the limit");

    }
}

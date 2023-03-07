public class mathOperationsAndDataTypes {

    public static void main(String[] args) {

        int firstNumber = 33;
        int secondNumber = 58;

        System.out.println("firstNumber + secondNumber = " + (firstNumber + secondNumber));
        System.out.println("firstNumber - secondNumber = " + (firstNumber - secondNumber));
        System.out.println("firstNumber * secondNumber = " + (firstNumber * secondNumber));
        System.out.println("secondNumber / firstNumber = " + (secondNumber / firstNumber));
        System.out.println("secondNumber % firstNumber = " + (secondNumber % firstNumber));
        System.out.println("firstNumber++   = " + (firstNumber++));
        System.out.println("firstNumber--   = " + (firstNumber--));
        System.out.println("++secondNumber   = " + (++secondNumber));
        System.out.println("secondNumber--   = " +  (firstNumber--));


        System.out.println("firstNumber == secondNumber = " + (firstNumber == secondNumber));
        System.out.println("firstNumber != secondNumber = " + (firstNumber != secondNumber));
        System.out.println("firstNumber > secondNumber = " + (firstNumber > secondNumber));
        System.out.println("firstNumber < secondNumber = " + (firstNumber < secondNumber));
        System.out.println("secondNumber >= firstNumber = " + (secondNumber >= firstNumber));
        System.out.println("secondNumber <= firstNumber = " + (secondNumber <= firstNumber));


        byte thirdNumber = 100;
        byte fourthNumber = (byte) (thirdNumber + 10);
        System.out.println(fourthNumber);


        int fifthNumber = Integer.MAX_VALUE;
        int sixthNumber = fifthNumber + 5;
        System.out.println(sixthNumber);


        double doubleNumber = 5.5;

        System.out.println("int(firstNumber) + double(doubleNumber) = " + (firstNumber + doubleNumber));
        System.out.println("int(firstNumber) * double(doubleNumber) = " + (firstNumber * doubleNumber));
        System.out.println("int(firstNumber) / double(doubleNumber) = " + (firstNumber / doubleNumber));
        System.out.println("int(firstNumber) - double(doubleNumber) = " + (firstNumber - doubleNumber));
        System.out.println("int(firstNumber) % double(doubleNumber) = " + (firstNumber + doubleNumber));
        System.out.println("int(firstNumber) + double(doubleNumber) = " + (firstNumber + doubleNumber));
    }
}

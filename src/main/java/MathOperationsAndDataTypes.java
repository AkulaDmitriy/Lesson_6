public class MathOperationsAndDataTypes {

    public static void main(String[] args) {

        int firtsNumber = 33;
        int secondNumber = 58;

        System.out.println("a +  = " + (firtsNumber + secondNumber));
        System.out.println("a - b = " + (firtsNumber - secondNumber));
        System.out.println("a * b = " + (firtsNumber * secondNumber));
        System.out.println("b / a = " + (secondNumber / firtsNumber));
        System.out.println("b % a = " + (secondNumber % firtsNumber));
        System.out.println("a++   = " + (firtsNumber++));
        System.out.println("a--   = " + (firtsNumber--));
        System.out.println("++b   = " + (++secondNumber));
        System.out.println("b--   = " +  (firtsNumber--));


        System.out.println("a == b = " + (firtsNumber == secondNumber));
        System.out.println("a != b = " + (firtsNumber != secondNumber));
        System.out.println("a > b = " + (firtsNumber > secondNumber));
        System.out.println("a < b = " + (firtsNumber < secondNumber));
        System.out.println("b >= a = " + (secondNumber >= firtsNumber));
        System.out.println("b <= a = " + (secondNumber <= firtsNumber));


        byte x = 100;
        byte y = (byte) (x + 10);
        System.out.println(y);


        int f = Integer.MAX_VALUE;
        int q = f + 5;
        System.out.println(q);


        double c = 5.5;

        System.out.println("int(a) + double(c) = " + (firtsNumber + c));
        System.out.println("int(a) * double(c) = " + (firtsNumber * c));
        System.out.println("int(a) / double(c) = " + (firtsNumber / c));
        System.out.println("int(a) - double(c) = " + (firtsNumber - c));
        System.out.println("int(a) % double(c) = " + (firtsNumber + c));
        System.out.println("int(a) + double(c) = " + (firtsNumber + c));
    }
}

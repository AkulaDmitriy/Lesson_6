public class MathOperationsAndDataTypes {

    public static void main(String[] args) {

        int FIRSTNUMBER = 33;
        int SECONDNUMBER = 58;

        System.out.println("FIRSTNUMBER + SECONDNUMBER = " + (FIRSTNUMBER + SECONDNUMBER));
        System.out.println("FIRSTNUMBER - SECONDNUMBER = " + (FIRSTNUMBER - SECONDNUMBER));
        System.out.println("FIRSTNUMBER * SECONDNUMBER = " + (FIRSTNUMBER * SECONDNUMBER));
        System.out.println("SECONDNUMBER / FIRSTNUMBER = " + (SECONDNUMBER / FIRSTNUMBER));
        System.out.println("SECONDNUMBER % FIRSTNUMBER = " + (SECONDNUMBER % FIRSTNUMBER));
        System.out.println("FIRSTNUMBER++   = " + (FIRSTNUMBER++));
        System.out.println("FIRSTNUMBER--   = " + (FIRSTNUMBER--));
        System.out.println("++SECONDNUMBER   = " + (++SECONDNUMBER));
        System.out.println("SECONDNUMBER--   = " +  (FIRSTNUMBER--));


        System.out.println("FIRSTNUMBER == SECONDNUMBER = " + (FIRSTNUMBER == SECONDNUMBER));
        System.out.println("FIRSTNUMBER != SECONDNUMBER = " + (FIRSTNUMBER != SECONDNUMBER));
        System.out.println("FIRSTNUMBER > SECONDNUMBER = " + (FIRSTNUMBER > SECONDNUMBER));
        System.out.println("FIRSTNUMBER < SECONDNUMBER = " + (FIRSTNUMBER < SECONDNUMBER));
        System.out.println("SECONDNUMBER >= FIRSTNUMBER = " + (SECONDNUMBER >= FIRSTNUMBER));
        System.out.println("SECONDNUMBER <= FIRSTNUMBER = " + (SECONDNUMBER <= FIRSTNUMBER));


        byte THIRDNUMBER = 100;
        byte FOURTHNUMBER = (byte) (THIRDNUMBER + 10);
        System.out.println(FOURTHNUMBER);


        int FIFTHNUMBER = Integer.MAX_VALUE;
        int SIXTHNUMBER = FIFTHNUMBER + 5;
        System.out.println(SIXTHNUMBER);


        double DOUBLENUMBER = 5.5;

        System.out.println("int(FIRSTNUMBER) + double(DOUBLENUMBER) = " + (FIRSTNUMBER + DOUBLENUMBER));
        System.out.println("int(FIRSTNUMBER) * double(DOUBLENUMBER) = " + (FIRSTNUMBER * DOUBLENUMBER));
        System.out.println("int(FIRSTNUMBER) / double(DOUBLENUMBER) = " + (FIRSTNUMBER / DOUBLENUMBER));
        System.out.println("int(FIRSTNUMBER) - double(DOUBLENUMBER) = " + (FIRSTNUMBER - DOUBLENUMBER));
        System.out.println("int(FIRSTNUMBER) % double(DOUBLENUMBER) = " + (FIRSTNUMBER + DOUBLENUMBER));
        System.out.println("int(FIRSTNUMBER) + double(DOUBLENUMBER) = " + (FIRSTNUMBER + DOUBLENUMBER));
    }
}

package homework7;

public class Calculator {

    int plus() {
        int amount;
        int firstAdditive = 64;
        int secondAdditive = 579;

        return amount = firstAdditive + secondAdditive;
    }

    int minus() {
        int difference;
        int minuend = 10068;
        int subtrahend = 6584;

        return difference = minuend - subtrahend;
    }

    int divide() {
        int quotient;
        int dividend = 120;
        int divisor = 30;
        if (divisor == 0) {
            System.out.print("Թիվը չի կարող բաժանվել 0-ի");
            return -1;
        }
        return quotient = dividend / divisor;
    }

    double multiply() {
        double product;
        double firstFactor = 3.687;
        double secondFactor = 63.987;

        return product = firstFactor * secondFactor;
    }
}


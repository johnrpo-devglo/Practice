public class SumAverageRunningInt {

    public static void main(String[] args) {

        int sum = 0;
        double prom;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for(int num = LOWERBOUND; num <= UPPERBOUND; ++num){
            sum += num;
        }
        prom = (LOWERBOUND + UPPERBOUND) / 2.0;

        System.out.println("El total es: " + sum);
        System.out.println("El promedio es: " + prom);

        //============================================
        System.out.println("\n");
        //============================================

        int sum1 = 0;
        int num1 = LOWERBOUND;

        while (num1 <= UPPERBOUND){
            sum1 += num1;
            ++num1;
        }
        System.out.println("Bucle while");
        System.out.println(sum1);

        //============================================
        System.out.println("\n");
        //============================================


    }

}

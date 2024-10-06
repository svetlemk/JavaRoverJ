package Day1.d2;

public class T1 {
    public static void main (String[] args) {
        int num1 = 6;
        int num2 = 8;
        int sum,deduct,divide,multiuply,remainnder;
        sum = num1+num2;
        deduct = num1-num2;
        divide = num1/num2;
        multiuply= num1*num2;
        remainnder= num1%num2;
        System.out.println("sum = " + sum);
        System.out.println("deduct = " + deduct);
        System.out.println("divide = " + divide);
        System.out.println("multiuply = " + multiuply);
        System.out.println("remainnder = " + remainnder);

        System.out.println("_____________________________________");
        int printout= T1.multiplication(3,10);
        System.out.println("printout = " + printout);

        double[] julyRides = new double[] {15.0, 21.8, 20.5, 18.2};

    }

    public static int multiplication(int num1,int num2){
        int result = num1+num2;
        System.out.println(result);
        return result;
    }
}
/*
Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.
 */
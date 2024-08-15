//Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами,
// первые 2 числа в массиве должны быть положительными;
//        Затем через 1 цикл “for each” посчитать среднее арифметическое положительных чисел, расположенных после
//        первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6, -7) =  11/3

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        double[] numbers = {1.5, 5.5, -4.3, 59.1, 3.4, -78.8, 0.4, -0.7, 2.5, -15.9, 1.1, 0.8, 13.2, 8.8, 7.7};
        boolean negative = false;
        double sum = 0.0;
        int count = 0;
        for (double number : numbers) {
            if (!negative){
            if (number < 0) {
                negative = true;
            }
            }else {
                if (number>0){
                    sum+=number;
                    count++;
                }
                }
            }
            if (count>0){
                double result = sum/count;
                System.out.println( Arrays.toString(numbers) + " = " +  sum+ " / "+ count + " = " + result);


                }

            }



}

import java.util.Arrays;

public class HomeWork2 {
    //exercise 1
    public static void main(String[] args) {
        int[] arr =  { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 0){
                arr[i] = arr[i] + 1;
            } else arr[i] = arr[i] * 0;
        }
        System.out.println(Arrays.toString(arr));

        //exercise 2
        int[] arrNumber =new int[8];
        for(int i = 0; i < 8; i++){
            arrNumber[i] = i + i * 2;
        }
        System.out.println(Arrays.toString(arrNumber));

        //exercise 3

        int[] arrMultiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arrMultiplication.length; i++){
            if(arrMultiplication[i] < 6){
                arrMultiplication[i] = arrMultiplication[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrMultiplication));

        //exercise 4
        int [][] table = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j) table[i][j] = 1;
                table[i][table.length - 1 - i] = 1;
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

        //exercise 5 нахождение максимального числа
        int[] arrMax = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arrMax[0];
        for (int i = 0; i < arrMax.length; i++){
            if(arrMax[i] > max)
                max = arrMax[i];
        }
        System.out.println("Максимальное значение в массиве: " + max);

        //exercise 5 нахождение минииального числа

        int[] arrMin = {21, 5, 3, 2, 11, 4, 5, -2, 4, 8, 9, 1};
        int min = arrMin[0];
        for(int i = 0; i < arrMin.length; i++){
            if(arrMin[i] < min)
                min = arrMin[i];
        }
        System.out.println("Минимальное значение в массиве: " + min);
    }
}

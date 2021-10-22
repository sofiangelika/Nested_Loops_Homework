package com.company;

public class Main {

    public static void main(String[] args) {
        homework_1();
        homework_2();
        homework_3();
        homework_4();

        int[] array = {1, 2, 3, 4, 1, 6};
        System.out.println(homework_5(array));

        homework_6();

    }
    static void homework_1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print(j + " ");
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print(j + i + " ");
            System.out.println();
        }
    }
    static void homework_2() {
        /*
        Pseudocode:
        FLAG = false
        loop N from 0 to 4
        M = 0
            loop while NOT FLAG AND M <= 4
                if A[N] = B[M] then
                    FLAG = true
                end if
                M = M + 1
            end loop
        end loop
        output FLAG
         */
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {7,6,1,41,-8};

        boolean flag = false;
        for (int i = 0; i < array1.length; i++) {
            int j = 0;
            while (j < array2.length && !flag) {
                if (array1[i] == array2[j])
                    flag = true;
                j++;
            }
        }
        System.out.println(flag);
    }
    static void homework_3() {
        int[] nums = {3, 7, 4};

        for (int k = 0; k < nums.length; k++)
            for (int l = 0; l < nums.length; l++)
                if (!(k == l))
                    System.out.println(10 * nums[k] + nums[l]);

    }

    static void homework_4() {
        for (int row = 6; row > 0; row--) {
            for (int stars = 1; stars <= row; stars++)
                System.out.print("*");
            System.out.println();
        }
        for (int row = 1; row <= 6; row++) {
            for (int stars = 1; stars <= row; stars++)
                System.out.print("*");
            for (int dashes = 1; dashes <= 6 - row; dashes++)
                System.out.print("-");
            System.out.println();
        }
    }

    static boolean homework_5(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                if (numbers[i] == numbers[j] && j != i)
                    return false;
            }
        }
        return true;
    }

    static void homework_6() {
        int[] a = {4, 4, 6, 11, -2, 3};
        int[] b = {5, 11, 11, -3, 3, 5};

        for (int number : a)
            compare(number, b);

        for (int number : b)
            compare(number, a);
    }

    static void compare(int num1, int[] array) {
        for (int num2 : array) {
            if (num1 == num2)
                return;
        }
        System.out.print(num1 + " ");
    }

}
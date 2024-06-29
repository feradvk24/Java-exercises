//Задача 2
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = Integer.parseInt(sc.nextLine());
        int[] arr = new int[len];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        int[] arr_copy = sortAndFilter(arr, 50);
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew array: ");
        for (int i = 0; i < arr_copy.length; i++) {
            System.out.print(arr_copy[i] + " ");
        }

    }





        public static int[] sortAndFilter(int[] array,int key) {
            int[] arr_cpy = Arrays.copyOf(array, array.length);
            Arrays.sort(arr_cpy);

            int l = 0;
            for (int i = 0; i < arr_cpy.length; i++) {
                if (arr_cpy[i] <= key) {
                    l++;
                } else {
                    break;
                }
            }

            return Arrays.copyOf(arr_cpy,l);

        }
    }
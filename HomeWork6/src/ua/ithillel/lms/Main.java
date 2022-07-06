package ua.ithillel.lms;

public class Main {

    public static void main(String[] args) {

        int ySize = 3;
        int xSize = 4;

        int[][] arr = new int[ySize][xSize];
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                arr[i][i1] = 10 * (i + 1) + i1;
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            result[i] = sum;
        }
        for (int i : result)
            System.out.println(i);
    }
}

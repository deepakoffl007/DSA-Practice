public class Bubblesort{
    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 5, 4 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-1; j++) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j]; 
                    a[j] = a[j-1];
                 a[j - 1]=temp;

                }
            }
        }
        for (int k = 0; k < 5; k++) {
            System.out.println(a[k]);
        }
    }
}
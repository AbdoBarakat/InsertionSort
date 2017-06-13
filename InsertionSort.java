package insertionsort;

public class InsertionSort {
    
    public static void print (int [] a) {        
        System.out.printf("{%d", a[0]);        
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
        }        
        System.out.println("}");
    }
    
    public static void swap (int [] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
    }
    
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i;

            while (j > 0 && a[j - 1] > temp) {
            a[j] = a[j - 1];
            j--;
            }

        a[j] = temp;
        }
    }


    public static void main(String[] args) {
          int [] a = {42, 77, 35, 12, 101, 5};
          print(a);
          insertionSort(a);  
          print(a);
    }
}
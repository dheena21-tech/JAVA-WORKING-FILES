public class num {
            public static void main(String[] args) {
        int rows = 10; // number of rows
        int j;
        for (int i = 1; i <= rows; i++) {
            for ( j = 1; j <= rows-i; j++) 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
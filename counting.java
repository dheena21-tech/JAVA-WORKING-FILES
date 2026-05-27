public class counting {
    public static void main(String[] args) {
        // Your Code goes here!
         
             int n =1000444,count=0;
             while(n>0)
             {
                n=n/10;
                count++;

             }
             System.out.println(count);
             n=10000;
             String s=Integer.toString(n);
             System.out.println(s.length());

        }

    }

    

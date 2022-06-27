import java.io.*;
import java.util.*;
class predoutput
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            int i = 1;
            while(i<=n)
            {
                int j = 1;
                while(j<=i)
                {
                    int k = 1;
                    while(k<=j)
                    {
                        System.out.print(k);
                        k++;
                    }
                    System.out.println(" ");
                    j++;
                }
                System.out.println("*******");
                System.out.println(" ");
                i++;
            }
          
        }
    }
                    
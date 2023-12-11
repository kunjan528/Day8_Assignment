public class Assign_Pattern_3_3
 {
    public static void main(String[] args)
     {
       
        int i ;
        int j ;
        for ( i = 1; i <= 5; i++) 
        {
            // Print spaces
            for (j = 1; j <i; j++) 
            {
                System.out.print(" ");
            }

                if (i == 1 || i == 5 )
            {
                            for( j = 1 ; j <= 10;j++) 
                {
                     System.out.print("*");
                }
            }
                 else 
                {
                    System.out.print("*");
                    for(j=1;j<=10;j++)
                    {
                        System.out.print(" ");
                    }
                }
                 System.out.println("*");
        }
     }
 }
            

            
        
    

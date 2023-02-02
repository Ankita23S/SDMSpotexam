class FibonacciExample1{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1,n3,i,count=10;    
     System.out.print(n1+" "+n2);//printing 0 and 1    
        
     for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }}

    public class PrimeNumbers{    
        public static void main(String args[]){    
         int i,m=0,flag=0;      
         int n=3;//it is the number to be checked    
         m=n/2;      
         if(n==0||n==1){  
          System.out.println(n+" is not prime number");      
         }else{  
          for(i=2;i<=m;i++){      
           if(n%i==0){      
            System.out.println(n+" is not prime number");      
            flag=1;      
            break;      
           }      
          }      
          if(flag==0)  { System.out.println(n+" is prime number"); }  
         }//end of else  
       }    
       } 

       public class ArmstrongNumber {

        public static void main(String[] args) {
    
            int number = 371, originalNumber, remainder, result = 0;
    
            originalNumber = number;
    
            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }
    
            if(result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
    
/**
 * @Abdulrahman :) 
 */ 
public class Recursion0 {

 public static void main(String[] args) {
   
     
    System.out.println(factorial(5));
    System.out.println(Fibonacci_Series(5));
    System.out.println(power(5,2));
    System.out.println(sum(5));
    int [] arr = {3,7,1};
    System.out.println(SumAryy(arr,0));

        
}
 
//-------------------------------------------      
 
   public static int factorial(int n){ // n
   if (n==1||n==0)//base case
       return 1;
   else
       return n*factorial(n-1); // genral case
   }
   
//-------------------------------------------
   
   public static int Fibonacci_Series(int n){ // 2^n
  if (n==1||n==0)//base case
       return n; 
   else
       return Fibonacci_Series(n-1)+Fibonacci_Series(n-2);// genral case
   }
   
//-------------------------------------------
   
   public static int power(int n,int x){// n
   if (x==0)//base case
       return 1;
   else
       return n * power(n,x-1); // genral case
   }
    
//-------------------------------------------
   
   public static int sum(int n){ // n
   if (n==1||n==0)//base case
       return n;
   else
       return n+sum(n-1); // genral case
   }

//------------------------------------------- 
public static int  SumAryy(int a[],int st){
   if (st+1 == a.length)
       return a[st];
       else
       return a[st]+SumAryy(a,st+1);
       
 }   
   
//-------------------------------------------
}

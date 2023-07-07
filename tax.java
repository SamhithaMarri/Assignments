import java.util.Scanner;
class Tax{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the monthly income");
        double n=s.nextDouble();
        n=n*12;
        double a=tax(n);
        System.out.println("Tax is: "+ a);
    }
public static double tax(double n)
    {
    if(n<=250000){
        return 0;
    }
    else if(n<=500000){
        return (n-250000)*0.1;
    }
    else if(n<=1000000){
        return 25000+(n-500000)*0.2;
    }
    else{
        return 125000+(n-1000000)*0.3;
    }

   }
}
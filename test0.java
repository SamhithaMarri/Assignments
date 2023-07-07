import java.util.*;
class test0
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int current,prev,billingUnit,x=0;
        current=sc.nextInt();
        prev=sc.nextInt();
        billingUnit=current-prev;
        char c=sc.next().charAt(0);c
        switch(c)
        {


            case 'D':
                if(billingUnit<=100)
                    x += billingUnit;
                else if(billingUnit<=200)
                    x += (((billingUnit-100)*2)+100);
                else
                    x += (100+(100*2)+(billingUnit-200)*3);
                break;
               

            case 'C':
                if(billingUnit<=100)
                    x += (billingUnit*2);
                else if(billingUnit<=200)
                    x += (((billingUnit-100)*4)+(100*2));
                else
                    x += ((100*4)+(100*2)+(billingUnit-200)*6);
                break;
                
           case 'I':
                if(billingUnit<=100)
                    x += (billingUnit*3);
                else if(billingUnit<=200)
                    x += (((billingUnit-100)*6)+(100*3));
                else
                    x += ((100*3)+(100*6)+(billingUnit-200)*9);
                break;
         
        }
        System.out.println(billingUnit+" "+x);
    }
}


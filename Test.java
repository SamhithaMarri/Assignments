class Test
{
 public static void main(String[] args)
 {
   Time t=new Time(13,56,34);
   t.setHour();
   t.setMinute();
   t.setSecond();
   t.incrementSecond();
   System.out.print(t.Time());
   System.out.print(t.getHour());
   System.out.print(t.getMinute());
   System.out.print(t.getSecond());
 }
}
class Time
{
  private int hour;
  private int minute;
  private int second;
  public Time(){}
  public void Time(int hour,int minute,int second)
  {
     this.hour=hour;
     this.minute=minute;
     this.second=second;
  }
     public int validatehour()
     {
       return hour>=0 && hour<=23 ? hour : hour%24;
     }
     
     public int validateMintue(int minute)
     {
       return minute >=0 && minute<=59 ? minute : minute%59; 
     }
     public int validateSecond()
     {
       return second>=0 && second<=59 ? second : second%59;
     }
     public void setHour(int hour);
     {
       hour=validateHour(hour);
     }
     public void setMinute(int minute);
     {
       minute=validateMinute(minute);
     }
     public void setSecond(int second);
     {
       second=validateSecond(second);
     }
    
     public void incrementHour()
     {
       if(hour>=0 && hour<=23)
        hour++;
       else 
        hour=0;
       
     }
     public void incrementMinute()
     {
       if(minute>=0 && minute<=59)
        minute++;
       else
        minute=0;
     }
     public void  incrementSecond()
     { 
       if(second>=0 && second<=59)
        second++;
       else
        second=0;
     }
     public int getHour()
     {
       return hour;
     }
      public int getMinute()
     {
       return minute;
     }
      public int getSecond()
     {
       return second;
     }

     
  

}
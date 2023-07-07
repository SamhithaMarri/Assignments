class linearSearch
{
 public static void main(String[] args)
 {
  int a[]={10,20,40,50,30};
  int key=50;
  boolean flag=false;
  for(int i=0;i<a.length;i++)
  {
    if(key==a[i])
    {
      System.out.println("Element is found at:"+" "+a[i]);
      flag=true;
      break;
    }
  }
  if(flag==false)
  {
    System.out.println("Element is not found");
  }
 }
}
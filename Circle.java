class Circle
{
 public static void main(String[] args)
 {
   Circle c1=new Circle();
   c1.setRadius(4.5);
   System.out.println(c1.area());
 }
 private double radius;
        public double validateRadius(double r)
        {
            return r> 0.0 ? r : 1.0;
        }
        public void setRadius(double r)
        {
            radius=validateRadius(r);
        }
        public double area()
        {
            return 3.14*radius*radius;
        }

}
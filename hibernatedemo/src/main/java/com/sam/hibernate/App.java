package com.sam.hibernate;



import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sam.hibernate.entity.Address;
import com.sam.hibernate.entity.Employee;
import com.sam.hibernate.entity.Person;
import com.sam.hibernate.util.HibernateUtil;


public class App 
{
    public static void main( String[] args )
    {
      SessionFactory factory = HibernateUtil.buildSessionFactory();
      Session session = factory.openSession();
      Person p = session.get(Person.class,11);
      if(p!=null)
      {
    	  System.out.println(p.getSsn()+" "+p.getPersonName()+" "+p.getPersonAge()+" "+p.getGender());
    	  System.out.println(p.getAddress().getAddressId()+"  "+p.getAddress().getHouseNo()+" "+p.getAddress().getStreetName() );
    	  System.out.println(p.getAddress().getCityName()+"  "+p.getAddress().getState());
      }
      Address a = session.get(Address.class, 1);
      if(a!=null)
      {
    	  System.out.println(a.getAddressId()+"  "+a.getHouseNo()+" "+a.getStreetName() );
    	  System.out.println(a.getCityName()+"  "+a.getState());
    	  System.out.println(a.getPerson().getSsn()+" "+a.getPerson().getPersonName());
    	  System.out.println(a.getPerson().getPersonAge()+" "+a.getPerson().getGender());
      }
      
      session.close();
      HibernateUtil.shutdown();
    }
}
/* if(e!=null)
e.setEmpname("akhila");
System.out.println(session.isDirty());
 System.out.println(e.getEmpname()+" "+e.getSalary()+" "+e.getDeptno());
else
System.out.println("Employee with id 104 doesnt exist");
Employee e2 = new Employee(2,"Chai",2000,20);
Transaction trans = session.beginTransaction();
session.save(e1); session.saveOrUpdate(e);
session.save(e2);

 Employee e = new Employee(2,"srija",2000,20);
       
        session.update(e);
 Employee e = new Employee();
        e.setEmpid(3);
        session.delete(e);;
*/

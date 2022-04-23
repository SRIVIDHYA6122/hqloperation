package com.edu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con= new Configuration().configure().addAnnotatedClass(EmployeeHQL.class);
		 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 SessionFactory factory= con.buildSessionFactory(reg);
		 Session session= factory.openSession();
		 Transaction t= session.beginTransaction();
		/* EmployeeHQL e1=new EmployeeHQL(1, "sri", 3432, "salem",100 );
		 session.save(e1);
		 EmployeeHQL e2=new EmployeeHQL(2, "ram", 4433, "mettur",101 );
		 session.save(e2);
		 EmployeeHQL e3=new EmployeeHQL(3, "raghul", 2122, "omalur",102 );
		 session.save(e3);
		 EmployeeHQL e4=new EmployeeHQL(4, "sanjay", 5454, "junction",103 );
		 session.save(e4);
		 EmployeeHQL e5=new EmployeeHQL(5, "meena", 2134, "erode",104 );
		 session.save(e5);*/
		 //EmployeeHQL e1=new EmployeeHQL(1, "sri", 4444, "salem",100 );
		 //session.save(e1);
		 //get record based on id
		// EmployeeHQL r=(EmployeeHQL) session.get(EmployeeHQL.class, 1);
		// System.out.println(r);
		
		/*Query q=session.createQuery("from EmployeeHQL");
		
		List l=q.list();
		System.out.println(l);
		Iterator<EmployeeHQL> it=l.iterator();
        while(it.hasNext()) {
     	 EmployeeHQL r=it.next();
     	System.out.println("emp id="+r.getEid()+"name="+r.getEname()+"salary="+r.getEsalary()+"address="+r.getEaddress()+"deptno="+r.getDeptno());
     	 
     	
        }*/
		 //update record the name
		/* Query q=session.createQuery("update EmployeeHQL set ename=:n where eid=:i");
		 q.setParameter("n", "ajay");
		 q.setParameter("i", 1);
		 
		 int i=q.executeUpdate();
		 if(i>0)
		 {
			 System.out.println("record  is updated");
		 }
		 else
		 {
			 System.out.println("not updated");
		 }*/
				
		 // update record to salary
		 
		/* Query q=session.createQuery("update EmployeeHQL set esalary=:m where eid=:i");
		 q.setParameter("m", 34543f);
		 q.setParameter("i", 1);
		 int i=q.executeUpdate();
		 if(i>0) {
			 System.out.println("record is update");
			 
			 
		 }
		 else
		 {
			 System.out.println("not update");
		 }*/
		 
		/* Query d= session.createQuery("delete from EmployeeHQL where eid=:i");
		 d.setParameter("i", 5);
		 int i= d.executeUpdate();
		 if(i>0) {
			 System.out.println("reocrd deleted");
		 }
		 else
		 {
			 System.out.println("not deleted");
		 }*/
		/* Query s=session.createQuery("select sum(esalary) from EmployeeHQL");
		 		List s1=s.list();
		 		System.out.println("total sal="+s1.get(0));
		 		/* Query s=session.createQuery("select min(esalary) from EmployeeHQL");
			 		List s1=s.list();
			 		System.out.println("total sal="+s1.get(0));*/
			 		Query s=session.createQuery("select max(esalary) from EmployeeHQL");
			 		List s1=s.list();
			 		System.out.println("total sal="+s1.get(0));
			 		Query e=session.createQuery("select avg(esalary) from EmployeeHQL");
			 		List e1=e.list();
			 		System.out.println("total sal="+e1.get(0));
			 		Query m=session.createQuery("select count(eid) from EmployeeHQL");
			 		List t1=m.list();
			 		System.out.println("total employee="+t1.get(0));

			 		
			 		
		 t.commit();
		  session.close();

	}

}
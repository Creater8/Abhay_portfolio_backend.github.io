package com.files;


import java.io.Serializable;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.files.entites.recivedPersistenet;

public class SaveRecords2 

{
	StandardServiceRegistry ssr;
	Metadata meta;
	SessionFactory sf;
	Session session;
	Transaction t;
     public SaveRecords2() 
    {
    	 ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	 meta=new MetadataSources(ssr).getMetadataBuilder().build();
    	 sf=meta.getSessionFactoryBuilder().build();
    	
    }
     
     public int data(recivedPersistenet recived)
     {
    	 session=sf.openSession();
   	     t=session.beginTransaction();
   	     
    	int status=0;
    	try {
    		Serializable save = session.save(recived);
    		
    		
    		status=1;
    		
  
			
		} catch (Exception e) {
		   System.out.println("Exception"+e);	
		}
    			
    	t.commit();	
    	sf.close();
        session.close();
        return status;
           
     }
	
}

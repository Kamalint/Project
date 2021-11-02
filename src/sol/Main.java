package sol;

import java.sql.*;
import java.util.*;

public class Main {

	    public static void main(String[] args) {  
	    	//Creating Database
	    	DB a = new DB();
	    	Connection con=null;
	    	con=a.createNewDatabase("test.db"); 
	    	
	    	//Checking connection
	    	C b = new C();
	    	con = b.connect("jdbc:sqlite:C://sqlite/test.db");
	    	
	    	if(b==null)
	    	{
	    		System.out.println("Not Connected");
	    	}
	    	else
	    	{	
	    		//Creating new table 
	    		a.createNewTable(con,"jdbc:sqlite:C://sqlite/test.db");
	    	}
	    	
	    	Data d = new Data();
	    	Scanner sc =  new Scanner(System.in);
	    	System.out.println("Enter the number of rows: ");
	    	int n=sc.nextInt();
	    	while(n>0)
	    	{
	    		sc.nextLine();
	    		String q,w,e,r,y;
	    		System.out.println("Enter the Moive_Name: ");
	    		q=sc.nextLine();
	    		System.out.println("Enter the Actor_Name: ");
	    		w=sc.nextLine();
	    		System.out.println("Enter the Actress_Name: ");
	    		e=sc.nextLine();
	    		System.out.println("Enter the Year_Of_Release: ");
	    		r=sc.nextLine();
	    		System.out.println("Enter the Director_Name: ");
	    		y=sc.nextLine();
	    		d.insert(con, q, w, e, r, y);
	    		n=n-1;
	    	}
	    	d.selectAll(con);
	    	System.out.println("Enter the Actor_Name: ");
    		String p;
	    	p=sc.nextLine();
	    	d.selectMovie(con,p);
	    	
	    }  
	}  

package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo implements Comparator<Emp>{

	public int compare(Emp e1, Emp e2) {
		int value=0;
		if(e1.getSal()>e2.getSal())
		{
			value=-1;
		}
		else if(e1.getSal()<e2.getSal())
		{
			value=1;
		}
		else if(e1.getSal()==e2.getSal())
		{
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("Yash");
		e1.setSal(20000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Nirav");
		e2.setSal(40000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Shruti");
		e3.setSal(18000);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Dhruvisha");
		e4.setSal(25000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, new ComparatorDemo());
		for(Emp e:list)
		{
			System.out.println("EID : "+e.getEid()+" ENAME : "+e.getEname()+" SALARY : "+e.getSal());
		}
	}
	
}

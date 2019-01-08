package pktest;

import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyNumber1 {
public int number;
public MyNumber1(int n) {
	this.number = n;
}
	//Trả ra danh sách tất cả các số chẵn nhỏ hơn number
public ArrayList Get_Sochan(){
ArrayList Get_Sochan = new ArrayList();
for ( int i = 0; i < number; i++) {
	if (number%2==0) {
		Get_Sochan.add(i);		
	}
}
	return Get_Sochan;
}
	//lay ra so le
public ArrayList Get_Sole(){
ArrayList Get_Sole = new ArrayList();
	for (int j = 0; j < number; j++) {
	if (number%2==1) {
		Get_Sole.add(j);
	}
	}
	return Get_Sole;
}
	//tinh tong
public ArrayList Get_Sotonghop(){
	ArrayList Sotonghop = new ArrayList();
	ArrayList sochan = Get_Sochan();
	ArrayList sole = Get_Sole();
	for (int i = 0; i < number ; i++){
//	int chan = Integer.parseInt(sochan.get(k).toString());
//  int le = Integer.parseInt(sole.get(k).toString());
//	int tong = chan + le;
//	int i = k;
//	for (i = 0; i < number; i++) {
		Sotonghop.add(sochan[i]+sole[i]);
	}
		
	}
	    
}


package pktest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class test_mynumber1 {
	public int number;
	public test_mynumber1(int n) {
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
//		int chan = Integer.parseInt(sochan.get(k).toString());
	//  int le = Integer.parseInt(sole.get(k).toString());
//		int tong = chan + le;
//		int i = k;
//		for (i = 0; i < number; i++) {
			Sotonghop.add(sochan[i]+sole[i]);
		}		
		}
@Test
public void check_sochan(){
	//arrange
	int number = 10;
	test_mynumber1 number1 = new test_mynumber1(number);
	//action
	ArrayList chan = new ArrayList();
		chan = number1.Get_Sochan();
		for (int i = 0; i < chan.size(); i++) {
			System.out.println(chan.get(i));
			
		}
	//asertion
		Assert.assertEquals(chan.get(0), 0);
		Assert.assertEquals(chan.get(2), 2);
		Assert.assertEquals(chan.get(4), 4);
		Assert.assertEquals(chan.get(6), 6);
		Assert.assertEquals(chan.get(8), 8);

}
@Test
public void check_sole(){
	//arrange
	int number = 10;
	test_mynumber1 number1 = new test_mynumber1(number);
	//action
	ArrayList le = new ArrayList();
		le = number1.Get_Sochan();
		for (int i = 0; i < le.size(); i++) {
			System.out.println(le.get(i));
			
		}
	//asertion
		Assert.assertEquals(le.get(1), 1);
		Assert.assertEquals(le.get(3), 3);
		Assert.assertEquals(le.get(5), 5);
		Assert.assertEquals(le.get(7), 7);
		Assert.assertEquals(le.get(9), 9);
}

public void check_tong(){
	//arrange
	int number = 10;
	test_mynumber1 number1 = new test_mynumber1(number);
	//action
	ArrayList tong = new ArrayList();
	tong = number1.Get_Sotonghop();
	for (int i = 0; i < tong.size(); i++) {
		System.out.println(tong.get(i));
}
	//asertion
	Assert.assertEquals(tong.get(1), 1);
	Assert.assertEquals(tong.get(2), 5);
	Assert.assertEquals(tong.get(3), 9);
	Assert.assertEquals(tong.get(4), 13);
	Assert.assertEquals(tong.get(5), 17);
}
}

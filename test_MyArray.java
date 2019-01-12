package pktest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class test_MyArray {
	public int [] Numbers;

	//khoi tao mang so nguyen
	public test_MyArray(int[] numbers){
		this.Numbers = numbers;	
		}
	//dem so lan xuat hien phan tu x
	public int CountNumber(int x){
	int count = 0;
	for (int i = 0; i < Numbers.length; i++) {
		if (x = Numbers[i]);{
			count = count +1;
		}
		return count;
	}
	}
	//Phương thức loại bỏ các phần tử trùng trong mảng Numbers
	public ArrayList RemoveDupplicateNumber(){
	ArrayList duplicate = new ArrayList();
	for (int i = 0; i < Numbers.length; i++) {
		int x = Numbers[i];
	for (int j = i+1; j < Numbers.length; j++ ){
		int y = Numbers[j];
	if (x = y) {
		duplicate.clear();
	}	
	}	
	}
	}
@Test
public void check_count(){
	//arrange
		int[] originalNumber = {2, 3, 2, 6, 2, 8, 9, 10 };	
		test_MyArray numb = new test_MyArray(originalNumber);
	//action
		int Duplicate = numb.CountNumber(2);
	//Assertion 
		Assert.assertEquals(3,Duplicate);
		
}		

@Test
public void check_remove(){
	//arrange
	int[] originalNumber = {2, 3, 2, 6, 2, 8, 9, 10 };
	test_MyArray numb = new test_MyArray(originalNumber);
	//action
	ArrayList remove = new ArrayList();
	remove = numb.RemoveDupplicateNumber();
	//assertion
	for (int i = 0; i < remove.size(); i++) {
	System.out.println(remove.get(i));	
	}
	//Assertion
	Assert.assertEquals(remove.get(1), 2);
	Assert.assertEquals(remove.get(3), 2);
	Assert.assertEquals(remove.get(5), 2);
}
}

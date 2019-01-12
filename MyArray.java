package pktest;

import java.util.ArrayList;

public class MyArray {
public int [] Numbers;

//khoi tao mang so nguyen
public MyArray (int[] numbers){
	this.Numbers= numbers;	
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
}



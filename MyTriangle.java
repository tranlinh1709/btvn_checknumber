package pktest;

public class MyTriangle {
public int canh1;
public int canh2;
public int canh3;
//kiem tra co phai la canh cua tam giac ko
public boolean IsTriangle(){
	boolean result = false;
	if ((canh1 + canh2 > canh3)&& (canh1 + canh3 > canh2)&& (canh2 + canh3 > canh1)) {
		result = true;
	}
	return result;
}

//kiem tra co phai 3 canh cua tam giac can
public boolean IsIsoscelesTriangle(){
	boolean resultcan = false;
	if ((canh1 + canh2 > canh3)&& (canh1 + canh3 > canh2)&& (canh2 + canh3 > canh1)&&(canh1==canh2)||(canh2==canh3)||(canh1==canh3))
	{
	    resultcan = true;
	}
	return resultcan;
}

//tinh chu vi neu la tam giac
//public int  GetCircuit(){
//	int chuvi = 0;
//	boolean a = IsTriangle();
//	if (a = true) {
//		chuvi = chuvi + canh1 + canh2 + canh3;
//	}
//	return chuvi;
//}

}

	
	


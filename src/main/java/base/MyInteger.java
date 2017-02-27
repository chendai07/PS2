package base;

import base.MyInteger;

public class MyInteger {

	private int iValue;
	public MyInteger(int i){
		iValue=i;
	}
	public  int getIValue(){
		return iValue;
	}
	public boolean isOdd(){
		if(iValue%2!=0)
			return true;
		else return false;
	}
	public boolean isEven(){
		if(iValue%2==0)
			return true;
		else return false;
	}
	public boolean isPrime(){
		int i;
		for(i=2;i<=iValue/2;i++){
			if(iValue%i==0){
				return false;
				
			}		
		}
		if(i>iValue/2&&iValue!=1)
			return true;
		else return false;
	}



}



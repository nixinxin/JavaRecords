package test;

public class Calculator {
	private static int result; //��̬���������ڴ洢���н��
	public void add(int n){
		result=result+n;
		System.out.println("�ͣ�"+result);
	}
	public void substract(int n){
		result=result-n; 
		System.out.println("����"+result);
	}
	public void multiply(int n){
		result=result*n; 
		System.out.println("�ˣ�"+result);
	}
	public void divide(int n)throws Exception{
		if(n==0)
			throw new Exception("��������Ϊ0");
		result=result/n;
		System.out.println("����"+result);
	}
	public void square(int n){
		result=n*n;
		System.out.println("ƽ����"+result);
	}
	public void squareRoot(int   n){
		for(;;);         //Bug:��ѭ��
		System.out.println("��ѭ��");
	}
	public void clear(){  //���������
		result=0;
		System.out.println("��գ�"+result);
	}
}

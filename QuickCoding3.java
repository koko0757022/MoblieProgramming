//�Է¹��� ���ڿ��� ���ڰ� �ƴѰ��
//0���� �������� �ϴ°��
//�Էµ� ������ �ڸ����� 3�ڸ��� �Ѿ�°��
package Quick;
import java.util.Scanner;

class MyException1 extends Exception{

	
}

public class QuickCoding3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str1 , str2;
		int num1=0,num2,num3;		
		
		try {
			str1 =  input.nextLine();
			str2 =  input.nextLine();
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);
			
			if(str1.length() >=3 || str2.length()>=3){
				throw new MyException1();
			}
			
			num1 = num1/num2;
			System.out.println(num1);
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �ȵ˴ϴ�");
		} catch(NumberFormatException e){
			System.out.println("�Է¹��� ���ڿ��� ���ڰ� �ƴմϴ�");
		} catch(MyException1 e){
			System.out.println("�Էµ� ���ڰ� 3�ڸ��� �Ѿ�ϴ�");
		}		
	}
}








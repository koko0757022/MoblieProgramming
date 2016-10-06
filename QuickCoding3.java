//입력받은 문자열이 숫자가 아닌경우
//0으로 나눗셈을 하는경우
//입력된 숫자의 자릿수가 3자리가 넘어가는경우
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
			System.out.println("0으로 나누면 안됩니다");
		} catch(NumberFormatException e){
			System.out.println("입력받은 문자열이 숫자가 아닙니다");
		} catch(MyException1 e){
			System.out.println("입력된 숫자가 3자리를 넘어갑니다");
		}		
	}
}








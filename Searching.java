import java.util.Scanner;
public class Searching {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ran = (int) (Math.random()*1000)+1;
		int myNum = 0;
		System.out.println("숫자를 맞춰보세요 (0~1000)");

		while(true){
			myNum = scan.nextInt();
			if(ran > myNum){
				System.out.println("up!!");
			}else if(ran < myNum){
				System.out.println("down!!");
			}else {
				System.out.println("정답입니다");
				break;
			}
		}

	}

}

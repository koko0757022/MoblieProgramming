import java.util.Scanner;
public class Searching {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ran = (int) (Math.random()*1000)+1;
		int myNum = 0;
		System.out.println("���ڸ� ���纸���� (0~1000)");

		while(true){
			myNum = scan.nextInt();
			if(ran > myNum){
				System.out.println("up!!");
			}else if(ran < myNum){
				System.out.println("down!!");
			}else {
				System.out.println("�����Դϴ�");
				break;
			}
		}

	}

}

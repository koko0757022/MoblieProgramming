
public class Sorting {

	public static void main(String[] args) {
		int index[] = {1,4,5,2,7,8,10};
		int temp;
		for (int i = 0; i < index.length - 1; i++) {
			for (int j = 0; j < index.length -1 -i; j++) {
				if(index[j] > index[j+1]){
					temp = index[j];
					index[j]=index[j+1];
					index[j+1] =temp;
				}
			}
		}
		for (int d = 0; d < index.length; d++) {
			System.out.println(index[d]);
		}

	}

}

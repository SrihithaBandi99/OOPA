package basicjavaprogramming;

public class Convertdecimaltobinary {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
int n=9;
int[] binary=new int[32];
int i=0;
while(n>0) {
	int num =n%2;
	 binary[i]= num ;
	n=n/2;
	i++;
	
}
for (int j = i - 1; j >= 0; j--) {
    System.out.print(binary[j]);
}
	}

}

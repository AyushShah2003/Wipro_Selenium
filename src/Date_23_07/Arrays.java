package Date_23_07;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int singlearr[]= {1,3,5,7};
		int multiarr[][]= {{10,20,30},{40,50,60},{10,40,50}};
		for(int i=0;i<singlearr.length;i++) {
			System.out.println(singlearr[i]);
		}
		for(int i=0;i<multiarr.length;i++) {
			for(int j=0;j<multiarr[0].length;j++) {
				System.out.print(multiarr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
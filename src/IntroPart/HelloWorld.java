package IntroPart;
public class HelloWorld
{

	public static void main(String[] args) {
		int arr[][]={{1, 2, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {2, 1, 4, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0}};
		int maxsum=Integer.MIN_VALUE;
		int currsum=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=0;j<arr[0].length-2;j++) {
				currsum=0;
				currsum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
								arr[i+1][j+1]+
						arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				maxsum=(currsum>maxsum)?currsum:maxsum;
			}
		}
		System.out.println(maxsum);
	}
}
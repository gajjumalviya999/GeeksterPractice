package GenericTree;

public class GenericTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
		GenericTree GT= new GenericTree(arr);
		GT.display();
		System.out.println(GT.NodeToRootPath(50));
//		int arr1[]= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,130,-1,-1,-1};
//		GenericTree GT2= new GenericTree(arr1);
//		GT.removeleafs();
//		GT.display();
//		System.out.println(GT.find(30));
//		GT.mirror();
//		GT.display();
//		GT.linearise();
//		GT.display();
		System.out.println("***********************");
//		GT.linearise2();
//		GT.display();
//		System.out.println(GenericTree.aresimilarshaped(GT,GT2));
//		System.out.println(GT.LowestCommonAncestor(10,120));
//		System.out.println(GT.size());
//		System.out.println(GT.sizedirect());
		System.out.println(GT.DistanceBWnode(120,120));
	}
	
	
}

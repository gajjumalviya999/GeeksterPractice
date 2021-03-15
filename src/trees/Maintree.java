package trees;

public class Maintree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node root=new Node(1);
//		TreeImp tree=new TreeImp(root);
//		tree.add(new Node(2),1,root,'L');
//		tree.add(new Node(3), 1, root, 'R');
//		tree.add(new Node(4), 2, root, 'L');
//		tree.add(new Node(5), 2, root, 'R');
//		tree.add(new Node(6), 3, root, 'L');
//		tree.add(new Node(7), 3, root, 'R');
//		tree.add(new Node(8), 4, root, 'L');
//		tree.add(new Node(9), 4, root, 'R');
//		tree.add(new Node(10), 5, root, 'L');
//		tree.add(new Node(11), 5, root, 'R');
//		tree.add(new Node(12), 6, root, 'L');
//		tree.add(new Node(13), 6, root, 'R');
//		tree.add(new Node(14), 7, root, 'L');
//		tree.add(new Node(15), 7, root, 'R');
//		
//		
//		tree.display(root);
		
//		tree.inorder(root);
//		System.out.println();
//		System.out.println("height of tree   "+ tree.heightoftree(root));
//		tree.printAllPathRoottoLeaf(root," ");
//		tree.printnodetoRoot(root,6);
//		System.out.println(tree.min(root)+tree.max(root));
//		System.out.println("********************************************");
//		tree.levelorder(root);
//		tree.removeleaf(null, root);
//		tree.printsinglechild(root);
//		tree.display(root);
//		tree.printPathLowHigh(root,6,20,0," ");
//		tree.printKaway(root, 2, 2);
//		tree.printrightview(root);
//		tree.printleftview(root);
//		tree.leftViewRecursive(root,1);
//		tree.rightViewRecursive(root,1);
//		tree.itterativeinorder(root);
//		tree.itterativepreorder(root);
//		tree.itterativepostorder(root);
//		System.out.println(tree.isbalanced(root));
//		System.out.println(tree.isbalancedImprove(root));
//		System.out.println(tree.DiametertreeR(root, 0));
//		System.out.println(tree.DiameterImporved(root));
//		System.out.println(tree.isBSt(root));
//		
		
		// Below Are the implementation for the BSt and its Questions;
		BST bst= new BST();
		int arr[]= {10,2,36,7,3,4,5,6,15,34,16,37,88,1,8,9};
		bst.addViaArray(arr);
		bst.display2();
//		bst.addNode(11);
//		bst.display();
//		bst.pir(5, 11);
//		System.out.println(bst.find(16));
//		bst.targetSumPair(16);
//		System.out.println(bst.LCA(2,36));
//		bst.replacewithlargersumNode();
		bst.removeNode(7);
		bst.display2();
	}

}
//            1
//    2               3
// 4     5          6      7
//8  9  10 11     12  13  14  15

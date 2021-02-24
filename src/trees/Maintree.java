package trees;

public class Maintree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		TreeImp tree=new TreeImp(root);
		tree.add(new Node(2),1,root,'L');
		tree.add(new Node(3), 1, root, 'R');
		tree.add(new Node(4), 2, root, 'L');
		tree.add(new Node(5), 2, root, 'R');
		tree.add(new Node(6), 3, root, 'L');
		tree.add(new Node(7), 3, root, 'R');
		tree.add(new Node(8), 4, root, 'L');
		tree.add(new Node(9), 4, root, 'R');
		tree.add(new Node(10), 5, root, 'L');
		tree.add(new Node(11), 5, root, 'R');
		tree.add(new Node(12), 6, root, 'L');
		tree.add(new Node(13), 6, root, 'R');
		tree.add(new Node(14), 7, root, 'L');
//		tree.add(new Node(15), 7, root, 'R');
		
		tree.display(root);
		
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
		tree.leftViewRecursive(root,1);
		tree.rightViewRecursive(root,1);
	}

}
//            1
//    2               3
// 4     5          6      7
//8  9  10 11     12  13  14  15

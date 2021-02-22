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
		
		tree.display(root);
		
//		tree.postorder(root);
//		System.out.println();
//		System.out.println("height of tree   "+ tree.heightoftree(root));
//		tree.printAllPathRoottoLeaf(root," ");
//		System.out.println(tree.printnodetoRoot(root,6));
//		System.out.println(tree.min(root)+tree.max(root));
		System.out.println("********************************************");
		tree.removeLeafs(null,root);
		tree.display(root);
	}

}
//     1
//   2     3
// 4   5 6  7
//8 9 10 

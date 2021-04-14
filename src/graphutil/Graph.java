package graphutil;

import java.util.*;

public class Graph {
	HashMap<String, HashMap<String , Integer>> vertices= new HashMap<>();
	
	public void addVertex(String name) {
		if(!containsVertex(name)) {
			vertices.put(name, new HashMap<>());
		}
	}

	public boolean containsVertex(String name) {
		// TODO Auto-generated method stub
		return vertices.containsKey(name);
	}
	public void display() {
		ArrayList<String> vces= new ArrayList<>(vertices.keySet());
		for(String v: vces) {
			System.out.println(v + " =  " + vertices.get(v));
		}
	}
	public void addEdge(String v1, String v2, int weight) {
		if(containsVertex(v1)&&containsVertex(v2))
		{	
			vertices.get(v1).put(v2, weight);
			vertices.get(v2).put(v1, weight);
		}
		else {
			System.out.println(" Error !!one Vertex Not found either " +v1 +" or "+ v2);
		}
		
	}
	public boolean containsEdge(String v1, String v2) {
		if(containsVertex(v1)==false||containsVertex(v2)==false) {
			return false;
		}
		return vertices.get(v1).containsKey(v2);
	}
	public int countVertices() {
		return vertices.size();
		}

	public int  countEdges() {
		// TODO Auto-generated method stub
		ArrayList<String> vces= new ArrayList<>(vertices.keySet());
		int count=0;
		for(String V:vces) {
			count+=vertices.get(V).size();
		}
		return count/2;
	}
	public void removeEdge(String v1, String v2) {
		if(containsVertex(v1)&&containsVertex(v2)==false) {
			return ;
		}
		vertices.get(v1).remove(v2);
		vertices.get(v2).remove(v1);
	}
	public void removeVertex(String vremove) {
		 if(containsVertex(vremove)){
	            ArrayList<String> nbrs = new ArrayList<>(vertices.get(vremove).keySet());
	            for(String nbr:nbrs){
	                removeEdge(nbr, vremove);
	            }
	            vertices.remove(vremove);
	        }
	}
	public boolean hasPath(String src, String dest) {
		return hasPath(src, dest, new HashSet<>());
	}

	private boolean hasPath(String src, String dest, HashSet<String> visited) {
		// TODO Auto-generated method stub
		if(src.equals(dest))
			return true;
		ArrayList<String> nbrs= new ArrayList<>(vertices.get(src).keySet());
		visited.add(src);
		for(String nbr:nbrs) {
			if(!visited.contains(nbr)) {
				boolean bl= hasPath(nbr, dest,visited);
				if(bl== true) {
					return true;
				}
			}
		}
		return false;
	}
	public void hasPathPrint(String src, String dest) {
		 hasPathPrint(src, dest, new HashSet<>(),src);
	}

	private void hasPathPrint(String src, String dest, HashSet<String> visited,String asf) {
		// TODO Auto-generated method stub
		if(src.equals(dest))
		{	visited.add(dest);
			System.out.println(visited);
		    System.out.println(asf);
		    visited.remove(dest);
		    return;
		}
		ArrayList<String> nbrs= new ArrayList<>(vertices.get(src).keySet());
		visited.add(src);
		for(String nbr:nbrs) {
			if(!visited.contains(nbr)) {
				hasPathPrint(nbr, dest,visited,asf+nbr);
			}
		}
		visited.remove(src);	
	}
	int minweight;
	String as;
	public void hasPathPrintmin(String src, String dest) {
		 minweight=Integer.MAX_VALUE;
		 as="";
		 hasPathPrintmin(src, dest, new HashSet<>(),src,0);
		 System.out.println(minweight+" Path "+as);
		 
	}

	private void hasPathPrintmin(String src, String dest, HashSet<String> visited,String asf,int currweight) {
		// TODO Auto-generated method stub
		if(src.equals(dest))
		{	visited.add(dest);
			if(currweight<minweight)
			{
				minweight=currweight;
				as=asf;
			}
		    return;
		}
		ArrayList<String> nbrs= new ArrayList<>(vertices.get(src).keySet());
		visited.add(src);
		for(String nbr:nbrs) {
			if(!visited.contains(nbr)) {
				hasPathPrintmin(nbr, dest,visited,asf+nbr, currweight+vertices.get(src).get(nbr));
			}
		}
		visited.remove(src);	
	}
}

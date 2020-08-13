package NO101_199.NO133;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    HashSet<Integer> hashSet=new HashSet<>();
    public Node cloneGraph(Node node) {
        if(hashSet.contains(node.val)) return hashSet.;
        ArrayList<Node> neighbors= (ArrayList<Node>) node.neighbors;
        Node cloneNode= new Node(node.val,neighbors);
        hashSet.add(node.val);
        for (int i=0;i<cloneNode.neighbors.size();i++){
            Node subnode=cloneGraph(cloneNode.neighbors.get(i));
            cloneNode.neighbors.set(i,subnode);
        }return cloneNode;
    }
}





// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


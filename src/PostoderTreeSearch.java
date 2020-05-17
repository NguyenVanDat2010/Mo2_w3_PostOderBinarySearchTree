public class PostoderTreeSearch {
    public class Node{
        private int key;
        private Node left,right;
        public Node(int key){
            this.key=key;
            left=null;
            right=null;
        }
    }
    private Node root;
    public PostoderTreeSearch(){
        this.root=null;
    }

    private Node insertRec(Node root,int key){
        if (root==null){
            root=new Node(key);
        }
        if (key<root.key){
            root.left=insertRec(root.left,key);
        }else if (key>root.key){
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    public void insert(int key){
        root=insertRec(root,key);
    }

    private void postoderRec(Node root){
        if (root!=null){
            postoderRec(root.left);
            postoderRec(root.right);
            System.out.print(root.key+" ");
        }
    }

    public void postoder(){
        postoderRec(root);
    }
}

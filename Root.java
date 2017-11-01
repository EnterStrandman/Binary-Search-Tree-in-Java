/*
 Matt Strand
binary search trees class
 */
package binarysearchtrees;

public class Root {
    private Node root;
    
    public void insert(int value){
        if(root == null){
            root = new Node(value, null, null);
        }
        else if(root != null){
            insertHelper(root, value);
        }
    }
    
    public void insertHelper(Node n, int value){
        if(value == n.getInfo()){
            System.out.println("The node for that value already exists");
        }        
        else if(n.getInfo() > value){
            if(n.getLeft() != null){
                insertHelper(n.getLeft(), value);
            } else{
                n.setLeft(new Node(value, null, null));
            }
        } else if(n.getInfo() < value){
            if(n.getRight() != null){
                insertHelper(n.getRight(), value);
            } else{
                n.setRight(new Node(value, null, null));
            }
        }
    }
    
    public boolean exists(int value){
        return existHelper(root, value);
    }
    
    public boolean existHelper(Node n, int value){
        if(n == null){
            return false;
        }
        else if(n.getInfo() == value){
            return true;
        } 
        else if(value < n.getInfo()){
            existHelper(n.getLeft(), value);
        } 
        else if(value > n.getInfo()){
            existHelper(n.getRight(), value);
        }
        return false;
    }
    
    public void inOrder(){
        inOrderHelper(root);
    }
    
    public void inOrderHelper(Node n){
        if(n != null){
            inOrderHelper(n.getLeft());
            System.out.println(n.getInfo());
            inOrderHelper(n.getRight());
        }
    }
    
    public void preOrder(){
        preOrderHelper(root);
    }
    
    public void preOrderHelper(Node n){
        if(n != null){
            System.out.println(n.getInfo());
            preOrderHelper(n.getLeft());
            preOrderHelper(n.getRight());
        } 
    }
    
    public void postOrder(){
        postOrderHelper(root);
    }
    
    public void postOrderHelper(Node n){
        if(n != null){
            postOrderHelper(n.getLeft());
            postOrderHelper(n.getRight());
            System.out.println(n.getInfo());
        }
    }
    
    public void delete(int value){
        if(root.getInfo() == value){
            deleteHelper(root, value);
        } else{
            deleteHelper(root, value);
        }
    }
    
    public void deleteHelper(Node n, int value){
        if(exists(value)){
            System.out.println("The value exists.");
            if(value < n.getInfo()){
                System.out.println("The value is less than the root value");
                if(n.getLeft() != null){ 
                    System.out.println("The left node was not null");
                    if(n.getLeft().getInfo() != value){
                        deleteHelper(n.getLeft(), value);
                    } else{
                        if(n.getLeft().getLeft() == null && n.getLeft().getRight() == null){
                            n.setLeft(null);
                        } else if(n.getLeft().getLeft() != null && n.getLeft().getRight() == null){
                            n.setLeft(n.getLeft().getLeft());
                        } 
                    }
                    
                } else if(n.getLeft() == null){

                }
            } else if(value > n.getInfo()){

            } 
        }
        else if(exists(value) == false){
            System.out.println("The value cannot be deleted, it does not exist in the tree.");
        }
    }
    
    
}

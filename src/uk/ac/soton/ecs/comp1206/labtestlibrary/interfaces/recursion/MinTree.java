package uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion;
import org.w3c.dom.Node;
import uk.ac.soton.ecs.comp1206.labtestlibrary.datastructure.Tree;

public class MinTree implements MinimumInTree{

    public static void main(String[] args){
        Tree tree = new Tree( 24,
                new Tree( 45,
                        null ,
                        new Tree(8, null , null) ) ,
                new Tree ( 17,
                        new Tree (74 , null , null ) ,
                        null ) );

        System.out.println(tree.left().right().getVal());
        MinTree minTree = new MinTree();
        System.out.println("Minimum is: " + minTree.findMin(tree));
    }

    public int findMin(Tree tree){

        if(tree == null){

            return Integer.MAX_VALUE;
        }

        int leftVal = findMin(tree.left());
        int rightVal = findMin(tree.right());
        int val = tree.getVal();


        if(leftVal < val ){
            val = leftVal;
        }
        if(rightVal < val){
            val = rightVal;
        }
        return val;
    }

}
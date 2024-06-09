package DSImplementation.tree.basicTree;

import java.util.ArrayList;

public class TreeNode {

    public String data;
    public ArrayList<TreeNode> children;

    public TreeNode(String value) {
        this.data = value;
        children = new ArrayList<>();
    }

    public void addChild(TreeNode value){
        children.add(value);
    }

    public String print(int level) {
        String s = "  ".repeat(level) + data + "\n";
        for (TreeNode node : this.children) {
            s += node.print(level+1);
        }
        return s;
    }

}

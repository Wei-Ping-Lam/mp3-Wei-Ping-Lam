package WhiteBox;

import BlackBox.CycleSort;
import Utils.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BinaryTreeSerializerTest {

    @Test
    public void serializeTest(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = null;
        String ret = bs.serialize(root);
        assertEquals("[null]",ret);
    }

    @Test
    public void deserializeTest(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[null]";
        TreeNode root = null;
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void serializeTest1(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(3);
        String ret = bs.serialize(root);
        assertEquals("[3,null,null]",ret);
    }

    @Test
    public void deserializeTest1(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[3,null,null]";
        TreeNode root = new TreeNode(3);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void serializeTest2(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        String ret = bs.serialize(root);
        assertEquals("[3,2,null,null,null]",ret);
    }

    @Test
    public void deserializeTest2(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[3,2,null,null,null]";
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void serializeTest3(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(2);
        String ret = bs.serialize(root);
        assertEquals("[3,null,2,null,null]",ret);
    }

    @Test
    public void deserializeTest3(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[3,null,2,null,null]";
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(2);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void deserializeTest4(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[]";
        TreeNode root = null;
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }

    @Test
    public void deserializeTest5(){
        BinaryTreeSerializer bs = new BinaryTreeSerializerImpl();
        String s = "[5]";
        TreeNode root = new TreeNode(5);
        TreeNode rootret = bs.deserialize(s);
        assertEquals(root,rootret);
    }
}

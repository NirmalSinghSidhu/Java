public class Node {
    private String item;
    private int count;
    private Node link;

    public Node() {
        item = null;
        count = 0;
        link = null;
    }

    public Node(String newitem, int newcount, Node newlink) {
        setData(newitem, newcount);
        link = newlink;
    }

    private void setData(String newitem, int newcount) {
        item = newitem;
        count = newcount;
    }

    public void setLink(Node newlink) {
        link = newlink;
    }

    public String getItem() {
        return item;
    }

    public int getDataCount() {
        return count;
    }

    public Node getLink() {
        return link;
    }
}

public class LLTest {
    public static void main(String[] args) {
        Node head= new Node();
        

    }
}

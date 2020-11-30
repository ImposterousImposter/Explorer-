public class Tree implements gameObject{
    private char symbol;
    private boolean shareTile;
    Tree()
    {
        symbol = '*';//Represents a tree.
        shareTile = false;//A player cannot share the same coordinate as a tree.
    }

    public void playerTouch()
    {
        //Trees are not naturally harmful.
        //Does nothing.
    }
}

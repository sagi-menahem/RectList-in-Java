/**
 * Class RectNode. The RectNode class represents a node in a linked
 * list that has a rectangle in it.
 *
 * @author (Sagi Menahem)
 * @version (22/01/22)
 */
public class RectNode
{
    //declarations:
    private RectangleA _rect;
    private RectNode _next;

    //constructors:
    /**
     * First constructor for objects of class RectNode.
     * Constructs a new Node with the specified Rectangle 
     * and update the next to null.
     *
     * @param  r - The rectangle from which to construct the new object
     * 
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public RectNode (RectangleA r) {
        _rect = new RectangleA(r);
        _next = null;
    }//RectNode (RectangleA r)

    /**
     * Second constructor for objects of class RectNode.
     * Construct a new Node with the specified Rectangle
     * and a specified node.
     *
     * @param  r - The rectangle from which to construct the new object
     * @param  n - The next node.
     * 
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public RectNode (RectangleA r, RectNode n){
        _rect = new RectangleA(r);
        _next = n;
    }//RectNode (RectangleA r, RectNode n)

    /**
     * Copy constructor for objects of class RectNode
     * Constructs a Node using another Node
     *
     * @param  r - The Node from which to construct the new object
     * 
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public RectNode (RectNode r){
        _rect = new RectangleA(r._rect);
        _next = r._next;
    }//RectNode (RectNode r)

    //methods:
    /**
     * Returns the Rectangle of the node.
     *
     * @return    the Rectangle of the node
     * 
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public RectangleA getRect(){
        return new RectangleA(_rect);
    }//RectangleA getRect()

    /**
     * Returns the next node of the node.
     *
     * @return    the next node of the node
     * 
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public RectNode getNext(){
        return _next;
    }//RectNode getNext()

    /**
     * Sets a Rectangle for this node.
     *
     * @param  r - The rectangle to set to
     * 
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public void setRect(RectangleA r){
        _rect = new RectangleA(r);
    }//setRect(RectangleA r)

    /**
     * sets the next node of this node.
     *
     * @param  next - the next node to set to
     * 
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public void setNext( RectNode next){
        _next = next;
    }//setNext( RectNode next)
}
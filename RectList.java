/**
 * Class RectList. The RectList class represents a linked list of rectangles.
 *
 * @author (Sagi Menahem)
 * @version (22/01/22)
 */
public class RectList
{
    //declarations:
    private RectNode _head;

    //constructor:
    /**
     * Constructor for objects of class RectList set the head to null
     *
     * Time Complexity: O(1) - constant number of actions.
     * Space Complexity: O(1) - constant number of variables.
     */
    public RectList (){
        _head = null;
    }//RectList ()

    //methods:
    /**
     * adds a rectangle to the end of the list
     *
     * @param  r - the rectangle to add
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    public void addRect(RectangleA r){
        if (_head == null) //the list is empty
            _head = new RectNode(r);
        else{//the list is not empty
            RectNode temp = _head;
            //When temp is not the last rectangle and r does not exist in the list
            while (temp.getNext() != null && !temp.getRect().equals(r))
                temp = temp.getNext();////updates to the next rectangle in the list
            if (!temp.getRect().equals(r))//There is no r in the list
                temp.setNext(new RectNode(r));
        }
    }//addRect(RectangleA r)

    /**
     * count how many rectangles in the list their South-West point is p
     *
     * @param  p - the given point
     * @return    how many rectangles in the list their South-West point is p
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    public int howManyWithPoint(Point p){
        if (_head == null)//the list is empty
            return 0;
        int count = 0;
        RectNode temp = _head;
        while (temp != null){////When temp is not the last rectangle
            if (temp.getRect().getPointSW().equals(p)) //South-West point is equal
                count++;
            temp = temp.getNext();//updates to the next rectangle in the list
        }
        return count;
    }//howManyWithPoint(Point p)

    /**
     * Returns the longest diagonal length between all rectangles
     *
     * @return    the longest diagonal length between all rectangles
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    public double longestDiagonal(){
        if (_head == null)//the list is empty
            return 0;
        double longest = _head.getRect().getDiagonalLength();
        RectNode temp = _head;
        while (temp != null){////When temp is not the last rectangle
            if (longest < temp.getRect().getDiagonalLength())
                longest = temp.getRect().getDiagonalLength();
            temp = temp.getNext();//updates to the next rectangle in the list
        }
        return longest;
    }//longestDiagonal()

    /**
     * Returns a copy of the South-West point of the leftmost rectangle on the list
     *
     * @return    copy of the South-West point of the leftmost
     *  rectangle on the list
     *  
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    public Point mostLeftRect(){
        if (_head == null)//the list is empty
            return null;
        Point mostLeft = _head.getRect().getPointSW();
        RectNode temp = _head;
        while (temp != null){////When temp is not the last rectangle
            if (temp.getRect().getPointSW().isLeft(mostLeft))
                mostLeft = temp.getRect().getPointSW();
            temp = temp.getNext();//updates to the next rectangle in the list
        }
        return new Point (mostLeft);
    }//mostLeftRect()

    /**
     * Returns a copy of the North-East point of the highest rectangle in the list
     *
     * @return    copy of the North-East point of the highest
     * rectangle in the list
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    public Point highestRect(){
        if (_head == null)//the list is empty
            return null;
        Point highest = _head.getRect().getPointNE();
        RectNode temp = _head;
        while (temp != null){////When temp is not the last rectangle
            if (temp.getRect().getPointNE().isAbove(highest))
                highest = temp.getRect().getPointNE();
            temp = temp.getNext();//updates to the next rectangle in the list
        }
        return new Point (highest);
    }//highestRect()

    /**
     * Returns a new rectangle that is the rectangle with the minimum area
     * that contains all the rectangles in the list
     *
     * @return    new rectangle that is the rectangle with the minimum area
     * that contains all the rectangles in the list
     * 
     * Time Complexity: O(n) - iterating over the list four times.
     * Space Complexity: O(1) - constant number of variables.
     */
    public RectangleA minimalContainer(){
        if (_head == null)//the list is empty
            return null;
        return new RectangleA (
            //South-West point
            new Point (mostLeftRect().getX(), lowestRect().getY()),
            //North-East point
            new Point (MostRightRect().getX(), highestRect().getY()));
    }//minimalContainer()

    /**
     * Returns a string of characters representing the list of rectangles
     *
     * @return    string of characters representing the list of rectangles
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    public String toString(){
        String text = "The list has " + length() + " rectangles.\n";
        int count = 1;
        RectNode temp = _head;
        while (temp != null){////When temp is not the last rectangle
            text += count + ". Width=" + temp.getRect().getWidth() + 
            " Height=" + temp.getRect().getHeight() +
            " PointSW=" + temp.getRect().getPointSW().toString() + "\n";
            count ++;
            temp = temp.getNext();//updates to the next rectangle in the list
        }
        return text;
    }//toString()

    /**
     * Returns how many rectangles there are on the list
     *
     * @return    how many rectangles there are on the list
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    private int length(){
        RectNode temp = _head;
        int count = 0;
        while (temp != null){////When temp is not the last rectangle
            count++;
            temp = temp.getNext();
        }
        return count;
    }//length()

    /**
     * Returns a copy of the North-East point of the rightmost rectangle on the list
     *
     * @return    copy of the North-East point of the rightmost rectangle on the list
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    private Point MostRightRect(){
        if (_head == null)//the list is empty
            return null;
        Point mostRight = _head.getRect().getPointNE();
        RectNode temp = _head;
        while (temp != null){////When temp is not the last rectangle
            if (temp.getRect().getPointNE().isRight(mostRight))
                mostRight = temp.getRect().getPointNE();
            temp = temp.getNext();//updates to the next rectangle in the list
        }
        return new Point (mostRight);
    }//MostRightRect()

    /**
     * Returns a copy of the South-West point of the lowest rectangle in the list
     *
     * @return    copy of the South-West point of the lowest rectangle in the list
     * 
     * Time Complexity: O(n) - iterating over the list only once.
     * Space Complexity: O(1) - constant number of variables.
     */
    private Point lowestRect(){
        if (_head == null)//the list is empty
            return null;
        Point lowest = _head.getRect().getPointSW();
        RectNode temp = _head;
        while (temp != null){////When temp is not the last rectangle
            if (temp.getRect().getPointSW().isUnder(lowest))
                lowest = temp.getRect().getPointSW();
            temp = temp.getNext();//updates to the next rectangle in the list
        }
        return new Point (lowest);
    }//lowestRect()

}
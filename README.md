# Rectangle List in Java

This repository contains the Java implementation of the `RectNode` and `RectList` classes for a linked list of rectangles. These classes are designed to represent rectangles and manage a list of rectangles efficiently.

## Table of Contents

* [RectNode Class](#rectnode-class)
    * [Constructors](#constructors)
    * [Methods](#methods)
* [RectList Class](#rectlist-class)
    * [Constructor](#constructor)
    * [Methods](#methods-1)
* [Author](#author)

## RectNode Class

The `RectNode` class represents a node in a linked list that contains information about a rectangle. Each `RectNode` object has two fields:

* `RectangleA _rect`: The rectangle object.
* `RectNode _next`: A reference to the next node in the list.

### Constructors

1.  `public RectNode(RectangleA r)`: Constructor that initializes the node with a rectangle, setting `_next` to `null`.
2.  `public RectNode(RectangleA r, RectNode n)`: Constructor that initializes the node with a rectangle and a reference to the next node.
3.  `public RectNode(RectNode r)`: Copy constructor.

### Methods

* `public RectangleA getRect()`: Returns a copy of the rectangle in the node.
* `public RectNode getNext()`: Returns a reference to the next node.
* `public void setRect(RectangleA r)`: Sets the rectangle in the node.
* `public void setNext(RectNode next)`: Sets the reference to the next node.

## RectList Class

The `RectList` class represents a linked list of rectangles. It maintains a list of rectangles efficiently using the `RectNode` class.

### Constructor

* `public RectList()`: Constructor that initializes an empty list.

### Methods

1.  `public void addRect(RectangleA r)`: Adds a rectangle to the end of the list if it's not already in the list.
2.  `public int howManyWithPoint(Point p)`: Counts the rectangles in the list with the given south-west point.
3.  `public double longestDiagonal()`: Finds the length of the longest diagonal among all rectangles.
4.  `public RectangleA mostLeftRect()`: Returns a copy of the rectangle with the most left south-west point.
5.  `public RectangleA highestRect()`: Returns a copy of the rectangle with the highest north-east point.
6.  `public RectangleA minimalContainer()`: Returns a new rectangle that minimally contains all rectangles in the list.
7.  `public String toString()`: Converts the list of rectangles to a string.

## Author

Sagi Menahem

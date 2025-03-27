package com.CollectionFramework;

public class Theory15 {

}

/*
 
 
                                             
Q1.Introduction to Collections Framework
Ans:
    The Collection Framework in Java is a set of interfaces and classes that provide an architecture to store and manipulate groups of objects.
    It is part of the java.util package and helps manage data in an efficient and flexible way.

    Class:
    1.ArrayList
    2.LinkedList
    3.HashSet
    4.TreeSet
    5.HashMap
    6.TreeMap
    7.Vector
    8.Generic
    
    Interfaces:
    1.List
    2.Set
    3.Map
    4.Iterator
    5.Enumeration
    

//-------------------------------------------------------------------------------------------------------------------------------------------------
  
  
    
Q2. List, Set, Map, and Queue Interfaces
Ans:    
    1. List Interface: A collection that allows ordered and duplicate elements.
        Key Characteristics:
        Elements are indexed (like an array).
        You can access elements by their index using get(index) method.
        Maintains the order of insertion.

    Common Implementations:
        ArrayList: A resizable array.
        LinkedList: A doubly-linked list.
        Vector: A synchronized variant of ArrayList.
        
    2. Set Interface: A collection that contains unique elements and does not allow duplicates.
        Key Characteristics:
        Elements are not ordered (in HashSet).
        No positional access to elements.
    
    Common Implementations:
        HashSet: Fast and does not maintain any order.
        LinkedHashSet: Maintains insertion order.
        TreeSet: Sorted set (elements are sorted in natural order or using a comparator).

    3. Map Interface: A collection of key-value pairs, where each key is unique.
        Key Characteristics:
        Does not inherit from Collection.
        Keys must be unique; values can be duplicated.
        Provides mappings from keys to values.
    
    Common Implementations:
        HashMap: Unordered map, allows null keys and values.
        LinkedHashMap: Maintains the insertion order of keys.
        TreeMap: Sorted map (keys are sorted in natural order or using a comparator).

        4. Queue Interface:A collection used to hold elements before processing, following FIFO (First-In-First-Out) order in most cases.
            Key Characteristics:
            Some queues (e.g., PriorityQueue) may not strictly follow FIFO but order elements based on their priority.
            Elements are added at the rear and removed from the front (in LinkedList or PriorityQueue).
        
        Common Implementations:
            LinkedList: Implements both Queue and Deque (Double-ended queue).
            PriorityQueue: Orders elements based on their natural ordering or a custom comparator.
            ArrayDeque: Efficient implementation of Deque interface.

o ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap
Ans:
    1. ArrayList: A resizable array that implements the List interface.
    Key Features:
        Allows duplicate elements.
        Maintains insertion order.
        Provides random access to elements using an index.
        Resizes dynamically when needed.
    
    Performance:
        Fast for random access (O(1)).
        Adding/removing elements at the end is efficient (O(1)).
        Adding/removing elements in the middle or beginning requires shifting elements (O(n)).
    
    2. LinkedList: A doubly-linked list that implements the List and Deque interfaces.
    Key Features:
        Allows duplicate elements.
        Maintains insertion order.
        Nodes store data and references to the next and previous nodes.

    Performance:
        Fast for adding/removing elements at the beginning or middle (O(1) for node operations).
        Slow for random access (O(n)) because it must traverse the list.

    3. HashSet: A collection that implements the Set interface, backed by a hash table.
    Key Features:
        Does not allow duplicate elements.
        Does not maintain insertion order.
        Allows null elements.

    Performance:
        Fast for adding/removing elements (O(1) on average).
        Not suitable for ordered or sorted data.

    4. TreeSet: A sorted collection that implements the Set interface, backed by a TreeMap.
    Key Features:
        Does not allow duplicate elements.
        Maintains elements in sorted order (natural or custom comparator).
        Does not allow null elements (from Java 7 onwards).
    
    Performance:
        Logarithmic time for adding, removing, and searching (O(log n)).

    5. HashMap: A collection of key-value pairs, backed by a hash table.
    Key Features:
        Keys must be unique; values can be duplicated.
        Does not maintain insertion order.
        Allows null keys (only one) and null values.

    Performance:
        Fast for adding/removing elements (O(1) on average).
        May degrade to O(n) in the case of hash collisions.
    
    6. TreeMap: A collection of key-value pairs, backed by a red-black tree.
    Key Features:
        Keys must be unique.
        Maintains sorted order of keys (natural or custom comparator).
        Does not allow null keys but allows null values.
    
    Performance:
        Logarithmic time for adding, removing, and searching (O(log n)).
        
        
        
//---------------------------------------------------------------------------------------------------------------------------------------------------
 
 

Q3. Iterators and ListIterators
Ans:    
    1. Iterator: A universal iterator used to traverse elements of any collection implementing the Collection interface.
    Key Features:
        Works for List, Set, and other collections.
        Traverses the collection in one direction only (forward).
        Cannot modify the collection structure except for removing elements.

    Key Methods:
        hasNext(): Returns true if there are more elements to traverse.
        next(): Returns the next element.
        remove(): Removes the last element returned by next().

    2. ListIterator: A specialized iterator that works only with List implementations (e.g., ArrayList, LinkedList).
    Key Features:
        Can traverse in both directions (forward and backward).
        Can add, modify, and remove elements during iteration.
        Can retrieve the current index of elements.
    
    Key Methods:
        hasNext(): Returns true if there are more elements when traversing forward.
        next(): Returns the next element.
        hasPrevious(): Returns true if there are more elements when traversing backward.
        previous(): Returns the previous element.
        add(E e): Inserts the specified element into the list.
        set(E e): Replaces the last element returned by next() or previous() with the specified element.    
        remove(): Removes the last element returned by next() or previous()

//---------------------------------------------------------------------------------------------------------------------------------------------------
 
 
 */
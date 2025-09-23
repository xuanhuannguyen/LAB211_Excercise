/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_3.ex4;

/**
 *
 * @author Admin
 */
public class ArrayStructure {
    class Node {
        int data;

        public Node(int data) {
            this.data = data;
        }
        
    }
    int capacity;
    Node[] arrayNodes;
    int length;

    public ArrayStructure(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        arrayNodes = new Node[capacity];
        
    }
    
    public boolean isEmpty() {
        return length==0;
    }
    public boolean isFull() {
        return length== capacity;
    }
    
    public void insertLast(int x) {
        if (isFull()) {
            
            increaseCap();
        } 
        {
            arrayNodes[length++] = new Node(x);
        }
    }
    
    public void increaseCap() {
        int newCap = capacity *3 /2 ;
        Node[] newArray = new Node[newCap];
        for (int i = 0;i<length;i++) {
            newArray[i] = arrayNodes[i];
        }
        arrayNodes = newArray;
        capacity = newCap;
    }
    public void insertFirst(int x) {
        if (isFull()) {
            increaseCap();
        }
        for (int i = length ; i>0; i--) {
            arrayNodes[i] = arrayNodes[i-1];
        }
        arrayNodes[0] = new Node(x);
        length++;
    }
    public void insertAtIndex(int x, int index) {
        if (isFull()) {
            increaseCap();
        }
        if (index >= length) {
            insertLast(x);
        }
        if (index < 0) {
            insertFirst(x);
        }
        for (int i = length ; i>index; i--) {
            arrayNodes[i] = arrayNodes[i-1];
        }
        arrayNodes[index] = new Node(x);
        length++;
    }
    public void removeLast() {
        if (isEmpty()) 
        {
            System.out.println("Array is empty!");
            return;
        }
        length --;
        
    }
    public void removeFirst() {
        if (isEmpty()) 
        {
            System.out.println("Array is empty!");
            return;
        }
        for (int i = 0 ; i < length -1 ; i++) 
        {
            arrayNodes[i] = arrayNodes[i+1];
        }
        length -- ;
    }
    public void removeAtIndex(int index) {
        if (isEmpty()) 
        {
            System.out.println("Array is empty!");
            return;
        }
        if (index > length) {
            
        }
        
    }
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(arrayNodes[i].data + " ");
       }
        System.out.println("");
        System.out.println(length + " " + capacity);
    }
    public static void main(String[] args) {
        ArrayStructure main = new ArrayStructure(5);
        main.insertLast(1);
        main.insertLast(2);
        main.insertLast(3);
        main.insertLast(4);
        main.insertLast(5);
        main.insertFirst(0);
        main.removeFirst();
        main.display();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_3.ex4;

/**
 *
 * @author Admin
 */
public class ArrayStack {
    class Node {
        int data;

        public Node(int x) {
           this.data = x;
        }
        
    }
   int capacity;
   Node[] arrayNodes;
   int length;
   public ArrayStack(int capacity) {
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
     public void increaseCap() {
        int newCap = capacity *3 /2+1 ;
        Node[] newArray = new Node[newCap];
        for (int i = 0;i<length;i++) {
            newArray[i] = arrayNodes[i];
        }
        arrayNodes = newArray;
        capacity = newCap;
    }
    public void push(int x) {
        if (isFull()) {
            
            increaseCap();
        } 
        {
            arrayNodes[length++] = new Node(x);
        }
    }
    public Node pop() {
         if (isEmpty()) 
        {
            System.out.println("Array is empty!");
            return null;
        }
         else {
        return arrayNodes[--length];
        }
    }
     public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(arrayNodes[i].data + " ");
       }
        System.out.println("");
//        System.out.println(length + " " + capacity);
    }
    public static void main(String[] args) {
        ArrayStack aS = new ArrayStack(0);
        aS.push(10);
        System.out.println(aS.pop().data);
        aS.pop();
        aS.display();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

public class App1 {

    public static<T> void printStack(ArrayBoundedStack<T> s){
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        
        while(!s.isEmpty()){
            System.out.println(s.top());
            temp.push(s.top());
            s.pop();
        }
        
        while(!temp.isEmpty()){
            s.push(temp.top());
            temp.pop();
        }
    }
    
    public static<T> void reverseStackOrder(ArrayBoundedStack<T> s){
        ArrayBoundedStack<T> temp = new ArrayBoundedStack<>();
        ArrayBoundedStack<T> temp2 = new ArrayBoundedStack<>();
        
        while(!s.isEmpty()){
            temp.push(s.top());
            s.pop();
        }
        
        while(!temp.isEmpty()){
            temp2.push(temp.top());
            temp.pop();
        }
        
        while(!temp2.isEmpty()){
            s.push(temp2.top());
            temp2.pop();
        }
    }
    
    public static void main(String[] args) {
       
        ArrayBoundedStack<Integer> s1 = new ArrayBoundedStack<>();
        ArrayBoundedStack<String> s2 = new ArrayBoundedStack<>();
        
        
        s1.push(10);
        s1.push(-2);
        s1.push(4);
        s1.push(50);
        s1.push(13);
        
        System.out.println("Stack Elements:");
        printStack(s1);
        
        reverseStackOrder(s1);
        
        System.out.println("________________________________");
        System.out.println("Stack Elements Reversed:");
        printStack(s1);
    }
}

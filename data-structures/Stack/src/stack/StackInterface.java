/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author user
 */
public interface StackInterface <T> 
{
    void push(T element) throws StackOverflowException;
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack. 
    void pop() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    T top() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element of this stack.
    boolean isEmpty();
    // Returns true if this stack is empty, otherwise returns false
    boolean isFull();
    // Returns true if this stack is full, otherwise returns false.    
}


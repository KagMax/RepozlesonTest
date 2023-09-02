package Stack;

import java.util.EmptyStackException;

public class ArrayStack implements  Stak {
    private String[] stakDate;

    private int buffor =10;

    private int top =-1;
     public ArrayStack (){
         stakDate= new String[buffor];
     }
     public void push(String oject) throws FullStackException{

         if(top>=stakDate.length-1){
             throw new FullStackException();
         }
         top++;
         stakDate[top]=oject;
     }
    public String pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stakDate [top--];
    }
    public String peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stakDate [top];
    }

    public boolean isEmpty(){
         return  top ==-1;
    }

}

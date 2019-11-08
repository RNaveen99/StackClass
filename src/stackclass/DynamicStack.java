package stackclass;

import java.util.ArrayList;

public abstract class DynamicStack extends AbstractStack{
    ArrayList<Integer> stack;
    
    public DynamicStack(){
        stack = new ArrayList<Integer>();
    }
    
    public void push(int elem){
        stack.add(elem);
        System.out.println("Element inserted");
    }
    
    public void pop(){
        if(stack.size() == 0){
            System.out.println("No element in stack!!");
        }
        else{
            System.out.println("Element popped : " + stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
    }
    
    public void display(){
        if(stack.size() == 0)
            System.out.println("No element in stack");
        else{
            for(int i = stack.size() - 1; i >= 0; i--)
                System.out.println(stack.get(i));
        }
    }
}

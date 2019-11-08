package stackclass;

public class StackClass {
    public static void main(String[] args) {
            StaticStack ss = new StaticStack();
            for(int i = 0; i < 11; i++)
                ss.push(i);
            ss.pop();
            ss.display();

            DynamicStack ds = new DynamicStack() {};
            for(int i = 0; i < 15; i++)
                ds.push(i);
            ds.pop();
            ds.display();

    }    
}

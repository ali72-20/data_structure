
public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(10);
        System.out.println(stack.size());
        if(stack.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("NO");
        }
        System.out.println(stack.peek());
        stack.pop();
        if(stack.isEmpty()){
            System.out.println("Empty");
        }
        System.out.println(stack.size());
    }
}
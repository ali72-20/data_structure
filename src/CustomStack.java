import java.util.ArrayList;
import java.util.List;

public class CustomStack {
   private List<Integer> stackList;

   public CustomStack(){
      stackList = new ArrayList<>();
   }
   public boolean isEmpty(){
      return stackList.isEmpty();
   }
   public void push(int element){
      stackList.add(element);
   }

   public void pop(){
      if(stackList.isEmpty()){
         return;
      }
      stackList.remove(stackList.getLast());
   }

   public int peek(){
      return stackList.getLast();
   }
   public int size(){
      return stackList.size();
   }
}



public class LamdaExpression
{
    
   public static void main(String args[]){
      LamdaExpression test = new LamdaExpression();
		
      
      AlgebricOperation addition = (int a, int b) -> a + b;
		
      
      AlgebricOperation subtraction = (a, b) -> a - b;
		
      
      AlgebricOperation multiplication = (int a, int b) -> { return a * b; };
		
      
      AlgebricOperation division = (int a, int b) -> a / b;
		
      System.out.println("50 + 5 = " + test.operate(50, 5, addition));
      System.out.println("50 - 5 = " + test.operate(50, 5, subtraction));
      System.out.println("50 x 5 = " + test.operate(50, 5, multiplication));
      System.out.println("50 / 5 = " + test.operate(50, 5, division));
		
      
      GreetingService greetingService1 = message ->
      System.out.println("Hello " + message);
		
      
      GreetingService greetingService2 = (message) ->
      System.out.println("Hello " + message);
		
      greetingService1.sayMessage("Tasnim");
      greetingService2.sayMessage("Mustafi");
   }
	
   interface AlgebricOperation {
      int operation(int a, int b);
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
	
   private int operate(int a, int b, AlgebricOperation AlgebricOperation){
      return AlgebricOperation.operation(a, b);
   }
}
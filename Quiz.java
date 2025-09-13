public class Quiz 
{
  public static void main(String []args)
  {
     Question_service service = new Question_service();
     System.out.println("~~~Welcome to the quiz game~~~");
     service.play();
     service.score();
  }    
}

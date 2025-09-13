import java.util.*;

public class Question_service 
{

    String select[] = new String[5];

    Questions[] question = new Questions[5]; 

    public Question_service()
    {
      question[0]= new Questions(1,"Which language are we coding in? ","C++","Java","Mawa","Python","Java");
    
      question[1]= new Questions(2,"Whats your name? ","Ram","Sham","Mawa","Pawa","Mawa");
    
      question[2]= new Questions(3,"Whats your sister's name? ","gopal","Ghanham","Disha","Pawa","Disha");
    
      question[3]= new Questions(4,"Whats your father's name? ","Manoj","vinod","krishna","Mahadev","Manoj");
    
      question[4]= new Questions(5,"Whats your mother's name? ","Sunita","Sita","Radha","Parvati","Sunita");
    
      
    }

    public void play()
    {
        for(int i=0;i<question.length;i++)
        {
          Questions q = question[i];
          System.out.println("\nQuestion no."+q.getId());
          System.out.println(q.getQue());
          System.out.println("A."+q.getOpt1());
          System.out.println("B."+q.getOpt2());
          System.out.println("C."+q.getOpt3());
          System.out.println("D."+q.getOpt4());
          System.out.println();

          @SuppressWarnings("resource")

           Scanner sc = new Scanner(System.in);
           System.out.print("Your answer: ");
           String ans = sc.nextLine().trim();
           
           if(ans.equalsIgnoreCase("A")) ans = q.getOpt1();
            else if(ans.equalsIgnoreCase("B")) ans = q.getOpt2();
            else if(ans.equalsIgnoreCase("C")) ans = q.getOpt3();
            else if(ans.equalsIgnoreCase("D")) ans = q.getOpt4();

            select[i] = ans;
        }
        
     System.out.println("~~~~~~~~~~~~~~~~~RESULTS~~~~~~~~~~~~~~~~~~~");
        for(int j=0;j<question.length;j++)
        {
          String s = select[j];
          System.out.println("Q."+(j+1)+"."+s);
        }
        
    }

    public void score()
    {
      int num=0;
      for(int i=0; i<question.length;i++)
      {
        Questions qn = question[i];
        String answer = qn.getAns();

        String usans = select[i];

        if(answer.equalsIgnoreCase(usans))
        {num++;}

      }
      System.out.println("\nYour Score is = "+num);
    }
}

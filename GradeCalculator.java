public class GradeCalculator
{
  public static void main(String[] args)
{
    String Course = "AP Comp Sci";
    int aveTime = 175;
    int Hw1 = 89;
    int Hw2 = 78;
    int Hw3 = 72;
    int Hw4 = 83;
    double Q1 = 89.48;
    double Q2 = 52.54;
    double F1 = 11.54;

    int weekTime1 = aveTime / 60;
    int weekTime2 = aveTime % 60;
    double aveHw = (double) Hw1 + Hw2 + Hw3 + Hw4 / ;
    
  
    
    
    
    
    
    System.out.println("Weekly time spent: " + weekTime1 + "h" + weekTime2);
    System.out.println("Average homework grade: " + aveHw);
}
}

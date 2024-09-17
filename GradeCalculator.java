public class GradeCalculator
{
  public static void main(String[] args)
  {
    //course name
    String Course = "AP Comp Sci A";
    //average time spent on course
    int aveTime = 175;
    //homeowrk grade
    int Hw1 = 89;
    int Hw2 = 78;
    int Hw3 = 72;
    int Hw4 = 83;
    //quiz grade
    double Q1 = 89.48;
    double Q2 = 52.54;
    //Final grade
    double Final = 81.54;
    //calculate weekly time spent on course
    int weekTime1 = aveTime / 60;
    int weekTime2 = aveTime % 60;
    //calculate average homework grade
    double aveHw = (double) (Hw1 + Hw2 + Hw3 + Hw4) / 4;
    //calculate average quiz grade
    double aveQuiz = (Q1 + Q2) / 2;
    //calculate total grade
    int totalGrade = (int)(aveHw * 0.35 + aveQuiz * 0.15 + Final * 0.5);
    //print course name
    System.out.println("Course Name: " + Course);
    //print average time spent on course
    System.out.println("average time spent in a week for this course in minutes: " + aveTime);
    //print homework grade
    System.out.println("homework grades for this course:");
    System.out.println(Hw1 + "%");
    System.out.println(Hw2 + "%");
    System.out.println(Hw3 + "%");
    System.out.println(Hw4 + "%");
    //print quiz grade
    System.out.println("quiz grades for this course:");
    System.out.println(Q1 + "%");
    System.out.println(Q2 + "%");
    //print final grade
    System.out.println("final exam grade for this course:");
    System.out.println(Final + "%");
    //print hour spend on course
    System.out.println("Weekly time spent: " + weekTime1 + "h" + weekTime2);
    //print average homework grade
    System.out.println("Average homework grade: " + aveHw + "%");
    //print average quiz grade
    System.out.println("Average quiz grade: " + aveQuiz + "%");
    //print final exam grade
    System.out.println("Final exam grade: " + Final + "%");
    //Print total grade
    System.out.println("Overall grade: " + totalGrade + "%");
  }
}

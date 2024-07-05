import java.util.Scanner;
public class GradeCalculator1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects=sc.nextInt();
        if(numSubjects<=0){
            System.out.println("Please enter a valid number of the subject.");
            return;
        }
        int totalMarks=0;
        int maxMarksPerSubject=100;
        for(int i=1;i<=numSubjects;i++){
            System.out.println("Enter marks obtained in Subject"+i+"(out of 100):");
            int marks=sc.nextInt();
            if(marks<0||marks>maxMarksPerSubject){
                System.out.println("Marks should be in the range of 0 to 100.Please enter valid marks.");
                i--;
            }
            else{
                totalMarks+=marks;
            }
        }
        double averagePercentage=(double)totalMarks/(numSubjects+maxMarksPerSubject)+100;
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+averagePercentage+"%");
    }
}
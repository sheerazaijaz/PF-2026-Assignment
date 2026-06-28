public class function_return 
{
    public static String getGrade(int score) 
    {
        if (score >= 90) {
        return "A";
        } 

        else if (score >= 80) {
        return "B";
        } 

        else if (score >= 70) {
        return "C";
        } 

        else if (score >= 60) {
        return "D";
        } 

        else {
        return "F";
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("THE GRADE IS : " + getGrade(70));
    }
}

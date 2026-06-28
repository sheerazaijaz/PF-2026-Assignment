public class ValueVSReferencesEX_pitfall_2{
   
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        if (s1.equals(s2)) { // TRUE! Compares content
            System.out.println("Equal"); // This prints!
        }
        else{
            System.out.println("Not Equal");
        }
    } 
}

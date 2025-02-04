package lessonone;
/**
 ** Ibrahim Shahid
 * Date: 1/29/2024
 * North Carolina Virtual Public Schools
 * Description: Java matrices examples
 * Difficulties: no major difficulatuise with the exception of using matricies
 */
public class lessonone {
    public static void main(String[] args) {
        int grade[] = {97, 62, 85, 26};
        System.out.println(grade[1]);
    }
    public static void videoTwo(){
        int sq[] = new int[1000];
        for(int j =0; j<sq.length; j++)
        {
            sq[j] = j*j;

        }
        System.out.println(sq[5]);
        
    }
    public static void videoThree(){
        String s = "Hello again";
        String sp[];
        sp = s.split("alg");
        for(int j =0; j<sp.length; j++)
        {
            System.out.println(sp[j]);
        }
    }
}
/*
 * expected output
 * 62
 * to run the other methods, put them in the main method, becuase you cant have multiple main methods in one class
 */
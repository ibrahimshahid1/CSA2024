/**
 ** Ibrahim Shahid
 * Date: 11/16/2024
 * North Carolina Virtual Public Schools
 * Description: Java For Loops Example
 * For loops in java, you can make iterations with java using for loops
 */
public class lessonseven {
    public static void main(String[] args) {
        
        for (int d = 2; d <= 14; d++) { // the loop intiailizes the denominator at 2, d=2, the loop keeps on running as long as d is less than or equal to 14, if this is true, then d is incremented by 1
            //as long as the statement d<=14 is true, then the code inside the for loop will continue running
            
            int n = 1;// integer n for the numerator is set to 1

           
            do { //the do while loop guarntees that the code inside runs at least once, things will happend as long as n<d

                // Calculate the decimal value
                double decimalValue = (double) n / d; //the decimal value is equal to numerator devidied by the denominator
 
                
                System.out.printf("%d/%d\t%.5f%n", n, d, decimalValue);

                n++; // n is incremented, as long as n<d, this will keep on happening as long as the condition in the for loop is met.
            } while (n < d);
        }
    }
}
/*
 * sample output
 * 1/2     0.50000
1/3     0.33333
2/3     0.66667
1/4     0.25000
2/4     0.50000
3/4     0.75000
1/5     0.20000
2/5     0.40000
3/5     0.60000
4/5     0.80000
1/6     0.16667
2/6     0.33333
3/6     0.50000
4/6     0.66667
5/6     0.83333
1/7     0.14286
2/7     0.28571
3/7     0.42857
4/7     0.57143
5/7     0.71429
6/7     0.85714
1/8     0.12500
2/8     0.25000
3/8     0.37500
4/8     0.50000
5/8     0.62500
6/8     0.75000
7/8     0.87500
1/9     0.11111
2/9     0.22222
3/9     0.33333
4/9     0.44444
5/9     0.55556
6/9     0.66667
7/9     0.77778
8/9     0.88889
1/10    0.10000
2/10    0.20000
3/10    0.30000
4/10    0.40000
5/10    0.50000
6/10    0.60000
7/10    0.70000
8/10    0.80000
9/10    0.90000
1/11    0.09091
2/11    0.18182
3/11    0.27273
4/11    0.36364
5/11    0.45455
6/11    0.54545
7/11    0.63636
8/11    0.72727
9/11    0.81818
10/11   0.90909
1/12    0.08333
2/12    0.16667
3/12    0.25000
4/12    0.33333
5/12    0.41667
6/12    0.50000
7/12    0.58333
8/12    0.66667
9/12    0.75000
10/12   0.83333
11/12   0.91667
1/13    0.07692
2/13    0.15385
3/13    0.23077
4/13    0.30769
5/13    0.38462
6/13    0.46154
7/13    0.53846
8/13    0.61538
9/13    0.69231
10/13   0.76923
11/13   0.84615
12/13   0.92308
1/14    0.07143
2/14    0.14286
3/14    0.21429
4/14    0.28571
5/14    0.35714
6/14    0.42857
7/14    0.50000
8/14    0.57143
9/14    0.64286
10/14   0.71429
11/14   0.78571
12/14   0.85714
13/14   0.92857
 */

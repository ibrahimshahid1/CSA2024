/**
 ** Ibrahim Shahid
 * Date: 11/16/2024
 * North Carolina Virtual Public Schools
 * Description: Java For Loops Example
 * For loops in java, you can make iterations with java using for loops
 */
public class lessontwo{
    public static void main(String[] args) {
        int sum = 0;
        for(int j =3; j<=79; j++){  //first video for loop
            sum = sum+ j;
            System.out.println(sum);

        }
        for (int j =100; j>=0; j--){ // second video for loop
            System.out.println(j);
        }
        for (int j = 3; j<=79; j++){ // third video for loop
            double d = 37.93;
            sum = sum +j;
            System.out.println(sum);
            System.out.println(j);

        }
        int count = 0;
        for(int j = 0; j<20; j++){ //fourth video for loop
            for(int k=0; k<5; k++)
            {
                count++;

            }
        }
        System.out.println(count);
        
        System.out.println(sum);


    }
}
/*
 * Expected output
 *
 *  3
7
12
18
25
33
42
52
63
75
88
102
117
133
150
168
187
207
228
250
273
297
322
348
375
403
432
462
493
525
558
592
627
663
700
738
777
817
858
900
943
987
1032
1078
1125
1173
1222
1272
1323
1375
1428
1482
1537
1593
1650
1708
1767
1827
1888
1950
2013
2077
2142
2208
2275
2343
2412
2482
2553
2625
2698
2772
2847
2923
3000
3078
3157
100
99
98
97
96
95
94
93
92
91
90
89
88
87
86
85
84
83
82
81
80
79
78
77
76
75
74
73
72
71
70
69
68
67
66
65
64
63
62
61
60
59
58
57
56
55
54
53
52
51
50
49
48
47
46
45
44
43
42
41
40
39
38
37
36
35
34
33
32
31
30
29
28
27
26
25
24
23
22
21
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
0
3160
3
3164
4
3169
5
3175
6
3182
7
3190
8
3199
9
3209
10
3220
11
3232
12
3245
13
3259
14
3274
15
3290
16
3307
17
3325
18
3344
19
3364
20
3385
21
3407
22
3430
23
3454
24
3479
25
3505
26
3532
27
3560
28
3589
29
3619
30
3650
31
3682
32
3715
33
3749
34
3784
35
3820
36
3857
37
3895
38
3934
39
3974
40
4015
41
4057
42
4100
43
4144
44
4189
45
4235
46
4282
47
4330
48
4379
49
4429
50
4480
51
4532
52
4585
53
4639
54
4694
55
4750
56
4807
57
4865
58
4924
59
4984
60
5045
61
5107
62
5170
63
5234
64
5299
65
5365
66
5432
67
5500
68
5569
69
5639
70
5710
71
5782
72
5855
73
5929
74
6004
75
6080
76
6157
77
6235
78
6314
79
100
6314
 */
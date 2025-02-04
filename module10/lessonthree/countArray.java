package lessonthree;
class CountArray
{

  public static void main ( String[] args )
  {
    int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

    for ( int index =0; index < egArray.length; index++); // question one
    {
      System.out.println(egArray);
    }
    for (int index = 9; index > egArray.length; index--); // question two
    {
        System.out.println();

    }
  }
}

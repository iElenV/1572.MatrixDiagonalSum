
public class Main {
    public static void main(String[] args)
    {
        int[][] arr = new int[][]{{1, 2, 3,4,5}, {1, 2, 3,4,5}, {1, 2, 3,4,5},{1, 2, 3,4,5}, {1, 2, 3,4,5}};
        int[][] arr2 = new int[][]{{1, 2, 3,4,5,6, 7}, {1, 2, 3,4,5,6, 7}, {1, 2, 3,4,5,6, 7},{1, 2, 3,4,5,6, 7}, {1, 2, 3,4,5,6, 7},{1, 2, 3,4,5,6, 7}, {1, 2, 3,4,5,6, 7}};
        int[][] arr3 = new int[][]{{1, 2, 3,4}, {1, 2, 3,4}, {1, 2, 3,4},{1, 2, 3,4}};
        System.out.println(GetDiagonalSum(arr));
        System.out.println(GetDiagonalSum(arr2));
        System.out.println(GetDiagonalSum(arr3));
    }

    public static int SumUP(int[][] arr) {
        int index = arr.length / 2 - 1;
        int SumUP = 0;
        int First_RowNumber = 0;
        int Last_RowNumber = arr[0].length;
        int Step =arr[0].length-1;
        for (int i = 0; i <= index; i++)
        {
            for (int j = First_RowNumber; j < Last_RowNumber; j = j + Step)
            {
            SumUP = SumUP+arr[i][j];
            }
            First_RowNumber++;
            Last_RowNumber --;
            Step = Step-2;
        }
    return SumUP;}

    public static int SumDown(int[][] arr) {
        int index = arr.length / 2 - 1;
        int SumDown = 0;
        int First_RowNumber = 0;
        int Last_RowNumber = arr[0].length;
        int Step =arr[0].length-1;
        for (int i = arr.length-1; i > arr.length/2; i--)
        {
            for (int j = First_RowNumber; j < Last_RowNumber; j = j + Step)
            {
                SumDown = SumDown+arr[i][j];
            }
            First_RowNumber++;
            Last_RowNumber --;
            Step = Step-2;
        }

        if (arr.length%2!=0)
        {
            SumDown = SumDown + arr[arr.length/2][arr[0].length/2];
        }
        else {
            SumDown = SumDown + arr[arr.length/2][arr[0].length/2-1]+arr[arr.length/2][arr[0].length/2];
        }
        return SumDown;}

public static int GetDiagonalSum (int [][] arr)
{
    return SumUP(arr) + SumDown(arr);}
}
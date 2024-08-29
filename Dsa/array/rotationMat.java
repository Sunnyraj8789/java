import java.util.*;
import java.io.*;

public class rotationMat {
public static void rotatedMatrix(int[][] arr)
{
    //transpose the 2d array
    int m=arr.length;// cheak how much rows
    int n=arr[0].length; //cheak the how much columns in the matrix
    for(int i=0;i<m;i++)
    {
        for(int j=i;j<n;j++)
        {
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    //swap the left and right side element
    for(int i=0;i<m;i++)
    {
        int li=0;
        int ri=n-1;
        while(li<ri)
        {
            int temp=arr[i][li];
            arr[i][li]=arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;
        }
    }
}
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        rotatedMatrix(arr);
        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}

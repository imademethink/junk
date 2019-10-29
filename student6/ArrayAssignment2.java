
import java.util.List;

import java.util.ArrayList;
public class ArrayAssignment2
{
    public static void main(String[] args) {

        //Assignment 3
        String[] str = new String[4];//if we give string[2] will get Exception insted
        str[0] = "Hello";
        str[1] = "Hello";
        str[2] = "Hello";
        str[3] = "Hello";
        System.out.println("The length of first element is : " + str[0].length());

        //Assignment 4

        float[] A = new float[4];
        float[] B = new float[4];
        float[] C = new float[4];
        A[0]=9.2f;A[1]=9.3f;A[2]=9.4f;A[3]=9.5f;
        B[0]=4.2f;B[1]=4.3f;B[2]=4.4f;B[3]=4.5f;
        C[0]=3.2f;C[1]=3.3f;C[2]=3.4f;C[3]=3.5f;

        System.out.println("The first element in 3rd array are");
        float[] Ans = new float[3];
   /* for (int r=0;r<3;r++)
    {
        System.out.println(Ans[r]);
    }*/
        System.out.println(Ans[0]=A[0]);
        System.out.println(Ans[1]=B[0]);
        System.out.println(Ans[2]=C[0]);

        //Assignment 5
        String[] cars={"BMW","Volvo","Ford","Audi"};
        //System.out.println(cars);
        for(int k=0; k<cars.length - 1;k++)
        {
            System.out.println(cars[k]);
        }




    }
}

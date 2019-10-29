
public class Assignment {

    public static void main(String[] args) {

        //Assignment 1
       int[] mtarray = new int[10];

//Assignment 2
        System.out.println("\n assignment2");
        char[][] carray  = new char [4][10];
        carray[0][0]= 'r';
        carray[0][1]= 'o';
        carray[0][2]= 's';
        carray[0][3]= 'e';
        carray[1][0]= 's';
        carray[1][1]= 'u';
        carray[1][2]= 'n';
        carray[3][9]= 'n';
        for (char[] flowers : carray) {
            System.out.println(flowers);
            //System.out.println(carray.length);
        }

        //assignment 3:

        System.out.println("\n assignment3");
        String[] assess = {"  Hello  ", "  Hello  ", "  Hello  ", "  Hello  "};
        System.out.println(assess[0].length());


//Assignment4
        //Declare 3 x 1-D array of type float with length 4 and fill some values.
        // Make 4th array of type float, length 3, and copy first element of each of the earlier array.
        System.out.println("\n assignment4");
        float[] farray1 = {1.1f, 1.2f, 1.3f, 1.4f};
        float[] farray2 = {2.1f, 2.2f, 2.3f, 2.4f};
        float[] farray3 = {3.1f, 3.2f, 3.3f, 3.4f};
        float[] farray4 = new float[3];

        farray4[0] = farray1[0];
        farray4[1] = farray2[0];
        farray4[2] = farray3[0];
       for(float i : farray4){
        System.out.print(i +", ");
        //System.out.println(farray4);
       }

        //assignment5:
        System.out.println("\n assignment5");
        String[] cars ={"volvo","BMW", "FORD", "Maruti"};
        for(int n=0; n<cars.length-1; n++)
        {
            System.out.println(cars[n]+" ");
        }




    }
    }





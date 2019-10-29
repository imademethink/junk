public class Ex10Array
{
    public static void main(String[] args) {

        String [] arr = {"Tusharr","Rohannnn","Rudraaa","Surajj"};

        int maxLength = 0;
        String maxLengthString = null;

        for(int i = 0; i <= arr.length-1; i++)
        {
            //System.out.println("Length of Element : " + arr[i] + " is " + arr[i].length()); // Print each element with their length.
            if (arr[i].length() > maxLength)
            {
                maxLength = arr[i].length();
                maxLengthString = arr[i];
            }

        }

        System.out.println(maxLengthString + " string is the longest string from array with length " + maxLength);

        //System.out.println();
        //int length1 =


    }

}

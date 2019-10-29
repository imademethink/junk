public class assignment2 {
    //program for printing numbers, decreasing per row
    public static void main(String[] args) {
        int varlength = 10;
        int varlength2 = varlength;
        for (int j = 0; j<varlength; j++){
                        for (int i = 0; i<varlength2; i++) {
                            System.out.print(i);
                        }
            System.out.println(" ");
                        varlength2 --;
        }

    }
}

public class SwitchCAse {
    public static void main(String[] args) {

        String yyyy = "2019";
        String mm = "Jan";
        switch(yyyy)
        {

            case "1998":
                System.out.println("Match found : 1998");
                break;

            case "2000":
                System.out.println("Match found : 2000");
                break;

            case "2019":

            switch (mm)
                {
                    case "Jan":
                        System.out.println("Jan 2019 Month");
                        break;
                    case "Feb":
                        System.out.println("Feb 2019 Month");
                        break;

                    case "March":
                        System.out.println("March 2019 Month");
                        break;

                    case "April":
                        System.out.println("April 2019 Month");
                        break;

                    case "May":
                        System.out.println("May 2019 Month");
                        break;

                    case "June":
                        System.out.println("June 2019 Month");
                        break;

                    case "July":
                        System.out.println("July Month");
                        break;

                    case "Aug":
                        System.out.println("Aug Month");
                        break;

                    case "Sept":
                        System.out.println("Sept Month");
                        break;

                    case "Oct":
                        System.out.println("Oct Month");
                        break;

                    case "Nov":
                        System.out.println("Nov Month");
                        break;

                    case "Dec":
                        System.out.println("Dec Month");
                        break;

                    default:
                        System.out.println("No Match");


                }
        }
    }
}

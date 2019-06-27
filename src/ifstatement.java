//import java.util.SortedMap;
//
//public class ifstatement {
//    public static void main(String[] args) {
//        int i = 10;
//        if ( i <= 10) {
//            System.out.println( "I Variable value is less than or equal 10" + ":" + i );
//        }
//        else if ( i > 10 ) {
//            System.out.println( "I Variable value is greater than 10 " + ":" + i);
//        }
//        else {
//            System.out.println( "None of the condition value met and the value of I is " + i );
//        }
//    }
//}

//public class ifstatement {
//    public static void main(String[] args) {
//        int i = 10;
//
//        while (i <= 30) {
//            i++;
//            System.out.println(i);
//            if (i == 15) {
//                break;
//            }
//        }
//    }
//}

public class ifstatement {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 100 ; i++) {
            if (i >= 1) {
                System.out.println(i);
            }
            if (i == 15) {
                break;
            }
        }
    }
}
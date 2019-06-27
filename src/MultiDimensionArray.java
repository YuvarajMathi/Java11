public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] number = {
                {1, 2, 3, 4},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(number[0][2]);
        System.out.println(number[1][1]);
        System.out.println(number[2][0]);
        System.out.println(number[0][0]);
        System.out.println(number[1][1]);
        System.out.println(number[2][2]);

        String[][] text = new String[2][3];
        text[1][0] = "A B C D";
        text[1][1] = "E F G H";
        text[1][2] = "I J K L";
        System.out.println(text[1][0]);
        System.out.println(text[1][1]);
        System.out.println(text[1][2]);

        System.out.println(number[0].length);
        System.out.println(number.length);


        for (int row = 0; row < number.length; row++){
            for (int col = 0; col < number[row].length ; col++){
                System.out.print(number[row][col] + "\t");
            }
            System.out.println();
        }

        String[][] words = new String[3][];
        System.out.println(words[0]);

        words[0] = new String[2];
        words[1] = new String[2];
        words[0][0] = "Hi there!!";
        words[1][0] = "Hi there!!!";

        System.out.println(words[0][0]);
        System.out.println(words[1][0]);

    }
}

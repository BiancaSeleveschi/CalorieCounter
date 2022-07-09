public class ex {
    public static void main(String[] args) {
//        String[] words = {"firstpassword", "secondpassword", "thirdpassword"};
//        int[] result = processArray(words);
//        for (int i = 0; i < result.length ; i++) {
//            System.out.println(result[i]);
//
//        }
//    }
//
//    private static int[] processArray(String[] words) {
//        int[] result = new int[words.length];
//        for (int i = 0; i < words.length; i++) {
//            result[i] = words[i].length();
//        }
//        return result;
// 0000000000000000000000000000000000000000000000
        int a = compute(10);
        System.out.println(a);
}
    public static int compute(int number) {
        if (number % 2 == 0) {
            return number * 3;
        }
        if (number == 10) {
            return number + 3;
        }
        return number * number;
        //==================================================

//
//        String result = processString("password");
//        System.out.println(result);


//        private static String processString(String word) {
//            String result = "";
//            while (word.length() > 0) {
//                result = result + word.charAt(word.length() - 1);
//                word = word.substring(0, word.length() -1);
//            }
//           return result;


//        int i = 1;
//        int j = 10;
//        int k = 0;
//        while (i < j) {
//            k += (i * j);
//            i = i * 2;
//            j--;
//        }
//        System.out.println("k = " + k);


//        int k = 4;
//        while (k % 2 == 0) {
//            k--;
//            System.out.println("eveeee");
//            k ++ ;
//        }


    }
}



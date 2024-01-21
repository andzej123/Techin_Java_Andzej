public class Yak {
    public static void main(String[] args) {


        System.out.println(maxBlock(""));


    }

    public static int maxBlock(String str) {
        str = str + " ";
        int result = 0;
        if (str.length() > 1) {
            result = 1;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            int iter = 0;
            String s1 = str.substring(i, i + 1);
            String s2 = str.substring(i + 1 + iter, i + 2 + iter);
            if (s1.equals(s2)) {
                int count = 1;
                iter = 0;
                while (s1.equals(s2)) {
                    count++;
                    iter++;
                    s2 = str.substring(i + 1 + iter, i + 2 + iter);
                }
                if (count > result) {
                    result = count;
                }
            }
        }
        return result;
    }


}

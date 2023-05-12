public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }
    public static String gd(int code){
        int[] dateCodes = {702, 1082, 1083, 1114, 1184, 1266, 12403};
        for (int dateCode:dateCodes) {
            if (code == dateCode){
                return "DATE";
            }
        }
        if (
                code == 20 ||
                        code == 21 ||
                        code == 23 ||
                        code == 24 ||
                        code == 26 ||
                        code == 700 ||
                        code == 701 ||
                        code == 790 ||
                        code == 1700 ||
                        code == 2202 ||
                        code == 2203 ||
                        code == 2204 ||
                        code == 2205 ||
                        code == 2206 ||
                        code == 3734 ||
                        code == 3769 ||
                        code == 12396
        ) {
            return "NUMERIC";
        } else {
            return "STRING";
        }
    }
}
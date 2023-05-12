public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }
    public static String gd(int code){
        int[] dateCodes = {702, 1082, 1083, 1114, 1184, 1266, 12403};
        int[] numericCodes = {20 ,21 ,23 ,24 ,26 ,700 ,701 ,790 ,1700 ,2202 ,2203 ,2204 ,2205 ,2206 ,3734 ,3769 ,12396};
        for (int dateCode:dateCodes) {
            if (code == dateCode){
                return "DATE";
            }
        }
        for (int numericCode:numericCodes) {
            if (code == numericCode){
                return "NUMERIC";
            }
        }
        return "STRING";
    }
}
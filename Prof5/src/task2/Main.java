package task2;

public class Main {
    public static void main(String[] args) {
        String str = "On this document we will be showing a java example on how to use the replace() method of HashMap Class." +
                " Basically this method is being used to insert a new a new key-value mapping to the hashmap object." +
                " The replace method is overloaded and we have two available method and here are the following.";
        System.out.println("Длина до: " + str.length());
        StringBuilder sb = new StringBuilder();
        String[] strSplit = str.split("\\.");
        for (int i = 0; i < strSplit.length; i++) {
            String[] split2 = strSplit[i].trim().split(" ");
            sb.append(split2[split2.length - 1]).append(" ");
            for (int j = 1; j < split2.length - 1; j++) {
                sb.append(split2[j]).append(" ");
            }
            sb.append(split2[0]).append(". ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println("Длина после: " + sb.length());
        System.out.println(sb);
    }
}

public class Exeption {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        try {
            if (a != b);
            System.out.println(a);
            throw new Exception("hhhh");
        }
        catch (Exception e){
            System.out.println("Делить на ноль нельзя");
            System.out.println(e.getMessage());
        }
    }


}

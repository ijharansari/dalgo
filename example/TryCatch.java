public class TryCatch {
    public int dd() {
        try{
            System.out.println("This is try block");
            int ddd = 1/0;
            return 1;
        }catch(Exception e) {
            System.out.println("This is catch");
        }finally {
            System.out.println("This is Finally");
        }
        return 2;
    }
    public static void main(String args[]) {
        TryCatch a = new TryCatch();
        int aaa = a.dd();
        System.out.println(aaa);
    }
}

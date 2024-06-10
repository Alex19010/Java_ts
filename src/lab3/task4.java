public class Index {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException in main()");
        } catch (Exception ex) {
            System.out.println("Exception in main()");
        }
    }

    static void method() throws Exception {
        String s = "abc";
        System.out.println(s.charAt(3));
    }
}

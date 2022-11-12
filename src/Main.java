public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("test", "abc", "abcd");
        if(success) {
            System.out.println("Данные валидны!");
        }else {
            System.out.println("Данные не валидны!");
        }
    }
}
package src.basic.JavaStrings;

public class StringToChars {

    public static void main(String[] args) {
        String st = "password";
        byte[] bytes = st.getBytes();
        int i;
        for (i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String stNew = new String(bytes);
        System.out.println(stNew);
    }
}

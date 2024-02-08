package Task_107;

public class Test {
    public static void main(String[] args) {
        String st ="7777777777777777777";
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] !='7');
        }
        System.out.println(ch);
    }


}

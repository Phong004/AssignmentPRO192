
public class Test {

    public static void main(String args[]) {
        StringBuffer buffer = new StringBuffer("Game Plan");
        String s = buffer.toString();
        String s1 = buffer.reverse().toString();
        System.out.println(s + "  " + s1 + ":" + s.equals(s1));
        s1 = "";
        for (String retval : s.split(" ")) {
            s1 = retval + " " + s1;
        }        
        System.out.println(s1.trim());
    }
}

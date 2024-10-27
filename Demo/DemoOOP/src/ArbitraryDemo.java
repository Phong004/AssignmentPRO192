public class ArbitraryDemo{

    public double sumArr(double[] groups) {
        double s = 0;
        for (double x: groups){
            s += x;
        }
        return s;
    }
    public double sum(double... groups) {
        double s = 0;
        for (int i =0 ; i < groups.length; i++) {
            double x = groups[i];
            s += x;
        }
        return s;
    }
//
    public String concate(String... groups) {
        String s = "";
        for (String x : groups) {
            s += x + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        ArbitraryDemo obj = new ArbitraryDemo();
        double[] arr = {5, 8, 9, 0, 10};
        double total = obj.sum(5, 8, 9, 0, 10);
        System.out.println("1:" +total);
        
        total = obj.sumArr(arr);
        System.out.println("2:" +total);
        String line = obj.concate("OOP", "Programming", "with", "Java");
        System.out.println(line);        
    }

}

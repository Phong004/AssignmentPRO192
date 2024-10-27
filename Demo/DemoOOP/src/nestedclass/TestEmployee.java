package nestedclass;

public class TestEmployee {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        if(args.length==2) {
            // Object of outer class
            Employee objEmp1 = new Employee();
            // Invoke the evaluateStatus() method
            objEmp1.evaluateStatus(args[0], Integer.parseInt(args[1]));
        }
        else{
            System.out.println("Usage: java Employee <Emp-Id> <Age>");
        }
    }
}

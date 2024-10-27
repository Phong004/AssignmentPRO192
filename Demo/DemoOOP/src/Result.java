public class Result {
    String rollNo;
    String name;
    int[] marks;
    
    public void input(){
        int[] arrMark = {5,9,7,0};
        marks = arrMark;
        rollNo = "PRO192";
        name = "Thai";
    }
    public void show(){
        
    }
    
    public int total(){
        if (marks == null || marks.length==0)
            return 0;
        int sum = 0;
        for(int x: marks) sum+=x;
        return sum;
    }
    public double avg(){
        if (marks == null || marks.length==0)
            return 0;
        return (double)total()/marks.length;
    }
    
    public static void main(String[] args){        
        Result result = new Result();
        result.input();
        System.out.print(result.avg());
    }
}

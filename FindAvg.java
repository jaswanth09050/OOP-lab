

public class FindAvg
{
    
    public int findAvg(int numA, int numB, int numC)
    {
        return (numA + numB + numC) / 3;
    }


    public static void main(String args[])
    {
        FindAvg obj = new FindAvg();
        int avg = obj.findAvg(25, 345, 30);

        System.out.println("Average  : " + avg);
    }
}

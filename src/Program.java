import java.util.Scanner;

public class Program
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String1 str = new String1();
        int count=0;
        String [] temp = new String [1024];
        boolean t= true;
        String s;
        System.out.println("Введите количество слов:");
        int b=scanner.nextInt();
        System.out.println("Введите текст:");
        scanner.nextLine();
        while(t)
        {
            s=scanner.nextLine();

            if(s.equals("Exit"))
            {
                t=false;
            }
            else
            {
                temp[count]=s;
                count++;
                str.part1(s,b);
            }

        }
        System.out.println("Part2: ");
        for (int y=0;y<count;y++)
        {
            str.part2(temp[y]);
        }
    }
}

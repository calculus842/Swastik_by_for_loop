package patterns_question_programs;


public class swastik
 {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter the odd number greater than or equals to 9");
    int n=sc.nextInt();
if(n>=9 && n%2!=0)
{
    for(int i=1;i<=n;i++)
{
    if(i==1)
    {
for(int j=1;j<=n;j++)
    {
        if(j>1 && j<(n+1)/2)
        {
            System.out.print("  ");
        }
        else{
            System.out.print(" *");
        }
    }
}
if(i>1 && i<(n+1)/2)
{
    for(int j=1;j<=n;j++)
    {
        if(j==1 || j==(n+1)/2)
        {
            System.out.print(" *");
        }
        else{
            System.out.print("  ");
        }
    }
}
if(i==(n+1)/2)
{
    for(int j=1;j<=n;j++)
    {
        System.out.print(" *");
    }
}
if(i>(n+1)/2 && i<n)
{
    for(int j=1;j<=n;j++)
    {
        if(j==(n+1)/2 || j==n){
        System.out.print(" *");
        }
        else
        {
            System.out.print("  ");
        }
    }
    
}
if(i==n)
{
    for(int j=1;j<=n;j++)
    {
        if(j>(n+1)/2 && j<n)
        {
            System.out.print("  ");
        }
        else{
            System.out.print(" *");
        }
    }

}
System.out.println();
}
}
else
{
    System.out.println("Put Valid input");
}
    }
}


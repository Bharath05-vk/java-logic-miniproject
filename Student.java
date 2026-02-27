import java.util.*;
class Student{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the no of student: ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter the marks: ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}


//total
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+arr[i];
i=i++;
}
System.out.println("total = "+sum);


//average
double average=sum/n;
System.out.println("average = "+average);


//high mark
int max=arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("high mark = "+max);


//low mark
int min=arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println("low mark = "+min);


//grade
for(int i=0;i<n;i++)
{
if(arr[i]>90)
{
System.out.println(arr[i] +" = " + "A grade");
}
else if(arr[i]>80)
{
System.out.println(arr[i] +" = " + "B grade");
}
else if(arr[i]>70)
{
System.out.println(arr[i] +" = " + "C grade");
}
else if(arr[i]>60)
{
System.out.println(arr[i] +" = " + "D grade");
}
else if(arr[i]>50)
{
System.out.println(arr[i] +" = " + "E grade");
}
else
{
System.out.println(arr[i] +" = " + "U grade");
}
}


//pass or fail
for(int i=0;i<n;i++)
{
if(arr[i]>50)
{
System.out.println(arr[i] + " is pass");
}
else
{
System.out.println(arr[i] + " is fail");
}
}
}
}
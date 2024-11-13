import java.util.*;
public class stringsort{
public static void main(String args[]){ Scanner sc= new Scanner(System.in);
System.out.println("enter the size of array"); int size= sc.nextInt();
String a[]= new String[10];
String temp="";
System.out.println("enter the array elements"); for(int i=0;i<=size;i++)
{
a[i]=sc.nextLine();
}
System.out.println("the sorted array is"); for(int i=0;i<=size-1;i++)
{
for(int j=0;j<=size-i-1;j++)
{
if (a[j].compareTo(a[j+1])>0) {
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}}}
for(int i=0;i<=size;i++)
{
System.out.println(a[i]); }
} }
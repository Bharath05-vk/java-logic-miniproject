import java.util.*;
class loginvalidation{
public static void main(String[] a){
String username="Bharath";
String password="1234";
Scanner sc=new Scanner(System.in);
int count=0;
boolean Isloggedin=false;
while(count<3)
{
System.out.println("Enter the username");
String getname=sc.nextLine();
System.out.println("Enter the password");
String getpass=sc.nextLine();
if((username.equals(getname)) && (password.equals(getpass)))
{
System.out.println("Login success");
count++;
Isloggedin=true;
break;
}
else
{
System.out.println("login failed");
count++;
}
}
if(!Isloggedin)
{
System.out.println("Attempt over wait for thirty minutes");
}
}
}
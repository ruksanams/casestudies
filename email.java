package ruksana;
import java.util.Scanner;
public class email {
	
	String name;
	String address;
	String no;
	String mail;
	String proof;
	String proofid;
	static int i=0;
	public email(String name,String address,String no,String mail,String proof,String proofid)
	{
	this.name=name;
	this.address=address;
	this.no=no;
	this.mail=mail;
	this.proof=proof;
	this.proofid=proofid;
	}

	       public static void main(String[] args)
	       {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter your Name");
	String name=S.nextLine();
	System.out.println("Enter your Address");
	String address=S.nextLine();
	System.out.println("Contact number");
	String no=S.nextLine();
	System.out.println("E-Mail ID");
	String mail=S.nextLine();
	System.out.println("Enter proof type");
	String proof=S.nextLine();
	System.out.println("Enter proof id");
	String proofid=S.nextLine();
	      email c=new email(name,address,no,mail,proof,proofid);
	      c.register();
	       }
	       public void register()
	       {
	      System.out.println("Thank you for registering your id is "+(++i));
	       }
	       }





import java.util.Scanner;
public class ArrayObject {
    double rate;
    String name;
    int id;
    ArrayObject(){
        this(1000,"DOMS",12);
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rate:");
        rate=sc.nextDouble();
        System.out.print("Enter brand name:");
        name=sc.next();
        System.out.print("Customer id:");
        id=sc.nextInt();*/

    }
    ArrayObject(double rate,String name,int id)
    {
        this.rate=rate;
        this.name=name;
        this.id=id;
    }
    public void display()
    {
        System.out.println("Details of the purchase are:");
        System.out.println("Product name:"+name);
        System.out.println("Product rate:"+rate);
        System.out.println("Customer id:"+id);
    }

    public static void main(String[] args) {
        ArrayObject arr= new ArrayObject();
        arr.display();
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = sc.nextInt();
        ArrayObject ao[] = new ArrayObject[size];
        for(int i=0;i<ao.length;i++)
        {

            ao[i]=new ArrayObject();
            System.out.println("---------------------Displaying Objects "+i+"---------------------");
            ao[i].display();
        }*/
        /*ao[0]=new ArrayObject();
        ao[1]=new ArrayObject(200000.0d,"mac",12);
        ao[2]=new ArrayObject(24000.0d,"Asus",4);
        ao[3]=new ArrayObject(29000.0d,"Dell",15);
        ao[4]=new ArrayObject(30000.0d,"HP",20);
        ao[0].display();
        System.out.println("---------------------");
        ao[1].display();
        System.out.println("---------------------");
        ao[2].display();
        System.out.println("---------------------");
        ao[3].display();
        System.out.println("---------------------");
        ao[4].display();
        System.out.println("---------------------");*/
    }
}

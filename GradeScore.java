import java.util.Scanner;
public class GradeScore {
    int result;
    int external;
    int internal;
    int viva;
    GradeScore(int e) {
        external=e;
    }
    GradeScore(int practical,int mid) {
        internal=practical + mid;
    }
    GradeScore(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeScore gs = new GradeScore();
        System.out.print("Enter external marks:");
        gs.external = sc.nextInt();
        GradeScore gs1 = new GradeScore(gs.external);
        System.out.println("Enter internal marks:");
        System.out.print("Practical:");
        int practical = sc.nextInt();
        System.out.print("Mid:");
        int mid = sc.nextInt();
        GradeScore gs2 =  new GradeScore(practical,mid);
        System.out.print("Enter viva marks:");
        gs.viva = sc.nextInt();
        if(gs.external<=70){
            if (practical<=20 && mid<=30)
            {
                if(gs.viva<=30)
                {
                    gs.result = gs1.external + gs2.internal + gs.viva;
                }
            }
        }
        System.out.println("Result is:"+gs.result);
        if(gs.result<=150 && gs.result>=120)
        {
            System.out.println("AA");
        }
        else if(gs.result<=120 && gs.result>=90)
        {
            System.out.println("BB");
        }
        else if(gs.result<=90 && gs.result>=60)
        {
            System.out.println("CC");
        }
        else if(gs.result<=60 && gs.result<=30)
        {
            System.out.println("DD");
        }
        else {
            System.out.println("FF");
            System.out.println("Moye Moye!!");
        }
    }
}

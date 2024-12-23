import java.util.Scanner;

interface  animal {

    void setType(String type);
    String  getType(String type);
    void sounding();
    void eat();
}
class dog implements animal{

    private String type;

    public void setType(String type)
    {
        this.type=type;
    }
    public String getType(String type)
    {
        return type;
    }

    @Override
    public void sounding(){
        System.out.println(type+" makking sound");
    }
    public void eat(){
        System.out.println(type+" eating");
    }


}
 class cat implements animal{
     private String type;
     public void setType(String type)
     {
         this.type=type;
     }
     public String getType(String type)
     {
         return type;
     }
     public void sounding(){
         System.out.println(type+ " makking sound");
     }
     public void eat(){
         System.out.println(type+" cat eating");
     }
 }
public class main{
     public static void main(String[] args) {
         animal dog=new dog();
         Scanner sc=new Scanner(System.in);
         String type=sc.nextLine();

         dog.setType(type);
         dog.getType(type);

         dog.sounding();
         dog.eat();

         animal cat= new cat();
         String type1=sc.nextLine();
         cat.setType(type1);
         cat.getType(type1);
         cat.sounding();
         cat.eat();
     }
 }
import java.util.Scanner;
public class ifelse {
    public static void main(String args[]){
        int marksobtained,passingmarks;
        passingmarks=40;
        Scanner input=new Scanner(System.in);
        System.out.println("input marks scored by you");
        marksobtained=input.nextInt();
        if(marksobtained>=passingmarks){
            System.out.println("you are pass");
        }
        else{
            System.out.println("unfortunately fail");
        }
        
        
    }
}
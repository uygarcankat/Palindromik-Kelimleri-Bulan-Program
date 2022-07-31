import java.util.Scanner;

public class Palindromik {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz");
        String word=input.nextLine();
        int number=word.length();
        String [] arr=new String[number];
        int index=0;

        for(int i=word.length()-1; 0<=i; i--){

            arr[index]= String.valueOf(word.charAt(i));

            index++;
        }
        int i=word.length()-1;
        int x=0;

        while( 0<=i) {
            x++;

            if(arr[i].equals(String.valueOf(word.charAt(i)))){

                i--;
            }

            if(x>number){

                System.out.println("Sayılar palindromik değildir");

                break;
            }

            else if(i==-1){

                System.out.println("Sayılar palindromiktir");
            }
        }
    }
}

package ui;
import java.util.Scanner;
public class Main {
    private  static  int [] blocks;
    private  static StringBuilder out;
    public static void main(String[] args){
        blocks = new int[3];
      Scanner  sc = new Scanner(System.in);
      int problems, discs;
       out = new StringBuilder();
      problems = sc.nextInt();

      while (problems!=0){
        discs = sc.nextInt();
        blocks[0] = discs;
        out.append(blocks[0]).append(" ").append(blocks[1]).append(" ").append(blocks[2]).append("\n");
        hanoiSolve(discs,0,2,1);
        out.append("\n");
        blocks[0]= 0;
        blocks[1] =0;
        blocks[2] =0;
        problems--;
      }
      System.out.print(out);
      sc.close();

    }

    public  static void hanoiSolve(int discs , int source , int destiny , int aux){
        if(discs == 1){
            move(destiny,source);
            out.append(blocks[0]).append(" ").append(blocks[1]).append(" ").append(blocks[2]).append("\n");
        }else{
            hanoiSolve(discs-1,source,aux,destiny);
            move(destiny,source);
            out.append(blocks[0]).append(" ").append(blocks[1]).append(" ").append(blocks[2]).append("\n");
            hanoiSolve(discs-1,aux,destiny,source);
        }

    }

    public static void move(int destiny , int source){
        blocks[destiny] = blocks[destiny]+1;
        blocks[source] = blocks[source]-1;

    }


}

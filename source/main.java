import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("#################################################");
            System.out.println("# Hello, user!                                  #");
            System.out.println("# To install a package, just type:              #");
            System.out.println("# //CMD.Package(<name>).Install(<parameter>)    #");
            System.out.println("# To unstall a package, just type:              #");
            System.out.println("# //CMD.Package(<name>).Unstall(<parameter>)    #");
            System.out.println("# To execute a package command, just type:      #");
            System.out.println("# //CMD.Package(<name>).Execute(<command>)      #");
            System.out.println("#################################################");
        }
    }
}

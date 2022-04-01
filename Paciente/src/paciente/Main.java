
package paciente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner retorno = new Scanner(System.in);
        String retornoUser = "";
        
        Paciente paciente = new Paciente();
        SomeService someService = new SomeService();
        
        while (!(retornoUser.equals("sim")) || !(retornoUser.equals("nao")))
        {
            System.out.println("O paciente esta em estado de emergência?");
            retornoUser = retorno.next();
            
            if (retornoUser.equals("sim"))
            {
                paciente.setStatus(Status.URGENTE);
                someService.someMethod(paciente);
                break;
            } else if (retornoUser.equals("nao"))
            {
                paciente.setStatus(Status.NAOURGENTE);
                someService.someMethod(paciente);
                break;
            } else {
                System.out.println("Digitar somente sim ou nao");
            }
        }
    }
    
}

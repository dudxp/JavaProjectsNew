package paciente;

public class SomeService {
    
    public SomeService(){};
    
    public void someMethod(final Paciente paciente) {
        if (paciente.getStatus() == Status.URGENTE)
        {
            System.out.println("Paciente em estado de emergência.");
        } else {
            System.out.println("Paciente pode aguardar um pouco mais para ser atendido.");        
        }
    }
}

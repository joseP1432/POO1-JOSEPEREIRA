import java.util.*;

public class Banco
{
    private String nome;
    private ArrayList<Agencia> agencias;
    
    public Banco(){
        agencias = new ArrayList<>();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Agencia> getAgencia(){
        return this.agencias;
    }
    
    public void setAgencia(ArrayList<Agencia> agencias){
        this.agencias = agencias;
    }    

    public double totalAgencia(){
        return agencias.stream().mapToDouble(agencia -> agencia.total()).sum();
    }
    
    public void renderAgencia(){
         agencias.stream().forEach(agencia -> {agencia.renderTotal();});
    }
}

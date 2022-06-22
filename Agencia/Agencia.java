import java.util.*;
import java.util.stream.*;
import java.util.stream.*;

public class Agencia
{
    private int id;
    private ArrayList<Conta> contas;
    
    public Agencia(){
        contas = new ArrayList<>();
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public ArrayList<Conta> getConta(){
        return this.contas;
    }
    
    public void setConta(ArrayList<Conta> contas){
        this.contas = contas;
    }
    
    public Conta pesquisar(int codigo){
        return contas.stream().filter(conta -> conta.getCodigo() == codigo).findFirst().get();
    }
    
    public List<String> extrato(Conta codigo){
        return codigo.getAcoes();
    }
    
    public void cobrarTaxa(){
         contas.stream().forEach(conta -> {conta.manutencao();});
    }
    
    public void renderTotal(){
         contas.stream().forEach(conta -> {conta.render();});
    }
    
    public void taxaCorrente(){
        contas.stream().filter(conta -> conta.getTipo().equals("Corrente")).forEach(conta -> {conta.manutencao();});    
    }
    
    public double saque(Conta codigo, double valor){
        return codigo.sacar(valor);
    }
    
    public double total(){
        return contas.stream().mapToDouble(conta -> conta.getSaldo()).sum();
    }
    
    public void transferir(Conta origem, Conta destino, double valor){
        origem.sacar(valor);
        destino.depositar(valor);
    }
    
    public double deposito(Conta codigo, double valor){
        return codigo.depositar(valor);
    }
    
    public List<Conta> devedoresTrue(){
        return contas.stream().filter(deve -> deve.devedor()).collect(Collectors.toList());
    }
}

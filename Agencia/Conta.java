import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.stream.*;

public class Conta
{
    private int codigo;
    private String tipo;
    private double limite;
    private double saldo;
    private ArrayList<String> acoes = new ArrayList<>();
    private double taxa;
    private double emprestado;
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getSaldo(){
        return this.saldo;
    }
    
    public double getTaxa(){
        return this.taxa;
    }
    
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
    
    public ArrayList<String> getAcoes(){
        return this.acoes;
    }
    
    public double getEmprestimo(){
        return this.emprestado;
    }
    
    public double sacar(double valor){
        if(valor > saldo+limite){
            return saldo;
        }else{
            saldo = saldo - valor;
            acoes.add("Saque: " + valor + " Data: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            return saldo;
        }
    }
    
    public double depositar(double valor){
        saldo = saldo + valor;
        acoes.add("Depósito: " + valor + " Data: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return saldo;
    }
    
    public boolean transferir(double valor, Conta destino){
        if(valor > saldo+limite){
            return false;
        }else{
            saldo = saldo - valor;
            acoes.add("Transferência: " + valor + " Data: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            destino.saldo = saldo + valor;
            destino.acoes.add("Recebeu: " + valor + " Data: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            return true;
        }
    }
    
    public boolean manutencao(){
        if (taxa == 0){
            return false;
        }else{
            saldo = saldo - taxa;
            acoes.add("Taxado: " + taxa + " Data: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            taxa = 0;
            // Usei a lógica de que a cada mês o responsável, irá alterar o valor da taxa e que todas as contas serão taxadas no mesmo período.
            return true;
        }
    }
    
    public void render(){
        if(tipo == "poupança"){
            double diferenca = saldo;
            saldo = saldo + saldo*0.02;
            diferenca = saldo - diferenca;
            acoes.add("Rendeu: " + diferenca + " Data: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
    }
    
    public boolean emprestimo(double valor){
        saldo = saldo + valor;
        emprestado = valor;
        acoes.add("Empréstimo: " + valor + " Data: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return true;
    }
    
    public boolean devedor(){
        if(emprestado > 0){
            return true;
        }else{
            return false;
        }
    }
}

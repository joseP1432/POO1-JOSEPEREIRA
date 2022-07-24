import java.util.*;
public class teste
{
    public Banco montarTudo(){
        Banco bb = criarBanco();
        bb.setAgencia(criarAgencia(2));
        return bb;
    }
    
    public ArrayList<Conta> criarConta(int num){
        ArrayList<Conta> cc = new ArrayList<>();
        for (int i = 0; i < num; i++){
            Conta conta = new Conta();
            conta.setCodigo(i);
            conta.setTipo("Corrente");
            conta.depositar((i+1)*1000.54);
            conta.setLimite(((i+1)*1000.54)/2);
            conta.setTaxa(1);
            cc.add(conta);
        }
        return cc;
    }
    
    public ArrayList<Agencia> criarAgencia(int num){
        ArrayList<Agencia> agen = new ArrayList<>();
        for (int i = 0; i < num; i++){
            Agencia ag = new Agencia();
            ag.setId(i);
            ag.setConta(criarConta(2));
            agen.add(ag);
        }
        return agen;
    }
    
    public Banco criarBanco(){
        Banco banco = new Banco();
        banco.setNome("Banco UFRN");
        return banco;
    }
}

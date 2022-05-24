import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.swing.*;

public class Texto_03
{
    public String ex3_1(){
        Date dataAtual = new Date();
        return ""+dataAtual;
    }
    
    public String ex3_2(String data){
        Date data_nova = new Date(data);
        SimpleDateFormat data_format = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
        String data_final = data_format.format(data_nova);
        return ""+data_final;
    }
    
    public String[] ex3_3(String dir){
        File diretorioTemp = new File(dir);
        String[] dire = diretorioTemp.list();
        return dire;
    }
    
    public String[] ex3_4(String dir){
        File diretorioTemp = new File(dir);
        String[] diretorio = diretorioTemp.list();
        for(int i = 0; i < diretorio.length; i++){
            if(new File(diretorioTemp.getPath() + "/" + diretorio[i]).isDirectory()){
                diretorio[i] = "[D] " + diretorio[i];
            }else{
                diretorio[i] = "[A] " + diretorio[i];
            }
        }
            
        return diretorio;
    }
    
    public String[] ex3_5(String dir, String arquivo){
        File arq = new File(arquivo);
        arq.delete();
        File diretorioTemp = new File(dir);
        String[] diretorio = diretorioTemp.list();
        return diretorio;
    }
    
    public void ex3_6(){
         JFrame janela = new JFrame("JAVA");
         janela.setSize(300,200);
         
         JMenuBar menu = new JMenuBar();
         JMenu item1 = new JMenu("Arquivo");
         JMenu item2 = new JMenu("Editar");
         
         menu.add(item1);
         menu.add(item2);
         
         janela.setJMenuBar(menu);
         janela.setVisible(true);
    }
    
    public void ex3_7(String arq){
        String[] comando = {"cmd", "/c", "start", arq};
        try{
            Runtime.getRuntime().exec(comando);
        }catch(IOException iOException){
            iOException.printStackTrace();
        }
    }
    
    public void ex3_8(String arq){
        String[] comando = {"cmd", "/c", "start", "notepad", arq};
        try{
            Runtime.getRuntime().exec(comando);
        }catch(IOException iOException){
            iOException.printStackTrace();
        }
    }
    
    public void ex3_9(){
        JFrame janela = new JFrame("JAVA");
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setVisible(true);
    }
    
    public String ex3_10(String data1, String data2){
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = new Date(data1);
        String dt1_final = formatar.format(dt1);
        Date dt2 = new Date(data2);
        String dt2_final = formatar.format(dt2);
        
        if(dt1_final.compareTo(dt2_final) > 0){
            return dt2_final;
        }else{
            return dt1_final;
        }
    }
    
    public String[] ex3_11(String[] data) throws java.text.ParseException {
        Date[] dt = new Date[data.length];
        for (int i = 0; i < data.length; i++){
            dt[i] = new SimpleDateFormat("dd/MM/yy").parse(data[i]);

            Date aux = dt[i];
            String aux2 = data[i];
            int j = i - 1; 
            while(j>=0 && dt[j].compareTo(aux) > 0){
                dt[j + 1] = dt[j];
                data[j+1] = data[j];
                j = j - 1;
            }
            dt[j+1] = aux;
            data[j+1] = aux2;
        }
        return data;
    }
    
    public String ex3_12(String data){
        SimpleDateFormat formatar = new SimpleDateFormat("EEEE");
        Date dt = new Date(data);
        String data_final = formatar.format(dt);
        return data_final;
    }
}

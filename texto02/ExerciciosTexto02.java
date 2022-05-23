import java.util.*;
public class ExerciciosTexto02
{
    public ExerciciosTexto02(){
        
    }
    
    public int[] e2__2(int y, int z){
        int[] x = new int[2];
        if(y > z){
            x[0] = z;
            x[1] = y;
        }
        else{
            x[0] = y;
            x[1] = z;
        }
        return x;
    }
    
    public double[] e2__3(double x, double y, double z){
        double[] dec = new double[3];
        if(x > y && y > z){
            dec[2] = x;
            dec[1] = y;
            dec[0] = z;
        }else if(x > z && z > y){
            dec[2] = x;
            dec[1] = z;
            dec[0] = y;
        }else if(y>x && x>z){
            dec[0] = y;
            dec[1] = x;
            dec[2] = z;
        }else if(y>z && z>x){
            dec[0] = y;
            dec[1] = z;
            dec[2] = x;
        }else if(z>x && x>y){
            dec[0] = z;
            dec[1] = x;
            dec[2] = y;
        }else{
            dec[0] = z;
            dec[1] = y;
            dec[2] = x;
        }
        return dec;
    }
    
    public double e2__4(double x){
        double c = Math.sqrt(x);
        return c;
    }
    
    public int e2__5(String x, String y){
        int u = x.indexOf(y);
        return u;
    }
    
    public String[] e2__6(String x, String y){
        String[] v = new String[2]; 
        int u = x.compareTo(y);
        if (u < 0){
            v[0] = x;
            v[1] = y;
            return v;
        }else{
            v[0] = y;
            v[1] = x;
            return v;
        }
    }
    
    public String[] e2__7(String x, String y, String z){
        String[] w = new String[3];
        if(x.compareTo(y) < 0 && y.compareTo(z) < 0){
            w[0] = x;
            w[1] = y;
            w[2] = z;
            return w;
        } else if(x.compareTo(z) < 0 && z.compareTo(y) < 0){
            w[0] = x;
            w[1] = z;
            w[2] = y;
            return w;
        } else if(y.compareTo(x) < 0 && x.compareTo(z) < 0){
            w[0] = y;
            w[1] = x;
            w[2] = z;
            return w;
        } else if(y.compareTo(z) < 0 && z.compareTo(x) < 0){
            w[0] = y;
            w[1] = z;
            w[2] = x;
            return w;
        } else if(z.compareTo(x) < 0 && x.compareTo(y) < 0){
            w[0] = z;
            w[1] = x;
            w[2] = y;
            return w;
        } else{
            w[0] = z;
            w[1] = y;
            w[2] = x;
            return w;
        }
    }
    
    public String[] e2__8(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            int verificar = nomes[i].indexOf(" ");
            int tamanho = nomes[i].length();
            if (verificar != -1){
                String nome1 = nomes[i].substring(0, verificar);
                String sobrenome = nomes[i].substring(verificar+1, tamanho);
                nomes[i] = sobrenome + ", " + nome1;
            }
        }
        return nomes;
    }
    
    public String[] e2__9(String[] palavras){
        for (int i = 0; i < palavras.length; i++){
            palavras[i] = palavras[i].toUpperCase();
        }
        return palavras;
    }
    
    public String[] e2__10(String[] palavras){
        String[] novo = new String[palavras.length];
        for (int i = 0; i < palavras.length; i++){
            novo[i] = palavras[i].toUpperCase();
        }
        return novo;
    }
    
    public int[] e2__11(int[] num){
        for (int i = 1; i < num.length; i++){
            int k = num[i];
            int j = i - 1;
            while(j>=0 && num[j]>k){
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j+1] = k;
        }
        return num;
    }
    
    public int e2__12(int[] num){
        int cont = 0;
        for (int i = 1; i < num.length; i++){
            int k = num[i];
            int j = i - 1;
            while(j >= 0 && num[j]>k){
                num[j+1] = num[j];
                j = j-1;
                cont ++;
            }
            num[j+1] = k;
        }
        return cont;
    }
 
    public String e2__13(String[] palavras){
        int cont = 0;
        for (int i = 1; i < palavras.length; i++){
            String k = palavras[i];
            int j = i-1;
            while(j>=0 && palavras[j].compareTo(palavras[i])>palavras[i].compareTo(palavras[j])){
                palavras[j+1] = palavras[j];
                j = j - 1;
                cont += 1;
            }
            palavras[j+1] = k;
        }
        return ""+cont;
    }
    
    public int[] e2__14(int[] num){   
        for (int i = 1; i < num.length; i++){
            int k = num[i];
            int j = i - 1;
            while(j>=0 && num[j]<k){
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j+1] = k;
        }
        return num;
    }
    
    public String[] e2__15(String[] nomes){
        for (int i = 1; i < nomes.length; i++){
            String k = nomes[i];
            int j = i - 1;
            while(j>=0 && nomes[j].compareTo(k) > 0){
                nomes[j + 1] = nomes[j];
                j = j - 1;
            }
            nomes[j+1] = k;
        }
        return nomes;
    }
    
    public String[] e2__16(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            int verificar = nomes[i].indexOf(" ");
            int tamanho = nomes[i].length();
            if (verificar != -1){
                String nome1 = nomes[i].substring(0, verificar);
                String sobrenome = nomes[i].substring(verificar+1, tamanho);
                nomes[i] = sobrenome + " " + nome1;
            }
        }
        for (int j = 1; j < nomes.length; j++){
            String aux = nomes[j];
            int k = j - 1;
            while(k>=0 && nomes[k].compareTo(aux) > 0){
                nomes[k + 1] = nomes[k];
                k = k - 1;
            }
            nomes[k+1] = aux;
        }
        for (int l = 0; l < nomes.length; l++){
            int verificar = nomes[l].indexOf(" ");
            int tamanho = nomes[l].length();
            if (verificar != -1){
                String nome1 = nomes[l].substring(0, verificar);
                String sobrenome = nomes[l].substring(verificar+1, tamanho);
                nomes[l] = sobrenome + " " + nome1;
            }
        }
        return nomes;
    }
    
    public String[] e2__17(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            int verificar = nomes[i].indexOf(" ");
            int tamanho = nomes[i].length();
            if (verificar != -1){
                String nome1 = nomes[i].substring(0, verificar);
                String sobrenome = nomes[i].substring(verificar+1, tamanho);
                nomes[i] = sobrenome + ", " + nome1;
            }
        }
        for (int j = 1; j < nomes.length; j++){
            String k = nomes[j];
            int l = j - 1;
            while(l >= 0 && nomes[l].compareTo(k)>0){
                nomes[l+1] = nomes[l];
                l = l - 1;
            }
            nomes[l+1] = k;
        }
        return nomes;
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaCalculadora extends JFrame implements ActionListener                      
{
    private Calculadora calcular = new Calculadora();
    private int contador;
    private JTextField campo = new JTextField(10);
    private JButton num0 = new JButton("0"),
                    num1 = new JButton("1"),
                    num2 = new JButton("2"),
                    num3 = new JButton("3"),
                    num4 = new JButton("4"),
                    num5 = new JButton("5"),
                    num6 = new JButton("6"),
                    num7 = new JButton("7"),
                    num8 = new JButton("8"),
                    num9 = new JButton("9"),
                    soma = new JButton("+"),
                    sub = new JButton("-"),
                    multi = new JButton("x"),
                    divisao = new JButton("/"),
                    igual = new JButton("="),
                    zerar = new JButton("C"),
                    pot = new JButton("x²"),
                    porc = new JButton("%"),
                    raiz = new JButton("\u221A"),
                    pota = new JButton("xª"), // Isso simboliza o numero elevedado na potência A.
                    neg = new JButton("+/-");
    private Color cinza = new Color(220,220,220);
    
                    
    public JanelaCalculadora()
    {
        setLayout(null);
        campo.setEnabled(false);
        
        campo.setBounds(130, 20, 100, 25); //,, tamanho, largura
        
        neg.setBounds(40, 60, 50, 20);
        
        num0.setBounds(120, 60, 50, 20);
        zerar.setBounds(200, 60, 50, 20);
        porc.setBounds(280 , 220 , 50 , 20);
        
        num1.setBounds(40, 100 , 50 , 20 );
        num2.setBounds(120 , 100 , 50 , 20 );
        num3.setBounds(200 , 100 , 50 , 20 );
        
        num4.setBounds(40 , 140 , 50 , 20 );
        num5.setBounds(120 , 140 , 50 , 20 );
        num6.setBounds(200 , 140 , 50 , 20 );
        
        num7.setBounds(40 , 180 , 50 , 20 );
        num8.setBounds(120 , 180 , 50 , 20 );
        num9.setBounds(200 , 180 , 50 , 20 );
        
        soma.setBounds(280 , 60 , 50 , 20 );
        sub.setBounds(280 , 100 , 50 , 20 );
        multi.setBounds(280 , 140 , 50 , 20 );
        divisao.setBounds(280 , 180 , 50 , 20 );
        igual.setBounds(280, 260, 50, 20);

        raiz.setBounds(120, 220, 50, 20);
        pot.setBounds(200 ,  220, 50 , 20 );
        pota.setBounds(40 , 220 , 50 , 20 );
        
        //raiz.setIcon(new ImageIcon("raiz.png"));
        //pot.setIcon(new ImageIcon("x2.jpg"));
        //pota.setIcon(new ImageIcon("xy.png"));
        //porc.setIcon(new ImageIcon("porc.png"));
    
        
        super.getContentPane().add(campo);
        super.getContentPane().add(num0);
        super.getContentPane().add(num1);
        super.getContentPane().add(num2);
        super.getContentPane().add(num3);
        super.getContentPane().add(num4);
        super.getContentPane().add(num5);
        super.getContentPane().add(num6);
        super.getContentPane().add(num7);
        super.getContentPane().add(num8);
        super.getContentPane().add(num9);
        super.getContentPane().add(soma);
        super.getContentPane().add(sub);
        super.getContentPane().add(multi);
        super.getContentPane().add(divisao);
        super.getContentPane().add(igual);
        super.getContentPane().add(zerar);
        super.getContentPane().add(pot);
        super.getContentPane().add(porc);
        super.getContentPane().add(raiz);
        super.getContentPane().add(pota);
        super.getContentPane().add(neg);
        
        num0.addActionListener(this);
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        soma.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        divisao.addActionListener(this);
        igual.addActionListener(this);
        zerar.addActionListener(this);
        pot.addActionListener(this);
        porc.addActionListener(this);
        raiz.addActionListener(this);
        pota.addActionListener(this);
        neg.addActionListener(this);
        
        super.setSize(400,400);
        super.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        cor();
        switch(e.getActionCommand()){
            case "0":  campo.setText(""+calcular.zero()); contador += 1; break;
            case "1":  campo.setText(""+calcular.um()); contador += 1; break;
            case "2":  campo.setText(""+calcular.dois()); contador += 1; break;
            case "3":  campo.setText(""+calcular.tres()); contador += 1; break;
            case "4":  campo.setText(""+calcular.quatro()); contador += 1; break;
            case "5":  campo.setText(""+calcular.cinco()); contador += 1; break;
            case "6":  campo.setText(""+calcular.seis()); contador += 1; break;
            case "7":  campo.setText(""+calcular.sete()); contador += 1; break;
            case "8":  campo.setText(""+calcular.oito()); contador += 1; break;
            case "9":  campo.setText(""+calcular.nove()); contador += 1; break;
            case "+":  campo.setText(""+calcular.mais()); contador += 1; break;
            case "-":  campo.setText(""+calcular.menos()); contador += 1; break;
            case "x":  campo.setText(""+calcular.vezes()); contador += 1; break;
            case "/":  campo.setText(""+calcular.dividir()); contador += 1; break;
            case "=":  campo.setText(""+calcular.igual()); contador += 1; break;
            case "C":  campo.setText(""+calcular.zerar()); contador += 1; break;
            case "x²":  campo.setText(""+calcular.potencia()); campo.setText(""+calcular.igual()); contador += 1; break;
            case "%":  campo.setText(""+calcular.porcentagem()); contador += 1; break;
            case "\u221A":  campo.setText(""+calcular.raiz()); campo.setText(""+calcular.igual()); contador += 1; break;
            case "xª": campo.setText(""+calcular.potenciaA()); contador += 1; break;
            case "+/-": campo.setText(""+calcular.negativo()); campo.setText(""+calcular.igual()); contador += 1; break;
        }
    }
    public void cor(){
        if (contador%2 == 0){
            num0.setBackground(Color.WHITE);
            num1.setBackground(Color.WHITE);
            num2.setBackground(Color.WHITE);
            num3.setBackground(Color.WHITE);
            num4.setBackground(Color.WHITE);
            num5.setBackground(Color.WHITE);
            num6.setBackground(Color.WHITE);
            num7.setBackground(Color.WHITE);
            num8.setBackground(Color.WHITE);
            num9.setBackground(Color.WHITE);
            soma.setBackground(Color.WHITE);
            sub.setBackground(Color.WHITE);
            multi.setBackground(Color.WHITE);
            divisao.setBackground(Color.WHITE);
            igual.setBackground(Color.WHITE);
            zerar.setBackground(Color.WHITE);
            pot.setBackground(Color.WHITE);
            pota.setBackground(Color.WHITE);
            porc.setBackground(Color.WHITE);
            raiz.setBackground(Color.WHITE);
            zerar.setBackground(Color.WHITE);
            neg.setBackground(Color.WHITE);
        }else{
            num0.setBackground(cinza);
            num1.setBackground(cinza);
            num2.setBackground(cinza);
            num3.setBackground(cinza);
            num4.setBackground(cinza);
            num5.setBackground(cinza);
            num6.setBackground(cinza);
            num7.setBackground(cinza);
            num8.setBackground(cinza);
            num9.setBackground(cinza);
            soma.setBackground(cinza);
            sub.setBackground(cinza);
            multi.setBackground(cinza);
            divisao.setBackground(cinza);
            igual.setBackground(cinza);
            zerar.setBackground(cinza);
            pot.setBackground(cinza);
            pota.setBackground(cinza);
            porc.setBackground(cinza);
            raiz.setBackground(cinza);
            zerar.setBackground(cinza);
            neg.setBackground(cinza);
        }
    }
    public static void main(String[] args){       
    }
}

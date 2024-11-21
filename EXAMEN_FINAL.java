
import java.awt.*;
import java.lang.reflect.Constructor;
import java.awt.event.*;
import javax.swing.*;

public class EXAMEN_FINAL implements ActionListener{
    //Atributos 
    double dato1;
    double dato2; 
    String almacen;
    double Dato3;
    JFrame F = new JFrame();
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,BMA,BME,BDI,BMUL,BRESULTADOXD,BCLEAN,BP,BPO;
    JTextArea _de_resultados;
    //Constructor abajo marca acme
    public EXAMEN_FINAL(){
        
        F.setSize(500, 700);
        F.setVisible(true);
        _de_resultados = new JTextArea();
        _de_resultados.setEditable(false);
        _de_resultados.setBounds(40, 40, 400, 200);
        B1 = new JButton("9");
        B2 = new JButton("8");
        B3 = new JButton("7");
        B4 = new JButton("6");
        B5 = new JButton("5");
        B6 = new JButton("4");
        B7 = new JButton("3");
        B8 = new JButton("2");
        B9 = new JButton("1");
        BMA = new JButton("+");
        BME = new JButton("-");
        B0 = new JButton("0");
        BP = new JButton(".");
        BMUL = new JButton("x");
        BDI = new JButton("/") ;
        BRESULTADOXD = new JButton("=");
        BCLEAN = new JButton("C");
        BPO = new JButton("E");

        B1.setBounds(250, 250, 100,50 );
        B1.addActionListener(this);
        B2.setBounds(150, 250, 100,50 );
        B2.addActionListener(this);
        B3.setBounds(50, 250, 100,50 );
        B3.addActionListener(this);
        B4.setBounds(250,300, 100,50 );
        B4.addActionListener(this);
        B5.setBounds(150, 300, 100,50 );
        B5.addActionListener(this);
        B6.setBounds(50, 300, 100,50 );
        B6.addActionListener(this);
        B7.setBounds(250, 350, 100,50 );
        B7.addActionListener(this);
        B8.setBounds(150, 350, 100,50 );
        B8.addActionListener(this);
        B9.setBounds(50, 350, 100,50 );
        B9.addActionListener(this);
        B0.setBounds(50, 400, 100,50 );
        B0.addActionListener(this);
        BP.setBounds(150, 400, 100, 50);
        BP.addActionListener(this);

        BMA.setBounds(350, 250, 75, 50);
        BMA.addActionListener(this);
        BME.setBounds(350, 300, 75, 50);
        BME.addActionListener(this);
        BDI.setBounds(350, 350, 75, 50);
        BDI.addActionListener(this);
        BMUL.setBounds(350, 400, 75, 50);
        BMUL.addActionListener(this);
        BPO.setBounds(150,500,100,50);
        BPO.addActionListener(this);
        BRESULTADOXD.setBounds(250, 400, 100, 50);
        BRESULTADOXD.addActionListener(this);
        BCLEAN.setBounds(50,500,100,50);
        BCLEAN.addActionListener(this);
        

        F.add(B1); 
        F.add(B2); 
        F.add(B3); 
        F.add(B4); 
        F.add(B5); 
        F.add(B6); 
        F.add(B7); 
        F.add(B8); 
        F.add(B9); 
        F.add(B0); 
        F.add(BP);
        
        F.add(BMA);
        F.add(BME);
        F.add(BDI);
        F.add(BMUL);
        F.add(BRESULTADOXD);
        F.add(BPO);
        F.add(BCLEAN);
    

        F.add(_de_resultados);
        F.setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == B1){
            _de_resultados.append("9");
        }
        else if(e.getSource() == B2){
            _de_resultados.append("8");
        }
        else if(e.getSource() == B3){
            _de_resultados.append("7");
        }
        else if(e.getSource() == B4){
            _de_resultados.append("6");
        }
        else if(e.getSource() == B5){
            _de_resultados.append("5");
        }
        else if(e.getSource() == B6){
            _de_resultados.append("4");
        }
        else if(e.getSource() == B7){
            _de_resultados.append("3");
        }
        else if(e.getSource() == B8){
            _de_resultados.append("2");
        }
        else if(e.getSource() == B9){
            _de_resultados.append("1");
        }
        else if(e.getSource() == B0){
            _de_resultados.append("0");
        }
        else if(e.getSource() == BP){
            _de_resultados.append(".");
        }
        else if(e.getSource() == BMA){
            dato1 = Double.parseDouble(_de_resultados.getText());
            almacen = "+";
            _de_resultados.setText(null);
        }
        else if(e.getSource() == BME){
            dato1 = Double.parseDouble(_de_resultados.getText());
            almacen = "-";
            _de_resultados.setText(null);
        }
        else if(e.getSource() == BMUL){
            dato1 = Double.parseDouble(_de_resultados.getText());
            almacen = "x";
            _de_resultados.setText(null);
        }
        else if(e.getSource() == BDI){
            dato1 = Double.parseDouble(_de_resultados.getText());
            almacen = "/";
            _de_resultados.setText(null);
        }
        else if(e.getSource() == BPO){
            dato1 = Double.parseDouble(_de_resultados.getText());
            almacen = "E";
            _de_resultados.setText(null);
        }
        else if(e.getSource() == BCLEAN){
            dato1 = 0;
            dato2 = 0;
            Dato3 = 0;
            almacen = "";
            _de_resultados.setText(null);
        }
        else if(e.getSource() == BRESULTADOXD){
            dato2 = Double.parseDouble(_de_resultados.getText());
            if(almacen == "+"){
                Dato3 = dato1 + dato2;
                String resultado = Double.toString(Dato3);
                _de_resultados.setText(resultado);
            }
            if(almacen == "-"){
                Dato3 = dato1 - dato2;
                String resultado = Double.toString(Dato3);
                _de_resultados.setText(resultado);
            }
            if(almacen == "x"){
                Dato3 = dato1 * dato2;
                String resultado = Double.toString(Dato3);
                _de_resultados.setText(resultado);
            }
            if(almacen == "/"){
                Dato3 = dato1 / dato2;
                String resultado = Double.toString(Dato3);
                _de_resultados.setText(resultado);
            }
            if(almacen == "E"){
                Dato3 = Math.pow(dato1, dato2);
                String resultado = Double.toString(Dato3);
                _de_resultados.setText(resultado);
            }
        }
        

    }
    public static void main(String[] args) {
        new EXAMEN_FINAL();
        
        
    }
}


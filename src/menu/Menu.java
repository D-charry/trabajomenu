package menu;

import javax.swing.JOptionPane;

public class Menu {    
    public static void main(String[] args) {
        int op1 = 0;
        int op2 = 0;
        int numeroUno,numeroDos;
        do{              
            
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                + "\n 1. operaciones basicas"
                + "\n 2. ejercicios arreglos"
                + "\n 3. ejercicio de matrices"
                + "\n 4. Salir"));

            switch(op1){
                case 1:
                 do{
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("Elija las operaciones"
                    + "\n 1. realizar suma"
                    + "\n 2. realizar resta"
                    + "\n 3. realizar multiplicacion"
                    + "\n 4. realizar division"
                    + "\n 5. salir" ));
                    
                        switch(op2){                          
                        
                            case 1:
                                JOptionPane.showMessageDialog(null, "realizar suma ");
                                numeroUno=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));                                
                                break;                                
                            case 2:
                                JOptionPane.showMessageDialog(null, "realizar resta");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "realizar multiplicacion");
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "realizar division");
                                break;                            
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;    
                            
                             
                        
                             
                           }
                        }while(op2 != 4);
            
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Mostrar departamentos");
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Mostrar ciudades");
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Seleccionó Salir");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
            
        
            }        
           }while(op1 != 4);
        }            
    } 

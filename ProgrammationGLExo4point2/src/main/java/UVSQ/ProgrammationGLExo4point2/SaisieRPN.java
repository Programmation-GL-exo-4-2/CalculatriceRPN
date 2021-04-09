package UVSQ.ProgrammationGLExo4point2;

import java.util.Scanner;
import java.util.Stack;


public class SaisieRPN {

    private MoteurRPN moteur;
    private Command add;
    private Command sub;
    private Command mult;
    private Command div;
    private Command enrg;
    private Stack<Command> stk = new Stack<Command>();
    
    public SaisieRPN() 
    {
    	moteur=new MoteurRPN();
        add = new Addition(moteur);
        sub = new Soustraction(moteur);
        mult = new Multiplication(moteur);
        div = new Division(moteur);
        enrg = new EnregistrerOprnd(moteur);
        
    }

    public String saisir()
    {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }
    
    public void evaluerSaisie(String saisie) 
    {
        switch(saisie) {
            case "+": {

                moteur.setSaisie("+");
                add.execute();
                stk.add(add);
                break;
                }
            case "-": {
                moteur.setSaisie("-");
                sub.execute();
                stk.add(sub);
                break;
                }
            case "*": {
                moteur.setSaisie("*");
                mult.execute();
                stk.add(mult);
                break;
                }
            case "/": {
                moteur.setSaisie("/");
                div.execute();
                stk.add(div);
                break;
                }
            default : {
                moteur.setSaisie(saisie);
                enrg.execute();
                stk.add(enrg);
                break;
            }
        }
    }

    public MoteurRPN getMoteur() {
        return moteur;
    }

    public void setMoteur(MoteurRPN moteur) {
        this.moteur = moteur;
    }
    public Command getPopStack()
    {
    	return stk.pop();
    }
}
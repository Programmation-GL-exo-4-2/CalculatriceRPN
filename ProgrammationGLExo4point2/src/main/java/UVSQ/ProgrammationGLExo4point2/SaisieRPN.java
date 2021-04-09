package UVSQ.ProgrammationGLExo4point2;

import java.util.Scanner;


public class SaisieRPN {

    private MoteurRPN moteur;
    private Command add;
    private Command sub;
    private Command mult;
    private Command div;
    private Command enrg;
    private Command quit;
    private Command undo;
    
    public SaisieRPN() 
    {
    	moteur=new MoteurRPN();
        add = new Addition(moteur);
        sub = new Soustraction(moteur);
        mult = new Multiplication(moteur);
        div = new Division(moteur);
        enrg = new EnregistrerOprnd(moteur);
        quit = new Quit(moteur);
        undo = new Undo(moteur);
        
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
                break;
                }
            case "-": {
                moteur.setSaisie("-");
                sub.execute();
                break;
                }
            case "*": {
                moteur.setSaisie("*");
                mult.execute();
                break;
                }
            case "/": {
                moteur.setSaisie("/");
                div.execute();
                break;
                }
            case "undo" : {
                undo.execute();
                break;
                }
            case "quit" : {
                moteur.quit();
                break;
                }
            //si c'est un chiffre 
            default : {
                moteur.setSaisie(saisie);
                enrg.execute();
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
}
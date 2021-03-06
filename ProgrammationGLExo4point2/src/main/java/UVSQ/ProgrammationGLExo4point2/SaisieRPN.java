package UVSQ.ProgrammationGLExo4point2;

import java.util.Scanner;
import java.util.Stack;

public class SaisieRPN {

	private MoteurRPN moteur;
	private Stack<Command> commands;
	private Command add;
	private Command sub;
	private Command mult;
	private Command div;
	private Command enrg;
	private Command quit;
	private Command undo;
	public SaisieRPN() 
	{
		
		add = new Addition(moteur);
		sub = new Soustraction(moteur);
		mult = new Multiplication(moteur);
		div = new Division(moteur);
		enrg = new EnregistrerOprnd(moteur);
		quit = new Quit(moteur);
		undo = new Undo(moteur);
		commands = new Stack<Command>();
		
	}
	
	public void evaluerSaisie() 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		switch(str) {
			case "+": {
				
				moteur.setSaisie(str);
				add.execute();
				break;
				}
			case "-": {
				moteur.setSaisie(str);
				sub.execute();
				break;
				}
			case "*": {
				moteur.setSaisie(str);
				mult.execute();
				break;
				}
			case "/": {
				moteur.setSaisie(str);
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
				int i = Integer.valueOf(str);
				
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

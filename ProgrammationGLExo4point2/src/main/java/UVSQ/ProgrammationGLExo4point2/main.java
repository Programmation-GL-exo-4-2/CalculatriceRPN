package UVSQ.ProgrammationGLExo4point2;

enum main {
    ENVIRONNEMENT;

    
    public void run(String[] args) {
    	CalculatriceRPN C = new CalculatriceRPN();
    	C.main();
    }

    /*
     * Point d'entrée du programme.
     * @param args les arguments de ligne de commande
     */
    public static void main(String[] args) {
      ENVIRONNEMENT.run(args);
    }
}
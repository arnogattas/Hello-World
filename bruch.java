
public class bruch {
    
    private int zaehler;
    private int nenner;
    
    public bruch(int zaehl, int nenn) {
        this.zaehler = zaehl;
        this.nenner = nenn;
    }

    public void kehrwert() {
        int temp = 0;
        temp = this.zaehler;
        this.zaehler = this.nenner;
        this.nenner = temp;
    }

    public void ausgabe() {
        System.out.println(this.zaehler);
        
        int maxLaenge = 0;
        if (String.valueOf(this.nenner).length() > String.valueOf(this.zaehler).length()) {
            maxLaenge = String.valueOf(this.nenner).length();
        } else {
            maxLaenge = String.valueOf(this.zaehler).length();
        }
        for (int i = 0; i < maxLaenge; i++) {
            System.out.print("-");
        }
        System.out.println("");
            
        System.out.println(this.nenner);
    }
}

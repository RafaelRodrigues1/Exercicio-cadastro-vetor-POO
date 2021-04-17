package quarto;

/**
 * @author RafaelRodrigues1
 */
public class Quarto {
    
    private int numQuarto;
    private String inquilino;
    private String emailInq;

    public Quarto(int numQuarto, String inquilino, String emailInq) {
        this.numQuarto = numQuarto;
        this.inquilino = inquilino;
        this.emailInq = emailInq;
    }

    

    public String getInquilino() {
        return inquilino;
    }

    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

    public String getEmailInq() {
        return emailInq;
    }

    public void setEmailInq(String emailInq) {
        this.emailInq = emailInq;
    }

    public int getNumQuarto() {
        return numQuarto;
    }
        
}

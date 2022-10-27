/**
 * @author Samantha Alves Reis - RA: 202122146
 * Ciência da Computação - Profº Marcos Lopes
 */
public class Delta {

    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;

    public Delta(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    private double delta(Delta delta) {
        return (Math.pow(delta.getCoeficienteB(), 2) - ((4 * delta.getCoeficienteA()) * delta.getCoeficienteC()));
    }

    public int numeroDeRaizes(Delta delta) {
        if (delta(delta) > 0) {
            return 2;
        } else if (delta(delta) == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

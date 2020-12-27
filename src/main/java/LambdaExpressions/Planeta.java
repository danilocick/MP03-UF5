package LambdaExpressions;

public class Planeta {
    String nom;
    float dimension;

    public Planeta(String nom, float dimension) {
        this.nom = nom;
        this.dimension = dimension;
    }

    public float getDimension() {
        return dimension;
    }

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "LambdaExpressions.Planeta{" +
                "nom='" + nom + '\'' +
                ", dimension=" + dimension +
                '}';
    }
}

public interface IWVerwaltung {

    void setFaktor(double Faktor);
    double getFaktor();
    public void setZielbetrag(double zielbetrag);
    double getZielbetrag();
    String getAusgangswaehrungName();
    String getAusgangswaehrungCode();
    String getZielwaehrungName();
    String getZielwaehrungCode();
    public void setZielwaehrung(String zielwaehrung);
    double getAusgangsbetrag();
    public void setAusgangsbetrag(double ausgangsbetrag);

}

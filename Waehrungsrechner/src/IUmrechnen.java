public interface IUmrechnen{
    double umrechnen(String variante, double betrag);
    double getFaktor();
    boolean zustaendig(String variante);
    void setNextConverter(IUmrechnen nextConverter);
}
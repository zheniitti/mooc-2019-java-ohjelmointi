
public enum Koulutus {
    
    FT("tohtori"), FM("maisteri"), LuK("kandidaatti"), FilYO("ylioppilas");

    private String nimike;
    private Koulutus(String nimike){
        this.nimike = nimike;
    }
    public String getNimike(){
        return this.nimike;
    }
}

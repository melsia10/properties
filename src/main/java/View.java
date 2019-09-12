public class View implements be.technifutur.MVC.Vue<Conteneur> {
    private Conteneur conteneur;
    @Override
    public void start() {

    }

    @Override
    public StringBuilder getScreen() {
        if(conteneur.getSize()==0){
            return new StringBuilder("Pour ajouter une entrée, +clef;valeur , pour en supprimer une, -clef;valeur");
        } else {
            return new StringBuilder(conteneur.getEntryByKey("test"));
        }
    }

    @Override
    public void stop() {

    }

    @Override
    public void setModel(Conteneur conteneur) {
        this.conteneur = conteneur;
    }
}

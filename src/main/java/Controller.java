public class Controller implements be.technifutur.MVC.Controleur<Conteneur> {
    private Conteneur conteneur;
    private View view;
    @Override
    public void start() {

    }

    @Override
    public boolean isFinish() {
        return conteneur.isFinish();
    }

    @Override
    public void newInput(String s) {
        String[] parts = s.split(";");
        String key = parts[0];
        key = key.substring(1);
        String value = parts[1];
       if(s.startsWith("+")){
           conteneur.addEntryIntoMap(key, value);
       }else if(s.startsWith("-")){
           conteneur.deleteEntryIntoMap(key);
    }else throw new NotFound();
    }


    @Override
    public boolean hasLastScreen() {
        return conteneur.isFinish();
    }

    @Override
    public void stop() {
        conteneur.setFinish(true);
        this.view.stop();
    }

    @Override
    public void setModel(Conteneur model) {
        this.conteneur = model;

    }
}

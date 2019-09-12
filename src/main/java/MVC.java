import be.technifutur.MVC.Controleur;
import be.technifutur.MVC.MVCFactory;
import be.technifutur.MVC.Vue;

public class MVC implements MVCFactory<Model> {
    private Model model;

    @Override
    public Model getModel() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    @Override
    public Controleur<Model> getControleur() {
        return null;
    }

    @Override
    public Vue<Model> getVue() {
        return null;
    }
}

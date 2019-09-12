import be.technifutur.MVC.ApplicationMVC;
import be.technifutur.MVC.Controleur;
import be.technifutur.MVC.MVCFactory;
import be.technifutur.MVC.Vue;

public class MVC implements MVCFactory<Conteneur> {
    private Conteneur model = new Conteneur();
    private Controller controller = new Controller();
    private View view = new View();

    @Override
    public Conteneur getModel() {
        if (model == null) {
            model = new Conteneur();
        }
        return model;
    }

    @Override
    public Controleur<Conteneur> getControleur() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    @Override
    public Vue<Conteneur> getVue() {
        if (view == null) {
            view = new View();
        }
        return view;
    }
}

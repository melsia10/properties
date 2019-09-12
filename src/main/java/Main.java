import be.technifutur.MVC.MVCFramework;

public class Main {
    public static void main(String[] args) {
        MVCFramework<Conteneur> framework = new MVCFramework<>();
        MVC app = new MVC();
        framework.start(app);
    }
}

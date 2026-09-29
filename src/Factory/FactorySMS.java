package Factory;

public class FactorySMS extends FactoryNotificacoes {
    @Override
    public Notificacoes create(){
        return new SMS ();
}
}

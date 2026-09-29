package Factory;

public class FactoryEmail extends FactoryNotificacoes {
    @Override
    public Notificacoes create(){
        return new Emails ();

}}

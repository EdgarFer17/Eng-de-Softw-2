package Factory;

public class FactoryPush extends FactoryNotificacoes{
    @Override
    public Notificacoes create(){
        return new Push();

    }}
}

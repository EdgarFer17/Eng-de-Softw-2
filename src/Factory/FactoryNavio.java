package Factory;

public class FactoryNavio extends FactoryTransport{
    @Override
    public Transporte create(){
        return new Navio();
    }
}

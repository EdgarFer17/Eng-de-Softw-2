package Factory;

public class FactoryCaminhao extends  FactoryTransport{
    @Override
    public Transporte create(){
        return new Caminhao();
    }
}

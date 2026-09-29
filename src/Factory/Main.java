package Factory;

public class Main {
    static void main(String[] args) {
        Transporte transporte = new FactoryCaminhao().create();

        Notificacoes notificacoes = new FactoryEmail().create();
        Notificacoes notificacoes1 = new FactorySMS().create();

        System.out.println(notificacoes);
        System.out.println(notificacoes1);

    }
}

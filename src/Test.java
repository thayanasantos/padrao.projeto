import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);


        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDesensivo();





        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        }

    private static class ComportamentoAgressivo implements Comportamento {
        @Override
        public void mover() {

        }

    }

    private static class ComportamentoDesensivo implements Comportamento {
        @Override
        public void mover() {

        }
        Facade facade = new Facade();

        facade.migrarClientes("Thayana","6544000") ;
    }
}


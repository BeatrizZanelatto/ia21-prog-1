package ex1;

public class Ex1 {

    public static void main(String[] args) {
        // Teste ex1
        Bola pocoyo = new Bola("rosa", "plastico", 45.2);
        System.out.println("A bola é de cor " + pocoyo.mostrarCor());
        pocoyo.trocarCor("roxo");
        System.out.println("A nova cor da bola é " + pocoyo.mostrarCor());
        
        //Teste Quadrado
        Quadrado barbie = new Quadrado(100);
        System.out.println("O tamanho do quadrado é " + barbie.retornarValor());
        barbie.mudarValor(50);
        System.out.println("O tamanho do quadrado é " + barbie.retornarValor());
    }
    
}

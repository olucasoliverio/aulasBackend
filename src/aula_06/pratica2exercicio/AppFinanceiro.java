package aula_06.pratica2exercicio;

public class AppFinanceiro {
    public static void main(String[] args) {
        Boleto boleto = new Boleto();
        PIX pix = new PIX();
        CartaoCredito cartaoCredito = new CartaoCredito();

        System.out.println("O pagamento foi via " + boleto.getDescricao());
        boleto.pagar(100);

        System.out.println();

        System.out.println("O pagamento foi via " + pix.getDescricao());
        pix.pagar(100);

        System.out.println();

        System.out.println("O pagamento foi via " + cartaoCredito.getDescricao());
        cartaoCredito.pagar(100);
    }
}
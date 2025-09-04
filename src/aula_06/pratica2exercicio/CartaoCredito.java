package aula_06.pratica2exercicio;

public class CartaoCredito  implements Pagamento{
    @Override
    public void pagar (double valor)
    {
        System.out.println("O valor é: " + valor);
    }

    @Override
    public String getDescricao(){
        return ("O pagamento foi via Cartão de Crédito");
    }
}

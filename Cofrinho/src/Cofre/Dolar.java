package Cofre;

// Representa a moeda Dolar como uma subclasse da classe abstrata Moeda.
public class Dolar extends Moeda {
  	public Dolar(double valor) {
        super(valor);
    }

    // Converte o valor em Dolar para Real.
    @Override
    public double converter() {
           return valor * 5.0;  //Cotação fictícia: 1 $ = R$ 5 
    }

  // Retorna uma string com as informacoes da moeda tipo e o valor formatado com duas casas decimais.
    @Override
    public String info() {
        return "Dólar - $ " + String.format("%.2f", valor);
    }
}

package Cofre;

//Representa a moeda Real como uma subclasse da classe abstrata Moeda.
public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

// Como o valor ja esta em Real, apenas retorna o proprio valor.
    @Override
    public double converter() {
        return valor; 
    }

// Retorna uma string com as informacoes da moeda tipo e o valor formatado com duas casas decimais.
    @Override
    public String info() {
        return "Real - R$ " + String.format("%.2f", valor);
    }
}
package Cofre;

//Representa a moeda Euro como uma subclasse da classe abstrata Moeda.
public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    // Converte o valor em Euro para Real. 
    @Override
    public double converter() {
        // Cotação ficticia: 1 € = R$ 6 
        return valor * 6.0;
    }

 // Retorna uma string com as informacoes da moeda tipo e o valor formatado com duas casas decimais.
    @Override
    public String info() {
        return "Euro - € " + String.format("%.2f", valor);
    }
}

package Cofre;

/*
 * Classe abstrata Moeda.
 * Serve como modelo para as moedas utilizadas no cofrinho (Real, Dolar e Euro).
 * Define atributos e metodos que devem ser implementados pelas subclasses.
 */
public abstract class Moeda {
    protected double valor;

// Recebe o valor da moeda e armazena no atributo.
    public Moeda(double valor) {
        this.valor = valor;
    }

// Cada moeda tem sua proria forma de conversao para Real.
    public abstract double converter();
// Cada moeda retorna uma string com suas informacoes tipo e valor.
    public abstract String info();

/* Permite comparar se duas moedas sao iguais
 * O programa entende que duas moedas sao iguais quando sao do mesmo tipo e tem o mesmo valor.
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
        	return true; 
        if (obj == null || this.getClass() != obj.getClass()) 
        	return false; // Se for nulo ou classes diferentes
        Moeda outra = (Moeda) obj;
        return this.valor == outra.valor; // compara o valor
    }

//Garante consistencia nas comparacoes de moedas. 
    @Override
    public int hashCode() {
        return Double.hashCode(valor);

    }
}
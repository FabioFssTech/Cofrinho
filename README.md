# Cofrinho 💰

Um projeto simples para simular um cofrinho digital, permitindo adicionar, remover e consultar valores.  
Ideal para estudos de programação orientada a objetos e boas práticas de versionamento.

---

## 🎯 Objetivo Acadêmico
Este projeto foi desenvolvido como **atividade acadêmica** da disciplina de *Programação Orientada a Objetos*.  
O foco é exercitar:
- Estruturação de classes e pacotes em Java
- Uso de herança e polimorfismo
- Tratamento de erros e entradas inválidas
- Documentação e versionamento com Git/GitHub

Não se trata de um produto comercial, mas sim de um exercício de aprendizado.

---

## 🚀 Funcionalidades
- Adicionar valores ao cofrinho
- Retirar valores do cofrinho
- Listar moedas armazenadas
- Calcular valor total convertido em Real

---

## 🛠️ Tecnologias utilizadas
- Linguagem: **Java**
- Paradigma: **Programação Orientada a Objetos**
- Controle de versão: **Git/GitHub**

---

### Estrutura de pastas
Os arquivos devem estar organizados assim:
Cofrinho/ └── Cofre/ ├── Principal.java ├── Cofrinho.java ├── Moeda.java ├── Real.java ├── Dolar.java └── Euro.java

## 📦 Como compilar e executar

### Compilação
No terminal, dentro da pasta `Cofrinho`:
```bash

### Execução
java Cofre.Principal

### Empacotamento em JAR
jar cfe Cofrinho.jar Cofre.Principal Cofre/*.class

### Roda o Programa
java -jar Cofrinho.jar


COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 1
1 - Real R$
2 - Dólar $
3 - Euro €
1
Digite o valor da moeda: 1
Moeda adicionada com sucesso!
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 1
1 - Real R$
2 - Dólar $
3 - Euro €
2
Digite o valor da moeda: 2
Moeda adicionada com sucesso!
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 1
1 - Real R$
2 - Dólar $
3 - Euro €
3
Digite o valor da moeda: 3
Moeda adicionada com sucesso!
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 1
1 - Real R$
2 - Dólar $
3 - Euro €
1
Digite o valor da moeda: 10
Moeda adicionada com sucesso!
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 3
 
 Moedas armazenadas no cofrinho:
Real - R$ 1,00
Dólar - $ 2,00
Euro - € 3,00
Real - R$ 10,00
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 2
1 - Real
2 - Dólar
3 - Euro
1
Digite o valor exato da moeda que sera removida: 
10
Moeda removida com sucesso!
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 3
 
 Moedas armazenadas no cofrinho:
Real - R$ 1,00
Dólar - $ 2,00
Euro - € 3,00
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 4

 Total convertido em Real: R$ 29,00
 
 COFRINHO:
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular valor total convertido em Real
0 - Encerrar

 Escolha uma opção: 0
Encerrando o programa...





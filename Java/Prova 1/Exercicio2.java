
import java.util.Scanner;
//Heitor Sousa da Silva
//Guilherme Ferreira Di Mario

/* 
Uma empresa deseja informatizar a venda de ingressos de um parque temático. O primeiro passo no desenvolvimento será criar o algoritmo base para o funcionamento do sistema. 

Para realizar a venda do ingresso, será necessário informar os seguintes dados: 

Nome, idade e altura do visitante; 
Se o visitante possui algum tipo de deficiência; 
Se o visitante é estudante; 
Se a visita será em um dia da semana ou no final de semana; 
Se a visita será no período da manhã ou da tarde.
O preço base do ingresso é de R$ 100,00



1. Brinquedo radical

Apenas visitantes com idade acima de 12 anos e altura mínima de 1,50m podem acessar os brinquedos radicais. 



2. Descontos

Pessoa com deficiência 

50% 

Estudante 

35% 

10 anos ou menos 

40% 

60 anos ou mais 

35% 



O desconto não é cumulativo, deve prevalecer o maior desconto



3. Acréscimos

Final de semana: acréscimo de 25% 
Período da manhã: acréscimo de 15%
O acréscimo deve ser aplicado após a concessão do desconto. Os dois acréscimos são cumulativos. 

4. Promoção especial 

Se: 

Estudante  E

Idade entre 14 e 17 anos E

Visita no período da tarde durante a semana 

Conceder desconto especial de 7%. Este desconto deve ser aplicado após os demais cálculos. 

5. Mensagem final 

Após os cálculos, exibir, de maneira formatada: 

Nome 

Categoria de desconto 

Valor do desconto 

Valor dos acréscimos

Valor da promoção especial 

Valor final 

Status do brinquedo radical (permitido ou negado) 
*/

public class Exercicio2 {
    public static void main(String[] args) {
       int idade;
       int deficiencia;
       int estudante;
       int manha;
       int dia;
       String nome;
       double altura;
       double desconto = 0;
       double acres;
       double preco = 100;
       double precoTotal;
       Scanner sc = new Scanner(System.in);
       System.out.println("Qual o seu nome?");
       nome = sc.nextLine();

       // parte desconto
       System.out.println("Quantos anos você tem?");
       idade = sc.nextInt();
       System.out.println("Qual é a sua altura?");
       altura = sc.nextDouble();
       System.out.println("Você tem alguma deficiencia?");
       System.out.println("1 - sim");
       System.out.println("2 - não");
       deficiencia = sc.nextInt();
       System.out.println("Você é estudante?");
       System.out.println("1 - sim");
       System.out.println("2 - não");
       estudante = sc.nextInt();
       if (deficiencia == 1 && estudante == 2) {
        desconto = 0.50;
       }
       else if (deficiencia == 2 && estudante == 1 || idade < 60) {
        desconto = 0.35;
       }
       else if (idade > 10){
        desconto = 0.40;
       }
    // dia do parque
       System.out.println("Que dia você vai para o parque?");
       dia = sc.nextInt();
       switch (dia){
        case 1: //sabado
            acres = 0.25;
            break;
        case 2: //Segunda
            acres = 0;
            break;
        case 3: //terça
            acres = 0;
            break;
        case 4: //Quarta
            acres = 0;
            break;
        case 5: //Quinta
            acres = 0;
            break;
        case 6: //Sexta
            acres = 0;
            break;
        case 7: //domingo
            acres = 0.25;
            break;
        default:System.err.println("Escolha um numero valido");
            return;
       }
    System.out.println("Vai ser no periodo da manha?");
    System.out.println("1 - sim");
    System.out.println("2 - não");
    manha = sc.nextInt();
    if (manha == 1){
        acres = 0.15;
    }

    precoTotal = (preco * acres) / desconto;

    if (idade > 14 || idade < 17 || estudante == 1 || manha == 2){
        System.out.println("Você tem um desconto especial !!!");
        precoTotal = precoTotal / 0.07;
    }

    System.out.println("Seu nome é " + nome);
    System.out.println("Seu preço total é de " + desconto);
    System.out.println("Seus acrescimos são " + acres);
    System.out.println("O valor total será:" + precoTotal);
    
    if (idade > 12 && altura > 1.50){
        System.out.println("Você pode também acessar o brinquedo radical");
    }
    else
        System.out.println("Você não pode acessar o brinquedo radical");
}

}
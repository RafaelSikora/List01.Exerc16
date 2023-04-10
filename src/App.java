import java.util.Scanner;
import java.lang.Math;
// Exercicio 16: Faça um programa para uma loja de tintas. O programa deverá
// pedir o tamanho em metros quadrados da área a ser pintada. Considere 
// que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e 
// que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidades de latas de tinta a serem compradas 
// e o preço total.
class Main {
  
  public static void main(String[] args) {
  //Declaração de variáveis
  double metroQuadrado;
  double litroTinta;
  double lataTinta;
  double precoTotal;
  Scanner teclado = new Scanner(System.in);

  //Passo 1: fazer a entrada dos dados
    System.out.println("Digite o tamanho da area a ser pintada em metros quadrados: ");
    metroQuadrado = teclado.nextDouble();

    //Passo 2: Fazer os calculos
    litroTinta = metroQuadrado / 3;
    lataTinta =  Math.ceil(litroTinta / 18);
    precoTotal = lataTinta * 80 ;

    //Passo 3: exibir a resposta pro usuário
    System.out.println("Serão necessarias " + lataTinta + " para pintar " + metroQuadrado + " Metros quadrados.");
    System.out.println(" Preço total: R$ " + precoTotal);
  }
  
}
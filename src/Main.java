import java.util. *;
void main() {

      Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome");
    String nome = sc.nextLine();
    System.out.println("Digite o valor da sua primeira nota: ");
    double nota1 = sc.nextInt();

    System.out.println("Digite o valor da sua segunda nota: ");
    double nota2 = sc.nextInt();

    double media = (nota1 + nota2) / 2;

    System.out.println(nome + " sua media é: " +  media);


}

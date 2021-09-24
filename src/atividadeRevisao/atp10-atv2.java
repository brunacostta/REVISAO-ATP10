package atividadeRevisao;

import java.util.Scanner;

public class atp10-atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============== Cadastro Salário ======================");

        System.out.println("Digite sua salário: R$ ");
        Double salario = Double.parseDouble(sc.nextLine());

        if (salario > 1997.58) {
            System.out.printf("Seu salário é de R$ %d. Maior que R$1.997,58" + salario);
        }else if (salario <= 0) {
            System.out.printf("Não há salário a ser exibido!");
        }else{
            System.out.printf("Seu salário é de R$ %d. Maior que R$5.399,99" + salario);
        } 
    }
}
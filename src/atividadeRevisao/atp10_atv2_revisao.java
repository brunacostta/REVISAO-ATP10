package atividadeRevisao;

import java.util.Scanner;

public class atp10_atv2_revisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============== Cadastro Salário ======================");

        System.out.print("Digite sua salário: R$ ");
        Double salario = Double.parseDouble(sc.nextLine());

        while (salario <= 0) {
            System.out.println("Não há salário a ser exibido!");
            System.out.print("Digite seu salário novamente: R$ ");
            salario = Double.parseDouble(sc.nextLine());            
        }

        if (salario >= 1997.58 && salario < 5399.99) {
            System.out.printf("Salário é maior que R$1.997,58.");
        }else if(salario >= 5399.99){
            System.out.printf("Salário maior que R$5.399,99");
        }else{
            System.out.printf("Seu salário é de: R$ " + salario);
        }
    }
}
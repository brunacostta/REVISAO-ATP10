package atividadeRevisao;

import java.util.Scanner;

import javax.lang.model.util.ElementFilter;

public class atp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============== Cadastro Idade ======================");

        System.out.println("Digite sua idade: ");
        byte idade = Byte.parseByte(sc.nextLine());

        if (idade < 25) {
            System.out.println("Idade menor que 25 anos.");
        }else if (idade > 25) {
            System.out.println("Idade maior que 25 anos.");
        }else{
            System.out.println("Idade igual a 25 anos.");
        }
        
    }

}
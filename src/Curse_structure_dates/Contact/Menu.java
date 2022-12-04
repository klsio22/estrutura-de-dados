package Curse_structure_dates.Contact;

import Curse_structure_dates.Vector_base.Lists;

import java.util.Scanner;

public class Menu {

    public void changeOption(Scanner scan) {
        int option = 1;
        while (option != 0) {
            option = getOptionMenu(scan);

            switch (option){
                case 1:break;
                case 2:break;
                default:break;
            }

        }

        System.out.println("Usuario digitou 0 , programa terminado");
    }

    public void adcionarContatoCOntatoFinal(){

    }


    public int getOptionMenu(Scanner scan) {
        boolean inputValid = false;
        int selectOption = 0;
        String input;

        String option = "Digite a opção desejada:\n" +
                "1:Adiconar contato no final do vetor:\n" +
                "2: Adicionar contato em uma posição especifica\n" +
                "3: Obtém contato de uma posição especírfica\n" +
                "4: Consulta contato\n" +
                "5: Consulta útimo índice do contato\n" +
                "6: Verifica se contato existe\n" +
                "7: Excluir por posição\n" +
                "8: Excluir contato\n" +
                "9: Verifica tamanho do vetor\n" +
                "10: Excluir todos os contatos do vetor\n" +
                "11: Impreme vetor\n" +
                "0: sair";

        while (!inputValid) {
            System.out.println(option);

            try {
                input = scan.nextLine();
                selectOption = Integer.parseInt(input);
                if (selectOption >= 0 && selectOption <= 11) {
                    inputValid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida , digite novamente\n\n");
            }
        }


        return selectOption;
    }

    public void createContactDynamically(int quantity, Lists<Contact> list) {
        Contact contact;

        for (int i = 1; i <= quantity; i++) {
            contact = new Contact();
            contact.setName("Contato" + i);
            contact.setTelephone("111111111" + i);
            contact.setEmail("Contato" + i + "@gmail.com");

        }

    }

}

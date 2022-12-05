package Curse_structure_dates.Contact;

import Curse_structure_dates.Vector_base.Lists;

import java.util.Scanner;

public class Menu {

  public void changeOption(Scanner scan, Lists<Contact> list) {
    int option = 1;
    while (option != 0) {
      option = getOptionMenu(scan);

      switch (option) {
        case 1:
          addFinalContact(scan, list);
          break;
        case 2:
          addContactPosition(scan, list);
          break;
        case 3:
          getContactPosition(scan, list);
          break;
        case 4:
          getContact(scan, list);
          break;
        case 5:
          searchLastIndex(scan, list);
          break;
        case 6:
          researchExistContact(scan, list);
          break;
        case 7:
          removeForPosition(scan, list);
          break;
        case 8:
          removeContact(scan, list);
          break;
        case 9:
          printSizeVector(list);
          break;
        case 10:
          clearVector(list);
          break;
        case 11:
          printVector(list);
          break;
        default:
          break;
      }
    }
    System.out.println("Usuário digitou 0 , programa terminado");
  }

  public void addFinalContact(Scanner scan, Lists<Contact> list) {
    System.out.println("Criado um contato, entre com as informações");
    String name = readInformation("Entre com o nome", scan);
    String phone = readInformation("Entre com o phone", scan);
    String email = readInformation("Entre com o email", scan);

    Contact contact = new Contact(name, phone, email);
    list.add(contact);
    System.out.println("Contato adicionado com sucesso");
    System.out.println(contact);
  }

  public void addContactPosition(Scanner scan, Lists<Contact> list) {
    System.out.println("Criado um contato, entre com as informações");
    String name = readInformation("Entre com o telefone", scan);
    String phone = readInformation("Entre com o telefone", scan);
    String email = readInformation("Entre com o telefone", scan);

    Contact contact = new Contact(name, phone, email);

    int pos = readInformationInt("Entre com a posição a adicionar o contato", scan);


    try {
      list.add(pos, contact);

      System.out.println("Contato adicionado com sucesso");
      list.add(contact);
    } catch (Exception e) {
      System.out.println("Posição inválida, contato não adiconanado\n\n");
    }

    System.out.println("Contato adicionado com sucesso");
    System.out.println(contact);
  }

  public int readInformationInt(String msg, Scanner scan) {
    boolean inputValid = false;
    String input;
    int num = 0;
    while (!inputValid) {
      try {
        System.out.println(msg);
        input = scan.nextLine();
        num = Integer.parseInt(input);

        inputValid = true;
      } catch (Exception e) {
        System.out.println("Entrada inválida , digite novamente\n\n");
      }
    }
    return num;
  }

  public String readInformation(String msg, Scanner scan) {
    String input;
    System.out.println(msg);
    input = scan.nextLine();

    return input;
  }

  public void getContact(Scanner scan, Lists<Contact> list) {
    int position = readInformationInt("Entre com a posição a ser pesquisada", scan);

    try {
      Contact contact = list.search(position);
      System.out.println("Contato existe, seguem dados:");
      System.out.println(contact);

      System.out.println("fazendo pesquisa do contato encotrado:");
      position = list.search(contact);
      System.out.println("Contato encotrado na posição " + position);

    } catch (Exception e) {
      System.out.println("Posição inválida");
    }
  }

  public void getContactPosition(Scanner scan, Lists<Contact> list) {
    int position = readInformationInt("Entre com a posição a ser pesquisada", scan);

    try {
      Contact contact = list.search(position);
      System.out.println("Contato existe, seguem dados:");
      System.out.println(contact);
    } catch (Exception e) {
      System.out.println("Posição inválida");
    }
  }

  public void searchLastIndex(Scanner scan, Lists<Contact> list) {
    int position = readInformationInt("Entre com a posição a ser pesquisada", scan);

    try {
      Contact contact = list.search(position);
      System.out.println("Contato existe, seguem dados:");
      System.out.println(contact);

      System.out.println("fazendo pesquisa do útimo indice do contato encotrado:");
      position = list.lastIndex(contact);

      System.out.println("Contato encotrado na posição " + position);

    } catch (Exception e) {
      System.out.println("Posição inválida");
    }
  }

  public void researchExistContact(Scanner scan, Lists<Contact> list) {
    int position = readInformationInt("Entre com a posição a ser pesquisada", scan);

    try {
      Contact contact = list.search(position);
      boolean exist = list.contains(contact);

      if (exist) {
        System.out.println("Contato existe, seguem dados:");
        System.out.println(contact);
      }

    } catch (Exception e) {
      System.out.println("Posição inválida");
    }
  }

  public void removeForPosition(Scanner scan, Lists<Contact> list) {
    int position = readInformationInt("Entre com a posição a ser pesquisada", scan);

    try {
      list.remove(position);
      System.out.println("Contato por posição excluído");
    } catch (Exception e) {
      System.out.println("Posição inválida");
    }
  }

  public void removeContact(Scanner scan, Lists<Contact> list) {
    int position = readInformationInt("Entre com a posição a ser pesquisada", scan);

    try {
      Contact contact = list.search(position);
      list.remove(contact);
      System.out.println("Contato excluído");
    } catch (Exception e) {
      System.out.println("Posição inválida");
    }
  }

  public void printSizeVector(Lists<Contact> list) {
    System.out.println("Tamanho vetor é de :" + list.size());
  }

  public void clearVector(Lists<Contact> list) {
    list.clear();
    System.out.println("Todos os contatos do vertor foram excluidos");
  }

  public void printVector(Lists<Contact> list) {
    System.out.println();
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

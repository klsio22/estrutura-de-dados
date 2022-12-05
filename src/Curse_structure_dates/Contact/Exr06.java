package Curse_structure_dates.Contact;

import Curse_structure_dates.Contact.Contact;
import Curse_structure_dates.Vector_base.Lists;

import java.util.Scanner;

public class Exr06 {
  public static void main(String[] args) {

    //criação das variavies
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();

    //criar vetor com 20 de capacidade
    Lists<Contact> list = new Lists<Contact>(20);

    //criar e adicionar 30 contatos
    menu.createContactDynamically(5, list);

    //criar um menu para que o usuário escola a opção
    menu.changeOption(scan, list);
  }
}
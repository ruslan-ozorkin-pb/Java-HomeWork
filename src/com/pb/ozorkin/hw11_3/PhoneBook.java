package com.pb.ozorkin.hw11_3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class PhoneBook implements Serializable, Comparator<PhoneBook> {

    private final static long serialVersionUID = 42;

    private String name;
    private String phone1;
    private String phone2;
    private String address;
    private LocalDate dateOfBirth;
    private LocalDateTime dateOfEdit;
    private static int index = 0;

    private ArrayList<PhoneBook> members = new ArrayList<>();
    static Scanner in = new Scanner(System.in);


    public void printGUI() {
        index = 0;
        System.out.print("  Добро пожаловать в телефонную книгу!  \n");
        System.out.printf("%d : Добавить контакт \n", index + 1);
        System.out.printf("%d : Искать контакт \n", index + 2);
        System.out.printf("%d : Редактировать контакт \n", index + 3);
        System.out.printf("%d : Показать контакты \n", index + 4);
        System.out.printf("%d : Сортировать контакты по фио \n", index + 5);
        System.out.printf("%d : Сортировать контакты по основному номеру телефона \n", index + 6);
        System.out.printf("%d : Записать книгу в файл \n", index + 7);
        System.out.printf("%d : Прочитать файл \n", index + 8);
        System.out.printf("%d : Удалить контакт \n", index + 9);
        System.out.printf("%d : Выход \n", index + 10);


    }

    public void run() throws IOException, ClassNotFoundException {
        System.out.println("Выберите что желаете сделать:");
        Scanner input = new Scanner(System.in);
        index = input.nextInt();

        switch (index) {
            case 1:
                addMember();
                break;
            case 2:
                searchMember();
                break;
            case 3:
                modifyMember();
                break;
            case 4:
                displayMember();
                break;
            case 5:
                sort3();
                break;
            case 6:
                sort4();
                break;
            case 7:
                contactWrite();
                break;
            case 8:
                contactRead();
                break;
            case 9:
                deleteMember();
                break;
            case 10:
                System.exit(0);
                break;
            default:
                System.out.println("Введите цифру от 1 до 10");
        }

    }

    public void addMember() throws IOException, ClassNotFoundException {
        Scanner string = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = string.next();
        System.out.println("Введите номер телефона: ");
        String phone1 = string.next();
        System.out.println("Введите доп. номер телефона: ");
        String phone2 = string.next();
        System.out.println("Введите адрес: ");
        String address = string.next();
        System.out.println("Введите дату рождения в формате гггг-мм-дд: ");
        LocalDate dateOfBirth = LocalDate.parse(string.next());

        try {
            members.add(new PhoneBook(name, phone1, phone2, address, dateOfBirth, LocalDateTime.now()));
            System.out.println("Контакт сохранен! ");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("String: " + e);
        }
        System.out.println();
        printGUI();
        run();

    }

    public void deleteMember() throws IOException, ClassNotFoundException {
        System.out.println("Введите имя контакта для удаления ");
        members.removeIf(c -> c.getName().equals(in.next()));
        System.out.println("Контакт удален! ");
        index = 0;
        printGUI();
        run();
    }

    public void displayMember() throws IOException, ClassNotFoundException {
//        for (PhoneBook c : members) {
//            System.out.println("ФИО: " + c.getName() + "основной номер телефона: " + c.getPhone1()
//                    + " дополнительный номер: " +  c.getPhone2() + " адрес: " + c.getAddress() + " дата рождения: " +
//                    c.getDateOfEdit() + " дата/время корректировки: " + c.getDateOfEdit());
//        }
        members.stream()
                .forEach(System.out::println);
        index = 0;
        printGUI();
        run();

    }

    public void searchMember() throws IOException, ClassNotFoundException {
        System.out.println("Введите ФИО для поиска: ");
        Scanner string1 = new Scanner(System.in);
        String getName = string1.nextLine();
        for (PhoneBook c : members) {
            if (c.getName().equals(getName))
                System.out.println(c);
        }

        printGUI();
        run();
    }

    public void modifyMember() throws IOException, ClassNotFoundException {
        if (members.isEmpty()) {
            System.out.println("Список пуст! ");
        } else {
            for (int i = 0; i < members.size(); i++) {
                System.out.println("#" + (i + 1) + " " + members.get(i));
            }
            System.out.println();
        }
        System.out.println("Введите номер редактируемого контакта: ");
        int index = in.nextInt();

        try {
            boolean exit = false;

            do {
                System.out.println(
                        "Введите 1, отредактировать имя\n" +
                                "Введите 2, отредактировать основной номер\n" +
                                "Введите 3, отредактировать доп. номер\n" +
                                "Введите 4, отредактировать адрес\n" +
                                "Введите 5, отредактировать дату рождения\n" +
                                "Введите 6, сохранить и выйти \n");

                int red = in.nextInt();

                switch (red) {
                    case 1:
                        System.out.println("Старое имя " + members.get(index - 1).getName());
                        System.out.println("Введите новое имя: ");
                        members.set(index - 1, members.get(index - 1)).setName(in.next(), LocalDateTime.now());
                        System.out.println("Новое имя: " + members.get(index - 1).getName());
                        System.out.println("Контакт сохранен! ");
                        break;
                    case 2:
                        System.out.println("Старый телефон: " + members.get(index - 1).getPhone1());
                        System.out.println("Введите новый номер телефона: ");
                        members.set(index - 1, members.get(index - 1)).setPhone1(in.next(), LocalDateTime.now());
                        System.out.println("Новый телефон: " + members.get(index - 1).getPhone1());

                        System.out.println("Контакт сохранен! ");
                        break;
                    case 3:
                        System.out.println("Старый телефон: " + members.get(index - 1).getPhone2());
                        System.out.println("Введите новый номер телефона: ");
                        members.set(index - 1, members.get(index - 1)).setPhone2(in.next(), LocalDateTime.now());
                        System.out.println("Новый телефон: " + members.get(index - 1).getPhone1());

                        System.out.println("Контакт сохранен! ");
                        break;
                    case 4:
                        System.out.println("Старый адрес: " + members.get(index - 1).getAddress());
                        System.out.println("Введите новый адрес: ");
                        members.set(index - 1, members.get(index - 1)).setAddress(in.next(), LocalDateTime.now());
                        System.out.println("Новый адрес: " + members.get(index - 1).getAddress());

                        System.out.println("Контакт сохранен! ");
                        break;
                    case 5:
                        System.out.println("Старая дата рождения: " + members.get(index - 1).getDateOfBirth());
                        System.out.println("Введите дату рождения в формате гггг-мм-дд: ");
                        members.set(index - 1, members.get(index - 1)).setDateOfBirth(LocalDate.parse(in.next()),
                                LocalDateTime.now());
                        System.out.println("Новая дата рождения: " + members.get(index - 1).getDateOfBirth());

                        System.out.println("Контакт сохранен! ");
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Неверная команда. Попробуйте еще раз. \n");
                }
            } while (!exit);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("String: " + e);
        }
        System.out.println();
        printGUI();
        run();
    }

    public void contactWrite() throws IOException, ClassNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        mapper.registerModule(module);

        String personsJson = mapper.writeValueAsString(members);
        System.out.println(personsJson);
        mapper.writeValue(new File("myfile.json"), members);
        printGUI();
        run();


    }

    public void contactRead() throws IOException, ClassNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);


        List<PhoneBook> persons3 = mapper.readValue(new File("myfile.json"), new TypeReference<List<PhoneBook>>() {
        });
        System.out.println(persons3.get(0).getClass().getName());
        System.out.println(persons3);
        printGUI();
        run();


    }

//    public void sort() throws IOException, ClassNotFoundException {   // заменяем на стрим sort3()
////        members.sort(new PhoneBook());
//        Collections.sort(members, new PhoneBook.nameComparator());
//
//        printGUI();
//        run();
//    }
    public void sort3() throws IOException, ClassNotFoundException {
        members.stream()
                .collect(Collectors.groupingBy(PhoneBook::getName))
                .entrySet()
                .forEach(System.out::println);
        printGUI();
        run();
    }
    public void sort4() throws IOException, ClassNotFoundException {
        members.stream()
                .collect(Collectors.groupingBy(PhoneBook::getPhone1))
                .entrySet()
                .forEach(System.out::println);

        printGUI();
        run();
    }

//    public void sort2() throws IOException, ClassNotFoundException { заменяем на стрим sort4()
////        members.sort(new PhoneBook());
//        Collections.sort(members, new PhoneBook.phone1Comparator());
//
//        printGUI();
//        run();
//    }
//
    @Override
    public int compare(PhoneBook o1, PhoneBook o2) {
        return 0;
    }

    public static class nameComparator implements Comparator<PhoneBook> {
        @Override
        public int compare(PhoneBook o1, PhoneBook o2) {
            return o1.getName().compareTo(o2.getName());

        }

    }
    public static class phone1Comparator implements Comparator<PhoneBook> {
        @Override
        public int compare(PhoneBook o1, PhoneBook o2) {
            return o1.getPhone1().compareTo(o2.getPhone1());
        }
    }

    public void setName(String name, LocalDateTime dateOfEdit) {
        this.name = name; this.dateOfEdit = LocalDateTime.now();
    }
    public void setPhone1(String phone1, LocalDateTime dateOfEdit) {
        this.phone1 = phone1; this.dateOfEdit = LocalDateTime.now();
    }

    public void setPhone2(String phone2, LocalDateTime dateOfEdit) {
        this.phone2 = phone2; this.dateOfEdit = LocalDateTime.now();
    }

    public void setAddress(String address, LocalDateTime dateOfEdit) {
        this.address = address; this.dateOfEdit = LocalDateTime.now();
    }

    public void setDateOfBirth(LocalDate dateOfBirth, LocalDateTime dateOfEdit) {
        this.dateOfBirth = dateOfBirth; this.dateOfEdit = LocalDateTime.now();
    }

    public String getName() {return name;  }

    public String getPhone1() {return phone1; }

    public String getPhone2() {return phone2; }

    public String getAddress() { return address; }

    public LocalDate getDateOfBirth() {return dateOfBirth;  }

    public LocalDateTime getDateOfEdit() { return dateOfEdit; }

    public PhoneBook() {

    }

    public PhoneBook(String name, String phone1, String phone2, String address, LocalDate dateOfBirth, LocalDateTime dateOfEdit) {
        this.name = name;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEdit = dateOfEdit;
    }
    public PhoneBook(String name, String phone, LocalDateTime dateOfEdit) {
        this.name = name;
        this.phone1 = phone;
        this.dateOfEdit = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfEdit=" + dateOfEdit +
                '}';
    }




}
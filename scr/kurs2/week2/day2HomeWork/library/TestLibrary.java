package scr.kurs2.week2.day2HomeWork.library;

/**
 * Created by miha on 15.06.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {

        Author author1 = new Author("Федор", "Достоевский");
        Author author2 = new Author("Лев", "Толстой");
        Author author3 = new Author("Михаил", "Булгаков");
        Author author4 = new Author("Николай", "Гоголь");

        Reader reader1 = new Reader("Саша", "Петров", 1, 2222222);
        Reader reader2 = new Reader("Коля", "Иванов", 2, 3333333);
        Reader reader3 = new Reader("Игорь", "Сидоров", 3, 4444444);
        Reader reader4 = new Reader("Вася", "Филимонов", 2, 5555555);

        Print book1 = new Book("Идиот", 1869, author1);
        Print book2 = new Book("Анна Каренина", 1877, author2);
        Print book3 = new Book("Мастер и Маргарита", 1966, author3);
        Print book4 = new Book("Тарас Бульба", 1950, author4);
        Print book5 = new Book("Идиот", 1869, author1);

        Print jornal1 = new Jornal("Космо", 2000, 2, 1);
        Print jornal2 = new Jornal("Сад", 2000, 2, 1);
        Print jornal3 = new Jornal("Авто", 2000, 2, 1);
        Print jornal4 = new Jornal("Живность", 2000, 2, 1);

        Print nespaper1 = new NewsPaper("Факты",2010,2,1);
        Print nespaper2 = new NewsPaper("Сегодня",2010,2,1);
        Print nespaper3 = new NewsPaper("Новости",2010,2,1);
        Print nespaper4 = new NewsPaper("Спорт",2010,2,1);

        Library library = new Library("НБУ", "Крещатик,1");

        //добавляем издания в библиотеку
        library.addPrint(book1);
        library.addPrint(book1);
        library.addPrint(book1);
        library.addPrint(book1);
        library.addPrint(nespaper1);
        library.addPrint(nespaper1);
        library.addPrint(jornal1);
        library.addPrint(jornal2);
        library.addPrint(jornal3);

        //добавляем читателей в библиотеку
        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);

        //выдать печатное издание читателю
        library.givePrintRider(book1,reader1);
        library.givePrintRider(jornal1,reader2);

        //добавить читателя в черный список
        library.addBlackListReader(reader1);

        System.out.println("===посмотреть черный список===");
        library.showBlackList();
        System.out.println();

        library.givePrintRider(nespaper1,reader1);

        System.out.println("===Посмотреть список книг у читателя===");
        library.showPrintReader(reader1);
        System.out.println();

        System.out.println("===Посмотреть список книг у всех читателей==");
        library.showPrintsReaders();
        System.out.println();

        System.out.println("===Список изданий в библиотеке===");
        library.showPrints();
        System.out.println();

        System.out.println("===Список читателей в библиотеке===");
        library.showReaders();
        System.out.println();

        System.out.println("===Поиск издания по году===");
        library.showPrintYear(2000);
        System.out.println();

        System.out.println("===Поиск издания по названию===");
        library.showPrintName("Авто");
        System.out.println();

        System.out.println("===Поиск издания по автору===");
        library.showAuthorPrint(author1);






    }
}

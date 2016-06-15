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

        Print book1 = new Book("Идиот", 1869, 3, author1);
        Print book2 = new Book("Анна Каренина", 1877, 5, author2);
        Print book3 = new Book("Мастер и Маргарита", 1966, 1, author3);
        Print book4 = new Book("Тарас Бульба", 1950, 1, author4);

        Print jornal1 = new Jornal("Космо", 2000, 2, 1);
        Print jornal2 = new Jornal("Сад", 2000, 2, 1);
        Print jornal3 = new Jornal("Авто", 2000, 2, 1);
        Print jornal4 = new Jornal("Живность", 2000, 2, 1);

        Print nespaper1 = new NewsPaper("Факты",2010,2,1);
        Print nespaper2 = new NewsPaper("Сегодня",2010,2,1);
        Print nespaper3 = new NewsPaper("Новости",2010,2,1);
        Print nespaper4 = new NewsPaper("Спорт",2010,2,1);


        Library lybrary = new Library("НБУ", "Крещатик,1");

        //Добавить читателей
        lybrary.addReader(reader1);
        lybrary.addReader(reader2);
        lybrary.addReader(reader3);
        lybrary.addReader(reader4);
        System.out.println("====Список читателей:====");
        lybrary.showReaders();
        System.out.println();

        //Добавить книги,журналы,газеты
        lybrary.addPrints(book1);
        lybrary.addPrints(book2);
        lybrary.addPrints(book3);
        lybrary.addPrints(book4);

        lybrary.addPrints(jornal1);
        lybrary.addPrints(jornal2);
        lybrary.addPrints(jornal3);
        lybrary.addPrints(jornal4);

        lybrary.addPrints(nespaper1);
        lybrary.addPrints(nespaper2);
        lybrary.addPrints(nespaper3);
        lybrary.addPrints(nespaper4);
        lybrary.addPrints(nespaper4);

        System.out.println("====Список печатных изданий====");
        lybrary.showPrints();


    }
}

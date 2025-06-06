package laba8.task.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParserTask {
    private static final String FILE_PATH = "src/main/java/laba8/task/json/book.json";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            JSONObject jsonObject = loadJsonFile();
            JSONArray books = (JSONArray) jsonObject.get("books");

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Показать все книги");
                System.out.println("2. Найти книгу по автору");
                System.out.println("3. Добавить книгу");
                System.out.println("4. Удалить книгу");
                System.out.println("0. Выход");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        showAllBooks(books);
                        break;
                    case 2:
                        searchByAuthor(books);
                        break;
                    case 3:
                        addBook(books);
                        saveJsonFile(jsonObject);
                        break;
                    case 4:
                        deleteBook(books);
                        saveJsonFile(jsonObject);
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject loadJsonFile() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(FILE_PATH);
        return (JSONObject) parser.parse(reader);
    }

    private static void saveJsonFile(JSONObject jsonObject) throws IOException {
        FileWriter file = new FileWriter(FILE_PATH);
        file.write(jsonObject.toJSONString());
        file.flush();
        file.close();
    }

    private static void showAllBooks(JSONArray books) {
        System.out.println("\nВсе книги:");
        for (Object book : books) {
            printBook((JSONObject) book);
        }
    }

    private static void searchByAuthor(JSONArray books) {
        System.out.print("\nВведите автора для поиска: ");
        String author = scanner.nextLine();

        System.out.println("Результаты поиска:");
        for (Object book : books) {
            JSONObject bookObj = (JSONObject) book;
            if (author.equalsIgnoreCase((String) bookObj.get("author"))) {
                printBook(bookObj);
            }
        }
    }

    private static void addBook(JSONArray books) {
        System.out.println("\nДобавление новой книги:");

        System.out.print("Введите название: ");
        String title = scanner.nextLine();

        System.out.print("Введите автора: ");
        String author = scanner.nextLine();

        System.out.print("Введите год издания: ");
        String year = scanner.nextLine();

        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);

        books.add(newBook);
        System.out.println("Книга добавлена!");
    }

    private static void deleteBook(JSONArray books) {
        System.out.print("\nВведите название книги для удаления: ");
        String title = scanner.nextLine();

        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equalsIgnoreCase((String) book.get("title"))) {
                iterator.remove();
                System.out.println("Книга удалена!");
                return;
            }
        }

        System.out.println("Книга не найдена!");
    }

    private static void printBook(JSONObject book) {
        System.out.println("\nКнига:");
        System.out.println("Название: " + book.get("title"));
        System.out.println("Автор: " + book.get("author"));
        System.out.println("Год: " + book.get("year"));
    }
}
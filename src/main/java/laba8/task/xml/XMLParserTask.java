package laba8.task.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class XMLParserTask {
    private static final String XML_FILE_PATH = "./src/main/java/laba8/task/xml/book.xml";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            File inputFile = new File(XML_FILE_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("book");

            while (true) {
                System.out.println("\nВыберите действие: ");
                System.out.println("1. Добавить книгу");
                System.out.println("2. Найти книгу");
                System.out.println("3. Удалить книгу");
                System.out.println("0. Выход");

                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> addBook(doc);
                    case 2 -> searchBooks(doc);
                    case 3 -> deleteBook(doc);
                    case 4 -> printNode(nodeList);
                    case 0 -> {
                        System.out.println("Выход из программы.");
                        return;
                    }
                    default -> System.out.println("Неверный выбор. Пожалуйста, выберите ещё раз.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printNode(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\nТекущий элемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
            }
        }
    }

    private static void addBook(Document doc) throws Exception {
        System.out.println("\nДобавление книг");
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.println("Введите автора: ");
        String author = scanner.nextLine();

        System.out.println("Введите год издания: ");
        int year = scanner.nextInt();

        Element newBook = doc.createElement("book");

        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));
        newBook.appendChild(titleElement);

        Element authorElement = doc.createElement("author");
        authorElement.appendChild(doc.createTextNode(author));
        newBook.appendChild(authorElement);

        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(String.valueOf(year)));
        newBook.appendChild(yearElement);

        doc.getDocumentElement().appendChild(newBook);
        saveXML(doc);

        System.out.println("Книга успешно добавлена!");
    }

    private static void searchBooks(Document doc) {
        System.out.println("\nПоиск книг");
        System.out.println("Введите автора (или оставьте пустым): ");
        String authorInput = scanner.nextLine().trim();

        System.out.println("Введите год издания (или оставьте пустым): ");
        String yearInput = scanner.nextLine().trim();

        boolean searchByAuthor = !authorInput.isEmpty();
        boolean searchByYear = !yearInput.isEmpty();

        if (!searchByAuthor && !searchByYear) {
            System.out.println("Не указаны критерии поиска. Показаны все книги:");
            return;
        }

        NodeList nodeList = doc.getElementsByTagName("book");

        List<Element> foundBooks = IntStream.range(0, nodeList.getLength())
                .mapToObj(nodeList::item)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(book -> {
                    boolean matches = true;

                    if (searchByAuthor) {
                        String author = book.getElementsByTagName("author")
                                .item(0)
                                .getTextContent();
                        matches &= author.equalsIgnoreCase(authorInput);
                    }

                    if (searchByYear) {
                        String year = book.getElementsByTagName("year")
                                .item(0)
                                .getTextContent();
                        matches &= year.equals(yearInput);
                    }

                    return matches;
                })
                .collect(Collectors.toList());

        if (foundBooks.isEmpty()) {
            System.out.println("Книги не найдены.");
        } else {
            System.out.println("\nНайдено книг: " + foundBooks.size());
            printBooks(foundBooks);
        }
    }

    private static void printBooks(List<Element> books) {
        for (int i = 0; i < books.size(); i++) {
            Element book = books.get(i);
            System.out.println("\nКнига #" + (i + 1));
            System.out.println("Название: " + book.getElementsByTagName("title").item(0).getTextContent());
            System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
            System.out.println("Год издания: " + book.getElementsByTagName("year").item(0).getTextContent());
        }
    }

    private static void deleteBook(Document doc) throws Exception {
        System.out.println("\nУдаление книги");
        System.out.print("Введите точное название книги: ");
        String title = scanner.nextLine();

        NodeList books = doc.getElementsByTagName("book");

        for (int i = 0; i < books.getLength(); i++) {
            Node bookNode = books.item(i);
            if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                Element book = (Element) bookNode;
                String bookTitle = book.getElementsByTagName("title").item(0).getTextContent();

                if (bookTitle.equals(title)) {
                    book.getParentNode().removeChild(book);
                    saveXML(doc);
                    System.out.println("Книга '" + title + "' удалена!");
                    return;
                }
            }
        }

        System.out.println("Книга с таким названием не найдена!");
    }

    private static void saveXML(Document doc) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(XML_FILE_PATH));
        transformer.transform(source, result);
    }
}

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        //ЗАДАНИЕ 1

//        FractionInterface fraction = FractionFactory.createFraction(4, 5);
//        FractionInterface fraction2 = FractionFactory.createFraction(1, 3);
//        System.out.println("Дробь 1: " + fraction); // 3/4
//        System.out.println("Дробь 2: " + fraction2);
//        System.out.println("Вещественное значение дроби 1: " + fraction.toDouble()); // 0.75
//
//        System.out.println("Дробь 1 равна дроби 2: " + fraction.equals(fraction2));
//
//        fraction.setNumerator(1);
//        System.out.println("Изменённая дробь 1: " + fraction); // 6/4
//        System.out.println("Вещественное значение измененной дроби 1: " + fraction.toDouble()); // 1.5
//
//        fraction.setDenominator(3);
//        System.out.println("Изменённая дробь 1: " + fraction); // 6/8
//        System.out.println("Вещественное значение измененной дроби 1: " + fraction.toDouble()); // 0.75
//
//        System.out.println("Дробь 1 равна дроби 2: " + fraction.equals(fraction2));

        //ЗАДАНИЕ 2

//        Meowable cat1 = new Cat("Барсик");
//        Meowable cat2 = new Cat("Мурзик");
//
//        // Оборачиваем котов в декораторы для подсчета мяуканий
//        Meowable decoratedCat1 = new MeowCountDecorator(cat1);
//        Meowable decoratedCat2 = new MeowCountDecorator(cat2);
//
//        // Создаем список котов
//        List<Meowable> cats = new ArrayList<>();
//        cats.add(decoratedCat1);
//        cats.add(decoratedCat2);
//
//        // Передаем список котов в метод meowsCare
//        Funs.meowsCare(cats);
//
//        // Выводим количество мяуканий каждого кота
//        MeowCountDecorator countDecorator1 = (MeowCountDecorator) decoratedCat1;
//        MeowCountDecorator countDecorator2 = (MeowCountDecorator) decoratedCat2;
//
//
//        System.out.println("Барсик мяукал " + countDecorator1.getMeowCount() + " раз");
//        System.out.println("Мурзик мяукал " + countDecorator2.getMeowCount() + " раз");


        //Задание 3

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество элементов в списке: ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//
//        List<String> inputList = new ArrayList<>();
//
//        System.out.println("Введите элементы списка (можно вводить числа, строки и т.д.):");
//        for (int i = 0; i < n; i++) {
//            String element = scanner.nextLine();
//            inputList.add(element);
//        }
//
//        List<String> outputList = removeDuplicates(inputList);
//
//        System.out.println("Список после удаления дубликатов: " + outputList);
//
//        // Закрываем сканер
//        scanner.close();

        //Задание 4

//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("/Users/platonkapustin/IdeaProjects/laba5/src/input.txt"));
//
//            int N = Integer.parseInt(reader.readLine());
//            int M = Integer.parseInt(reader.readLine());
//
//            Map<String, Integer> athleteScores = new HashMap<>();
//
//            for (int i = 0; i < N; i++) {
//                String line = reader.readLine();
//                String[] parts = line.split(" ");
//
//                String name = parts[0] + " " + parts[1];
//                int totalScore = 0;
//
//                for (int j = 2; j < 2 + M; j++) {
//                    totalScore += Integer.parseInt(parts[j]);
//                }
//
//                athleteScores.put(name, totalScore);
//            }
//            reader.close();
//
//            printAthleteRanking(athleteScores);
//
//        } catch (IOException e) {
//            System.out.println("Ошибка при чтении файла: " + e.getMessage());
//        }

        //Задание 5

        String filePath = "/Users/platonkapustin/IdeaProjects/laba5/src/file.txt";

        try {
            Set<Character> resultSet = findUniqueCharactersInFile(filePath);

            System.out.println("Символы, встречающиеся в одном и только в одном слове:");
            if (resultSet.isEmpty()) {
                System.out.println("Нет символов, которые встречаются только в одном слове.");
            } else {
                for (Character ch : resultSet) {
                    System.out.println(ch);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //ЗАДАНИЕ 6

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество элементов в списке: ");
//        int size = scanner.nextInt();
//        scanner.nextLine();
//
//        List<String> list = new ArrayList<>();
//
//        System.out.println("Введите строки:");
//        for (int i = 0; i < size; i++) {
//            System.out.print("Строка " + (i + 1) + ": ");
//            list.add(scanner.nextLine());
//        }
//
//        System.out.println("Введенный список: " + list);
//
//        Queue<String> L1 = new LinkedList<>(list);
//
//        Queue<String> L2 = reverseQueue(L1);
//
//        System.out.println("Очередь L2 после переноса из L1 в обратном порядке: " + L2);


        //ЗАДАНИЕ 7.1

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество точек");
//        int N = scanner.nextInt();  // количество спортсменов\
//        scanner.nextLine();  // Переход на новую строку после ввода чисел
//
//        // Используем TreeMap для хранения спортсменов по фамилии и имени
//        Map<String, Integer> athleteScores = new HashMap<>();
//        List<Point> points = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            System.out.println("Введите X для точки " + (i + 1) + ":");
//            int X = scanner.nextInt();
//            System.out.println("Введите Y для точки " + (i + 1) + ":");
//            int Y = scanner.nextInt();
//            points.add(new Point(X, Y));
//        }
//
//
//        // Преобразование и обработка данных с использованием Stream API
//        Polyline polyline = new Polyline(
//                points.stream()
//                        // Убираем дублирующиеся точки
//                        // Преобразуем отрицательные Y в положительные
//                        .map(point -> new Point(point.x, Math.abs(point.y)))
//                        .distinct()
//                        // Сортируем по координате X
//                        .sorted(Comparator.comparingInt(point -> point.x))
//                        // Собираем результат в список
//                        .collect(Collectors.toList())
//        );
//
//        // Вывод результата
//        System.out.println(polyline);
//        scanner.close();

        //ЗАДАНИЕ 7.2

//        Path path = Paths.get("/Users/platonkapustin/IdeaProjects/laba5/src/text.txt");
//
//        try {
//            // Чтение строк из файла, обработка и группировка
//            Map<Integer, List<String>> groupedPeople = Files.lines(path)
//                    .filter(line -> line.contains(":")) // Фильтрация строк с номером
//                    .map(line -> {
//                        // Разделяем строку на имя и номер только если строка корректная
//                        String[] parts = line.split(":");
//                        if (parts.length != 2) {
//                            return null; // Игнорируем строку, если нет разделителя ':'
//                        }
//
//                        String name = parts[0].trim();
//                        String numberStr = parts[1].trim();
//
//                        // Преобразуем строку в число и форматируем имя
//                        try {
//                            int number = Integer.parseInt(numberStr);
//                            // Приводим имя к нужному формату (первую букву заглавной)
//                            String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
//                            return new AbstractMap.SimpleEntry<>(formattedName, number);
//                        } catch (NumberFormatException e) {
//                            return null; // Игнорируем людей без номера
//                        }
//                    })
//                    .filter(Objects::nonNull) // Убираем null (людей без номеров)
//                    .collect(Collectors.groupingBy(
//                            Map.Entry::getValue, // Группируем по номеру
//                            Collectors.mapping(Map.Entry::getKey, Collectors.toList()) // Собираем имена в список
//                    ));
//
//            // Выводим результат
//            System.out.println(groupedPeople);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (!seen.contains(item)) {
                seen.add(item);
                result.add(item);
            }
        }

        return result;
    }

    public static void printAthleteRanking(Map<String, Integer> athleteScores) {
        List<Map.Entry<String, Integer>> athleteList = new ArrayList<>(athleteScores.entrySet());
        athleteList.sort((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

        System.out.println("\nРезультаты:");
        int currentPlace = 1;
        int currentScore = athleteList.get(0).getValue();

        for (int i = 0; i < athleteList.size(); i++) {
            Map.Entry<String, Integer> entry = athleteList.get(i);
            String athleteName = entry.getKey();
            int totalScore = entry.getValue();

            if (i > 0 && totalScore < currentScore) {
                currentPlace = currentPlace+1;
            }
            currentScore = totalScore;

            System.out.println(athleteName + " " + totalScore + " " + currentPlace);
        }
    }


    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        Queue<T> resultQueue = new LinkedList<>();

        while (!queue.isEmpty()) {

            int size = queue.size() - 1;
            for (int i = 0; i < size; i++) {
                queue.add(queue.poll());
            }
            T last = queue.poll();
            resultQueue.add(last);
        }

        return resultQueue;
    }

    public static Set<Character> findUniqueCharactersInFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        List<Set<Character>> wordCharacterSets = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            String[] lineWords = line.split("\\s+");

            for (String word : lineWords) {
                Set<Character> uniqueCharsInWord = new HashSet<>();

                for (char ch : word.toCharArray()) {
                    uniqueCharsInWord.add(ch);
                }
                wordCharacterSets.add(uniqueCharsInWord);
            }
        }
        reader.close();

        Set<Character> allCharacters = new HashSet<>();
        Set<Character> duplicateCharacters = new HashSet<>();

        for (Set<Character> charSet : wordCharacterSets) {
            for (Character ch : charSet) {
                if (!allCharacters.add(ch)) {
                    duplicateCharacters.add(ch);
                }
            }
        }

        allCharacters.removeAll(duplicateCharacters);

        return allCharacters;
    }
}
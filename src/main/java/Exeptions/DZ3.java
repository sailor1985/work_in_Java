package Exeptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Finish {
        public static void main(String[] args) {
            // Запрашиваем у пользователя все необходимые данные
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные в следующем порядке: Фамилия Имя Отчество дата рождения номер телефона пол");
            String input = scanner.nextLine();
            scanner.close();

            // Разделяем полученную строку на отдельные значения
            String[] values = input.split("\\s+");

            // Проверяем количество полученных значений требуемому
            validateValues(values);

            // Проверяяем формат каждого параметра
            String surname = validateString(values[0], "Фамилия");
            String name = validateString(values[1], "Имя");
            String patronymic = validateString(values[2], "Отчество");
            String birthday = validateDate(values[3]);
            String phoneNumber = validatePhoneNumber(values[4]);
            String gender = validateGender(values[5]);

            // Создаем файл и записываем данные
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(surname + ".txt", true));
                writer.write(surname + " " + name + " " + patronymic+ " " + birthday + " " + phoneNumber+ " " + gender);
                writer.newLine();
                writer.close();
                System.out.println("Данные успешно записаны в файл.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Функция проверки количества полученных значений требуемому
        private static void validateValues (String[] values) throws ArrayIndexOutOfBoundsException {
                try {
                    if (values.length < 6) {
                        throw new ArrayIndexOutOfBoundsException("Ошибка: введено меньшее количество данных, чем требуется (должно быть 6 значений)");
                    } else if (values.length > 6) {
                        throw new ArrayIndexOutOfBoundsException("Ошибка: введено большее количество данных, чем требуется (должно быть 6 значений)");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
        }

        // Проверяем, что переданная строка состоит только из букв
        private static String validateString(String value, String field) {
            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher matcher = pattern.matcher(value);
            if (!matcher.matches()) {
                System.err.println("Ошибка: некорректное значение поля " + field + ".");
                System.exit(1);
            }
            return value;
        }

        // Проверяем, что переданная строка является корректной датой в формате dd.mm.yyyy
        private static String validateDate(String value) {
            Pattern pattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
            Matcher matcher = pattern.matcher(value);
            if (!matcher.matches()) {
                System.err.println("Ошибка: некорректное значение поля дата рождения.");
                System.exit(1);
            }
            // Проверить, что дата соответствует реальной дате
            // ...
            return value;
        }

        // Проверяем, что переданная строка является корректным номером телефона (целое беззнаковое число без форматирования)
        private static String validatePhoneNumber(String value) {
            Pattern pattern = Pattern.compile("^\\d+$");
            Matcher matcher = pattern.matcher(value);
            if (!matcher.matches()) {
                System.err.println("Ошибка: некорректное значение поля номер телефона.");
                System.exit(1);
            }
            return value;
        }

        // Проверяем, что переданный символ является 'f' или 'm'
        private static String validateGender(String value) {
            if (!value.equals("f") && !value.equals("m")) {
                System.err.println("Ошибка: некорректное значение поля пол.");
                System.exit(1);
            }
            return value;
        }
    }


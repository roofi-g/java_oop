package err;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class task33 {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите следующие данные: ФИО (по порядку), дата рождения, номер телефона, пол(f/m): \n");
        String enteredData = in.nextLine();
        in.close();
        String[] userData = enteredData.split(" ");

        checkingForQuantity(userData);

        String[] newUserData = getNewArrayWithData(userData);

        methodOfAddingDataToAFile(newUserData);

    }

    private static void methodOfAddingDataToAFile(String[] newUserData) throws IOException {

        String surname = newUserData[0];

        try(FileWriter writer = new FileWriter(surname + ".txt", true))
        {
            for (String data : newUserData) {
                writer.append('<');
                writer.write(data);
                writer.append('>');
            }
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println("ошибка записи файла");
            throw ex;
        }
    }

    public static void checkingForQuantity(String[] data) throws Exception {
        if (data.length == 6 & Arrays.stream(data).noneMatch(String::isEmpty)) {
            System.out.printf("Данные добавлены: %s \n", Arrays.toString(data));
        } else {
            throw new Exception("меньше или больше веденных данных");
        }
    }

    public static String[] getNewArrayWithData(String[] userData) throws Exception {

        String[] newUserData = new String[6];

        for (String data : userData) {

                if (data.matches("^[a-zA-Zа-яА-Я]*$")) {
                    if (data.length() == 1) {
                            if ((data.contains("f") | data.contains("m"))) {
                                newUserData[5] = data;
                            } else {
                                throw new RuntimeException("введен некорректный пол");
                            }
                    } else {
                        if (newUserData[0] == null) {
                            newUserData[0] = data;
                        } else if (newUserData[1] == null) {
                            newUserData[1] = data;
                        } else {
                            newUserData[2] = data;
                        }
                    }
                }

                else if (data.contains(".")) {
                    if (checkingTheDateOfBirth(data)) {
                        newUserData[3] = data;
                    }
                }
                else if (checkingTheNumber(data)) {
                    newUserData[4] = data;
                }
        }
        return newUserData;
    }

    public static boolean checkingTheNumber(String str) throws WrongNumberException {

        Long.parseLong(str);
        if (str.length() == 11) {
            return true;
        } else {
            throw new WrongNumberException("некорректный номер телефона");
        }
    }

    public static boolean checkingTheDateOfBirth(String data) throws Exception {

            if (data.length() == 10) {
                return true;
            } else {
                throw new Exception("некорректная дата рождения");
            }
    }
}


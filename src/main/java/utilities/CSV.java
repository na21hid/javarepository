package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //this function will read data from a CSV file and return as list
    public static List<String[]> read(String file){
        String dataRow;

        List<String[]> data = new LinkedList<String[]>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((dataRow = bufferedReader.readLine()) != null) {

                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }

        } catch (FileNotFoundException e) {
            System.out.println(" could not find file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("could not read file");
            e.printStackTrace();
        }

        return data;
    }

//    //Delimiter used in CSV file
//    private static final String COMMA_DELIMITER = ",";
//    private static final String NEW_LINE_SEPARATOR = "\n";
//
//    //CSV file header
//    private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

//    public static void writeCsvFile(String fileName) {
//
//        //Create new students objects
//        Human human = new Human();
//
//        //Create a new list of student objects
//        List students = new ArrayList();
//        students.add(human);
//
//
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter(fileName);
//
//            //Write the CSV file header
//            fileWriter.append(FILE_HEADER.toString());
//
//            //Add a new line separator after the header
//            fileWriter.append(NEW_LINE_SEPARATOR);
//
//            //Write a new student object list to the CSV file
//            for (Student student : students) {
//                fileWriter.append(String.valueOf(student.getId()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(student.getFirstName());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(student.getLastName());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(student.getGender());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(student.getAge()));
//                fileWriter.append(NEW_LINE_SEPARATOR);
//            }


//
//            System.out.println("CSV file was created successfully !!!");
//
//        } catch (Exception e) {
//            System.out.println("Error in CsvFileWriter !!!");
//            e.printStackTrace();
//        } finally {
//
//            try {
//                fileWriter.flush();
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("Error while flushing/closing fileWriter !!!");
//                e.printStackTrace();
//            }
//
//        }
//    }
//}
}

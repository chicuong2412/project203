package services;

import enity.Account;
import enity.Course;
import java.io.*;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author admin
 */
public class FileServices{
    
    public static void writeFileExcel(String name, ArrayList<Course> courses) {
        try {
            File file1 = new File("data\\"+name+".xlsx");
            FileOutputStream file = new FileOutputStream("data\\"+name+".xlsx");
            XSSFWorkbook fileExcel = new XSSFWorkbook();
            XSSFSheet data = fileExcel.createSheet("data");
            XSSFRow row;
            XSSFCell cell;
            String[] cata = {"ID", "Name", "Credit", "Reference", "GPA", "Score", "Status", "Prerequisites"};
            row = data.createRow(0);
            for (int j = 0; j <= 7; j++) {
                cell = row.createCell(j);
                cell.setCellValue(cata[j]);
            }
            ArrayList<Object> dataStore;
            int k = 1;
            for (Course each : courses) {
                row = data.createRow(k);
                dataStore = CourseServices.toArrayList(each);
                cell = row.createCell(0);
                cell.setCellValue(String.valueOf(dataStore.get(0)));
                cell = row.createCell(1);
                cell.setCellValue(String.valueOf(dataStore.get(1)));
                cell = row.createCell(2);
                cell.setCellValue(Integer.parseInt(String.valueOf(dataStore.get(2))));
                cell = row.createCell(3);
                cell.setCellValue(String.valueOf(dataStore.get(3)));
                cell = row.createCell(4);
                cell.setCellValue(Double.parseDouble(String.valueOf(dataStore.get(4))));
                cell = row.createCell(5);
                cell.setCellValue(Double.parseDouble(String.valueOf(dataStore.get(5))));
                cell = row.createCell(6);
                //(String.valueOf(dataStore.get(5)).equalsIgnoreCase("true"))?true:false
                cell.setCellValue((String.valueOf(dataStore.get(6))));
                cell = row.createCell(7);
                cell.setCellValue(String.valueOf(dataStore.get(7)));
                k++;
            }
            try {
                fileExcel.write(file);
                file.close();
            } catch (IOException ex) {
            }
        } catch (FileNotFoundException ex) {
        }
    }

    public static ArrayList<Course> readFileExcel(String name) {
        try {
            ArrayList<Course> courses = new ArrayList<>();
            FileInputStream file = new FileInputStream("data\\"+name+".xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheet("data");
            FormulaEvaluator formula = wb.getCreationHelper().createFormulaEvaluator();
            int i = 0;
            for (Row row : sheet) {
                if (i == 0) {
                    i = 1;
                    continue;
                }
                ArrayList<Object> information = new ArrayList<>();
                int h = 1;
                for (Cell cell : row) {
                    CellType z = formula.evaluate(cell).getCellType();
                    switch(z) {
                        case STRING:
                            information.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            information.add(cell.getNumericCellValue());
                            break;
                    }
                }
                ArrayList<String> tempt = new ArrayList<>();
                String prerequisites = String.valueOf(information.get(7));
                for(int j = 0; j < prerequisites.split(" ").length; j++) {
                    tempt.add(prerequisites.split(" ")[j]);
                }
                Course course = new Course(String.valueOf(information.get(0)), 
                        String.valueOf(information.get(1)),
                        (int)Double.parseDouble(String.valueOf(information.get(2))),
                String.valueOf(information.get(3)),
                Double.parseDouble(String.valueOf(information.get(4))),
                Double.parseDouble(String.valueOf(information.get(5))),
                (String.valueOf(information.get(6)).equalsIgnoreCase(("true")))?true:false,
                tempt);
                courses.add(course);
            }
            return courses;
        } catch (IOException ex) {
        }
        return null;
    }
    
    public static void copyExcelFile(String name){
        try {
            File sourse = new File("course.xlsx");
            File des = new File("data\\" + name + ".xlsx");
            checkIfFolderExistToCreate("data\\" + name + ".xlsx");
            FileUtils.copyFile(sourse, des);
            
        } catch (Exception ex) {
        }
    }
    
    public static void checkIfFolderExistToCreate(String path) {
        File file = new File(path);
        File folder = new File(file.getParent());
        if (!folder.exists()) {
            folder.mkdirs();
        } else if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
            }
        }
    }
    
    public static void saveAccountByByte(ArrayList<Account> accounts, boolean add) {
        File file = new File("accounts.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
            }
        }
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("accounts.txt", add));
            DataOutputStream dos = new DataOutputStream(bos);
            for (Account each: accounts) {
                byte[] byteData1 = each.getUsername().getBytes();
                byte[] byteData2 = each.getPassword().getBytes();
                byte[] byteData3 = each.getFullName().getBytes();
                byte[] byteData4 = each.getStudentID().getBytes();
                byte[] byteData5 = (each.isGender() == true) ? "true".getBytes():"false".getBytes();
                try {
                    int size = byteData1.length;
                    dos.writeInt(size);
                    bos.write(byteData1);
                    size = byteData2.length;
                    dos.writeInt(size);
                    bos.write(byteData2);
                    size = byteData3.length;
                    dos.writeInt(size);
                    bos.write(byteData3);
                    dos.writeInt(each.getYearAttend());
                    size = byteData4.length;
                    dos.writeInt(size);
                    bos.write(byteData4);
                    size = byteData5.length;
                    dos.writeInt(size);
                    bos.write(byteData5);
                    dos.flush();

                } catch (IOException ex) {
                }
            }
            try {
                dos.close();
            } catch (IOException ex) {
            }

        } catch (FileNotFoundException ex) {
        }
    }
    
    
    public static ArrayList<Account> readAccountByByte() {
        File folder = new File("accounts.txt");
        ArrayList<Account> listAcc = new ArrayList<>();
        if (folder.exists()) {
            try {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("accounts.txt"));
                DataInputStream dis = new DataInputStream(bis);
                try {
                    while (dis.available() > 0) {
                        int size = dis.readInt();
                        byte [] data = new byte[size];
                        dis.read(data);
                        String name = new String(data);
                        size = dis.readInt();
                        data = new byte[size];
                        dis.read(data);
                        String password = new String(data);
                        size = dis.readInt();
                        data = new byte[size];
                        dis.read(data);
                        String fullName = new String(data);
                        int yearAttend = dis.readInt();
                        size = dis.readInt();
                        data = new byte[size];
                        dis.read(data);
                        String studentID = new String(data);
                        size = dis.readInt();
                        data = new byte[size];
                        dis.read(data);
                        boolean gender = ((new String(data).equalsIgnoreCase("true"))? true: false);
                        Account acc = new Account(
                         name, 
                                password,
                                fullName, 
                                yearAttend, 
                                studentID, 
                                gender);
                        listAcc.add(acc); 
                    }
                 dis.close();
                } catch (IOException ex) {
                }
            } catch (FileNotFoundException ex) {
            }
        }
        return listAcc;
    }
    
    public static HashMap<Account, ArrayList<Course>> readAllUsersCourses(){
        HashMap<Account, ArrayList<Course>> usersCourses = new HashMap<>();
        ArrayList<Account> accounts = readAccountByByte();
        for (Account acc: accounts){
            usersCourses.put(acc, readFileExcel(acc.getUsername()));
        }
        return usersCourses;
    }
    
}

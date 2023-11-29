package userDAO;

import enity.Account;
import enity.Course;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import services.FileServices;


public class AllUserProgress {// new AllUserProgess()
    public static HashMap<Account, ArrayList<Course>> data = FileServices.readAllUsersCourses();
    
    
    
    public static ArrayList<Account> getListAccounts(){
        Set<Account> key = data.keySet();
        ArrayList<Account> accounts = new ArrayList<>();
        for (Account acc: key){
            accounts.add(acc);
        }
        return accounts;
    }
    
    public static ArrayList<Course> getListCourses(Account acc){
        return data.get(acc);
    }
    
    public static void setCourses(Account acc, ArrayList<Course> courses){
        data.put(acc, courses);
    }
}

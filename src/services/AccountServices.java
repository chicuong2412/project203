package services;

import accountDAO.AllUserProgress;
import static accountDAO.AllUserProgress.getListAccounts;
import enity.Account;
import java.util.ArrayList;
import java.util.Set;


public class AccountServices {
    
    public static void addAccount(String username, String password, String fullName, int yearAttend){
        Account acc = new Account(username, password, fullName, yearAttend);
        FileServices.copyExcelFile(username);
        ArrayList<Account> listAccounts = AllUserProgress.getListAccounts();
        listAccounts.add(acc);
        FileServices.saveAccountByByte(listAccounts, false);
        AllUserProgress.data = FileServices.readAllUsersCourses();
    }
    
    public static Account getAccount(String username){
        for (Account each: getListAccounts()){
            if (each.getUsername().equals(username)){
                return each;
            }
        }
        return null;
    }
    
    public static boolean checkAccountExisted(String username){
        Set<Account> accounts = AllUserProgress.data.keySet();
        for (Account acc: accounts){
            if (acc.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
}

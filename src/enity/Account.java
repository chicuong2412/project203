package enity;


public class Account {
    private String username;
    private String password;
    private String fullName;
    private int yearAttend;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearAttend() {
        return yearAttend;
    }

    public void setYearAttend(int yearAttend) {
        this.yearAttend = yearAttend;
    }
   
    public Account(String username, 
            String password, String fullName, int yearAttend) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.yearAttend = yearAttend;
    }
 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
     
}

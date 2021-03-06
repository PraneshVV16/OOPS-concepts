public class Encapsulation {
    private String username;
    private String password;

    public void setUsername(String name){
        this.username = name;
    }
    public String getUsername(){
        return username;
    }
    public void  setPassword(String pwd){
        this.password = pwd;
    }
    public String getPassword() {
        return password;
    }
}
class login{
    public static void main(String[] args){
        Encapsulation e = new Encapsulation();
        e.setUsername("xyz@gmail.com");
        e.setPassword("admin123");
        System.out.println("Username : "+e.getUsername());
        System.out.println("Password : "+e.getPassword());
    }
}
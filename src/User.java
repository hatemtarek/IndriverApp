public class User extends SystemUser{

    User(String username , String password , String Mobileno , String Email){
        this.Username = username;
        this.Password = password;
        this.MobileNumber = Mobileno;
        this.Email = Email;
    }
    public void Login(String username, String password) {}
}

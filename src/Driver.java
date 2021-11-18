import java.util.ArrayList;
import java.util.List;

public class Driver extends SystemUser{
    int Balance;
    List<String> FavArea = new ArrayList<String>();
    Driver(String username , String password , String Mobileno , String Email){
        this.Username = username;
        this.Password = password;
        this.MobileNumber = Mobileno;
        this.Email = Email;
    }
    public void Login(String username, String password) {}
    public void AddFavoriteArea(String favouritearea)
    {
        FavArea.add(favouritearea);
    }
    public List ListFavAreasRides()
    {
        return FavArea;
    }
    public void AddToBalance(int price)
    {
        Balance += price;
    }

}

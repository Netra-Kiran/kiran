interface Users
{
    public void login();
    public void logout();
}
class Webuser implements User
{
  @Override
  public void login()
  {
    System.out.println("the webuser is login using pwd:");

  }
 @Override
  public void logout()
  {
    System.out.println("the webuser is logging out");
  }
}
class Admin implements User
{
    @Override
    public void login()
    {
        System.out.println("the admin is login using pwd:");  
    }
    @Override
    public void logout()
    {
        System.out.println("the admin is logging out");
    }
}
class Abstract
{
    public static void main(String[] args) 
    {
      Webuser w1=new Webuser();
      w1.login();
      w1.logout();
      Admin a1=new Admin();
      a1.login();
      a1.logout();  
    }
}
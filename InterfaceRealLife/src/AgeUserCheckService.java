public class AgeUserCheckService implements IUserCheckServ {
    //Method yaz
    public boolean checkUser(User user){
        return user.getAge()>=18;
    }
}

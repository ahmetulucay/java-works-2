public class ComplexUSerCheckServ  implements  IUserCheckServ{
    public boolean checkUser(User user){
        return (user.getAge()>=18 && user.getName().startsWith("Mu"));
    }
}

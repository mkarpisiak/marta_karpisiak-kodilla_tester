public class User {
    private String name;
    private int age;
    private int [] users;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User Peter = new User ("Peter", 23);
        User Asia = new User ("Asia", 21);
        User Marta = new User ("Marta", 33);
        User Darek = new User ("Darek", 32);
        User Laura = new User ("Laura", 4);
        User Amelia = new User ("Amelia", 6);

        User[] users= {Peter, Asia, Marta, Darek, Laura, Amelia};

        public int getAge() {
            return this.age;
        }

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + this.age[i];
        }

        double arythmetic= result % users.length;

        for (int i=0; i <arythmetic; i++) {
            System.out.println(this.name);
        }

    }

}

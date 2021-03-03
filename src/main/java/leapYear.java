public class leapYear {

    public boolean leapYear(int yourYear) {
                return ((yourYear % 4 == 0) && (yourYear % 100 != 0)) || (yourYear % 400 == 0);
    }
}

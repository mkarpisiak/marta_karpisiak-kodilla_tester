public class Grades {
    private int[] grades;
    private int size;            //ile elementów znajduje sie aktualnie w tablicy

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {            //przerwanie jeśli przekroczymy rozmiar tablicy
            return;
        }
        this.grades[this.size] = value;              //dodanie wartości do indeksu
        this.size++;
    }

    public int lastAdd(){
        int result;
        result= this.size;
        return result;
    }

    public int sum(){
        int sum= 0;
        for (int i=0; i<grades.length; i++){
            sum = sum + grades[1];
        }

        //illegal start of expression?
        public int aryth(){
            int aryth= 0;
            aryth= sum/ grades.length;
            return aryth;
        }
    }

}
//    dodającą przekazaną w argumencie ocenę do tablicy,
//        zwracającą ostatnio dodaną ocenę,
//        zwracającą średnią ocen.
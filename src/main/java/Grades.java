public class Grades {
    private int[] grades;
    private int size;
    private double result;

    public Grades() {
        this.grades = new int[10];
        this.size=0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastNumber (){
        return (this.grades[this.size]);
    }

    public double arithmeticMean (){
        for (int i = 0; i <= this.size; i++) {
            result= result+ grades[1] % this.size;
        }
        return result;
    }
}

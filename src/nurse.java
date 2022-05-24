public class nurse extends employee{
    public String $assingPatients$;
    public double salery;
    public int $roomNumber$;
    public nurse(){}
    public nurse(int $roomNumber$,String $assingPatients$){
        this.$assingPatients$=$assingPatients$;
        this.$roomNumber$=$roomNumber$;
    }

    public void set$roomNumber$(int $roomNumber$) {
        this.$roomNumber$ = $roomNumber$;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public void set$assingPatients$(String $assingPatients$) {
        this.$assingPatients$ = $assingPatients$;
    }

    public int get$roomNumber$() {
        return $roomNumber$;
    }

    public double getSalery() {
        return salery;
    }

    public String get$assingPatients$() {
        return $assingPatients$;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "$ID=" + $ID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                "$assingPatients$='" + $assingPatients$ + '\'' +
                ", salery=" + salery +
                ", $roomNumber$=" + $roomNumber$ +
                '}'+"\n";
    }
}

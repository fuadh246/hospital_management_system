public class employee {
    public int $ID;
    public String name;
    public String position;
    public employee(){
    }

     public employee(int $ID,String name,String position){
         this.$ID = $ID;
         this.name = name;
         this.position = position;
     }

    public void set$ID(int $ID) {
        this.$ID = $ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int get$ID() {
        return $ID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "employee{" +
                "$ID=" + $ID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

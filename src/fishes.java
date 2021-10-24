class fishes{
    void var(){System.out.println("Varieties of fishes by their color ...");}
}

class fish extends fishes{
    void fishcol(){System.out.println("We have a  orange color fish...");}
}

class project2{
    public static void main(String args[]){
        fish d=new fish();
        d.var();
        d.fishcol();
    }
}

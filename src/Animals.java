class Animals{
    void var(){System.out.println("Varieties of Animals by their color ...");}
}

class Dog extends Animals{
    void dogcol(){System.out.println("We have a  White color Dog...");}
}

class program1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.var();
        d.dogcol();
    }
}

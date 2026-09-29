// package enumeration;

// public class Enum {
//     public static void main(String args[]){
// Status ss[]=Status.values();
// for(Status s:ss){
// System.out.println(s+":" +""+s.ordinal());
// }
// }
// }

// enum Status{
//     success,pending,failed,tryAgain; //constant
//  }


public class Enum{
    public static void main(String args[]){
       
        for(Laptop lap:Laptop.values()){
            System.out.println(lap+":"+lap.getprice());
        }


    }
}



enum Laptop{
    macbook(3000),xps(4000),surface(3000),gps;

    private int price;

    private Laptop(){
        this.price=699;
    }
    private Laptop (int price){
        this.price=price;
    }

    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price=price;

    }

}
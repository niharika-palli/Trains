package Train;

abstract class user {
    String name;
    int contactnumber;
    String address;
    float age;
    char Gender;
    String Startingaddress;
    String destinationaddress;
    user(){
    }
    user(String name,int contactnumber,String address,float age,char Gender,String Startingaddress,
            String destinationaddress){
        this.name=name;
        this.contactnumber=contactnumber;
        this.address=address;
        this.age=age;
        this.Gender=Gender;
        this.Startingaddress=Startingaddress;
        this.destinationaddress=destinationaddress;
    }
}

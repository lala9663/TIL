package online.Chapter2.day03;

public class Person {

    public String name;

    public int age;

    public int height;

    public int weight;

    public String gender;

    public Person(){}

    public Person(String name, int age, int height, int weight, String gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }
    public String showUserInfo(){
        return "키가" + height + "이고 몸무게가 " + weight + "킬로인" +  gender + "이 있습니다. 이름은" + name  + "이고 나이는 " + age + "세 입니다.";
    }

//    public  String getName(){
//        return name;
//    }
    public  void setName(String name1){
        name = name1;
    }

}

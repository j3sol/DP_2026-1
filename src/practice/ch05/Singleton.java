package practice.ch05;

//싱글톤 패턴 적용하기
public class Singleton {
   
   // (3) Singleton 객체를 미리 만들어서 static 변수에 저장해 놓는다.
     private static Singleton singleton = new Singleton(); //싱글턴 객체가 미리 만들어져 있기 때문에 getInstance를 호출하면 항상 같은 객체가 반환됩니다.
    //만들어서 class에 속하도록 static을 붙여서 클래스가 로딩될 때 객체가 만들어지도록 합니다.
    //싱글턴 객체가 만들어지는 시점은 클래스가 처음 로딩될 때입니다. 클래스가 로딩될 때 static 변수인 singleton이 초기화되면서 Singleton 객체가 생성됩니다. 이후 getInstance 메소드를 호출하면 항상 같은 singleton 객체가 반환됩니다. 


    // (1) 생성자를 private으로 한다.
    private Singleton() {
        System.out.println("싱글톤 객체가 생성됩니다.");
    }

    // (2) Singleton 객체를 얻어가는 static 메소드를 정의한다.
    public static Singleton getInstance() {
        return new singleton();
    } //싱글턴 객체가 생성되기 전에 getInstance를 호출할 수 있게 해야함. 객체 생성을 위에서 막아둬서 메소드를 호출 하려면 static을 붙여서 클래스에 속하도록 해야함

    

}

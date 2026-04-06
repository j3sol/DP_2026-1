package practice.ch05;

public class Main {
    public static void main(String[] args) {
        //Singleton s1 = new Singleton(); //컴파일 에러: 생성자가 private이므로 외부에서 객체를 생성할 수 없습니다.
        Singleton s2 = Singleton.getInstance(); //싱글톤 객체를 얻어가는 static 메소드를 호출하여 객체를 생성합니다.
        Singleton s3 = Singleton.getInstance(); //다시 getInstance를 호출해도 새로운 객체가 생성됩니다. 싱글톤 패턴이 적용되지 않음!!!
    
        System.out.println("s2:"   +s2); //s2:practice.ch05.Singleton@123772c4
        System.out.println("s3:"   +s3); //s3:practice.ch05.Singleton@59690aa4
        //주소가 다름 다른 객체 두개가 만들어짐
   
        if (s2 == s3) {
            System.out.println("s2와 s3는 같은 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 객체입니다.");
        }

        Singleton2 s4 = Singleton2.INSTANCE; //enum의 상수인 INSTANCE를 통해 싱글톤 객체를 얻어옵니다.
        s4.hello();
    }

}

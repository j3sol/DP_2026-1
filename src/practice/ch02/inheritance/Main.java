package practice.ch02.inheritance;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("HEllo, World");
        banner.showWithParen();
        banner.showWithAster();

        
        Print print = new PrintBannerAdapter01("Hello,World");
        print.printWeak();
        print.printStrong();
    }
}

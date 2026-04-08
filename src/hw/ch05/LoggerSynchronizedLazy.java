package hw.ch05;

public class LoggerSynchronizedLazy {

    private static LoggerSynchronizedLazy instance; //null로 초기화하여 필요할 때 생성
    private StringBuilder logBuffer;

    private LoggerSynchronizedLazy() {
        System.out.println("[LoggerSynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    public static synchronized LoggerSynchronizedLazy getInstance() { // getInstance()에 synchronized를 붙여서 여러 스레드가 동시에 접근할 때도 안전하게 인스턴스를 생성하도록 보장
        if (instance == null) {  //인스턴스가 아직 생성되지 않았다면 실행 - 지연 초기화 
            instance = new LoggerSynchronizedLazy();
        }
        return instance;
    }

    public void log(String message) { //동기화된 로그 메서드
        logBuffer.append("[")
                .append(System.currentTimeMillis())
                .append("] ")
                .append(message)
                .append("\n");

        System.out.println("[LoggerSynchronizedLazy] " + message);
    }

    public String getLog() {  
        return logBuffer.toString();
    }
}
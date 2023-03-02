public class Log {
    private StringBuilder oLog = new StringBuilder();

    public StringBuilder getLog() {
        return oLog;
    }

    public void addlog(String bild){
        oLog.append(bild + "\n");


    }

}
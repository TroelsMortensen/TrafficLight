package simpletrafficlight;

public interface Subject {

    void addListener(Listener lstnr);
    void removeListener(Listener lstnr);

}

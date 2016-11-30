package ex1;

import java.io.IOException;

public interface Ex3_Message {
    public void addWriter(String msg);
    public String getView();
    public void remove() throws IOException;
}

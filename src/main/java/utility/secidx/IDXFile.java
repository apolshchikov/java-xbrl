package utility.secidx;

import org.joda.time.DateTime;

public class IDXFile {
    private String description;
    private DateTime lastDataReceived;
    private String[] idxData;

    public IDXFile(String description, DateTime lastDataReceived, String[] idxData) {
        this.description = description;
        this.lastDataReceived = lastDataReceived;
        this.idxData = idxData;
    }
}

package utility.secidx;

import org.joda.time.DateTime;

public class IDX {
    private String companyName;
    private String formType;
    private String CIK;
    private DateTime dateFiled;
    private String fileName;

    public IDX(String companyName, String formType, String CIK, DateTime dateFiled, String fileName) {
        this.companyName = companyName;
        this.formType = formType;
        this.CIK = CIK;
        this.dateFiled = dateFiled;
        this.fileName = fileName;
    }
}

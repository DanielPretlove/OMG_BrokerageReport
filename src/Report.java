public class Report {
    private int Txnid;
    private String PreviousTimestamp;
    private String LatestTimestamp;
    private String Account;
    private String Adviser;
    private double Value;

    public Report(int txnid, String previoustimepstamp, String latestTimestamp, String account, String adviser, double value)
    {
        super();
        this.Txnid = txnid; 
        this.PreviousTimestamp = previoustimepstamp;
        this.LatestTimestamp = latestTimestamp;
        this.Account = account;
        this.Adviser = adviser;
        this.Value = value;
    }

    public int getTxnid() {
        return Txnid;
    }

    public String getPreviousTimestamp() {
        return PreviousTimestamp.toString();
    }
    public String getLatestTimestamp() {
        return LatestTimestamp.toString();
    }

    public String getAccount() {
        return Account;
    }

    public String getAdviser() {
        return Adviser;
    }

    public double getValue() {
        return Value;
    }

    @Override
    public String toString() {
        return String.format("User: %s\n\n%s\n\t%,.2f\n%s -> %s\n\n", Account, Adviser, Value, PreviousTimestamp, LatestTimestamp);
    }

}

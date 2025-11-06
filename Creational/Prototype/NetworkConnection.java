import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    
    private String ip;
    private String impData;
    private List<String> domains = new ArrayList<>();
    
    
    public NetworkConnection() {
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public NetworkConnection(String ip, String impData) {
        this.ip = ip;
        this.impData = impData;
    }
    
    public String getIp() {
        return ip;
    }
    public String getImpData() {
        return impData;
    }

  

    public void setIp(String ip) {
        this.ip = ip;
    }
    public void setImpData(String impData) {
        this.impData = impData;
    }

    public void loadVeryImportantData() throws InterruptedException
    {
        this.impData="Very very important Data";

        domains.add("www.google.com");
        domains.add("www.facebbok.com");
        domains.add("www.instagran.com");
        domains.add("www.linkedin.com");
        Thread.sleep(5000);
        //It will take 5 seconds to create first object and then for second object it will not take time 
    }

    @Override
    public String toString()
    {
        return this.ip+ " : " + this.impData+ " : " + this.domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        //Logic for clonning - implementing deep copy
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImpData(this.getImpData());
        for(String d : this.getDomains())
        {
            networkConnection.getDomains().add(d);
        }
        return networkConnection;


        // return super.clone();
        
    }

}

import java.sql.SQLOutput;

public class MyServices {
    private ApiService apikey;
    public MyServices(ApiService apikey){
        this.apikey=apikey;
    }
    public String displayName(int id){
        return apikey.getName(id);
    }
}

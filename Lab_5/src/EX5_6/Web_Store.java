package EX5_6;

public class Web_Store extends Store{
    private String internetAddress;
    private String language;

    public Web_Store(String name, String internetAddress, String language) {
        super(name);
        this.internetAddress = internetAddress;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Web_Store{" + " name='"+super.getName()+", "+
                "internetAddress='" + internetAddress + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

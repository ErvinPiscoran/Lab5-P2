/*Creati o clasa ( la alegerea voastra ) care este extinsa de alte 2 clase.
Pentru clasa parinte creati un constructor care initializeaza toate campurile clasei.
Pentru clasele mostenitoare, constructorul va apela constructorul din clasa parinte,
 iar pentru campuri creati getter si setter.*/
class Band {
    private String bandName;
    private int bandYear;
    public Band(String bandName, int bandYear){
        this.bandName=bandName;
        this.bandYear=bandYear;
    }
    public String getBandName(){
        return bandName;
    }
    public void setBandName(String bandName){
        this.bandName=bandName;
    }
    public int getBandYear(){
        return bandYear;
    }
    public void setBandYear(int bandYear){
        this.bandYear=bandYear;
    }
}
class Guitarist extends Band {
    private String guitaristName;
    public Guitarist(String bandName, int bandYear, String guitaristName){
        super(bandName,bandYear);
        this.guitaristName=guitaristName;
    }
    public String getGuitaristName(){
        return guitaristName;
    }

    public void setGuitaristName(String guitaristName) {
        this.guitaristName = guitaristName;
    }
}
class Drummer extends Band {
    private String drummerName;
    public Drummer(String bandName, int bandYear, String drummerName){
        super(bandName,bandYear);
        this.drummerName=drummerName;
    }
    public String getDrummerName(){
        return drummerName;
    }
    public void setDrummerName(String drummerName){
        this.drummerName=drummerName;
    }
}
public class Main {
    public static void main(String[] args){
        Guitarist angus=new Guitarist("acdc",1970,"Angus Young");
        Drummer phil=new Drummer("ACDC", 1971,"Phil Rudd");
        System.out.println("Guitarist name:"+angus.getGuitaristName());
        System.out.println("Guitarist band name:"+angus.getBandName());
        System.out.println("Guitarist band year:"+angus.getBandYear());
        angus.setGuitaristName("The Guitar God");
        System.out.println("Guitarist new name:"+angus.getGuitaristName());
    }
}

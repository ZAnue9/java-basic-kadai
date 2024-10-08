package text.kadai_018;
public abstract class Kato_Chapter18 {
    // フィールド
    public String familyName;   
    public String givenName;    
    public String address;      


    
    public abstract void eachIntroduce();

    
    public void execIntroduce() {
        eachIntroduce();    
    }
}
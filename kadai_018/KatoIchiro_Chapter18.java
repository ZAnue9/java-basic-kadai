package text.kadai_018;
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタで名をセット
    public KatoIchiro_Chapter18() {
        this.givenName = "一郎";
    }
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです。");
    }
}
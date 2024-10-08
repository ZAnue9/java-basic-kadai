package text.kadai_018;
public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 各インスタンスを作成し、紹介を実行
        Kato_Chapter18 taro = new KatoTaro_Chapter18();
        Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
        Kato_Chapter18 hanako = new KatoHanako_Chapter18();
        

        taro.execIntroduce();
        ichiro.execIntroduce();
        hanako.execIntroduce();
    }
}
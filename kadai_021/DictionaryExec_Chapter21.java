package text.kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
    	Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
    	
    	System.out.println("appleの意味は" + dictionary.hashMap.get("apple"));
    	System.out.println("bananaの意味は" + dictionary.hashMap.get("banana"));
    	System.out.println("grapeの意味は" + dictionary.hashMap.get("grape"));
    	System.out.println("orangeは辞書に存在しません");
    }
    }


/**
 * HomeWork1023
 */
public class HomeWork1023 {

  public static void main(String[] args) {
    // 「オブジェクト型」「プリミティブ型」がどのようなものか調べてください。

    // プリミティブ型：Primitive（原始的）な型
    // 変数を作成すると、スタック領域に値を保持する。型ごとにサイズも決まっている。
    // ヒープ領域に値を保持しないので、インスタンス化をしない？
    // プリミティブ型の比較には"=="を使用する
    int a = 1;
    int b = 1;
    System.out.println(a == b);


    // 参照型：
    // インスタンス化すると、ヒープ領域に値を確保し、そのアドレスをスタック領域に確保する
    // 変数には値そのものではなく、アドレスを保持する
    // 参照型の中に、ラッパークラスがある　int ⇒ Integer みたいな
    // ラッパークラスはいろんなメソッドを持っていて、メンバ変数にプリミティブ型の値を保持する
    Integer i = Integer.valueOf(1);
    
    // Integer c = new Integer(1); みたいな書き方がJava9から非推奨になっている
    Integer q = new Integer(1);
    
    // ↓のどちらかの書き方になる
    Integer c = 1; // オートボクシング(プリミティブ型⇒ラッパークラスへの自動変換)
    Integer w = Integer.valueOf(1); // メソッド内でインスタンス化


    // Objectクラス
    // extends句を省略した時に暗黙的に継承されるクラス
    // 全クラスが最終的にObjectクラスをルートにもつ
    Object o;
    /* 
      * メモ：Object型のtoStringメソッド、読み解くと面白そう　
      * @123456みたいなデバッグ時によく見る形　
      * 参照型なため、ヒープ領域ののアドレスを返すようにしている？
     public String toString() {
      return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
     }
    */


    
    /*
    * 応用編
      以下の変数objをInteger型に変換したい。
      適切な記述はABCのうちどれ？（複数回答OK）
      適切だと考えた理由も添えて回答してください。
    
      Object obj = 75;
    
      A. Integer i = (Integer) obj;
      ⇒ objがIntegerへの互換性のないものかもしれないので不適切
         if (obj instanceof Integer) でtrueになれば変換可能
    
      B. Integer i = new Integer(obj);
      ⇒ Integerはコンストラクタの引数が、int型なので不適切？
         int型はObject型を継承していないと思うので
    
      C. Integer i = Integer.parseInt(obj);
      ⇒ Integer.parseIntの引数はString型で、Object型を継承しているため適切
    */

        
    Object obj = 75;
    Integer u = (Integer) obj;
    Integer y = new Integer(obj);
    Integer p = Integer.parseInt(obj);

  }
}
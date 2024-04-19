# このプロジェクトについて
このプロジェクトでは、日にち、カテゴリー、金額、コメントを管理するREST APIを実装します。



| 列名          | データ型       | 説明                                         |
|-------------|------------|--------------------------------------------|
| id          | INTEGER    | レコードの一意の識別子                                |
| DATE 　　　　   | DATE       | 収支が発生した日時                                  |
| TRANSACTION_TYPE | VARCHAR    | 収入か、支出かを示す                                 |
| ITEM_NAME   | VARCHAR    | 収入や支出の種類を示す                                |
| AMOUNT      | DECIMAL    | 金額（通貨の小数点以下の桁数を考慮）                         |
| COMMENT　　　　　　　 | TEXT　　　　　　　 | その他の情報やコメント                                |

# ローカルでのアプリケーション起動方法
1. git clone
2. Dockerを起動
docker compose up
docker compose exec db mysql -uroot -p
パスワードは、password
3. Postmanやcurlなどでリクエストを送る
4. 結果を確認

# ＡＰＩの使用
|request| メソッド                                                                                             | 取得するもの               |
|-------|--------------------------------------------------------------------------------------------------|----------------------|
|GET| http://localhost:8080/money_diaries                                                              | 全件取得                 |
|GET| http://localhost:8080/money_diaries/id                                                           | 指定したidのデータを出力        |
GET| http://localhost:8080/money_diaries/http://localhost:8080/money_diaries/transaction_type/収入または支出 | 収入または支出の取り出したいデータを出力 |
GET| http://localhost:8080/money_diaries/date?startDay=取り出したいデータの初めの日&endDay=取り出したいデータの終わりの日          | 指定した期間のデータのみ出力       |

date?startDay=2024-04-20&endDay=2024-04-25
# ステータスコード


| ステータスコード         | 説明          |
|------------------|-------------|
| 200            | OK     |   
| 404| NotFound|


# このプロジェクトについて
このプロジェクトでは、id、DATE（収支が発生した日）、TRANSACTION_TYPE（収入または支出）、ITEM_NAME（収入や支出の種類）金額（通貨の小数点以下を考慮）、コメントを管理するREST APIを実装します。



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
|request| メソッド                                                                                                 | 取得するもの                             | 
|-------|------------------------------------------------------------------------------------------------------|------------------------------------|
|GET| http://localhost:8080/money_diaries                                                                  | money_diariesに格納したデータ（以下、データ）を全て出力 |
|GET| http://localhost:8080/money_diaries/{id}                                                             | データのうち、指定したidのデータのみを出力             |
GET| http://localhost:8080/money_diaries/http://localhost:8080/money_diaries/transaction_type/収入または支出     | データのうち、収入または支出の指定したデータを出力          |
GET| http://localhost:8080/money_diaries/specified_period?startDay=取り出したいデータのはじめの日&endDay=取り出したいデータのおわりの日 | データのうち、指定した期間のデータのみ出力              |


# ステータスコード

## データが存在する場合
| request | メソッド                                                                                  | ステータスコード | 説明 |
|---------|---------------------------------------------------------------------------------------|----------|----|
| GET     | http://localhost:8080/money_diaries                                                   | 200      | OK 
| GET     | http://localhost:8080/money_diaries/{id}                                              | 200      | OK 
| GET     | http://localhost:8080/money_diaries/http://localhost:8080/money_diaries/transaction_type/収入または支出 | 200      | OK |
| GET     | http://localhost:8080/money_diaries/specified_period?startDate=取り出したいデータの初めの日&endDate=取り出したいデータの終わりの日 |200|OK|

## データが存在しない場合
|request| メソッド                                                                                  |ステータスコード| 説明                               |
|-------|---------------------------------------------------------------------------------------|-------------|----------------------------------|
|GET| http://localhost:8080/money_diaries                                                   |404| messageにNo records in the databaseを返す |
|GET| http://localhost:8080/money_diaries/{id}                                              |404| messageにRecord by id not foundを返す |
|GET| http://localhost:8080/money_diaries/http://localhost:8080/money_diaries/transaction_type/収入または支出 |404| Records by transaction type not foundを返す |
|GET| http://localhost:8080/money_diaries/specified_period?startDate=取り出したいデータの初めの日&endDate=取り出したいデータの終わりの日 |404| Records by dates not foundを返す    |
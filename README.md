# このプロジェクトについて

このプロジェクトでは、家計簿データを管理するREST APIを実装します。

| 列名               | データ型        | 説明                 |
|------------------|-------------|--------------------|
| id               | INTEGER     | レコードの一意の識別子        |
| DATE 　　　　        | DATE        | 収支が発生した日時          |
| TRANSACTION_TYPE | VARCHAR     | 収入か、支出かを示す         |
| ITEM_NAME        | VARCHAR     | 収入や支出の種類を示す        |
| AMOUNT           | DECIMAL     | 金額（通貨の小数点以下の桁数を考慮） |
| COMMENT　　　　　　　   | TEXT　　　　　　　 | その他の情報やコメント        |

# ローカルでのアプリケーション起動方法

1. git clone
2. Dockerを起動
   docker compose up
   docker compose exec db mysql -uroot -p
   パスワードは、password
3. Postmanやcurlなどでリクエストを送る
4. 結果を確認

# ＡＰＩの仕様

### ②家計簿データを取得するAPI

http://localhost:8080/money_diaries/{id}

#### 取得できるもの

データのうち、指定したidのデータのみを出力

#### ステータスコード

| request | データの有無 | ステータスコード | 説明                                |
|---------|--------|----------|-----------------------------------|
| GET     | 〇      | ２００      |                                   |
| GET     | ✖      | ４０４      | messageにRecord by id not foundを返す |

### ③家計簿データを取得するAPI

http://localhost:8080/money_diaries?stratDate=指定したい期間の初めの日にち&endDate=指定したい期間の終わりの日&transactionType=収入または支出

#### 取得できるもの

データのうち、指定した期間のうち、収入または支出のデータのみを出力

#### ステータスコード

| request | データの有無 | ステータスコード | 説明    |
|---------|--------|----------|-------|
| GET     | 〇      | ２００      |       |
| GET     | ✖      | ２００      | []を返す |

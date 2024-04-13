DROP TABLE IF EXISTS money_diarys;

CREATE TABLE money_diarys (
 id int unsigned AUTO_INCREMENT,
 日 LocalDate,
 収入 VARCHAR(100) NOT NULL,
 出費 VARCHAR(100) NOT NULL,
 金額 int,
 コメント VARCHAR(100)NOT NULL,

 PRIMARY KEY(id)
);

INSERT INTO money_diarys (日, 収入, 出費, 金額,コメント) VALUES ('2024-04-12', 'なし', '夜ごはん',-6000 '新宿');
INSERT INTO money_diarys (日, 収入, 出費, 金額,コメント) VALUES ('2024-04-12', 'なし','交通費' -188, '新宿から最寄り駅');
INSERT INTO money_diarys (日, 収入, 出費, 金額,コメント) VALUES ('2024-04-15', '給料日', 'なし',400000 '3月分給料');




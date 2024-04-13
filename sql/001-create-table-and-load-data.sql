DROP TABLE IF EXISTS money_diarys;

CREATE TABLE money_diarys (
 id int unsigned AUTO_INCREMENT,
 day LocalDate,
 income VARCHAR(100) NOT NULL,
 expense VARCHAR(100) NOT NULL,
 amount int,
 comment VARCHAR(100)NOT NULL,

 PRIMARY KEY(id)
);

INSERT INTO money_diarys (day,income,expense,amount,comment) VALUES ('2024-04-12', 'なし', '夜ごはん',-6000 '新宿');
INSERT INTO money_diarys (day,income,expense,amount,comment) VALUES ('2024-04-12', 'なし','交通費' -188, '新宿から最寄り駅');
INSERT INTO money_diarys (day,income,expense,amount,comment) VALUES ('2024-04-15', '給料日', 'なし',400000 '3月分給料');




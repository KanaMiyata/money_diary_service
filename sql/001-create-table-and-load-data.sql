DROP TABLE IF EXISTS money_diarys;

CREATE TABLE money_diarys (
 id int unsigned AUTO_INCREMENT,
 usingday DATE,
 category VARCHAR(100) NOT NULL,
 amount int,
 comment VARCHAR(100)NOT NULL,

 PRIMARY KEY(id)
);

INSERT INTO money_diarys (usingday, category, amount, comment) VALUES ('2024-04-12', 'food', 3500, 'good taste');
INSERT INTO money_diarys (usingday, category, amount, comment) VALUES ('2024-04-12', 'transportation', 188, 'shinjuke-nearstation');



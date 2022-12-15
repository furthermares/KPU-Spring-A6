CREATE TABLE word_free (
	w_id VARCHAR(20) NOT NULL Primary Key,
	l_id VARCHAR(20) NOT NULL,
    w_title VARCHAR(20) NOT NULL,
	w_desc VARCHAR(20) NOT NULL,
	w_extra VARCHAR(50)
);

INSERT INTO word_free VALUES( 'w11', 'main', 'apple', '사과', 'ˈæp əl'); 
INSERT INTO word_free VALUES( 'w12', 'main', 'pear', '배', 'pɛər'); 
INSERT INTO word_free VALUES( 'w13', 'main', 'strawberry', '딸기', 'ˈstrɔˌbɛr i, -bə ri'); 
INSERT INTO word_free VALUES( 'w21', 'secondary', 'celery', '샐러리', 'ˈsɛl ə ri, ˈsɛl ri'); 
INSERT INTO word_free VALUES( 'w22', 'secondary', 'flower', '꽃', 'ˈflaʊ ər');

SELECT * from word_free;

DROP TABLE word_free;
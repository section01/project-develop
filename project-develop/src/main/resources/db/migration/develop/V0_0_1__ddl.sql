select 1;

-- ユーザテーブル
create table if not exists user_mst(
    id varchar (20),
    name varchar (20)
);

-- 認証テーブル
create table if not exists auth_mst(
    id varchar (20)
    , account varchar (20)
    , roles varchar (10)
    , password varchar (20)
);

-- 勤怠期間テーブル
create table if not exists period_tbl(
    id varchar (20)
    , period varchar (20)
    , status varchar (1)
);

-- 勤怠詳細テーブル
create table if not exists detail_tbl(
    id varchar (20)
    , period varchar (20)
    , date varchar (20)
    , week varchar (20)
    , type varchar (20)
    , open_time varchar (10)
    , close_time varchar (10)
    , break_time varchar (10)
    , total_time varchar (10)
    , remark varchar (100)
);

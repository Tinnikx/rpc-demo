create table payment (
    id bigint(20) not null auto_increment,
    serial varchar(200) default '',
    primary key (`id`)
)
engine=innodb auto_increment=1 default charset=utf8;
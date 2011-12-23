    drop table Stuff_Tag;
	drop table Stuff;
    drop table Tag;
    
    create table Stuff (
        id int4 not null,
        name varchar(255),
        parentId int4 not null,
        primary key (id)
    );

    create table Tag (
    	id int4 not null,
    	name varchar(255),
        primary key (id)
    );
    
    create table Stuff_Tag (
    	stuffId int4 not null,
    	tagId int4 not null,
        primary key (stuffId, tagId)
    );

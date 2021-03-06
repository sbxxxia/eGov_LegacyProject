package com.sbxxxia.web.enums;

public enum Sql {
	CREATE_DB,
	CREATE_USERS, DROP_USERS, TRUNCATE_USERS,
	INSERT_USER, DROP_USER,
	CREATE_ARTICLES, DROP_ARTICLES, TRUNCATE_ARTICLES,
	CREATE_FILES, DROP_FILES, TRUNCATE_FILES;
	
	@Override
	public String toString() {
		String result = "";
		switch(this) {
		case CREATE_DB:
			result = "create database mariadb";
			break;
			
		case CREATE_USERS:
			result = "create table users(userid varchar(30) primary key,"
					+ " password varchar(30) ,"
					+ " name varchar(30) ,"
					+ " birthday varchar(30) ,"
					+ " gender varchar(10) ,"
					+ " reg_date varchar(10) ,"
					+ " telephone varchar(30),"
					+ " access_code VARCHAR(30)) ENGINE=InnoDB DEFAULT CHARSET=UTF8";
			break;
			
		case DROP_USERS:
			result = "drop table users";
			break;
			
		case TRUNCATE_USERS:
			result = "truncate table users";
			break;
			
		case INSERT_USER:
			result = "insert userid, password, name, birthday, gender, telephone, reg_date, access_code "
					+ "into users "
					+ "values (#{userid}, #{password}, #{name}, #{birthday}, #{gender}, #{telephone}, #{regDate}, #{accessCode})";
			
		case DROP_USER:
			result = "delete from users where userid like #{userid}";
		
		case CREATE_ARTICLES:
			result = "create table articles("
					+ "article_number int auto_increment primary key,"
					+ "file_number int references files,"
					+ "userid varchar(30) references users,"
					+ "comment varchar(500),"
					+ "message varchar(50),"
					+ "rating varchar(50),"
					+ "boardtype varchar(50),"
					+ "title varchar(300),"
					+ "content varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=UTF8";
			break;
			
		case DROP_ARTICLES:
			result = "drop table articles";
			break;
			
		case TRUNCATE_ARTICLES:
			result = "truncate table articles";
			break;
			
		case CREATE_FILES:
			result = "create table files("
					+ "file_number int auto_increment primary key,"
					+ "file_name varchar(100),"
					+ ")ENGINE=InnoDB DEFAULT CHARSET=UTF8";
			break;
			
		case DROP_FILES:
			result = "drop table files";
			break;
			
		case TRUNCATE_FILES:
			result = "truncate table files";
			break;
			
		default:
			break;
		}
		return result;
	}
}

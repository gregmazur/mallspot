create table Users (ID int NOT NULL AUTO_INCREMENT, FIRST_NAME VARCHAR, LAST_NAME VARCHAR,
EMAIL VARCHAR, PASSWORD VARCHAR, CREATEDBY INT, MODIFIEDBY INT, CREATEDAT VARCHAR, MODIFIEDAT VARCHAR );

create table StoreAdmins (ID int NOT NULL AUTO_INCREMENT, FIRST_NAME VARCHAR, LAST_NAME VARCHAR,
EMAIL VARCHAR, PASSWORD VARCHAR, CREATEDBY INT, MODIFIEDBY INT, CREATEDAT VARCHAR, MODIFIEDAT VARCHAR );

create table MALLS (ID int NOT NULL AUTO_INCREMENT, NAME VARCHAR, DESCRIPTION VARCHAR, );

create table stores (ID int NOT NULL AUTO_INCREMENT, MALL INT references MALLS(ID), NAME VARCHAR, 
DESCRIPTION VARCHAR, POSITION VARCHAR, ADMIN INT references StoreAdmins(ID), CATEGORY VARCHAR);

create table products (ID int NOT NULL AUTO_INCREMENT, STORE INT references stores(ID), 
)

private byte[] image;
	private float price;
	private String description;// categories(tag) are being saved here 
	private String name;
	private Brand brand;
	private long storeId; //specifies store to w


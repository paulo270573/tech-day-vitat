CREATE TABLE IF NOT EXISTS PROGRAMA (
    program_id  numeric(19, -127) NOT NULL,
    programa    varchar(30) NOT NULL,
    program_url varchar(30) NOT NULL,
    meta       numeric(19, 2),
    date_reset  datetime
);

CREATE TABLE IF NOT EXISTS CUSTOMER (
    customer_id  numeric(19, -127) NOT NULL,
    name   varchar(30) NOT NULL,
    photo_url varchar(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS PROGRAMCUSTOMER (

   program_customer_id  numeric(19, -127) NOT NULL,
   program_id  numeric(19, -127) NOT NULL,
   customer_id  numeric(19, -127) NOT NULL,
   time numeric(19, 2)
);

CREATE SEQUENCE IF NOT EXISTS SQ_PROGRAM_ID;
CREATE SEQUENCE IF NOT EXISTS SQ_CUSTOMER_ID;
CREATE SEQUENCE IF NOT EXISTS SQ_PROGRAM_CUSTOMER_ID;

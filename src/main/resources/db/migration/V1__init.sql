create sequence member_id_seq start with 1 increment by 50;

CREATE TABLE member (
    id BIGINT,
    name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    PRIMARY KEY (id)
);
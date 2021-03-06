CREATE TABLE ADRESS (
                ID NUMERIC(10,0) IDENTITY(1,1) NOT NULL,
                DT_DELETE TIMESTAMP NOT NULL,
                DT_UPDATE TIMESTAMP NOT NULL,
                DT_CREATE TIMESTAMP NOT NULL,
                STREET VARCHAR(100) NOT NULL,
				NUMBER NUMERIC(10,0) NOT NULL,
                COMPLEMENT VARCHAR(150),
                DISTRICT VARCHAR(100) NOT NULL,
                TOWN VARCHAR(100) NOT NULL,
                COUNTRY VARCHAR(100) NOT NULL,
                POSTAL_CODE VARCHAR(25) NOT NULL,
                CONSTRAINT PK_ADRESS PRIMARY KEY (ID)
);
--CREATE UNIQUE INDEX UK_ADRESS ON ADRESS(STREET,NUMBER);
CREATE INDEX IX_ADRESS_ID ON ADRESS(ID);
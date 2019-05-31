CREATE TABLE PERSON_SOCIAL_MEDIA (
                ID NUMERIC(10,0) IDENTITY(1,1) NOT NULL,
                DT_DELETE TIMESTAMP NOT NULL,
                DT_UPDATE TIMESTAMP NOT NULL,
                DT_CREATE TIMESTAMP NOT NULL,
                ID_SOCIAL_MEDIA NUMERIC(10,0) NOT NULL,
                ID_USER_SECURITY NUMERIC(10,0) NOT NULL,
                CONSTRAINT PK_PERSON_SOCIAL_MEDIA PRIMARY KEY (ID)
);
CREATE UNIQUE INDEX UK_PERSON_SOCIAL_MEDIA ON PERSON_SOCIAL_MEDIA(ID_SOCIAL_MEDIA, ID_USER_SECURITY);

CREATE INDEX IX_PERSON_SOCIAL_MEDIA_ID ON PERSON_SOCIAL_MEDIA(ID);
CREATE INDEX IX_PERSON_SOCIAL_MEDIA_ID_USER_SECURITY ON PERSON_SOCIAL_MEDIA(ID_USER_SECURITY);
CREATE INDEX IX_PERSON_SOCIAL_MEDIA_ID_PERSON_SOCIAL_MEDIA ON PERSON_SOCIAL_MEDIA(ID_SOCIAL_MEDIA);

ALTER TABLE PERSON_SOCIAL_MEDIA ADD CONSTRAINT FK_SOCIAL_MEDIA FOREIGN KEY (ID_SOCIAL_MEDIA) REFERENCES SOCIAL_MEDIA(ID);
ALTER TABLE PERSON_SOCIAL_MEDIA ADD CONSTRAINT FK_USER_SECURITY FOREIGN KEY (ID_USER_SECURITY) REFERENCES USER_SECURITY(ID);
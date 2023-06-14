CREATE TABLE IF NOT EXISTS BRANDS
(
    ID         LONG AUTO_INCREMENT,
    NAME       VARCHAR(255) NOT NULL,
    CREATED_AT TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    DELETED_AT TIMESTAMP,
    PRIMARY KEY (ID)
);

INSERT INTO BRANDS (ID, NAME, CREATED_AT, UPDATED_AT, DELETED_AT)
VALUES (1, 'ZARA', NULL, NULL, NULL);

CREATE TABLE IF NOT EXISTS PRICES
(
    ID            LONG AUTO_INCREMENT,
    BRAND_ID      LONG                   NOT NULL,
    START_DATE    TIMESTAMP              NOT NULL,
    END_DATE      TIMESTAMP              NOT NULL,
    PRICE_LIST_ID LONG                   NOT NULL,
    PRODUCT_ID    LONG                   NOT NULL,
    PRIORITY      INTEGER                NOT NULL,
    PRICE         NUMERIC                NOT NULL,
    CURRENCY      VARCHAR_IGNORECASE(10) NOT NULL,
    CREATED_AT    TIMESTAMP,
    UPDATED_AT    TIMESTAMP,
    DELETED_AT    TIMESTAMP,
    PRIMARY KEY (ID),
    FOREIGN KEY (BRAND_ID) REFERENCES BRANDS (ID)
);

INSERT INTO PRICES
(BRAND_ID, START_DATE, END_DATE, PRICE_LIST_ID, PRODUCT_ID, PRIORITY, PRICE, CURRENCY, CREATED_AT, UPDATED_AT,
 DELETED_AT)
VALUES (1, '2020-06-14-00.00.00', '2020-12-31-23.59.59', 1, 35455, 0, '35.50', 'EUR', NULL, NULL, NULL),
       (1, '2020-06-14-15.00.00', '2020-06-14-18.30.00', 1, 35455, 1, '25.45', 'EUR', NULL, NULL, NULL),
       (1, '2020-06-15-00.00.00', '2020-06-15-11.00.00', 1, 35455, 1, '30.50', 'EUR', NULL, NULL, NULL),
       (1, '2020-06-15-16.00.00', '2020-12-31-23.59.59', 1, 35455, 1, '38.95', 'EUR', NULL, NULL, NULL);
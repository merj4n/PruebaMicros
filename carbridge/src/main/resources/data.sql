INSERT INTO coches (coche_id,nombre_modelo,color) VALUES (1001,'Yaris','Gris Zenith');
INSERT INTO coches (coche_id,nombre_modelo,color) VALUES (1002,'Igo','Blue motion');
INSERT INTO coches (coche_id,nombre_modelo,color) VALUES (1003,'Leon','Rojo pasión');
INSERT INTO coches (coche_id,nombre_modelo,color) VALUES (1004,'Ateca','Black');
INSERT INTO coches (coche_id,nombre_modelo,color) VALUES (1005,'508','Yellow Gold');

INSERT INTO precios (id,precio,fecha_inicio,fecha_fin) VALUES (301,16669,CURRENT_DATE,TO_DATE(20220529,'yyyymmdd'));
INSERT INTO precios (id,precio,fecha_inicio,fecha_fin) VALUES (302,24358.19,CURRENT_DATE,TO_DATE(20220629,'yyyymmdd'));
INSERT INTO precios (id,precio,fecha_inicio,fecha_fin) VALUES (303,35000,CURRENT_DATE,TO_DATE(20220729,'yyyymmdd'));
INSERT INTO precios (id,precio,fecha_inicio,fecha_fin) VALUES (304,13545.99,CURRENT_DATE,TO_DATE(20220829,'yyyymmdd'));
INSERT INTO precios (id,precio,fecha_inicio,fecha_fin) VALUES (305,19999,CURRENT_DATE,TO_DATE(20220929,'yyyymmdd'));

--INSERT INTO marcas (id,nombre_marca,coche_id) VALUES (201,'Toyota',1001);
--INSERT INTO marcas (id,nombre_marca,coche_id) VALUES (202,'Toyota',1002);
--INSERT INTO marcas (id,nombre_marca,coche_id) VALUES (203,'Seat',1003);
--INSERT INTO marcas (id,nombre_marca,coche_id) VALUES (204,'Seat',1004);
--INSERT INTO marcas (id,nombre_marca,coche_id) VALUES (205,'Peugeot',1005);

INSERT INTO marcas (marca_id,nombre_marca) VALUES (201,'Toyota');
INSERT INTO marcas (marca_id,nombre_marca) VALUES (202,'Toyota');
INSERT INTO marcas (marca_id,nombre_marca) VALUES (203,'Seat');
INSERT INTO marcas (marca_id,nombre_marca) VALUES (204,'Seat');
INSERT INTO marcas (marca_id,nombre_marca) VALUES (205,'Peugeot');
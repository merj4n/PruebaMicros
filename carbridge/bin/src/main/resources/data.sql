INSERT INTO tde_coches (id,nombre_modelo,color) VALUES (1001,'Yaris','Gris Zenith');
INSERT INTO tde_coches (id,nombre_modelo,color) VALUES (1002,'Igo','Blue motion');
INSERT INTO tde_coches (id,nombre_modelo,color) VALUES (1003,'Leon','Rojo pasión');
INSERT INTO tde_coches (id,nombre_modelo,color) VALUES (1004,'Ateca','Black');
INSERT INTO tde_coches (id,nombre_modelo,color) VALUES (1005,'508','Yellow Gold');

INSERT INTO tde_precios (id_precio,precio,fecha_inicio,fecha_fin,cochesid) VALUES (301,16669,CURRENT_DATE,TO_DATE(20220529,'yyyymmdd'),1001);
INSERT INTO tde_precios (id_precio,precio,fecha_inicio,fecha_fin,cochesid) VALUES (302,24358.19,CURRENT_DATE,TO_DATE(20220629,'yyyymmdd'),1002);
INSERT INTO tde_precios (id_precio,precio,fecha_inicio,fecha_fin,cochesid) VALUES (303,35000,CURRENT_DATE,TO_DATE(20220729,'yyyymmdd'),1003);
INSERT INTO tde_precios (id_precio,precio,fecha_inicio,fecha_fin,cochesid) VALUES (304,13545.99,CURRENT_DATE,TO_DATE(20220829,'yyyymmdd'),1004);
INSERT INTO tde_precios (id_precio,precio,fecha_inicio,fecha_fin,cochesid) VALUES (305,19999,CURRENT_DATE,TO_DATE(20220929,'yyyymmdd'),1005);

INSERT INTO tde_marcas (id_marcas,nombre_marca,cochesid) VALUES (201,'Toyota',1001);
INSERT INTO tde_marcas (id_marcas,nombre_marca,cochesid) VALUES (202,'Toyota',1002);
INSERT INTO tde_marcas (id_marcas,nombre_marca,cochesid) VALUES (203,'Seat',1003);
INSERT INTO tde_marcas (id_marcas,nombre_marca,cochesid) VALUES (204,'Seat',1004);
INSERT INTO tde_marcas (id_marcas,nombre_marca,cochesid) VALUES (205,'Peugeot',1005);

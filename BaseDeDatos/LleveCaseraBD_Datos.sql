insert into vendedor(dni_vendedor, nombre_vendedor, celular_vendedor, estado_vendedor, user_vendedor) values ('73202484', 'Elliot', '963640756', '1', 'ElliotXLeo');
insert into vendedor(dni_vendedor, nombre_vendedor, celular_vendedor, estado_vendedor, user_vendedor) values ('71314123', 'Mariana', '923654543', '1', 'Ratona');
select * from vendedor;

insert into cliente (dni_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('73562135', 'Acsafkineret', '924654356', '1');
insert into cliente (dni_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('70535126', 'Melissa', '996563215', '1');
insert into cliente (dni_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('70674689', 'Isabel', '965326452', '1');
insert into cliente (dni_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('72669763', 'Michael', '936466213', '1');
select * from cliente;

insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Frejoles', 8.5, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Arroz', 3.5, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Carne', 15, 25, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Pollo', 4.5, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Pescado', 5.5, 25, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Ajos', 12, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Cebolla', 2.5, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Tomate', 3, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Pimienta', 0.5, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Comino', 0.5, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Sal', 1, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Aji amarillo', 4, 50, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Azucar', 2, 100, 1);
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('Aceite', 5, 100, 1);
select * from producto;

insert into venta (serie_venta, fecha_venta, monto_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values ('000001', '2020-07-07', 43, 1, 1, 1);
insert into venta (serie_venta, fecha_venta, monto_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values ('000002', '2020-07-07', 40, 1, 2, 2);
insert into venta (serie_venta, fecha_venta, monto_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values ('000003', '2020-07-08', 50, 1, 3, 1);
select * from venta;

insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 7, 1, 2);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 10, 1, 14);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 24, 1, 6);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 2, 1, 11);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 17, 2, 1);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 10, 2, 14);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 6, 2, 8);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 5, 2, 7);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 2, 2, 11);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 11, 3, 5);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 30, 3, 3);
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 9, 3, 4);
select * from detalle_venta;
/* Consulta de inicioSesion */
select * from vendedor where user_vendedor = 'ElliotXLeo' and dni_vendedor = 73202484;


/* CRUD cliente*/
describe cliente;
-- agregar
insert into cliente (dni_cliente, nombre_cliente, celular_cliente, estado_cliente) values ('79865235', 'Eduardo', '964321564', '1');

-- listar
select * from cliente;

-- actualizar
update cliente set dni_cliente='69465321', nombre_cliente='Eduardo', celular_cliente='963632125', estado_cliente='1' where id_cliente=9;

-- eliminar
delete from cliente where id_cliente = 9;


/* CRUD producto*/
describe producto;
-- agregar
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('garbanzo', 6.5, 100, 1);

-- listar
select * from producto;

-- actualizar
update producto set nombre_producto='garbanzo', precio_producto=7.5, stock_producto=150, estado_producto='1' where id_producto=29;

-- eliminar
delete from producto where id_producto = 29;


/* CRUD vendedor*/
describe vendedor;
-- agregar
insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values ('garbanzo', 6.5, 100, 1);

-- listar
select * from producto;

-- actualizar
update producto set nombre_producto='garbanzo', precio_producto=7.5, stock_producto=150, estado_producto='1' where id_producto=29;

-- eliminar
delete from producto where id_producto = 29;

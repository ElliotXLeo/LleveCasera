/* actualizarStock */
-- actualizarStock
update producto set stock_producto = 150 where id_producto = 1;

/* detalle_venta */
-- guardarDetalleVenta
insert into detalle_venta (cantidad_venta, precio_total_venta, venta_id_venta, producto_id_producto) values (2, 7, 1, 2);

/* generarVenta */
-- ultimoIdVenta
select max(id_venta) from venta;

-- guardarVenta
insert into venta (serie_venta, fecha_venta, monto_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values ('000001', '2020-07-07', 43, 1, 1, 1);


/* listarProducto */
select * from producto order by nombre_producto;


/* buscarProducto */
-- buscarProductoId
select * from producto where id_producto=1;

-- buscarProductoNombre
select * from producto where nombre_producto='Frejoles';


/* buscarCliente */
select * from cliente where dni_cliente = 73202484;


/* iniciarSesion */
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
insert into vendedor(dni_vendedor, nombre_vendedor, celular_vendedor, estado_vendedor, user_vendedor) values ('06541238', 'Marilu', '992654760', '1', 'Marilu');

-- listar
select * from vendedor;

-- actualizar
update vendedor set dni_vendedor='16178523', nombre_vendedor='Marilú', celular_vendedor=992654753, estado_vendedor='0', user_vendedor='Mari' where id_vendedor=5;

-- eliminar
delete from vendedor where id_vendedor = 5;

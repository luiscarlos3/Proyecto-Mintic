create table empresa(
id_empresa int not null primary key,
NombreEmpresa varchar(45) not null,
DocumentoEmpresa varchar(45) not null,
telefono varchar(16) not null,
direcion varchar(45) not null,
unique(NombreEmpresa),
unique(DocumentoEmpresa)
);

select * from empresa;


create table roles(
id_rol int not null primary key,
nombreRol varchar(45) not null
);
create table perfil(
idPerfil int not null primary key,
image varchar(45) not null,
telefono varchar(16) not null,
nombreUsuario varchar(45) not null
);
select * from roles;

create table empleado(
identificacion varchar(16) not null primary key,
email varchar(45) not null,
usuario int not null,
rolUsuario int not null,
unique(email),
foreign key(usuario) references perfil(idPerfil),
foreign key(rolUsuario) references roles(id_rol));

select * from empleado;

create table transaccion(
id_transaccion int not null primary key,
concepto varchar(45) not null,
empleado_transaccion int not null,
empresa_id int not null,
foreign key(empleado_transaccion) references perfil(idPerfil),
foreign key(empresa_id) references empresa(id_empresa)
);
alter table empresa
add column transaccion_empresa int not null,
add column empleado_empresa varchar(16) not null,
add foreign key(transaccion_empresa) references empresa(id_empresa),
add foreign key(empleado_empresa) REFERENCES empleado(identificacion);

select * from transaccion;
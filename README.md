# udemyJSFterminado

El proyecto se compilo en Intellij Idea.
Se uso wildfly-11.0.0.Final

La configuracion que se anade al standalone.xml es la siguiente.

<datasource jndi-name="java:/syscomDS" pool-name="syscomDS" enabled="true" use-java-context="true">
          <connection-url>jdbc:postgresql://localhost:5432/syscom-hpmedical</connection-url>
          <driver>postgres</driver>
          <security>
            <user-name>postgres</user-name>
            <password>postgres</password>
          </security>
</datasource>
       
       
La base de datos se realizo en postgres, las configuraciones son las siguientes:
create database syscom-hpmedical

CREATE TABLE public.colonia (
    colonia_id integer NOT NULL,
    nombre_colonia character varying,
    codigo_postal integer
);

INSERT INTO colonia (colonia_id,nombre_colonia,codigo_postal) values ('1','Plan 3000','11530');
INSERT INTO colonia (colonia_id,nombre_colonia,codigo_postal) values ('2','Polanco','3810');
INSERT INTO colonia (colonia_id,nombre_colonia,codigo_postal) values ('3','Del Valle Centro','3100');


# basicoSpringH2
:bookmark_tabs: The goal is to practice programming skills and implement a CRUD method within an H2 memory bank.

O objetivo é construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

:white_check_mark: Buscar todos os usuários

:white_check_mark: Buscar um usuário pelo seu id

:white_check_mark: Insira um novo usuário

:computer: Configuração do BD H2:

# Dados de conexão com o banco H2

spring.datasource.url=jdbc:h2:mem:testdb

spring.datasource.username=sa

spring.datasource.password=


# Configuração do cliente web do banco H2

spring.h2.console.enabled=true

spring.h2.console.path=/h2-console


# Configuração para mostrar o SQL no console

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true

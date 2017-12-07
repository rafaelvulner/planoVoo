# planoVoo
Modulo back-end plano de voo<br><br>

<strong>Ambiente de desenvolvimento</strong></br>
JDK 8<br>
Eclipse<br>
Maven<br>
Tomcat 8*

<strong>Tecnologias utilizadas</strong><br>
Java 8<br>
SpringBoot<br>
SpringData<br>
Hibernate

<strong>Build do projeto</strong><br>
mvn clean install
<br>
Para abrir o projeto dentro do Eclipse, basta ir em File > import > Existing Maven Projects<br>
escolher a pasta onde fez o clone do projeto clicar em OK e Finish<br>

<strong>Rest localhost:8080</strong><br>
http://localhost:8080/voo/buscarTodos <strong>METHOD.GET (Trás todos os voo, aviões e pilotos atrelados a eles)</strong><br>
http://localhost:8080/voo/saida <strong>METHOD.POST (Seta as informações dos voo de saida, incluindo horario)</strong><br>
<i>exemplo de payload a ser setado:</i><br>
{"cod":15,"cidadeOrigem":"Distrito federal","cidadeDestino":"EUA","aviao":{"modelo":"E-JET","serie":1},"piloto":{"registro":70,"nome":"Gabigol"}}<br>
http://localhost:8080/voo/chegada <strong> METHOD.PUT (Atualiza a hora da chegada e o status do avião)</strong><br>
http://localhost:8080/voo/remover <strong> METHOD.DELETE (Deleta um voo pelo cod)</strong><br>
<br><i>Todas as API's foram testadas pelo POSTMAN

# repository[![Build Status](https://drone.io/github.com/clairton/repository/status.png)](https://drone.io/github.com/clairton/repository/latest)

Paginated Collection.

Para Recuperar uma Coleção paginada:
```java
PaginatedMetaList<Aplicacao> metaList = repository.from(Aplicacao.class).collection(1, 1);
metaList.getMeta().getTotal();//total de itens em todosd as paginas
metaList.getMeta().getPage();//pagina atual
```

Para usar será necessário adicionar os repositórios maven:

```xml
<repository>
	<id>mvn-repo-releases</id>
	<url>https://raw.github.com/clairton/mvn-repo/releases</url>
</repository>
<repository>
	<id>mvn-repo-snapshot</id>
	<url>https://raw.github.com/clairton/mvn-repo/snapshots</url>
</repository>
```
 Também adicionar as depêndencias:
```xml
<dependency>
    <groupId>br.eti.clairton</groupId>
	<artifactId>paginated</artifactId>
	<version>0.1.0</version>
</dependency>
```

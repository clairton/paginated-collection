# paginated-collection[![Build Status](https://drone.io/github.com/clairton/paginated-collection/status.png)](https://drone.io/github.com/clairton/paginated-collection/latest)

Paginated Collection.

Para Recuperar uma Coleção paginada:
```java
PaginatedMetaList<Aplicacao> metaList = new PaginatedMetaList<>(Arrays.asList(new Aplicacao()), new Meta(1l,2l));
metaList.getMeta().getTotal();//total de itens em todosd as paginas
metaList.getMeta().getPage();//pagina atual
for(Aplicacao a : metaList){
	a....
}
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

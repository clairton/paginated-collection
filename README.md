# paginated-collection [![Build Status](https://travis-ci.org/clairton/paginated-collection.svg?branch=master)](https://travis-ci.org/clairton/paginated-collection)

Paginated Collection.

Coleção paginada:
```java
PaginatedMetaList<Aplicacao> metaList = new PaginatedMetaList<>(Arrays.asList(new Aplicacao()), new Meta(1l,2l));
metaList.getMeta().getTotal();//total de itens em todos as paginas
metaList.getMeta().getPage();//pagina atual
for(Aplicacao a : metaList){
	a....
}
```

Para usar será necessário adicionar a depêndencia:
```xml
<dependency>
    <groupId>br.eti.clairton</groupId>
	<artifactId>paginated-collection</artifactId>
	<version>0.1.0</version>
</dependency>
```

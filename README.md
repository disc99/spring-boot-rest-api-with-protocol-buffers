# spring-boot-rest-api-with-protocol-buffers

## Application architecture
![Image](https://user-images.githubusercontent.com/5003722/57571660-df588380-744b-11e9-8577-a81e922485f6.png)

## Execution

```bash
$ curl -X POST localhost:8080 -H "Content-Type: application/json" -d '{"id": 1}'
{"id": 1,"title": "Title 1","price": 2000,"release_date": {"seconds": 1557588668934}}
```

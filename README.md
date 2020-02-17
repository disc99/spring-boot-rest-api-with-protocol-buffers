# spring-boot-rest-api-with-protocol-buffers

## Application architecture
![image](https://user-images.githubusercontent.com/5003722/74623770-451b2e00-5189-11ea-81a4-5b111eb7e558.png)

## Execution

```bash
$ curl -X POST localhost:8080 -H "Content-Type: application/json" -d '{"id": 1}'
{
  "id": 1,
  "title": "Title 1",
  "price": 2000,
  "releaseDate": "1970-01-01T00:00:00Z"
}
```

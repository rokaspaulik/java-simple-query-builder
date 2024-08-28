
# Simple query builder

## Story

At work there was issue with LT symbols not getting decoded properly after calling API using POST and query params. So I made this query builder to solve that issue so that params get properly encoded to proper utf before sending the request.

## Example params

```java
Map<String, String> params = new HashMap<>();
params.put("firstname", "TestFirstName");
params.put("lastname", "TestLastName");
params.put("email", "email@test.com");
params.put("address", "Gargždai, Gargždų raj., Alyvų 1234 k., Vienkiemio g. 1");
params.put("city", "Gargždai");
params.put("postcode", "01234");
params.put("country", "LT");
```

## Example response

```bash
https://some.website.com/api.php?country=LT&firstname=TestFirstName&address=Garg%C5%BEdai%2C+Garg%C5%BEd%C5%B3+raj.%2C+Alyv%C5%B3+1234+k.%2C+Vienkiemio+g.+1&city=Garg%C5%BEdai&postcode=01234&email=email%40test.com&lastname=TestLastName
```

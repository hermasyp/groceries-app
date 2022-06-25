# Groceries Simple API using Spring Boot Kotlin

## Base url

```
https://catnip-groceries.herokuapp.com/api/v1
```
## Table endpoints
### Groceries

| Name                           | Endpoint                      | Method   | Bearer token | Body and response                                  |
|--------------------------------|-------------------------------|----------|--------------|----------------------------------------------------|
| Get Groceries                  | `/grocery`                    | `GET`    | no           | [example](#grocery---get-grocery)                  |
| Get Grocery by Id              | `/grocery/{id}`               | `GET`    | no           | [example](#grocery---get-grocery-by-id)            |
| Get Groceries Filtered by Name | `/grocery/filter?name={name}` | `GET`    | no           | [example](#grocery---get-groceries-filtered-by-name)                    |
| Add Grocery                    | `/grocery`                    | `POST`   | no           | [example](#grocery---add-grocery)         |
| Delete Grocery                 | `/grocery/{id}`               | `DELETE` | no           | [example](#grocery---delete-grocery)      |
| Update Grocery                 | `/grocery/{id}`               | `PUT`    | no           | [example](#grocery---update-grocery) |


### Grocery - Get Grocery

```
GET `/grocery`
```

Response

```json
{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": "f8283e91-5a15-493b-a07d-a28cf6fc606c",
      "name": "Xylitol 242",
      "price": 5000.0,
      "gram": 250.0,
      "description": "Chewing Gum 3"
    },
    {
      "id": "71993178-6f50-4649-8fb0-51906f024182",
      "name": "Xylitol 242",
      "price": 5000.0,
      "gram": 250.0,
      "description": "Chewing Gum 3"
    }
  ]
}
```

### Grocery - Get Grocery by Id

```
GET `/grocery/{id}`
```

Response

```json
{
  "success": true,
  "message": "Success",
  "data": {
    "id": "f8283e91-5a15-493b-a07d-a28cf6fc606c",
    "name": "Xylitol 242",
    "price": 5000.0,
    "gram": 250.0,
    "description": "Chewing Gum 3"
  }
}
```


### Grocery - Get Groceries Filtered by Name

```
GET `/grocery/filter?name={name}`
```

Response

```json
{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": "f8283e91-5a15-493b-a07d-a28cf6fc606c",
      "name": "Xylitol 242",
      "price": 5000.0,
      "gram": 250.0,
      "description": "Chewing Gum 3"
    },
    {
      "id": "71993178-6f50-4649-8fb0-51906f024182",
      "name": "Xylitol 242",
      "price": 5000.0,
      "gram": 250.0,
      "description": "Chewing Gum 3"
    }
  ]
}
```

### Grocery - Add Grocery

```
GET `/grocery`
```

Body

```json
{
  "name" : "Xylitol",
  "gram" : 250,
  "price" : 5000,
  "description" : "Chewing Gum"
}
```

Response

```json
{
  "success": true,
  "message": "Success",
  "data": {
    "id": "23321768-3c6a-4c22-8ba2-c664b82410c3",
    "name": "Sunlight 2 Edited",
    "price": 5000.0,
    "gram": 250.0,
    "description": "Dishwasher Soap 2"
  }
}
```



### Grocery - Delete Grocery

```
DELETE `/grocery/{ID}`
```

Response

```json
{
  "success": true,
  "message": "Success",
  "data": {
    "id": "23321768-3c6a-4c22-8ba2-c664b82410c3",
    "name": "Sunlight 2 Edited",
    "price": 5000.0,
    "gram": 250.0,
    "description": "Dishwasher Soap 2"
  }
}
```


### Grocery - Add Grocery

```
PUT `/grocery/{ID}`
```

Body

```json
{
  "name" : "Xylitol",
  "gram" : 250,
  "price" : 5000,
  "description" : "Chewing Gum"
}
```

Response

```json
{
  "success": true,
  "message": "Success",
  "data": {
    "id": "23321768-3c6a-4c22-8ba2-c664b82410c3",
    "name": "Sunlight 2 Edited",
    "price": 5000.0,
    "gram": 250.0,
    "description": "Dishwasher Soap 2"
  }
}
```

# workshop-spring-mongodb

Projeto para o curso de **Java** do Nelio Alves envolvendo o uso do framework Spring, o banco de dados orientado a documentos **MongoDB** e a ferramenta **Postman**. Ele possui operações de CRUD para usuários e operações de busca com diferentes tipos de filtro para publicações (posts). Abaixo, seguem capturas de interface do Swagger e alguns exemplos.

---

<details>
<summary>Exemplo GET users sem parâmetros</summary>

### GET localhost:8080/users

```
[
    {
        "id": "66c80456c01c8b3e5a5ef539",
        "name": "Maria Brown",
        "email": "maria@gmail.com"
    },
    {
        "id": "66c80456c01c8b3e5a5ef53a",
        "name": "Alex Green",
        "email": "alex@gmail.com"
    },
    {
        "id": "66c80456c01c8b3e5a5ef53b",
        "name": "Bob Grey",
        "email": "bob@gmail.com"
    }
]
```

<br>
<br>
</details>

<details>
<summary>Exemplo POST users</summary>

### POST localhost:8080/users
```
{
    "name": "Kevin Levin",
    "email": "kevin@gmail.com"
}
```
> Status: 201 Created

<br>
<br>
</details>

<details>
<summary>Exemplo GET posts com vários parâmetros</summary>

### GET localhost:8080/posts/fullsearch?*parâmetros*
+ **text**=nutricionista
+ **minDate**=2023-08-20
+ **maxDate**=2023-08-25

```
[
    {
        "id": "66c80456c01c8b3e5a5ef539",
        "date": "2023-08-23T00:00:00.000+00:00",
        "title": "Bom dia",
        "body": "Acordei com vontade de comer pizza e milkshake hoje. Meu nutricionista não pode saber.",
        "author": {
            "id": "66c8c6bc26d0f738cdbda9bf",
            "name": "Maria Brown"
        },
        "comments": [
            {
                "text": "Estou sabendo. Se controle, hoje não é seu dia livre.",
                "date": "2023-08-23T00:00:00.000+00:00",
                "author": {
                    "id": "66c80456c01c8b3e5a5ef53b",
                    "name": "Bob Grey"
                }
            }
        ]
    }
]
```

<br>
<br>
</details>

---

![image](https://github.com/user-attachments/assets/e215d2b8-3dee-4c8f-8dbe-c3a601f25761)
![image](https://github.com/user-attachments/assets/481f1866-d125-4ce3-b6da-bb8fd577bec0)




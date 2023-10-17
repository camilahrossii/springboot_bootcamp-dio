# Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week

## Diagrama de classes

```mermaid
classDiagram
    class User {
        - name: String
        - account: Account
        - features: Features
        - card: Card
        - news: News
    }

    class Account {
        - number: String
        - agency: String
        - balance: Double
        - limit: Double
    }

    class Features {
        - icon: String
        - description: String
    }

    class Card {
        - number: String
        - limit: Double
    }

    class News {
        - icon: String
        - description: String
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Features
    User "1" *-- "1" Card
    User "1" *-- "N" News
```

# 🛍️ ProdutoAPI

API REST simples para gerenciamento de produtos, desenvolvida com **Spring Boot** e banco em memória **H2**.  
O projeto implementa um CRUD básico de produtos, ideal para estudos e práticas de desenvolvimento com Java e Spring.

---

## 🚀 Tecnologias Utilizadas
- Java 21+
- Spring Boot
- Spring Data JPA
- H2 Database (console web embutido)
- Maven

---

## ⚙️ Funcionalidades
- Criar um produto
- Buscar produto por **ID**
- Buscar produtos por **nome**
- Atualizar um produto
- Remover um produto

---

## 📌 Endpoints

### ➕ Criar Produto
`POST /produtos`  
Body (JSON):
```json
{
  "nome": "Notebook",
  "descricao": "Notebook Dell Inspiron",
  "preco": 3500.0
}

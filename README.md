# 🥖 Sistema de Gestão de Padaria (Web)

Este é um sistema completo de gestão de padaria desenvolvido em ambiente web. A aplicação foi projetada utilizando a arquitetura MVC (Model-View-Controller) para fornecer um controle eficiente de estoque, autenticação de usuários, gerenciamento de vendas e monitoramento de produtos vencidos.

O objetivo deste projeto foi migrar/evoluir regras de negócio para uma plataforma web robusta, garantindo persistência de dados íntegra e uma interface amigável para o usuário final (como atendentes e gerentes).

---

## 🚀 Funcionalidades Principais

* **Controle de Acesso (Autenticação):** Tela de login funcional integrada para perfis de usuários (como Atendentes) operarem o sistema com segurança.
* **CRUD de Produtos:** Cadastro, listagem (leitura), atualização e exclusão completa de itens do estoque da padaria (ex: pães, doces, laticínios).
* **Mapeamento de Regras de Negócio:** Suporte para gerenciamento de vendas (`venda` e `item_venda`), controle de métodos de pagamento, vínculos com fornecedores e monitoramento de produtos próximos ao vencimento.
* **Filtros e Buscas:** Barra de pesquisa otimizada para buscar produtos de forma dinâmica por partes do nome (ignorando maiúsculas e minúsculas).

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

### Back-end
* **Java 17:** Linguagem base do ecossistema.
* **Spring Boot:** Framework para aceleração e configuração da arquitetura.
* **Spring Data JPA / Hibernate:** Camada de persistência e mapeamento objeto-relacional (ORM).
* **Spring MVC:** Estruturação das rotas, requisições HTTP (`@GetMapping`, `@PostMapping`) e controle de views.

### Front-end
* **HTML5 & CSS3:** Estruturação visual e estilização customizada dos componentes da interface.
* **Thymeleaf:** Motor de template (*template engine*) para integração dinâmica dos dados do Java direto nas tags HTML via expressões (`th:field`, `th:object`, `th:action`).

### Banco de Dados & Ferramentas
* **MySQL:** Banco de dados relacional para armazenamento seguro das informações.
* **Git & GitHub:** Ferramentas para controle de versão distribuído e histórico de commits.
* **Jira Software:** Utilizado como ferramenta de *Bugtracking* para gerenciamento de ciclos de vida de falhas e garantia de qualidade (QA).
* **NetBeans IDE:** Ambiente de desenvolvimento integrado para codificação e build da aplicação via Maven.

---

## 📐 Estrutura do Banco de Dados

A camada de modelo do sistema mapeia um ecossistema de dados relacional contendo as seguintes entidades principais:
* `Produto` (id, nome, preco, quantidadeEstoque, dataCadastro, dataValidade, idFornecedor)
* `Usuario` (id, login, senha, perfil)
* `Venda` & `ItemVenda`
* `MetodoPagamento`

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Maven instalado (ou embutido na IDE).
* MySQ1. **Clonar o Repositório:**
   ```bash
   git clone [https://github.com/giselleleaodeoliveiradasilva-lab/SistemaPadaria_Web.git](https://github.com/giselleleaodeoliveiradasilva-lab/SistemaPadaria_Web.git)L Server ativo na máquina.
* 

# MaintenanceControl

App para gerenciar controle de manutenção de ar-condicionado em grandes lojas

## Endpoints
    - Procura Visitas
    - Cancelar Visitas
    - Conferir Visitas do dia
    - Atualizar a lista de visitas

---

### Procura Manutenção
`GET` /maintenancecontrol/api/ProcuraManuntencao

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|--
| id_empresa | string | sim | É o id para localizar a empresa.
| id_marca | string | sim | É o id para localizar a marca do ar-condicionado.
| id_modelo | string | sim | É o id para ver o modelo que sera trocado.
| login | string | sim | Login de acesso.
| senha | string | sim | Senha.


**Exemplo de corpo do request**

```js
{
    "id_empresa" : "Chamex",
    "id_marca": "Elgin",
    "id_modelo": "Ar Condicionado Split High Wall Eco Inverter",
    "login": "Gabriel",
    "senha": "abc123"
    
}
```

**Códigos de Exceção**

| código | descrição 
|-|-
| 201 | Cadastrado com sucesso
| 400 | Erro de cadastro

---

### Visualizar Manutenção
`GET` /maintenancecontrol/api/ProcuraManuntencao

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|--
| id_empresa | string | sim | É o id para localizar a empresa.
| id_marca | string | sim | É o id para localizar a marca do ar-condicionado.
| id_modelo | string | sim | É o id para ver o modelo que sera trocado.

**Exemplo de corpo do request**

```js
{
    "id_empresa" : "Chamex",
    "id_marca": "Elgin",
    "id_modelo": "Ar Condicionado Split High Wall Eco Inverter",
    
}
```

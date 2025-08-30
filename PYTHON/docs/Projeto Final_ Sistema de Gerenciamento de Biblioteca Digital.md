# Projeto Final: Sistema de Gerenciamento de Biblioteca Digital

**Autor:** Diogo Rocha
**Data:** Agosto 2025  
**Curso:** Python - Do Básico ao Avançado  
**Baseado no conteúdo:** W3Schools Python Tutorial

---

## Índice

1. [Visão Geral do Projeto](#1-visão-geral-do-projeto)
2. [Objetivos de Aprendizagem](#2-objetivos-de-aprendizagem)
3. [Requisitos Funcionais](#3-requisitos-funcionais)
4. [Requisitos Técnicos](#4-requisitos-técnicos)
5. [Arquitetura do Sistema](#5-arquitetura-do-sistema)
6. [Implementação Passo a Passo](#6-implementação-passo-a-passo)
7. [Estrutura de Arquivos](#7-estrutura-de-arquivos)
8. [Código Base](#8-código-base)
9. [Testes e Validação](#9-testes-e-validação)
10. [Extensões e Melhorias](#10-extensões-e-melhorias)
11. [Critérios de Avaliação](#11-critérios-de-avaliação)
12. [Recursos e Referências](#12-recursos-e-referências)

---

## 1. Visão Geral do Projeto

O projeto final consiste no desenvolvimento de um **Sistema de Gerenciamento de Biblioteca Digital** completo, que integra todos os conceitos aprendidos durante o curso de Python. Este sistema permitirá gerenciar livros, usuários, empréstimos e relatórios de uma biblioteca, demonstrando a aplicação prática de programação orientada a objetos, manipulação de arquivos, tratamento de exceções, e muito mais.

### 1.1 Contexto do Projeto

Em um mundo cada vez mais digitalizado, as bibliotecas precisam de sistemas eficientes para gerenciar seus acervos e atender seus usuários. Este projeto simula um ambiente real onde você desenvolverá uma solução completa que poderia ser utilizada por uma biblioteca real.

### 1.2 Escopo do Sistema

O sistema abrangerá as seguintes funcionalidades principais:

- **Gestão de Acervo:** Cadastro, edição e remoção de livros
- **Gestão de Usuários:** Registro e gerenciamento de bibliotecários e leitores
- **Sistema de Empréstimos:** Controle de empréstimos e devoluções
- **Relatórios:** Geração de relatórios estatísticos e gerenciais
- **Persistência de Dados:** Armazenamento em arquivos JSON e CSV
- **Interface de Usuário:** Menu interativo via linha de comando
- **Sistema de Logs:** Registro de todas as operações do sistema

### 1.3 Tecnologias Utilizadas

O projeto utilizará exclusivamente Python e suas bibliotecas padrão, incluindo:
- `json` para persistência de dados
- `csv` para relatórios
- `datetime` para controle de datas
- `logging` para sistema de logs
- `re` para validações com expressões regulares
- `os` para manipulação de arquivos e diretórios

---


## 2. Objetivos de Aprendizagem

Este projeto final foi cuidadosamente projetado para consolidar e aplicar todos os conceitos fundamentais do Python aprendidos durante o curso. Ao completar este projeto, você demonstrará domínio em:

### 2.1 Conceitos Fundamentais
- **Sintaxe e Estruturas Básicas:** Aplicação correta da sintaxe Python, uso adequado de indentação, comentários e convenções de nomenclatura
- **Tipos de Dados e Variáveis:** Manipulação eficiente de strings, números, booleanos e estruturas de dados complexas
- **Operadores:** Uso apropriado de operadores aritméticos, lógicos e de comparação em contextos reais

### 2.2 Estruturas de Dados Avançadas
- **Listas e Tuplas:** Implementação de coleções ordenadas para armazenar informações de livros e usuários
- **Dicionários:** Criação de estruturas de dados complexas para representar entidades do sistema
- **Sets:** Utilização para operações de conjunto e validações de unicidade

### 2.3 Controle de Fluxo
- **Estruturas Condicionais:** Implementação de lógica de negócio complexa com múltiplas condições
- **Loops:** Processamento eficiente de coleções de dados e implementação de menus interativos
- **Tratamento de Exceções:** Criação de um sistema robusto que lida graciosamente com erros

### 2.4 Programação Orientada a Objetos
- **Classes e Objetos:** Modelagem de entidades do mundo real (Livro, Usuario, Emprestimo)
- **Herança:** Criação de hierarquias de classes para diferentes tipos de usuários
- **Encapsulamento:** Proteção de dados sensíveis e implementação de interfaces consistentes
- **Polimorfismo:** Implementação de comportamentos específicos para diferentes tipos de objetos

### 2.5 Funções e Modularidade
- **Definição de Funções:** Criação de funções reutilizáveis e bem documentadas
- **Parâmetros e Argumentos:** Uso de argumentos padrão, *args e **kwargs
- **Funções Lambda:** Aplicação em operações de filtragem e ordenação
- **Módulos:** Organização do código em módulos coesos e reutilizáveis

### 2.6 Manipulação de Arquivos e Dados
- **Leitura e Escrita:** Persistência de dados em formatos JSON e CSV
- **Processamento de Dados:** Análise e transformação de informações para relatórios
- **Backup e Recuperação:** Implementação de mecanismos de segurança de dados

### 2.7 Tópicos Avançados
- **Expressões Regulares:** Validação de dados de entrada (emails, telefones, ISBNs)
- **Logging:** Implementação de sistema de auditoria e depuração
- **Datetime:** Manipulação de datas para controle de empréstimos e relatórios
- **Decoradores:** Implementação de funcionalidades transversais como logging e validação

---

## 3. Requisitos Funcionais

O sistema deve atender aos seguintes requisitos funcionais, organizados por módulo:

### 3.1 Módulo de Gestão de Livros

**RF001 - Cadastrar Livro**
O sistema deve permitir o cadastro de novos livros com as seguintes informações obrigatórias:
- Título (string, máximo 200 caracteres)
- Autor (string, máximo 100 caracteres)
- ISBN (string, formato válido ISBN-10 ou ISBN-13)
- Ano de publicação (inteiro, entre 1000 e ano atual)
- Gênero (string, selecionado de lista predefinida)
- Número de exemplares disponíveis (inteiro positivo)

**RF002 - Consultar Livro**
O sistema deve permitir a busca de livros por:
- Título (busca parcial, case-insensitive)
- Autor (busca parcial, case-insensitive)
- ISBN (busca exata)
- Gênero (seleção de lista)

**RF003 - Editar Livro**
O sistema deve permitir a edição de informações de livros existentes, exceto o ISBN que serve como identificador único.

**RF004 - Remover Livro**
O sistema deve permitir a remoção de livros do acervo, verificando se não há empréstimos ativos para o livro.

**RF005 - Listar Livros**
O sistema deve exibir lista de todos os livros com opções de ordenação por título, autor ou ano de publicação.

### 3.2 Módulo de Gestão de Usuários

**RF006 - Cadastrar Usuário**
O sistema deve permitir o cadastro de dois tipos de usuários:

*Bibliotecário:*
- Nome completo (string, máximo 100 caracteres)
- Email (string, formato válido)
- Telefone (string, formato brasileiro)
- Matrícula funcional (string, única)
- Senha (string, mínimo 8 caracteres)

*Leitor:*
- Nome completo (string, máximo 100 caracteres)
- Email (string, formato válido)
- Telefone (string, formato brasileiro)
- CPF (string, formato e dígitos válidos)
- Endereço completo (string)
- Data de nascimento (date)

**RF007 - Autenticar Usuário**
O sistema deve implementar autenticação para bibliotecários com email/matrícula e senha.

**RF008 - Consultar Usuário**
O sistema deve permitir busca de usuários por nome, email ou documento (matrícula/CPF).

**RF009 - Editar Usuário**
O sistema deve permitir edição de dados de usuários, mantendo a integridade dos identificadores únicos.

**RF010 - Remover Usuário**
O sistema deve permitir remoção de usuários, verificando se não há empréstimos ativos.

### 3.3 Módulo de Empréstimos

**RF011 - Realizar Empréstimo**
O sistema deve permitir o registro de empréstimos com:
- Seleção do livro (verificando disponibilidade)
- Identificação do leitor
- Data de empréstimo (automática)
- Data de devolução prevista (7 dias após empréstimo)
- Status do empréstimo (ativo/devolvido/atrasado)

**RF012 - Processar Devolução**
O sistema deve permitir o registro de devoluções, atualizando:
- Status do empréstimo
- Data de devolução real
- Disponibilidade do livro
- Cálculo de multas por atraso (se aplicável)

**RF013 - Consultar Empréstimos**
O sistema deve permitir consulta de empréstimos por:
- Usuário (todos os empréstimos de um leitor)
- Livro (histórico de empréstimos)
- Status (ativos, devolvidos, atrasados)
- Período (empréstimos em um intervalo de datas)

**RF014 - Renovar Empréstimo**
O sistema deve permitir renovação de empréstimos ativos por mais 7 dias, limitado a uma renovação por empréstimo.

### 3.4 Módulo de Relatórios

**RF015 - Relatório de Acervo**
O sistema deve gerar relatórios contendo:
- Total de livros por gênero
- Livros mais emprestados
- Livros nunca emprestados
- Estatísticas de disponibilidade

**RF016 - Relatório de Usuários**
O sistema deve gerar relatórios com:
- Total de usuários por tipo
- Leitores mais ativos
- Histórico de empréstimos por usuário

**RF017 - Relatório de Empréstimos**
O sistema deve gerar relatórios incluindo:
- Empréstimos por período
- Taxa de devolução no prazo
- Empréstimos em atraso
- Receita de multas

**RF018 - Exportar Relatórios**
O sistema deve permitir exportação de relatórios em formato CSV para análise externa.

### 3.5 Módulo de Administração

**RF019 - Backup de Dados**
O sistema deve implementar funcionalidade de backup automático e manual dos dados.

**RF020 - Restaurar Dados**
O sistema deve permitir restauração de dados a partir de backups anteriores.

**RF021 - Configurações do Sistema**
O sistema deve permitir configuração de:
- Prazo padrão de empréstimo
- Valor da multa por dia de atraso
- Número máximo de empréstimos por usuário
- Gêneros de livros disponíveis

**RF022 - Logs do Sistema**
O sistema deve manter logs detalhados de todas as operações realizadas.

---


## 4. Requisitos Técnicos

### 4.1 Requisitos de Ambiente

**RT001 - Versão do Python**
O sistema deve ser desenvolvido em Python 3.8 ou superior, utilizando apenas bibliotecas padrão da linguagem.

**RT002 - Estrutura de Arquivos**
O projeto deve seguir uma estrutura organizada de diretórios e módulos, facilitando manutenção e extensibilidade.

**RT003 - Documentação**
Todo o código deve ser adequadamente documentado com docstrings seguindo o padrão PEP 257.

**RT004 - Convenções de Código**
O código deve seguir as convenções PEP 8 para estilo e formatação.

### 4.2 Requisitos de Performance

**RT005 - Tempo de Resposta**
Operações básicas (cadastro, consulta, edição) devem ser executadas em menos de 1 segundo.

**RT006 - Capacidade de Dados**
O sistema deve suportar pelo menos 10.000 livros, 1.000 usuários e 50.000 empréstimos sem degradação significativa de performance.

**RT007 - Uso de Memória**
O sistema deve otimizar o uso de memória, carregando dados sob demanda quando necessário.

### 4.3 Requisitos de Segurança

**RT008 - Validação de Dados**
Todos os dados de entrada devem ser validados antes do processamento.

**RT009 - Tratamento de Exceções**
O sistema deve tratar graciosamente todas as exceções possíveis, evitando crashes.

**RT010 - Backup de Segurança**
O sistema deve criar backups automáticos dos dados a cada operação crítica.

### 4.4 Requisitos de Usabilidade

**RT011 - Interface Intuitiva**
A interface de linha de comando deve ser clara e fácil de navegar.

**RT012 - Mensagens de Erro**
Mensagens de erro devem ser claras e orientar o usuário sobre como corrigir problemas.

**RT013 - Confirmações**
Operações críticas (remoção, backup) devem solicitar confirmação do usuário.

### 4.5 Requisitos de Manutenibilidade

**RT014 - Modularidade**
O código deve ser organizado em módulos coesos com baixo acoplamento.

**RT015 - Extensibilidade**
A arquitetura deve permitir fácil adição de novas funcionalidades.

**RT016 - Testabilidade**
O código deve ser estruturado para facilitar a criação de testes unitários.

---

## 5. Arquitetura do Sistema

### 5.1 Visão Geral da Arquitetura

O sistema seguirá uma arquitetura em camadas (layered architecture) com separação clara de responsabilidades:

```
┌─────────────────────────────────────┐
│           Interface Layer           │
│        (Menu e Interação)           │
├─────────────────────────────────────┤
│          Business Layer             │
│      (Lógica de Negócio)            │
├─────────────────────────────────────┤
│           Data Layer                │
│    (Persistência e Acesso)          │
├─────────────────────────────────────┤
│          Model Layer                │
│      (Entidades do Domínio)         │
└─────────────────────────────────────┘
```

### 5.2 Camada de Modelo (Model Layer)

Esta camada contém as classes que representam as entidades do domínio:

**Classe Livro**
- Atributos: isbn, titulo, autor, ano_publicacao, genero, exemplares_total, exemplares_disponiveis
- Métodos: validar_isbn(), emprestar_exemplar(), devolver_exemplar(), to_dict(), from_dict()

**Classe Usuario (Abstrata)**
- Atributos: nome, email, telefone, data_cadastro
- Métodos: validar_email(), validar_telefone(), to_dict(), from_dict()

**Classe Bibliotecario (herda de Usuario)**
- Atributos: matricula, senha_hash
- Métodos: autenticar(), alterar_senha()

**Classe Leitor (herda de Usuario)**
- Atributos: cpf, endereco, data_nascimento
- Métodos: validar_cpf(), calcular_idade()

**Classe Emprestimo**
- Atributos: id, isbn_livro, cpf_leitor, data_emprestimo, data_devolucao_prevista, data_devolucao_real, status, renovado
- Métodos: calcular_multa(), esta_atrasado(), pode_renovar(), to_dict(), from_dict()

### 5.3 Camada de Dados (Data Layer)

Esta camada gerencia a persistência e acesso aos dados:

**Classe DataManager**
- Responsável por operações CRUD genéricas
- Métodos: salvar(), carregar(), backup(), restaurar()

**Classe LivroRepository**
- Gerencia persistência específica de livros
- Métodos: buscar_por_isbn(), buscar_por_titulo(), buscar_por_autor(), listar_por_genero()

**Classe UsuarioRepository**
- Gerencia persistência específica de usuários
- Métodos: buscar_por_email(), buscar_por_documento(), autenticar_bibliotecario()

**Classe EmprestimoRepository**
- Gerencia persistência específica de empréstimos
- Métodos: buscar_por_usuario(), buscar_por_livro(), buscar_atrasados(), buscar_por_periodo()

### 5.4 Camada de Negócio (Business Layer)

Esta camada implementa a lógica de negócio do sistema:

**Classe BibliotecaService**
- Orquestra operações complexas que envolvem múltiplas entidades
- Métodos: realizar_emprestimo(), processar_devolucao(), renovar_emprestimo()

**Classe RelatorioService**
- Gera relatórios e estatísticas
- Métodos: relatorio_acervo(), relatorio_usuarios(), relatorio_emprestimos()

**Classe ValidacaoService**
- Centraliza validações de negócio
- Métodos: validar_emprestimo(), validar_devolucao(), validar_cadastro()

### 5.5 Camada de Interface (Interface Layer)

Esta camada gerencia a interação com o usuário:

**Classe MenuPrincipal**
- Controla o fluxo principal da aplicação
- Métodos: exibir_menu(), processar_opcao()

**Classe MenuLivros**
- Gerencia operações relacionadas a livros
- Métodos: cadastrar_livro(), consultar_livro(), editar_livro()

**Classe MenuUsuarios**
- Gerencia operações relacionadas a usuários
- Métodos: cadastrar_usuario(), consultar_usuario(), autenticar()

**Classe MenuEmprestimos**
- Gerencia operações de empréstimo
- Métodos: realizar_emprestimo(), processar_devolucao(), consultar_emprestimos()

**Classe MenuRelatorios**
- Gerencia geração e exibição de relatórios
- Métodos: gerar_relatorio(), exportar_csv()

### 5.6 Utilitários e Serviços Transversais

**Classe Logger**
- Gerencia logs do sistema
- Métodos: log_operacao(), log_erro(), configurar_logging()

**Classe ConfigManager**
- Gerencia configurações do sistema
- Métodos: carregar_config(), salvar_config(), obter_valor()

**Classe Utils**
- Funções utilitárias gerais
- Métodos: formatar_data(), validar_cpf(), gerar_hash(), limpar_tela()

### 5.7 Fluxo de Dados

O fluxo típico de uma operação no sistema segue o padrão:

1. **Interface Layer** recebe entrada do usuário
2. **Business Layer** valida e processa a lógica de negócio
3. **Data Layer** persiste ou recupera dados
4. **Model Layer** representa e valida entidades
5. **Interface Layer** exibe resultado ao usuário

Este design garante separação de responsabilidades, facilita manutenção e permite extensibilidade futura do sistema.

---


## 6. Implementação Passo a Passo

### 6.1 Fase 1: Configuração Inicial e Estrutura Base (Semana 1)

**Passo 1.1: Criar Estrutura de Diretórios**
```
biblioteca_digital/
├── main.py
├── config/
│   ├── __init__.py
│   ├── settings.py
│   └── logging_config.py
├── models/
│   ├── __init__.py
│   ├── livro.py
│   ├── usuario.py
│   ├── bibliotecario.py
│   ├── leitor.py
│   └── emprestimo.py
├── data/
│   ├── __init__.py
│   ├── data_manager.py
│   ├── livro_repository.py
│   ├── usuario_repository.py
│   └── emprestimo_repository.py
├── services/
│   ├── __init__.py
│   ├── biblioteca_service.py
│   ├── relatorio_service.py
│   └── validacao_service.py
├── interface/
│   ├── __init__.py
│   ├── menu_principal.py
│   ├── menu_livros.py
│   ├── menu_usuarios.py
│   ├── menu_emprestimos.py
│   └── menu_relatorios.py
├── utils/
│   ├── __init__.py
│   ├── logger.py
│   ├── validators.py
│   └── helpers.py
├── storage/
│   ├── livros.json
│   ├── usuarios.json
│   ├── emprestimos.json
│   └── backups/
├── logs/
│   └── sistema.log
├── reports/
│   └── (arquivos CSV gerados)
└── tests/
    ├── __init__.py
    ├── test_models.py
    ├── test_services.py
    └── test_data.py
```

**Passo 1.2: Configurar Sistema de Logging**
Implementar configuração básica de logging para rastrear operações do sistema.

**Passo 1.3: Criar Classes Base**
Implementar as classes modelo básicas (Livro, Usuario, Emprestimo) com validações fundamentais.

### 6.2 Fase 2: Camada de Dados e Persistência (Semana 2)

**Passo 2.1: Implementar DataManager**
Criar classe base para operações de persistência em JSON.

**Passo 2.2: Implementar Repositories**
Desenvolver classes específicas para cada entidade com operações CRUD.

**Passo 2.3: Sistema de Backup**
Implementar funcionalidades de backup automático e manual.

**Passo 2.4: Testes de Persistência**
Criar testes para validar operações de dados.

### 6.3 Fase 3: Lógica de Negócio (Semana 3)

**Passo 3.1: Implementar BibliotecaService**
Desenvolver lógica para empréstimos, devoluções e renovações.

**Passo 3.2: Sistema de Validações**
Implementar validações complexas de negócio.

**Passo 3.3: Cálculo de Multas**
Desenvolver sistema de cálculo de multas por atraso.

**Passo 3.4: Testes de Negócio**
Criar testes para validar regras de negócio.

### 6.4 Fase 4: Interface de Usuário (Semana 4)

**Passo 4.1: Menu Principal**
Implementar navegação principal do sistema.

**Passo 4.2: Menus Específicos**
Desenvolver interfaces para cada módulo (livros, usuários, empréstimos).

**Passo 4.3: Sistema de Autenticação**
Implementar login para bibliotecários.

**Passo 4.4: Tratamento de Erros**
Implementar tratamento robusto de exceções na interface.

### 6.5 Fase 5: Relatórios e Finalização (Semana 5)

**Passo 5.1: Sistema de Relatórios**
Implementar geração de relatórios estatísticos.

**Passo 5.2: Exportação CSV**
Desenvolver funcionalidade de exportação de dados.

**Passo 5.3: Otimizações**
Implementar melhorias de performance e usabilidade.

**Passo 5.4: Documentação Final**
Completar documentação do código e manual do usuário.

---

## 7. Estrutura de Arquivos

### 7.1 Arquivo Principal (main.py)

```python
#!/usr/bin/env python3
"""
Sistema de Gerenciamento de Biblioteca Digital
Projeto Final - Curso Python Do Básico ao Avançado

Autor: [Seu Nome]
Data: [Data Atual]
Versão: 1.0
"""

import sys
import os
from pathlib import Path

# Adicionar diretório raiz ao path
sys.path.append(str(Path(__file__).parent))

from config.logging_config import configurar_logging
from interface.menu_principal import MenuPrincipal
from utils.logger import Logger

def main():
    """Função principal do sistema."""
    try:
        # Configurar logging
        configurar_logging()
        logger = Logger()
        logger.log_operacao("Sistema iniciado")
        
        # Inicializar menu principal
        menu = MenuPrincipal()
        menu.executar()
        
    except KeyboardInterrupt:
        print("\n\nSistema encerrado pelo usuário.")
    except Exception as e:
        print(f"Erro crítico: {e}")
        logger.log_erro(f"Erro crítico: {e}")
    finally:
        logger.log_operacao("Sistema encerrado")

if __name__ == "__main__":
    main()
```

### 7.2 Configurações (config/settings.py)

```python
"""
Configurações do Sistema de Biblioteca Digital
"""

import os
from pathlib import Path

# Diretórios base
BASE_DIR = Path(__file__).parent.parent
STORAGE_DIR = BASE_DIR / "storage"
LOGS_DIR = BASE_DIR / "logs"
REPORTS_DIR = BASE_DIR / "reports"
BACKUPS_DIR = STORAGE_DIR / "backups"

# Arquivos de dados
LIVROS_FILE = STORAGE_DIR / "livros.json"
USUARIOS_FILE = STORAGE_DIR / "usuarios.json"
EMPRESTIMOS_FILE = STORAGE_DIR / "emprestimos.json"

# Configurações de empréstimo
PRAZO_EMPRESTIMO_DIAS = 7
VALOR_MULTA_DIA = 2.00
MAX_EMPRESTIMOS_USUARIO = 3
MAX_RENOVACOES = 1

# Configurações de sistema
BACKUP_AUTOMATICO = True
BACKUP_INTERVALO_OPERACOES = 10

# Gêneros de livros disponíveis
GENEROS_LIVROS = [
    "Ficção",
    "Não-ficção",
    "Romance",
    "Mistério",
    "Fantasia",
    "Ficção Científica",
    "Biografia",
    "História",
    "Ciência",
    "Tecnologia",
    "Arte",
    "Filosofia",
    "Religião",
    "Autoajuda",
    "Infantil",
    "Juvenil",
    "Educação",
    "Negócios",
    "Saúde",
    "Culinária"
]

# Criar diretórios se não existirem
for directory in [STORAGE_DIR, LOGS_DIR, REPORTS_DIR, BACKUPS_DIR]:
    directory.mkdir(parents=True, exist_ok=True)
```

### 7.3 Modelo Base - Livro (models/livro.py)

```python
"""
Modelo para representar um Livro no sistema
"""

import re
from datetime import datetime
from typing import Dict, Any, Optional

class Livro:
    """Classe que representa um livro na biblioteca."""
    
    def __init__(self, isbn: str, titulo: str, autor: str, 
                 ano_publicacao: int, genero: str, exemplares_total: int):
        """
        Inicializa um novo livro.
        
        Args:
            isbn: Código ISBN do livro
            titulo: Título do livro
            autor: Nome do autor
            ano_publicacao: Ano de publicação
            genero: Gênero literário
            exemplares_total: Número total de exemplares
        """
        self.isbn = self._validar_isbn(isbn)
        self.titulo = titulo.strip()
        self.autor = autor.strip()
        self.ano_publicacao = self._validar_ano(ano_publicacao)
        self.genero = genero
        self.exemplares_total = max(1, exemplares_total)
        self.exemplares_disponiveis = self.exemplares_total
        self.data_cadastro = datetime.now()
        self.total_emprestimos = 0
    
    def _validar_isbn(self, isbn: str) -> str:
        """Valida formato do ISBN."""
        isbn_limpo = re.sub(r'[^0-9X]', '', isbn.upper())
        
        if len(isbn_limpo) == 10:
            return self._validar_isbn10(isbn_limpo)
        elif len(isbn_limpo) == 13:
            return self._validar_isbn13(isbn_limpo)
        else:
            raise ValueError("ISBN deve ter 10 ou 13 dígitos")
    
    def _validar_isbn10(self, isbn: str) -> str:
        """Valida ISBN-10."""
        if len(isbn) != 10:
            raise ValueError("ISBN-10 deve ter exatamente 10 caracteres")
        
        soma = 0
        for i, char in enumerate(isbn[:-1]):
            soma += int(char) * (10 - i)
        
        check_digit = isbn[-1]
        resto = soma % 11
        digito_esperado = 'X' if resto == 1 else str(11 - resto) if resto != 0 else '0'
        
        if check_digit != digito_esperado:
            raise ValueError("ISBN-10 inválido")
        
        return isbn
    
    def _validar_isbn13(self, isbn: str) -> str:
        """Valida ISBN-13."""
        if len(isbn) != 13:
            raise ValueError("ISBN-13 deve ter exatamente 13 dígitos")
        
        soma = 0
        for i, char in enumerate(isbn[:-1]):
            multiplicador = 1 if i % 2 == 0 else 3
            soma += int(char) * multiplicador
        
        check_digit = int(isbn[-1])
        digito_esperado = (10 - (soma % 10)) % 10
        
        if check_digit != digito_esperado:
            raise ValueError("ISBN-13 inválido")
        
        return isbn
    
    def _validar_ano(self, ano: int) -> int:
        """Valida ano de publicação."""
        ano_atual = datetime.now().year
        if not (1000 <= ano <= ano_atual):
            raise ValueError(f"Ano deve estar entre 1000 e {ano_atual}")
        return ano
    
    def emprestar_exemplar(self) -> bool:
        """
        Empresta um exemplar do livro.
        
        Returns:
            True se o empréstimo foi realizado, False caso contrário
        """
        if self.exemplares_disponiveis > 0:
            self.exemplares_disponiveis -= 1
            self.total_emprestimos += 1
            return True
        return False
    
    def devolver_exemplar(self) -> bool:
        """
        Devolve um exemplar do livro.
        
        Returns:
            True se a devolução foi realizada, False caso contrário
        """
        if self.exemplares_disponiveis < self.exemplares_total:
            self.exemplares_disponiveis += 1
            return True
        return False
    
    def esta_disponivel(self) -> bool:
        """Verifica se há exemplares disponíveis."""
        return self.exemplares_disponiveis > 0
    
    def to_dict(self) -> Dict[str, Any]:
        """Converte o livro para dicionário."""
        return {
            'isbn': self.isbn,
            'titulo': self.titulo,
            'autor': self.autor,
            'ano_publicacao': self.ano_publicacao,
            'genero': self.genero,
            'exemplares_total': self.exemplares_total,
            'exemplares_disponiveis': self.exemplares_disponiveis,
            'data_cadastro': self.data_cadastro.isoformat(),
            'total_emprestimos': self.total_emprestimos
        }
    
    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> 'Livro':
        """Cria um livro a partir de dicionário."""
        livro = cls(
            isbn=data['isbn'],
            titulo=data['titulo'],
            autor=data['autor'],
            ano_publicacao=data['ano_publicacao'],
            genero=data['genero'],
            exemplares_total=data['exemplares_total']
        )
        livro.exemplares_disponiveis = data.get('exemplares_disponiveis', livro.exemplares_total)
        livro.total_emprestimos = data.get('total_emprestimos', 0)
        
        if 'data_cadastro' in data:
            livro.data_cadastro = datetime.fromisoformat(data['data_cadastro'])
        
        return livro
    
    def __str__(self) -> str:
        """Representação em string do livro."""
        return f"{self.titulo} - {self.autor} ({self.ano_publicacao})"
    
    def __repr__(self) -> str:
        """Representação técnica do livro."""
        return f"Livro(isbn='{self.isbn}', titulo='{self.titulo}', autor='{self.autor}')"
    
    def __eq__(self, other) -> bool:
        """Compara livros pelo ISBN."""
        if isinstance(other, Livro):
            return self.isbn == other.isbn
        return False
    
    def __hash__(self) -> int:
        """Hash baseado no ISBN."""
        return hash(self.isbn)
```

---


### 7.4 Modelo Base - Usuario (models/usuario.py)

```python
"""
Modelo base para usuários do sistema
"""

import re
from abc import ABC, abstractmethod
from datetime import datetime
from typing import Dict, Any

class Usuario(ABC):
    """Classe abstrata base para usuários do sistema."""
    
    def __init__(self, nome: str, email: str, telefone: str):
        """
        Inicializa um usuário.
        
        Args:
            nome: Nome completo do usuário
            email: Email do usuário
            telefone: Telefone do usuário
        """
        self.nome = nome.strip()
        self.email = self._validar_email(email)
        self.telefone = self._validar_telefone(telefone)
        self.data_cadastro = datetime.now()
        self.ativo = True
    
    def _validar_email(self, email: str) -> str:
        """Valida formato do email."""
        email = email.strip().lower()
        padrao = r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'
        
        if not re.match(padrao, email):
            raise ValueError("Formato de email inválido")
        
        return email
    
    def _validar_telefone(self, telefone: str) -> str:
        """Valida formato do telefone brasileiro."""
        # Remove caracteres não numéricos
        telefone_limpo = re.sub(r'[^0-9]', '', telefone)
        
        # Verifica se tem 10 ou 11 dígitos
        if len(telefone_limpo) not in [10, 11]:
            raise ValueError("Telefone deve ter 10 ou 11 dígitos")
        
        # Formata o telefone
        if len(telefone_limpo) == 10:
            return f"({telefone_limpo[:2]}) {telefone_limpo[2:6]}-{telefone_limpo[6:]}"
        else:
            return f"({telefone_limpo[:2]}) {telefone_limpo[2:7]}-{telefone_limpo[7:]}"
    
    @abstractmethod
    def to_dict(self) -> Dict[str, Any]:
        """Converte o usuário para dicionário."""
        pass
    
    @abstractmethod
    def get_identificador(self) -> str:
        """Retorna o identificador único do usuário."""
        pass
    
    def __str__(self) -> str:
        """Representação em string do usuário."""
        return f"{self.nome} ({self.email})"
```

### 7.5 Modelo Bibliotecario (models/bibliotecario.py)

```python
"""
Modelo para representar um Bibliotecário
"""

import hashlib
from typing import Dict, Any
from .usuario import Usuario

class Bibliotecario(Usuario):
    """Classe que representa um bibliotecário do sistema."""
    
    def __init__(self, nome: str, email: str, telefone: str, matricula: str, senha: str):
        """
        Inicializa um bibliotecário.
        
        Args:
            nome: Nome completo
            email: Email
            telefone: Telefone
            matricula: Matrícula funcional
            senha: Senha de acesso
        """
        super().__init__(nome, email, telefone)
        self.matricula = matricula.strip().upper()
        self.senha_hash = self._gerar_hash_senha(senha)
        self.ultimo_login = None
    
    def _gerar_hash_senha(self, senha: str) -> str:
        """Gera hash da senha usando SHA-256."""
        if len(senha) < 8:
            raise ValueError("Senha deve ter pelo menos 8 caracteres")
        
        return hashlib.sha256(senha.encode()).hexdigest()
    
    def autenticar(self, senha: str) -> bool:
        """
        Autentica o bibliotecário.
        
        Args:
            senha: Senha para verificação
            
        Returns:
            True se a senha estiver correta
        """
        hash_fornecido = hashlib.sha256(senha.encode()).hexdigest()
        if hash_fornecido == self.senha_hash:
            self.ultimo_login = datetime.now()
            return True
        return False
    
    def alterar_senha(self, senha_atual: str, nova_senha: str) -> bool:
        """
        Altera a senha do bibliotecário.
        
        Args:
            senha_atual: Senha atual para verificação
            nova_senha: Nova senha
            
        Returns:
            True se a senha foi alterada com sucesso
        """
        if self.autenticar(senha_atual):
            self.senha_hash = self._gerar_hash_senha(nova_senha)
            return True
        return False
    
    def get_identificador(self) -> str:
        """Retorna a matrícula como identificador."""
        return self.matricula
    
    def to_dict(self) -> Dict[str, Any]:
        """Converte o bibliotecário para dicionário."""
        return {
            'tipo': 'bibliotecario',
            'nome': self.nome,
            'email': self.email,
            'telefone': self.telefone,
            'matricula': self.matricula,
            'senha_hash': self.senha_hash,
            'data_cadastro': self.data_cadastro.isoformat(),
            'ultimo_login': self.ultimo_login.isoformat() if self.ultimo_login else None,
            'ativo': self.ativo
        }
    
    @classmethod
    def from_dict(cls, data: Dict[str, Any]) -> 'Bibliotecario':
        """Cria um bibliotecário a partir de dicionário."""
        # Cria com senha temporária (será substituída pelo hash)
        bibliotecario = cls.__new__(cls)
        Usuario.__init__(bibliotecario, data['nome'], data['email'], data['telefone'])
        
        bibliotecario.matricula = data['matricula']
        bibliotecario.senha_hash = data['senha_hash']
        bibliotecario.data_cadastro = datetime.fromisoformat(data['data_cadastro'])
        bibliotecario.ativo = data.get('ativo', True)
        
        if data.get('ultimo_login'):
            bibliotecario.ultimo_login = datetime.fromisoformat(data['ultimo_login'])
        else:
            bibliotecario.ultimo_login = None
        
        return bibliotecario
```

### 7.6 Gerenciador de Dados (data/data_manager.py)

```python
"""
Gerenciador de dados para persistência em JSON
"""

import json
import shutil
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Any, Optional

from config.settings import BACKUPS_DIR
from utils.logger import Logger

class DataManager:
    """Classe responsável por operações de persistência de dados."""
    
    def __init__(self, arquivo_dados: Path):
        """
        Inicializa o gerenciador de dados.
        
        Args:
            arquivo_dados: Caminho para o arquivo de dados
        """
        self.arquivo_dados = arquivo_dados
        self.logger = Logger()
        
        # Criar arquivo se não existir
        if not self.arquivo_dados.exists():
            self.salvar([])
    
    def carregar(self) -> List[Dict[str, Any]]:
        """
        Carrega dados do arquivo JSON.
        
        Returns:
            Lista de dicionários com os dados
        """
        try:
            with open(self.arquivo_dados, 'r', encoding='utf-8') as arquivo:
                dados = json.load(arquivo)
                self.logger.log_operacao(f"Dados carregados de {self.arquivo_dados.name}")
                return dados
        except FileNotFoundError:
            self.logger.log_erro(f"Arquivo não encontrado: {self.arquivo_dados}")
            return []
        except json.JSONDecodeError as e:
            self.logger.log_erro(f"Erro ao decodificar JSON: {e}")
            return []
        except Exception as e:
            self.logger.log_erro(f"Erro ao carregar dados: {e}")
            return []
    
    def salvar(self, dados: List[Dict[str, Any]]) -> bool:
        """
        Salva dados no arquivo JSON.
        
        Args:
            dados: Lista de dicionários para salvar
            
        Returns:
            True se salvou com sucesso
        """
        try:
            # Criar backup antes de salvar
            self._criar_backup()
            
            with open(self.arquivo_dados, 'w', encoding='utf-8') as arquivo:
                json.dump(dados, arquivo, indent=2, ensure_ascii=False)
            
            self.logger.log_operacao(f"Dados salvos em {self.arquivo_dados.name}")
            return True
        except Exception as e:
            self.logger.log_erro(f"Erro ao salvar dados: {e}")
            return False
    
    def _criar_backup(self) -> bool:
        """
        Cria backup do arquivo atual.
        
        Returns:
            True se o backup foi criado com sucesso
        """
        try:
            if self.arquivo_dados.exists():
                timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
                nome_backup = f"{self.arquivo_dados.stem}_{timestamp}.json"
                caminho_backup = BACKUPS_DIR / nome_backup
                
                shutil.copy2(self.arquivo_dados, caminho_backup)
                self.logger.log_operacao(f"Backup criado: {nome_backup}")
                
                # Manter apenas os 10 backups mais recentes
                self._limpar_backups_antigos()
                
                return True
        except Exception as e:
            self.logger.log_erro(f"Erro ao criar backup: {e}")
            return False
    
    def _limpar_backups_antigos(self, max_backups: int = 10) -> None:
        """
        Remove backups antigos, mantendo apenas os mais recentes.
        
        Args:
            max_backups: Número máximo de backups a manter
        """
        try:
            padrao = f"{self.arquivo_dados.stem}_*.json"
            backups = list(BACKUPS_DIR.glob(padrao))
            
            if len(backups) > max_backups:
                # Ordenar por data de modificação (mais antigos primeiro)
                backups.sort(key=lambda x: x.stat().st_mtime)
                
                # Remover backups excedentes
                for backup in backups[:-max_backups]:
                    backup.unlink()
                    self.logger.log_operacao(f"Backup removido: {backup.name}")
        except Exception as e:
            self.logger.log_erro(f"Erro ao limpar backups: {e}")
    
    def restaurar_backup(self, nome_backup: str) -> bool:
        """
        Restaura dados a partir de um backup.
        
        Args:
            nome_backup: Nome do arquivo de backup
            
        Returns:
            True se a restauração foi bem-sucedida
        """
        try:
            caminho_backup = BACKUPS_DIR / nome_backup
            
            if not caminho_backup.exists():
                self.logger.log_erro(f"Backup não encontrado: {nome_backup}")
                return False
            
            # Criar backup do arquivo atual antes de restaurar
            self._criar_backup()
            
            # Restaurar backup
            shutil.copy2(caminho_backup, self.arquivo_dados)
            self.logger.log_operacao(f"Dados restaurados do backup: {nome_backup}")
            
            return True
        except Exception as e:
            self.logger.log_erro(f"Erro ao restaurar backup: {e}")
            return False
    
    def listar_backups(self) -> List[str]:
        """
        Lista todos os backups disponíveis.
        
        Returns:
            Lista com nomes dos arquivos de backup
        """
        try:
            padrao = f"{self.arquivo_dados.stem}_*.json"
            backups = list(BACKUPS_DIR.glob(padrao))
            
            # Ordenar por data de modificação (mais recentes primeiro)
            backups.sort(key=lambda x: x.stat().st_mtime, reverse=True)
            
            return [backup.name for backup in backups]
        except Exception as e:
            self.logger.log_erro(f"Erro ao listar backups: {e}")
            return []
```

### 7.7 Menu Principal (interface/menu_principal.py)

```python
"""
Menu principal do sistema de biblioteca
"""

import os
from typing import Optional

from services.biblioteca_service import BibliotecaService
from interface.menu_livros import MenuLivros
from interface.menu_usuarios import MenuUsuarios
from interface.menu_emprestimos import MenuEmprestimos
from interface.menu_relatorios import MenuRelatorios
from utils.logger import Logger
from utils.helpers import limpar_tela, pausar

class MenuPrincipal:
    """Classe responsável pelo menu principal do sistema."""
    
    def __init__(self):
        """Inicializa o menu principal."""
        self.logger = Logger()
        self.biblioteca_service = BibliotecaService()
        self.usuario_logado = None
        
        # Inicializar submenus
        self.menu_livros = MenuLivros(self.biblioteca_service)
        self.menu_usuarios = MenuUsuarios(self.biblioteca_service)
        self.menu_emprestimos = MenuEmprestimos(self.biblioteca_service)
        self.menu_relatorios = MenuRelatorios(self.biblioteca_service)
    
    def executar(self) -> None:
        """Executa o loop principal do sistema."""
        self._exibir_boas_vindas()
        
        while True:
            try:
                if not self.usuario_logado:
                    if not self._realizar_login():
                        continue
                
                opcao = self._exibir_menu_principal()
                
                if opcao == '1':
                    self.menu_livros.executar()
                elif opcao == '2':
                    self.menu_usuarios.executar()
                elif opcao == '3':
                    self.menu_emprestimos.executar()
                elif opcao == '4':
                    self.menu_relatorios.executar()
                elif opcao == '5':
                    self._gerenciar_sistema()
                elif opcao == '6':
                    self._logout()
                elif opcao == '0':
                    if self._confirmar_saida():
                        break
                else:
                    print("Opção inválida! Tente novamente.")
                    pausar()
                    
            except KeyboardInterrupt:
                print("\n\nOperação cancelada pelo usuário.")
                pausar()
            except Exception as e:
                print(f"Erro inesperado: {e}")
                self.logger.log_erro(f"Erro no menu principal: {e}")
                pausar()
    
    def _exibir_boas_vindas(self) -> None:
        """Exibe mensagem de boas-vindas."""
        limpar_tela()
        print("=" * 60)
        print("    SISTEMA DE GERENCIAMENTO DE BIBLIOTECA DIGITAL")
        print("=" * 60)
        print("    Bem-vindo ao sistema de gestão da sua biblioteca!")
        print("=" * 60)
        print()
    
    def _realizar_login(self) -> bool:
        """
        Realiza o processo de login.
        
        Returns:
            True se o login foi bem-sucedido
        """
        limpar_tela()
        print("=" * 40)
        print("           LOGIN DO SISTEMA")
        print("=" * 40)
        print()
        
        try:
            email_ou_matricula = input("Email ou Matrícula: ").strip()
            senha = input("Senha: ").strip()
            
            if not email_ou_matricula or not senha:
                print("Email/matrícula e senha são obrigatórios!")
                pausar()
                return False
            
            usuario = self.biblioteca_service.autenticar_bibliotecario(email_ou_matricula, senha)
            
            if usuario:
                self.usuario_logado = usuario
                print(f"\nLogin realizado com sucesso!")
                print(f"Bem-vindo(a), {usuario.nome}!")
                self.logger.log_operacao(f"Login realizado: {usuario.email}")
                pausar()
                return True
            else:
                print("Credenciais inválidas!")
                pausar()
                return False
                
        except Exception as e:
            print(f"Erro ao realizar login: {e}")
            self.logger.log_erro(f"Erro no login: {e}")
            pausar()
            return False
    
    def _exibir_menu_principal(self) -> str:
        """
        Exibe o menu principal e retorna a opção escolhida.
        
        Returns:
            Opção escolhida pelo usuário
        """
        limpar_tela()
        print("=" * 50)
        print("              MENU PRINCIPAL")
        print("=" * 50)
        print(f"Usuário: {self.usuario_logado.nome}")
        print(f"Último login: {self.usuario_logado.ultimo_login.strftime('%d/%m/%Y %H:%M') if self.usuario_logado.ultimo_login else 'Primeiro acesso'}")
        print("=" * 50)
        print()
        print("1. Gerenciar Livros")
        print("2. Gerenciar Usuários")
        print("3. Gerenciar Empréstimos")
        print("4. Relatórios")
        print("5. Administração do Sistema")
        print("6. Logout")
        print("0. Sair do Sistema")
        print()
        print("=" * 50)
        
        return input("Escolha uma opção: ").strip()
    
    def _gerenciar_sistema(self) -> None:
        """Exibe menu de administração do sistema."""
        while True:
            limpar_tela()
            print("=" * 40)
            print("    ADMINISTRAÇÃO DO SISTEMA")
            print("=" * 40)
            print()
            print("1. Criar Backup Manual")
            print("2. Restaurar Backup")
            print("3. Listar Backups")
            print("4. Configurações")
            print("5. Logs do Sistema")
            print("0. Voltar")
            print()
            
            opcao = input("Escolha uma opção: ").strip()
            
            if opcao == '1':
                self._criar_backup_manual()
            elif opcao == '2':
                self._restaurar_backup()
            elif opcao == '3':
                self._listar_backups()
            elif opcao == '4':
                self._exibir_configuracoes()
            elif opcao == '5':
                self._exibir_logs()
            elif opcao == '0':
                break
            else:
                print("Opção inválida!")
                pausar()
    
    def _logout(self) -> None:
        """Realiza logout do usuário."""
        if self.usuario_logado:
            self.logger.log_operacao(f"Logout realizado: {self.usuario_logado.email}")
            self.usuario_logado = None
            print("Logout realizado com sucesso!")
            pausar()
    
    def _confirmar_saida(self) -> bool:
        """
        Confirma se o usuário deseja sair do sistema.
        
        Returns:
            True se confirmou a saída
        """
        resposta = input("\nDeseja realmente sair do sistema? (s/N): ").strip().lower()
        return resposta in ['s', 'sim', 'y', 'yes']
    
    def _criar_backup_manual(self) -> None:
        """Cria backup manual dos dados."""
        print("\nCriando backup manual...")
        try:
            if self.biblioteca_service.criar_backup():
                print("Backup criado com sucesso!")
            else:
                print("Erro ao criar backup!")
        except Exception as e:
            print(f"Erro ao criar backup: {e}")
        pausar()
    
    def _restaurar_backup(self) -> None:
        """Restaura dados a partir de backup."""
        backups = self.biblioteca_service.listar_backups()
        
        if not backups:
            print("Nenhum backup disponível!")
            pausar()
            return
        
        print("\nBackups disponíveis:")
        for i, backup in enumerate(backups, 1):
            print(f"{i}. {backup}")
        
        try:
            escolha = int(input("\nEscolha o backup (0 para cancelar): "))
            
            if escolha == 0:
                return
            
            if 1 <= escolha <= len(backups):
                backup_escolhido = backups[escolha - 1]
                
                confirmacao = input(f"\nConfirma restauração do backup '{backup_escolhido}'? (s/N): ").strip().lower()
                
                if confirmacao in ['s', 'sim']:
                    if self.biblioteca_service.restaurar_backup(backup_escolhido):
                        print("Backup restaurado com sucesso!")
                    else:
                        print("Erro ao restaurar backup!")
                else:
                    print("Operação cancelada.")
            else:
                print("Opção inválida!")
                
        except ValueError:
            print("Entrada inválida!")
        except Exception as e:
            print(f"Erro ao restaurar backup: {e}")
        
        pausar()
    
    def _listar_backups(self) -> None:
        """Lista todos os backups disponíveis."""
        backups = self.biblioteca_service.listar_backups()
        
        if not backups:
            print("Nenhum backup disponível!")
        else:
            print(f"\nBackups disponíveis ({len(backups)}):")
            print("-" * 40)
            for backup in backups:
                print(f"• {backup}")
        
        pausar()
    
    def _exibir_configuracoes(self) -> None:
        """Exibe configurações do sistema."""
        from config.settings import (
            PRAZO_EMPRESTIMO_DIAS, VALOR_MULTA_DIA, 
            MAX_EMPRESTIMOS_USUARIO, MAX_RENOVACOES
        )
        
        print("\nConfigurações do Sistema:")
        print("-" * 30)
        print(f"Prazo de empréstimo: {PRAZO_EMPRESTIMO_DIAS} dias")
        print(f"Valor da multa por dia: R$ {VALOR_MULTA_DIA:.2f}")
        print(f"Máximo de empréstimos por usuário: {MAX_EMPRESTIMOS_USUARIO}")
        print(f"Máximo de renovações: {MAX_RENOVACOES}")
        
        pausar()
    
    def _exibir_logs(self) -> None:
        """Exibe logs recentes do sistema."""
        try:
            logs = self.logger.obter_logs_recentes(50)
            
            if not logs:
                print("Nenhum log disponível!")
            else:
                print(f"\nLogs recentes ({len(logs)} entradas):")
                print("-" * 60)
                for log in logs:
                    print(log)
        except Exception as e:
            print(f"Erro ao exibir logs: {e}")
        
        pausar()
```

---


## 8. Código Base

O código apresentado nas seções anteriores fornece uma base sólida para o desenvolvimento do sistema. Os arquivos principais incluem:

- **Modelos de dados** com validações robustas e métodos de conversão
- **Gerenciador de persistência** com backup automático e recuperação
- **Interface de usuário** com navegação intuitiva e tratamento de erros
- **Sistema de logging** para auditoria e depuração

### 8.1 Padrões de Implementação

O projeto segue padrões estabelecidos da indústria:

- **Repository Pattern** para acesso a dados
- **Service Layer** para lógica de negócio
- **MVC Pattern** para separação de responsabilidades
- **Dependency Injection** para baixo acoplamento

### 8.2 Convenções de Código

Todo o código deve seguir as convenções PEP 8:
- Nomes de classes em PascalCase
- Nomes de métodos e variáveis em snake_case
- Constantes em UPPER_CASE
- Docstrings em formato Google Style

---

## 9. Testes e Validação

### 9.1 Estratégia de Testes

O projeto deve incluir testes abrangentes para garantir qualidade e confiabilidade:

**Testes Unitários**
- Validação de modelos de dados
- Lógica de negócio dos services
- Operações de persistência
- Funções utilitárias

**Testes de Integração**
- Fluxos completos de empréstimo
- Operações de backup e restauração
- Geração de relatórios

**Testes de Sistema**
- Navegação completa pelos menus
- Cenários de uso real
- Tratamento de erros

### 9.2 Exemplo de Teste Unitário

```python
"""
Testes para a classe Livro
"""

import unittest
from datetime import datetime
from models.livro import Livro

class TestLivro(unittest.TestCase):
    """Testes unitários para a classe Livro."""
    
    def setUp(self):
        """Configuração inicial para os testes."""
        self.livro_valido = Livro(
            isbn="9788535902773",
            titulo="Dom Casmurro",
            autor="Machado de Assis",
            ano_publicacao=1899,
            genero="Romance",
            exemplares_total=5
        )
    
    def test_criacao_livro_valido(self):
        """Testa criação de livro com dados válidos."""
        self.assertEqual(self.livro_valido.titulo, "Dom Casmurro")
        self.assertEqual(self.livro_valido.autor, "Machado de Assis")
        self.assertEqual(self.livro_valido.exemplares_disponiveis, 5)
    
    def test_isbn_invalido(self):
        """Testa validação de ISBN inválido."""
        with self.assertRaises(ValueError):
            Livro(
                isbn="123456789",  # ISBN inválido
                titulo="Teste",
                autor="Autor Teste",
                ano_publicacao=2020,
                genero="Ficção",
                exemplares_total=1
            )
    
    def test_emprestimo_exemplar(self):
        """Testa empréstimo de exemplar."""
        inicial = self.livro_valido.exemplares_disponiveis
        resultado = self.livro_valido.emprestar_exemplar()
        
        self.assertTrue(resultado)
        self.assertEqual(self.livro_valido.exemplares_disponiveis, inicial - 1)
        self.assertEqual(self.livro_valido.total_emprestimos, 1)
    
    def test_emprestimo_sem_exemplares(self):
        """Testa empréstimo quando não há exemplares disponíveis."""
        # Emprestar todos os exemplares
        for _ in range(self.livro_valido.exemplares_total):
            self.livro_valido.emprestar_exemplar()
        
        # Tentar emprestar mais um
        resultado = self.livro_valido.emprestar_exemplar()
        self.assertFalse(resultado)
    
    def test_devolucao_exemplar(self):
        """Testa devolução de exemplar."""
        # Primeiro emprestar
        self.livro_valido.emprestar_exemplar()
        inicial = self.livro_valido.exemplares_disponiveis
        
        # Depois devolver
        resultado = self.livro_valido.devolver_exemplar()
        
        self.assertTrue(resultado)
        self.assertEqual(self.livro_valido.exemplares_disponiveis, inicial + 1)
    
    def test_conversao_dicionario(self):
        """Testa conversão para dicionário e volta."""
        dict_livro = self.livro_valido.to_dict()
        livro_restaurado = Livro.from_dict(dict_livro)
        
        self.assertEqual(self.livro_valido.isbn, livro_restaurado.isbn)
        self.assertEqual(self.livro_valido.titulo, livro_restaurado.titulo)
        self.assertEqual(self.livro_valido.autor, livro_restaurado.autor)

if __name__ == '__main__':
    unittest.main()
```

### 9.3 Dados de Teste

O projeto deve incluir dados de teste realistas:

```python
"""
Dados de teste para o sistema
"""

LIVROS_TESTE = [
    {
        "isbn": "9788535902773",
        "titulo": "Dom Casmurro",
        "autor": "Machado de Assis",
        "ano_publicacao": 1899,
        "genero": "Romance",
        "exemplares_total": 3
    },
    {
        "isbn": "9788525406958",
        "titulo": "O Cortiço",
        "autor": "Aluísio Azevedo",
        "ano_publicacao": 1890,
        "genero": "Romance",
        "exemplares_total": 2
    },
    {
        "isbn": "9788535909739",
        "titulo": "1984",
        "autor": "George Orwell",
        "ano_publicacao": 1949,
        "genero": "Ficção Científica",
        "exemplares_total": 4
    }
]

USUARIOS_TESTE = [
    {
        "tipo": "bibliotecario",
        "nome": "Maria Silva",
        "email": "maria.silva@biblioteca.com",
        "telefone": "(11) 99999-9999",
        "matricula": "BIB001",
        "senha": "senha123"
    },
    {
        "tipo": "leitor",
        "nome": "João Santos",
        "email": "joao.santos@email.com",
        "telefone": "(11) 88888-8888",
        "cpf": "123.456.789-00",
        "endereco": "Rua das Flores, 123",
        "data_nascimento": "1990-05-15"
    }
]
```

---

## 10. Extensões e Melhorias

### 10.1 Funcionalidades Adicionais

Após completar o projeto básico, considere implementar:

**Sistema de Reservas**
- Permitir reserva de livros emprestados
- Fila de espera para livros populares
- Notificações de disponibilidade

**Sistema de Multas**
- Cálculo automático de multas
- Controle de pagamentos
- Relatórios financeiros

**Sistema de Recomendações**
- Sugestões baseadas no histórico
- Livros similares por gênero
- Autores relacionados

**Interface Web**
- Desenvolvimento com Flask
- Interface responsiva
- API REST para integração

**Integração com APIs Externas**
- Busca de informações de livros
- Importação de catálogos
- Sincronização com outros sistemas

### 10.2 Melhorias Técnicas

**Performance**
- Indexação de dados para buscas rápidas
- Cache de consultas frequentes
- Paginação de resultados

**Segurança**
- Criptografia de dados sensíveis
- Controle de acesso por perfis
- Auditoria completa de operações

**Usabilidade**
- Interface gráfica com Tkinter
- Atalhos de teclado
- Configurações personalizáveis

**Integração**
- Banco de dados SQL
- Sistema de email
- Integração com catálogos online

---

## 11. Critérios de Avaliação

### 11.1 Funcionalidade (30 pontos)

**Implementação Completa (15 pontos)**
- Todos os requisitos funcionais implementados
- Sistema funciona sem erros críticos
- Fluxos principais operacionais

**Validações e Tratamento de Erros (15 pontos)**
- Validação adequada de dados de entrada
- Tratamento robusto de exceções
- Mensagens de erro claras e úteis

### 11.2 Qualidade do Código (25 pontos)

**Estrutura e Organização (10 pontos)**
- Código bem organizado em módulos
- Separação clara de responsabilidades
- Arquitetura coerente

**Convenções e Estilo (8 pontos)**
- Seguimento das convenções PEP 8
- Nomes descritivos para variáveis e funções
- Código limpo e legível

**Documentação (7 pontos)**
- Docstrings em todas as classes e métodos
- Comentários explicativos quando necessário
- README com instruções de uso

### 11.3 Programação Orientada a Objetos (20 pontos)

**Modelagem de Classes (10 pontos)**
- Classes bem definidas e coesas
- Relacionamentos apropriados entre classes
- Uso adequado de herança

**Encapsulamento e Abstração (10 pontos)**
- Atributos e métodos apropriadamente encapsulados
- Interfaces bem definidas
- Uso de classes abstratas quando apropriado

### 11.4 Persistência e Dados (15 pontos)

**Gerenciamento de Dados (8 pontos)**
- Persistência eficiente em JSON
- Operações CRUD completas
- Integridade dos dados mantida

**Sistema de Backup (7 pontos)**
- Backup automático funcional
- Restauração de dados operacional
- Gerenciamento de versões de backup

### 11.5 Interface e Usabilidade (10 pontos)

**Interface de Usuário (5 pontos)**
- Menus claros e intuitivos
- Navegação fluida
- Feedback adequado ao usuário

**Experiência do Usuário (5 pontos)**
- Sistema fácil de usar
- Operações eficientes
- Tratamento gracioso de erros

### 11.6 Critérios de Excelência (Bônus)

**Testes Automatizados (+5 pontos)**
- Testes unitários abrangentes
- Cobertura de código adequada
- Testes de integração

**Funcionalidades Extras (+5 pontos)**
- Implementação de funcionalidades adicionais
- Inovações na solução
- Melhorias de performance

**Documentação Avançada (+3 pontos)**
- Manual do usuário completo
- Documentação técnica detalhada
- Diagramas de arquitetura

---

## 12. Recursos e Referências

### 12.1 Documentação Oficial

**Python**
- [Documentação Python 3](https://docs.python.org/3/) - Referência completa da linguagem
- [PEP 8](https://pep8.org/) - Guia de estilo para código Python
- [PEP 257](https://www.python.org/dev/peps/pep-0257/) - Convenções para docstrings

**Bibliotecas Utilizadas**
- [JSON](https://docs.python.org/3/library/json.html) - Manipulação de dados JSON
- [Datetime](https://docs.python.org/3/library/datetime.html) - Manipulação de datas e horários
- [Logging](https://docs.python.org/3/library/logging.html) - Sistema de logging
- [Re](https://docs.python.org/3/library/re.html) - Expressões regulares

### 12.2 Tutoriais e Guias

**Programação Orientada a Objetos**
- [Real Python - OOP](https://realpython.com/python3-object-oriented-programming/) - Tutorial completo sobre OOP em Python
- [Python OOP Tutorial](https://www.programiz.com/python-programming/object-oriented-programming) - Conceitos fundamentais

**Padrões de Design**
- [Python Patterns](https://python-patterns.guide/) - Padrões de design em Python
- [Refactoring Guru](https://refactoring.guru/design-patterns/python) - Padrões de design com exemplos

**Boas Práticas**
- [The Hitchhiker's Guide to Python](https://docs.python-guide.org/) - Guia de boas práticas
- [Clean Code Python](https://github.com/zedr/clean-code-python) - Princípios de código limpo

### 12.3 Ferramentas de Desenvolvimento

**Editores e IDEs**
- [Visual Studio Code](https://code.visualstudio.com/) - Editor leve com extensões Python
- [PyCharm](https://www.jetbrains.com/pycharm/) - IDE completa para Python
- [Sublime Text](https://www.sublimetext.com/) - Editor rápido e customizável

**Ferramentas de Qualidade**
- [Pylint](https://pylint.org/) - Análise estática de código
- [Black](https://black.readthedocs.io/) - Formatador automático de código
- [pytest](https://pytest.org/) - Framework de testes

### 12.4 Recursos de Aprendizagem

**Cursos Online**
- [Python.org Tutorial](https://docs.python.org/3/tutorial/) - Tutorial oficial
- [Automate the Boring Stuff](https://automatetheboringstuff.com/) - Livro gratuito online
- [Python Crash Course](https://nostarch.com/pythoncrashcourse2e) - Livro para iniciantes

**Comunidades**
- [Stack Overflow](https://stackoverflow.com/questions/tagged/python) - Perguntas e respostas
- [Reddit r/Python](https://www.reddit.com/r/Python/) - Comunidade Python
- [Python Discord](https://discord.gg/python) - Chat em tempo real

### 12.5 Dados de Teste e Exemplos

**Geradores de Dados**
- [Faker](https://faker.readthedocs.io/) - Geração de dados falsos
- [Lorem Ipsum](https://www.lipsum.com/) - Texto de exemplo
- [JSONPlaceholder](https://jsonplaceholder.typicode.com/) - API de teste

**Datasets**
- [Kaggle Datasets](https://www.kaggle.com/datasets) - Conjuntos de dados reais
- [UCI Machine Learning Repository](https://archive.ics.uci.edu/ml/) - Datasets acadêmicos
- [Google Dataset Search](https://datasetsearch.research.google.com/) - Busca de datasets

---

## Conclusão

Este projeto final representa a culminação de todo o aprendizado adquirido durante o curso de Python. Ao desenvolver o Sistema de Gerenciamento de Biblioteca Digital, você aplicará conceitos fundamentais e avançados da linguagem, desde sintaxe básica até programação orientada a objetos e manipulação de arquivos.

O projeto foi estruturado para ser desafiador, mas alcançável, proporcionando uma experiência prática valiosa que simula o desenvolvimento de software no mundo real. A arquitetura proposta segue boas práticas da indústria e pode servir como base para projetos futuros.

Lembre-se de que o objetivo não é apenas fazer o código funcionar, mas desenvolvê-lo com qualidade, seguindo convenções e implementando funcionalidades robustas. Este projeto será uma excelente adição ao seu portfólio e demonstrará sua competência em Python para futuros empregadores ou projetos pessoais.

**Dicas Finais:**

1. **Comece simples:** Implemente primeiro as funcionalidades básicas antes de partir para as avançadas
2. **Teste frequentemente:** Execute e teste seu código regularmente durante o desenvolvimento
3. **Documente bem:** Mantenha documentação clara e atualizada
4. **Peça ajuda:** Não hesite em consultar a documentação ou buscar ajuda quando necessário
5. **Seja criativo:** Sinta-se livre para adicionar funcionalidades extras que demonstrem sua criatividade

**Boa sorte com seu projeto final!**

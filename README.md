# Apresentação Prof. Rodrigão — LPDM Avaliação 1

## Descrição do Projeto
Este aplicativo Android foi desenvolvido como parte da Avaliação 1 da disciplina de Laboratório de Programação para Dispositivos Móveis. O objetivo do app é exibir uma tela de apresentação estilizada em homenagem ao professor Rodrigo de Lima Cunha, funcionando como um cartão de visitas digital com seus dados de contato (telefone, e-mail e rede social) sobrepostos a uma imagem de fundo profissional.

---

## Tecnologias Utilizadas
* **Linguagem:** Kotlin
* **Toolkit de UI:** Jetpack Compose
* **Ambiente de Desenvolvimento:** Android Studio (Versão Ladybug ou superior)
* **Versão do Android Alvo:** Android 10 (API Level 29)

---

## Como Compilar e Executar o Projeto

Siga o passo a passo abaixo para clonar e rodar o projeto no seu ambiente local:

1. **Clonar o Repositório:**
   Abra o seu terminal e execute o comando de clonagem:
   ```bash
   git clone https://github.com/isaquefelicio47-creator/LPDM-avaliacao-1
   ```
2. **Abrir no Android Studio:**
   * Abra o Android Studio.
   * Clique em **File > Open** (Arquivo > Abrir).
   * Selecione a pasta do projeto clonado `LPDM-avaliacao-1` e aguarde a indexação do Gradle ser concluída.
3. **Compilar o Projeto:**
   * No menu superior, clique em **Build > Make Project** para garantir que todas as dependências foram baixadas e o código compila corretamente.
4. **Executar no Emulador:**
   * Selecione um dispositivo virtual (Emulador com API 29 ou superior) no gerenciador de dispositivos.
   * Clique no botão verde de **Run** (ícone de play) ou use o atalho `Shift + F10` para instalar e rodar o aplicativo.

---

## Descrição dos Arquivos e Composable Functions

### `MainActivity.kt`
Arquivo principal do código-fonte onde está centralizada a lógica de inicialização e a árvore de componentes da interface do usuário. Contém os seguintes elementos:

* **`MainActivity` (Classe):** Ponto de entrada do aplicativo. Configura o layout de ponta a ponta (`enableEdgeToEdge`) e define o tema padrão do app como contêiner do esqueleto principal (`Scaffold`).
* **`GreetingImage` (Composable Function):** Responsável pelo plano de fundo do aplicativo. Ela carrega e renderiza a imagem local (`R.drawable.profissional`) em tela cheia usando um contêiner empilhado (`Box`), servindo de base para a inserção dos textos informativos.
* **`Greeting` (Composable Function):** Responsável por organizar e renderizar todo o conteúdo textual e os blocos de contato na tela. Utiliza um layout vertical (`Column`) para alinhar o título de boas-vindas, o nome do professor e sua descrição, seguidos por linhas horizontais (`Row`) que agrupam ícones do Material Design e informações textuais de contato.

---

## Hierarquia Textual dos Composables

Abaixo está o diagrama estrutural de como as funções e componentes de interface estão aninhados na tela:

```text
└── MainActivity (ComponentActivity)
    └── LPDMavaliacao1Theme
        └── Scaffold
            └── GreetingImage (Composable)
                ├── Image (Plano de Fundo: profissional)
                └── Greeting (Composable)
                    └── Column (Alinhamento Vertical Geral)
                        ├── Text ("Olá a todos")
                        ├── Text ("·Rodrigão de Lima Cunha")
                        ├── Text ("·Professor de Desenvolvimento Mobile")
                        ├── Text ("Este é o meu professor de LPDM...")
                        ├── Row (Contato 1)
                        │   ├── Icon (Telefone)
                        │   └── Text ("+55 11 99999-9999")
                        ├── Row (Contato 2)
                        │   ├── Icon (Email)
                        │   └── Text ("rodrigolim@gmail.com")
                        └── Row (Contato 3)
                            ├── Icon (Rede Social)
                            └── Text ("@rodrigolima.developer")
```

---

## Identificação do Aluno
* **Nome do Aluno:** Isaque Felício Moreira
* **Turma / Período:** 3º Período

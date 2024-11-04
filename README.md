## Integrantes do Grupo
- **Ana Carolina Tavares** - RM552283
- **Giovanni Paschoalatto** - RM98837
- **Sofia Sprocatti** - RM99208
- **Vinicius Minei** - RM98486
- **Gabriel Lopes Pereira** - RM98023

# Duocorde: Plataforma de Educação Musical Inclusiva

**Duocorde** é uma plataforma inovadora de educação musical inspirada no método de aprendizado progressivo do Duolingo, adaptada para atender às necessidades de pessoas com deficiência visual. Nosso objetivo é criar um ambiente de aprendizagem inclusivo, acessível e eficaz, proporcionando uma experiência musical enriquecedora para todos.

## Objetivo do Projeto

O objetivo do projeto é desenvolver uma plataforma inclusiva que permita o aprendizado musical de forma intuitiva e interativa para pessoas com diferentes níveis de habilidade visual. A plataforma adota uma abordagem centrada no usuário e está adaptada para interfaces assistivas, garantindo uma experiência educativa completa e significativa para qualquer pessoa.

## Funcionalidades Principais

- **Aprendizado progressivo**: conteúdo adaptado para diferentes níveis de habilidade musical.
- **Acessibilidade**: integração com tecnologias assistivas para usuários com deficiência visual.
- **Interface amigável**: design simplificado e intuitivo, com feedback sonoro e textual.
- **Sistema de progresso**: monitoramento das conquistas e progresso do usuário, inspirado no método da Duolingo.

## Firebase Integration

O Firebase é utilizado no projeto para facilitar a autenticação e o armazenamento de dados em tempo real. As principais integrações com o Firebase incluem:

- **Autenticação**: Permite que os usuários façam login de maneira segura na plataforma, utilizando Firebase Authentication.
- **Banco de Dados em Tempo Real**: Utilizamos o Firebase Realtime Database para armazenar e sincronizar dados do usuário, como progresso de aprendizado e conquistas.
- **Notificações**: Firebase Cloud Messaging é empregado para enviar notificações de lembretes e atualizações importantes aos usuários.
- **Armazenamento**: O Firebase Storage é utilizado para guardar materiais educacionais, como arquivos de áudio e partituras, acessíveis para os usuários durante o aprendizado.

## Integração com CRUD e API

Para gerenciar dados de forma eficiente, o projeto integra um CRUD (Create, Read, Update, Delete) com uma API. Essa funcionalidade permite que os dados do usuário, como progresso de aprendizado, atividades concluídas e preferências, sejam salvos, atualizados e recuperados de forma centralizada e segura. A integração com a API inclui:

- **Criação de dados**: Registra novas informações, como uma atividade de aprendizado iniciada.
- **Leitura de dados**: Recupera dados, como o histórico de atividades e progresso.
- **Atualização de dados**: Modifica informações, por exemplo, atualizando o progresso do usuário.
- **Exclusão de dados**: Remove registros conforme necessário, como resetar o progresso.

Essa estrutura permite sincronização em tempo real com o backend, oferecendo uma experiência consistente e confiável para o usuário.

## Uso de Async Storage

O **Async Storage** é utilizado para armazenar dados localmente no dispositivo do usuário, facilitando o acesso rápido e offline a informações cruciais da plataforma, como configurações e dados temporários de progresso. As principais implementações incluem:

- **Armazenamento de Dados Temporários**: Permite que o aplicativo funcione sem conexão com a internet, armazenando dados temporários do usuário.
- **Recuperação Rápida de Informações**: Proporciona uma experiência de usuário fluida ao acessar rapidamente dados que são frequentemente consultados, como preferências de acessibilidade.
- **Sincronização com o Backend**: Os dados armazenados no Async Storage são sincronizados periodicamente com o backend para garantir que todas as informações estejam atualizadas e seguras.

Essa abordagem híbrida entre armazenamento local e sincronização com o backend garante que a plataforma funcione de forma eficiente, mesmo em condições de conectividade limitada.

## Link do GitHub
[GitHub - Duocorde](https://github.com/anabrandt/duocorde)

## Link do WebSite
[Site](https://doracorde.vercel.app/)

## Demonstração Visual

<div style="display:flex;">
  <img src="journey.svg" width="19%">
  <img style="margin-left:10px;" src="login.svg" width="19%">
  <img style="margin-left:10px;" src="perfil.svg" width="19%">
  <img style="margin-left:10px;" src="appmus.svg" width="19%">
</div>

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/anabrandt/duocorde.git

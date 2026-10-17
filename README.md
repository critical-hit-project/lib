# lib
Biblioteca dos serviços, contendo utilitarios usados em todos os serviços


# Configuração da lib

1. Ir no seu **próprio projeto** (exemplo: projeto Jogo), e criar na pasta raiz a pasta lib

2. Vir neste projeto (Projeto lib) e rodar o projeto
   * Caso continue rodando, pode parar a execução dele.

3. Ir na pasta **target** e copiar o arquivo lib-0.0.1-SNAPSHOT.jar.original e colar na pasta lib do seu próprio projeto

4. Renomear o arquivo e remover o .original (deixar até o .jar)

5. Ir nas dependencias no arquivo pom.xml e adicionar a seguinte dependencia:
```xml
<dependency>
    <groupId>com.critical-hit</groupId>
    <artifactId>lib</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>system</scope>
    <systemPath>${project.basedir}/lib/lib-0.0.1-SNAPSHOT.jar</systemPath>
</dependency>
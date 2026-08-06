
    EX 1
```mermaid
flowchart TD
    A([Inicio]) --> B[\Digite sua nota!\]
    B --> C{Nota ≥ 50?}
    C -->|Sim| D[/Aprovado/]
    C -->|Não| E[/Reprovado/]
    D --> F((Fim))
    E --> F
```
    EX 2
```mermaid
flowchart TD
    A([Inicio]) --> B[\Digite sua nota!\]
    B --> G[\Digite sua frequencia!\]
    G --> C{Nota ≥ 50 <br>E</br> Freq ≥ 75%?}
    C -->|Sim| D[/Aprovado/]
    C -->|Não| E[/Reprovado/]
    D --> F((Fim))
    E --> F
```
    EX 3
```mermaid
flowchart TD
    A([Inicio]) --> B[\Numero 1\]
    B --> C[\Numero 2\]
    C --> D{Num 1 + Num 2}
    D --> F((Resultado))
```
    EX 4
``` mermaid
flowchart TD
    A([Inicio]) --> B[\Digite um numero\]
    B --> C{Numero > 0?}
    C --> |sim| D[/Positivo/]
    C --> |não| E[/Negativo/]
    D --> F((Fim))
    E --> F
```
    EX 5
```mermaid
flowchart TD
    A([Inicio]) --> B[\Qual sua idade?\]
    B --> C{Idade >= 16?}
    C --> |sim| D[/Pode votar/]
    C --> |não| E[/Não pode votar/]
    D --> F((Fim))
    E --> F
```
    EX 6
```mermaid
flowchart TD
    A([Inicio]) --> B[\Digite um numero\]
    B --> G[\Digite outro numero\]
    G --> C{B > G?}
    C -->|Sim| D[/O primeiro numero é maior/]
    C -->|Não| E[/O segundo numero é maior/]
    D --> F((Fim))
    E --> F
```
    EX 7
```mermaid
flowchart TD
    A([Inicio]) --> B[\Digite o N1\]
    B --> C[\Digite o N2\]
    C --> D[\Digite o N3\]
    D --> E{N1 > N2?}
    E -->|sim| F{N1 > N3?}
    E -->|não| G{N2 > N3?}
    F -->|sim| H[/N1/]
    F -->|não| I[/N3/]
    G -->|sim| J[/N2/]
    G -->|não| I
    H --> K((Fim))
    I --> K
    J --> K
```
    EX 8 
```mermaid
flowchart TD
    A([Inicio]) --> B[\Digite um numero\]
    B --> C(Res = 1)
    C --> D{N > 1}
    D -->|não| E[/N! = Res/]
    D -->|sim| F(Res = Res x N)
    F --> G(N = N-1)
    G --> D
    E --> H((Fim))
```
    EX 9
```mermaid
flowchart TD
    A([Inicio X]) --> B[\Digite um numero\]
    B --> C{N%2=0?}
    C -->|não| D[/É impar!/]
    C -->|sim| E[/É par!/]
    D --> F((Fim))
    E --> F
```
    EX 10
```mermaid
flowchart TD
A([Inicio X]) --> B[\Digite um numero\]
    B --> C{}
    C --> |sim| D[//]
    C --> |não| E[//]
    D --> F((Fim))
    E --> F
```
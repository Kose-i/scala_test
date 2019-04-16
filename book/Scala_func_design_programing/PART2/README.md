REPL

```
scala #move scala REPL mode 
:load MyModule.scala # Loading selected scala-file 
MyModule.abs(-4) # access module function
```

```
scala
import MyModule.abs # MyModule function
abs(-3) # MyModule.abs(Int) -> abs(Int)
```

```
scala
import MyModule._ # all import function
```

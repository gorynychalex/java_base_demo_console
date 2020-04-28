# [Работа с Java в командной строке](https://habr.com/ru/post/125210/)

### Один файл

```
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```


```
javac HelloWorld.java
```

```
java -classpath . HelloWorld
```

### Отделяем бинарные файлы от исходников
```
javac -d ./bin src/Main.java
```

```
java -classpath /home/gorynych/study/java_simple/bin Main
```
или
```
java -classpath ./bin Main
```
### Включение пакетов

edit src/ru/popovich/demo01/Main.java
```
package ru.popovich.demo01;
```

```
javac -d bin src/ru/popovich/demo01/Main.java
```

```
java -cp ./bin ru.popovich.demo01.Main
```

```
.
├── bin
│   └── ru
│       └── popovich
│           └── demo01
│               └── Main.class
├── README.md
└── src
    └── ru
        └── popovich
            └── demo01
                └── Main.java
```



### Несколько файлов в программе


```
javac -sourcepath ./src -d bin src/ru/popovich/demo01/Main.java 
```

```
java -cp ./bin ru.popovich.demo01.Main
```

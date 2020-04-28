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

### Запуск отладчика

```
javac -g -sourcepath ./src -d bin src/ru/popovich/demo01/Main.java 
```

```
jdb -classpath bin -sourcepath src ru.popovich.demo01.Main 
```

### JUnit4 тест

```
javac -classpath lib/junit-4.13.jar -sourcepath ./src/ -d out/ test/ru/popovich/demo01/TestCalculator.java
```

```
java -cp lib/junit-4.13.jar:lib/hamcrest-core-1.3.jar:./out org.junit.runner.JUnitCore ru.popovich.demo01.TestCalculator
```

```
.
├── bin
│   └── ru
│       └── popovich
│           └── demo01
│               ├── Calculator.class
│               ├── Main.class
│               └── Second.class
├── lib
│   ├── hamcrest-core-1.3.jar
│   ├── junit-4.13.jar
│   └── source-junit-r4.13.tar.gz
├── out
│   └── ru
│       └── popovich
│           └── demo01
│               ├── Calculator.class
│               └── TestCalculator.class
├── README.md
├── src
│   └── ru
│       └── popovich
│           └── demo01
│               ├── Calculator.java
│               ├── Main.java
│               └── Second.java
└── test
    └── ru
        └── popovich
            └── demo01
                └── TestCalculator.java

```


## 스프링 배치 연습하기
==
### 1. 참고주소
1. [**IntelliJ(인텔리제이)에서 Junit으로 테스트하기**](https://youagain.tistory.com/9)
   날짜 : 2021-01-22

### 2. 주절주절
      아무래도 테스트할때 실제 코드로 사용하기엔 힘드니 Junit 테스트를 사용해보자.
      이건 연습해둬서 나쁠게 없을 것이다.
      실제코드로 사용하면 항상 모든코드가 실행되기때문에 테스트시 시간이 오래걸린다.
### 3. TO DO List
      1. 최우선 Junit 테스트 한번 해보기.
      2. 케이스를 여러개 만들어서 사용해보자.
      3. 그 외 기능추가 할때 각 기능의 테스트케이스 추가해보자.

### 4. Error 확인 및 해결법 History
#### 4.1.1. 에러 전문 (2021-02-28)
      java.lang.NoClassDefFoundError: org/hamcrest/SelfDescribing
	  at java.base/java.lang.ClassLoaineClass(ClassLoader.java:1016)
	  at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:174)
	  at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:800)
	  at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:698)
	  at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	  at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:621)
	  at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:579)
	  at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
	  at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	  at org.junit.internal.builders.JUnit4Builder.runnerForClass(JUnit4Builder.java:10)
	  at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
	  at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:26)
	  at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
	  at org.junit.internal.requests.ClassRequest.getRunner(ClassRequest.java:33)
	  at org.junit.internal.requests.FilterRequest.getRunner(FilterRequest.java:36)
	  at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:49)
	  at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
	  at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)
	  at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)
      Caused by: java.lang.ClassNotFoundException: org.hamcrest.SelfDescribing
      at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
      at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
      at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
      ... 19 more
   
      Process finished with exit code -1
#### 4.1.2. 검색어
      java.lang.NoClassDefFoundError: org/hamcrest/SelfDescribing
#### 4.1.3. 해결한 사이트
   [**Stackoverflow**](https://stackoverflow.com/questions/62290927/intellij-java-lang-noclassdeffounderror-org-hamcrest-selfdescribing)
#### 4.1.4 해결 방법
      Project Structure -> Dependencies -> Looked for hamcrest within the JDK installation -> Added hamcrest-core-1.3.jar


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
===============================================================

#### 4.2.1. 에러 전문 (2021-05-09)
      오랫만에 켜서 다시 진행하니 Junit Test가 아무 에러도 안뱉고 테스트가 되지 않는다.
      해당 문제는 도대체 어떻게 해결해야할지 모르겠다.
      뭐가문제인지 도통 모르겠다.
      테스트 Run을 눌러도 반응도없고, 위에 테스트 스타트 버튼도 그냥 클릭자체가 안된다.

      ---- IntelliJ IDEA coverage runner ----
      sampling ...
      include patterns:
      com\.practiceVO\.kingVO\..*
      exclude patterns:
      
      java.lang.NoClassDefFoundError: org/hamcrest/SelfDescribing

       at java.lang.ClassLoader.defineClass1(Native Method)
       at java.lang.ClassLoader.defineClass(ClassLoader.java:756)
       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
       at java.net.URLClassLoader.defineClass(URLClassLoader.java:468)
       at java.net.URLClassLoader.access$100(URLClassLoader.java:74)
       at java.net.URLClassLoader$1.run(URLClassLoader.java:369)
       at java.net.URLClassLoader$1.run(URLClassLoader.java:363)
       at java.security.AccessController.doPrivileged(Native Method)
       at java.net.URLClassLoader.findClass(URLClassLoader.java:362)
       at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
       at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)
       at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
       at org.junit.internal.builders.JUnit4Builder.runnerForClass(JUnit4Builder.java:10)
       at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
       at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:26)
       at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
       at org.junit.internal.requests.ClassRequest.getRunner(ClassRequest.java:33)
       at org.junit.internal.requests.FilterRequest.getRunner(FilterRequest.java:36)
       at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:50)
       at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
       at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)
       at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)
      Caused by: java.lang.ClassNotFoundException: org.hamcrest.SelfDescribing
      at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
      at java.lang.ClassLoader.loadClass(ClassLoader.java:418)
      at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:355)
      at java.lang.ClassLoader.loadClass(ClassLoader.java:351)
      ... 22 more
      
      Class transformation time: 0.0335732s for 347 classes or 9.675273775216138E-5s per class
      
      Process finished with exit code -1
#### 4.2.2 해결방법
      갑자기 지혼자 해결 됨
      해결방법 모르겠음.. 갑자기 잘됨;;    
      우선 노트북에서만 최대한 개발하기로 했으니 노트북에서 개발 진행 할 예정
      데스크탑은 최대한 제외시킬예정
            
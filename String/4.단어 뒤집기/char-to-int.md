# Char를 Int로 바꾸는 방법

* `java.lang.Character.getNumericVlaue(char ch)`
    - 숫자 형태의 문자를 정수형으로 바꾼다.  
    - `'3'` 이라는 문자를 `(int)`로 명시적 형변환을 할 경우에,  
    ASCII 코드 값으로 변환되기 때문에 51로 변경될 것이다.  
    이 경우에는 원하는 값을 얻은게 아니기 때문에 `Character.getNumericValue('3')` 을 사용한다.

* `java.lang.Integer.parseInt(String s)`
    - 가장 많이 쓰이는 메소드인 것 같다. 
    - 파라미터로 Char가 아닌 String을 줘야 한다. 
    - `4.단어 뒤집기` 문제에서 `br.read()` 를 사용할 경우에는 개행문자를 제거해주지 않기 때문에 뒤에 `br.readLine()` 을 추가로 써야하는 경우가 있었다. 이 때는 `br.read()` 로 읽은 값을 `Character.getNumericValue` 로 처리해야 하고, `br.readLine()` 으로 값을 입력받은 경우라면 `Integer.parseInt` 를 사용하자.   

    

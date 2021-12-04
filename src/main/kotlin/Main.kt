fun main(args: Array<String>) {
    val a = "a" //val은 지정된 읽기전용 변수를 선언할 때 사용
    var b : String  = "bb"// var은  값을 바꿀 수 있을 때 사용. 변수 값을 지정했다면 초기값을 사용하지 않아도 되지만 변수를 출력하거나 사용하기 전에는 꼭
//초기화를 해주어야한다.
    var c = "ccc" // : 이후에 변수 타입이 정해지지 않아도 코틀린이 알아서 정해주지만 초기값을 꼭 설정해야한다.
    val Byte00 : Byte = 111 // 보통 숫자는 int형으로 지정되기 때문에 그 이외의 자료형은 직업 입력하는 것이 좋다.
    val short00 : Short = 222
    val ex = 1_000_000//단위 구분은 _ 으로 해준다.
    val pi = 3.14F//F로 자료형을 표현해 주자
    val pi1 = 3.14E-2
    val pi2 = 3.14e2
    val isUploadead : Boolean // 초기화 하지 않으면 자료형 선언은 꼭 해두자앋
    val code : Int = 65
    val codeChar : Char = code.toChar() // 숫자에 해당하는 char값이 삽입된다. 무자 하나만 가능
    val s : String = "S"
    val s1 = "a is $a" // $를 함으로써 글자가 아닌 변수라는 것을 의미
    val s2 = "a is ${a+2}" // {}안에 있는 a를 변수로 인식하여 1+2는 3인 결과가 나온다
    val s3 = "\" escape \", i have \$5" // 파이썬과 비슷하게 escape가 존재하며 \이다. 큰 따움표나 $같은 문자 아ㅠ에 \을 써서 사용할 수 있다.

    println(a)
    println(b)
    println(c)
    println(ex)
    println(pi)
    println(pi1)
    println(pi2)
    println(codeChar)
    println(s1)
    println(s2)
    println(s3)
}
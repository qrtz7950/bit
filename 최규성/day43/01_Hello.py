# Hello.py
print('Hello Python!')

'''
    컴파일러 언어 -> Java
    인터프리터 언어 -> Python
        1. 미리 컴파일러에 의해 만들어진 저장 코드를 수행한다.
        2. 유저가 작성한 코드를 중간 코드로 변환한 뒤 변환된 코드를 실행.

    파이썬의 종류
        - Cpython : C로 작성된 파이썬 인터프리터
        - Jython  : Java로 작성된 파이썬 인터프리터
        - IronPython : .Net(C#) 플랫폼 용 파이썬 인터프리터
        - PyPy       :Python으로 작성된 파이썬 인터프리터
'''
# 단일 라인 주석처리
'''
    다중 라인 주석처리를 흉내
        변수: 확정되지 않은 수
        상수: 확정된 수
'''

# Python Naming Rule
#   1. 문자(유니코드), 숫자, '_'로 구성
#   2. 숫자로 시작 불가
#   3. 대소문자 구분
#   4. 예약어 사용 불가
#   5. 함수나 클래스에도 동일 적용

val= 10
name = '박보검'
_name = '송중기'
name2 = '손흥민'
print(val, name, _name, name2)

#한글 변수명은 되도록 자제
한글 = '가나다라'
print(한글)

# 파이썬 예약어 확인
import keyword # keyword module 포함
print(keyword.kwlist)
print(len(keyword.kwlist))

# 대입 연산자(치환)
a = 10
b = a + 20
print(a, b) # 표준 입출력, 구분자 -> 실행결과 : 10 30
c = 3.14; d = 1.23 # Line 구분 시 세미콜론
print(c, d)
e, f = 10, 20 # 2개 이상의 변수 동시 대입
print(e, f)

# [l-value] = [r-value], 대입 연산의 결합 방향 (<-)
x = y = z = 30 # 여러 변수에 같은 값을 대입
print(x,y,z)

# 복합 대입 연산자(확장 치환)
# +=, -=, *=, **=, /=, //=, %=
# >>=, <<=
# &=, ^=, |=
a = 10; a += 20; print(a)
b = 10; b *= 2; print(b)
c = 10; c **= 3; print(c) # 1000
d = 10; d /= 3; print(d)
e = 10; e //= 2; print(e)
f = 10; f %= 3; print(f)


















































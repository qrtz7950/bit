# Object.py
#   1. 파이썬은 모든 자료형이 객체 형태
#   2. 다자(컴파일러 언어)와  같이 값을 저장하는 공간의 주소 심볼릭이 아니다
#   3. 객체의 변수와 값이 저장된 공간의 주소르 저장하지 않는다.
#   4. 단순히 객체의 이름만을 표현
#   5. 심볼 테이블(Symbol Table)에 객체 이름과 주소를 저장하여 연결

print('--------Symbol Table--------')
#  locals() : Local Scope의 Symbol Table
#  globals() : Global Scope의 Symbol Table
#       -> 두  내장 함수는 dict 타입으로 변환
glibal_a = 10
global_b = 'symbol'
def foo():
    local_a = 20
    local_b = 'table'
  #  print(locals())
for i in range(10):
    global_c = 30
    global_d = 'python'
  #  print(locals())
foo()
print(globals())

class MyClass:
    a = 10
    b = 20
print(MyClass.__dict__) # 객체의 심볼 테이블 확인

# Symbol Table -> namespace, 이름 (변수) 저장되는 공간
# 모듈, 클래스, 인스턴스, 함수들이 심볼 테이블을 가진다

print('--------GC(Garbage Collection---------')
# 쓰레기 수집, 사용되지 않는 객체의 메모리 해제
# Reference Count가 0이라면 , GC에 의해 메모리 해제
import sys
obj = object()
print(sys.getrefcount(obj)) # obj를 참조하는 수
subObj = obj
print(sys.getrefcount(obj))
del obj
print(sys.getrefcount(subObj))

print('---------객체 복제--------')
# Shallow Copy(얕은 복제)
# 복합 객체만 복사, 내용은 동일한 객체
a = [1, 2, 3]
b = [4, 5, a]
c = [a, b, 10]
d = c  # c를 d에 먼저 복사하고 밑에서 값을 바꿨지만 c와 d가 똑같은 값이 나옴
c[0] = 'Shallow'    
print(c)
print(d)

# Deep Copy(깊은 복제)
# 복합 객체 생성, 해당 내용도 재귀적으로 복사
import copy
a = [1,2,3]
b = [4,5,a]
c = [a,b,10]
d = copy.deepcopy(c)
c[0] = 'Deep'
print(c)
print(d)
# 이해를 위한 얕은 복사와 깊은 복사의 차이점
#  주소는 그래도 내용만 복제 하느냐(얕은 복제)
#  아니면, 내용과 같이 다른 주소로 복제하느냐 (깊은 복제)





























#Function.py
'''
    1. def 키워드를 활용해 정의
    2. 선언부는 ':' 로 종료
    3. 들여쓰기 주의
'''

def add(a, b):
    return a + b
print(add(3,7))

# return
'''
    1. 함쉬의 종료와 값을 반환
    2. 객체 반환 시tuple 사용
    3. return 단일 사용시 None이 반환
'''
def rtnNone():
    return
print(rtnNone())

print('----------1개 반환----------')
def maxNum(a,b):
    if a>b:
        return a
    else:
        return b
print(maxNum(3,7))

print('---------2개 반환-----------')
def swap(a,b):
    return b, a
#result = swap(3,7)
#print(result, type(result)) # tuple 반환

c, d = swap(3,7)    #unpacking
print(c,d)

print('---------parameter (callby)--------')
#Call By Value
#       : 값에 의한 호출 방식 -> foo
#Call By Reference
#       : 참조에 의한 호출 방식 -> goo
def foo(val) :
    val = 20
a = 10
foo(a)
print(a)

def goo(val):
    val = (1,2,3)
a=(4,5,6)
goo(a)
print(a)

def hoo(val):
    val[0] = 0; val[1] = 0; val[2] = 0 #전달된 list의 주소 참조 0 0 0 
    #val = [40,50,60]                   #새로운 list를 치환한 경우 10 20 30
a=[10,20,30]
hoo(a)
print(a)

print('--------Scope---------')
# Local Scope   : 함수 내부
# Global Scope  : 모듈 내부
# Built-in Scope : 내장 영역(파이썬에서 제공하는 별개의 저장영역)
a = 10 # Global
def foo(b): # Local
    return a + b
print(foo(20))

a = 10
def goo(b):
    a= 20
    return a + b
print(goo(30))

val = 0
def foo():
    #val = 10
    global val # 함수 내부에서 Global Scope 선언
                # 선언과 동시에 초기화 불가
    val = 30
    print(val)
def goo():
    val = 20
    print(val)
foo(); goo()

#print(dir()) # 존재하는 Scope 확인
#print(dir(__builtins__)) # Built-in Scope 확인

print('--------parameter, arguments---------')
def foo(a, step = 1):  # 고정값(기본값), 기본 인수
    return a + step
print(foo(5))

def goo(a, b):
    return a + b
#print(goo(a = 10, b = 20)) # 키워드 인수
print(goo(b = 20 , a = 10)) # 키워드 기준으로 순서 상관없음
#print(goo(a = 10, c = 20)) # 키워드 불일치

print('------가변 인수-----')
def hoo(a, *b):
    return(a,b)
hoo(1,2,3,4)

print('-------정의 되지 않은 키워드 인수 -> dict----------')
def f(width, height, **data):
    print(width, height)
    print(data)
f(10, 20, depth=10, dimention=3)
# 키워드 인수 전달 (함수에는 정의 x)

def g(a, b, *args, **data): # 단, dict 키워드 인수는 마지막에
    print(a,b)
    print(args)
    print(data)
g(1, 2, 3, 4, 5, c=6, d=7)

print('--------함수 객체(문자열처리)---------')
import re
names = ['Python', 'python?', '    PyThon!', '#pyThon   ']
def clr_strings(datas):
    results = []
    for data in datas:
        data = data.strip() # 양쪽 공백 제거, trim()
        print(data, end = ' ')
        data = re.sub('[!#?]', '', data)
        # 패턴과 일치하는 문자열을 변경
        print(data, end = ' ')
        data = data.title() #제목형식, 첫글자 대문자 및 나머지 소문자
        print(data)
        results.append(data)
    return results
names = clr_strings(names)
print(names)

addrs = ['Seoul', '   BUSAN', 'cheonAn   ']
def clr_strings(datas, *funcs): #funcs -> 함수객체들의 집합
    results = []
    for data in datas:
        for func in funcs: # 함수집합의 함수를 하나씩 순회하며 활용
            data = func(data)
        results.append(data)
    return results
addrs = clr_strings(addrs, str.strip, str.title) # 함수 이름으로 전달
print(addrs)

# Hello Func Object
def foo(func):
    func()
def goo():
    print('goo() function Called...')
foo(goo) # 인자로 함수자체를 전달 할 수 있다.































# DataType.py

#   bool    : True, False
#   int     : 정수
#   float   : 실수
#   complex : 복소수
#   str     : 문자열(유니코드)
#   bytes   : 0~255 사이의 코드
#   list    : 객체 집합
#   tuple   : 객채 집합(순서 변경 X)
#   set     : 집합 (순서 x 중복 x)
#   dict    : 객체 저장, 순서가 없이 key를 참조하여 활용

# 접근 방법
#   - Direct : int, float, complex
#   - Sequence : str, bytes, list, tuple
#   - Mapping : dict

print('------bool--------')
a = 10
print(a > 20)
print(a < 20)
b = a == 10
print(type(b)) # Data Type 확인
print(b + 20)   # True + 20 = 21
print(True + True)  # 2
print(True + False) # 1
print(False + False)# 0



print('---------int--------')
i = 2**1024 # 무한대 표현 가능
print(type(i))
print(i)

a = 20
print(type(a))
print(isinstance(a, int)) # a가 int형의 객체인지

print('-------접두사----------')
b = 0b10100 # 2진수(0b)
c = 0o20 # 8진수 (0o)
d = 0x20 # 16진수 (0x)

print(b,c,d)



print('---------float--------')
a  = 3.14

print(type(a))
print(isinstance(a, float)) # True
print(a.is_integer()) # False

a = 3.0
print(a.is_integer()) # 실수 값이 정수인지 판별

b = 3e3 # 3*(10*10*10)
c = -0.2e-4
print(b,c)

print('---------complex--------')
a = 3 + 5j
print(a)
print(type(a))
print(isinstance(a, complex))

b = 7 - 2j
print(a + b)
print(b.real, b.imag) # 실수, 허수 부분 따로 추출

print('-------복합관계식----------')
a  = 10

print(0<a<20)   #True
print(0 < a and a < 5) #False


print('-------객체 비교---------')
print ('abc' > 'aaa') # True    
print((1,2,3) < (1,3,1)) # T    각 객체 집합의 각 요소들끼리 비교
print([1,2,3] > [1,2,0]) # T    앞에서 부터 비교해서 참이 나오면 뒤에 안

''' java에서 
    String str  = new String('Hello');
    if(str == 'Hello') {}  -> 주소 비교 F
    if(str.equals('Hello')) {} -> 값 비교 T
'''

# == : 객체의 값 비교 (동질성) 자바의 equals
# is : 객체 자체가 같은지 (동일성) 자바의 ==

a=10
b=10
print(a == b) # T
print(a is b) # False가 나와야하는데 True가 나옴
                # why?
                # Integer Cashing
                #  -5 ~ 256 정수는 캐싱되어 있어서
                # PyInt_Object 배열로 유지 (이미 존재)


print('--------Script File Mode와 Interactive Mode의 차이점--------')
a = 257
b = 257
print(a == b)   # T
print(a is b)   # T (shell에서 치면 F나옴)
                # >>> a = 257
                # >>> b = 257
                # >>> a is b       -> False
print('--------bool type -> True = 1, False = 0---------')
print(True + 1) # 2
a = 10
b = 20
print((a>b) + 1) # 1

print('-------타입별 bool 판단 기준--------')
print(bool(10), bool(0))    # int       T, F
print(bool(3.14), bool(0.)) # float     T, F
print(bool('hello'), bool(''))  # str   T, F
print(bool([1,2,3]), bool([]))  # list  T, F
print(bool((1,2,3)), bool(()))  # tuple T, F
print(bool({1,2,3}), bool({}))  # set   T, F
print(bool({1:2}), bool({})) # dict     T, F
print(bool(None)) # None                F

print('-------논리 비교 (SCE - 순서) ----')
print([] or 'hello')
print('hello' or [])
print('hello' and 'operator')
print(None and 1)
print(None or 1)

print('-------비트 연산자=-------')
print(~3)
print(~-1)
print(2<<4)
print(48>>4)
print(3&2)
print(16|2)
print(16^2)

num1 = 10
num2 = 4
result = num1 ^ num2
print(result)
result = result ^ num2
print(result)

print('-------Swap----')
a = 10
b = 6
print(a, b)
'''
#메모리를 사용하지만 밑의 swap방식보다 빠르다
temp  = a
a = b
b = temp
'''
'''
#메모리를 사용하지않지만 속도가 느리다
a ^= b
b ^= a
a ^= b
'''
#파이썬의 문법을 활용한 Swap
b, a = a, b

print(a, b)


#암호화
key = 532432
password = 1234
sub = 0
re = 0
#암호화 작업
sub = password ^ key
print(sub)
#복호화 작업
re = sub ^ key
print(re)


print('-------문자열 (str)-----')
s1 = ''
s2 = 'Hello'
s3 = 'Python'
print(type(s1), type(s2), type(s3))

print('-------다중라인 문자열 표현--------')
s4 = '''Hello
abcd
안녕하세요
1234'''
print(s4)

s5 = '''Hello
    abcd
        반갑습니다
1234'''
print(s5)

print('-------문자열 연산--------')
str1 = 'Hello'
str2 = 'Python'
print(str1 + str2)
print(str1 * 2)
print(str1 * 3)
print(str1[0]) # index연산
print(str1[1:4]) #  1번지 부터 4번지 전까지

#str[0] = 'G' # 변경 불가
#print(str1)

val=10
#print('val : ' + val) # 문자열과 정수의 + 연산 불가
print('val : ' + format(val, 'd')) # 서식을 활용


print('-------tuple 활용---------')
f = 'name : %s, age: %d'
print(f % ('박서준', 29))
print(f % ('제니', 23))
print('-------dict 활용 (Dictionary)------')
f = 'name : %(name)s, age : %(age)d' # key Mapping
print(f)
print(f % {'name':'박신혜', 'age':26})
print(f % {'name':'박보영', 'age':29})

print('-------list---------')
myList = [10, 3.14, 'hello']

print(myList[0], myList[1], myList[2])
print(myList[-1], myList[-2], myList[-3]) # 역순
print(myList[1:3]) # 1번지부터 3번지 전까지 -> list
print(myList + [1, 2, 3]) # list 요소 추가
del myList[1] # 1번지 요소 삭제
print(myList)
print(10 in myList) # myList 안에 10이 있는지 확인

#수정
myList[0] = 20 # 변경 가능 (Mutable)
print(myList)

myList[0:2] = [10, 20]
print(myList)

subList  = [1,2,3,4,5]
myList = subList
print(myList)

myList[2:2] = ['a'] # 2번지 삽입
print(myList)
myList[3:] = [123, 456] # 3번지 부터 삽입
print(myList)
myList[:0] = [1,2,3] # 맨 앞에 삽입
print(myList)


print('-------list 주요 메소드--------')
oriList = [1,2,3,4,5]
print(oriList)
oriList.append(6)
print(oriList)
oriList.insert(1, 5) # 1번지에 5를 삽입
print(oriList)
oriList.reverse()
print(oriList)
oriList.sort() # 정렬
print(oriList)
oriList.remove(3) # 3 삭제
print(oriList)
subList = [9, 10, 11]
oriList.extend(subList) # list 추가
print(oriList)

print('-------정렬-------')
oriList.reverse()
print(oriList)

print('-------oriList.sort()--------')
oriList.sort(key=str) # key :  정렬기준
print(oriList)
oriList.sort(key=int)
print(oriList)


print('-------set----------')
mySet = {10, 20, 30}
print(mySet, type(mySet))
print(len(mySet))
print(30 in mySet)
print(40 not in mySet)

print('-------set 주요 메소드-------')
mySet.add(40)    #추가
mySet.add(50) # 집합을 의미하기 때문에 순서가 없다
print(mySet)
mySet.remove(30) # 삭제
print(mySet)
mySet.discard(30)
print(mySet)
mySet.clear() #  전부 삭제
print(mySet)

oriSet = {1, 2, 3, 4, 5}
subSet = {3, 5, 7}
result = oriSet.union(subSet) # 합집합
print(result)
subSet = {1,4,7}
result = oriSet.intersection(subSet) # 교집합
print(result)

result = oriSet.symmetric_difference(subSet) # 대칭 차집합
print(result)

subSet = {2,3}
print(oriSet.issuperset(subSet)) # 확대 집합
print(subSet.issubset(oriSet)) # 부분 집합

print('-------tuple--------')
myTuple = (1, 2, 3)
print(myTuple, type(myTuple))


print(myTuple[0], myTuple[1],myTuple[2])
print(myTuple[-1], myTuple[-2],myTuple[-3])

print(myTuple[1:3])
print(myTuple + (4,5,6))
print(myTuple * 2)
print(4 in myTuple)

#myTuple[0] = 5 # 변경 불가(Immutable)


print('-------Tuple 주요 메소드--------')
oriTuple = (1,2,3,4,5)
print(oriTuple, type(oriTuple))
subTuple = set(oriTuple) # set으로 변환
print(subTuple, type(subTuple))
subTuple = list(oriTuple) # list로 변환
print(subTuple, type(subTuple))

print('-------tuple (packing, unpacking)-------')
data = 1, 2, 3, 'BIT' # 나열한 데이터
print(data, type(data)) # tuple 형식, packing

a, b, c, d = data # 각각의 변수abcd로 unpacking
print(a, b, c, d)

#a, b, c = data # data는 4개인데 변수가 부족해서 에러남
#print(a, b, c)

a, *b = data # a에 한개 대입후 나머지 data는 b가 받는다
print(a, b) # 1 [2, 3, 'BIT']

*a, b = data
print(a, b) # [1, 2, 3] BIT

a, *b, c = data
print(a,b,c)    # 1 [2, 3] BIT

d = tuple(b) # tuple로 변환
print(d, type(d))

print('------- dict---------')
oriDict = {'name':'BIT', 'age':20 }
print(oriDict, type(oriDict))
print(oriDict['name']) # key 'name' 대한 value 'BIT'
print('age' in oriDict)
print('addr' not in oriDict)

print('-------dict 초기화 방법-------')
myDict = dict() # empty dict
print(myDict)
print('-------1. keyword arguments--------')
myDict = dict(one=1, two=2)
print(myDict) # {'one': 1, 'two': 2}
print('-------2. tuple list---------')
myDict = dict([('one',1), ('two', 2)])
print(myDict)

print('-------3.  key-value---------')
keys = ('one', 'two') # key tuple -> list도 가능
values = (1,2) # value tuple
myDict = dict(zip(keys, values))
print(myDict)

myDict = {} # 비워줌
print(myDict, type(myDict))
myDict[10] = '10'
myDict['name'] = 'BIT'
print(myDict)

myDict[(1, 2)] = 'number' # tuple을 key로 설정
print(myDict)
#myDict[[1, 2]] = 'number' # unhashable error
#print(myDict)

keys = myDict.keys() # key 들을 추출
print(keys, type(keys))

print('-------foreach 출력--------')
for key in keys :
    print('{0}:{1}'.format(key, myDict[key]))

values = myDict.values() # value 들을 추출
print(values, type(values))

items = myDict.items() # 요소 모두 추출, tuple list
print(items)

result = myDict.get('name') # key 값으로 value추출
print(result)
result = myDict['name']
print(result)

result = myDict.pop('name') #stack의 pop과 유사
print(result)
print(myDict)

result = myDict.popitem() # key와 value 모두 출력
print(result)
print(myDict)

myDict.update({'aaa':'123', 'bbb':'456'})
print(myDict)

myDict.clear()
print(myDict)

myDict = { 'b':2, 'c':3, 'a':1} # keySet을 안받아도 key값 출력 가능
#for key in myDict :        # 자동으로 key를 추출
#    print(key, end=' ')

#for key in myDict :
#   print(str(key) + ':' + str(myDict[key]), end=' ')

#for key in myDict :
#    print('{0}:{1}'.format(key, myDict[key]), end=' ')

for key, value in myDict.items() :  # tuple list 형식으로 key, value를 모두 추출
    print('{0}:{1}'.format(key, value), end=' ')    # ex) key, value = ('b', 2)
    














































































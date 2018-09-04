# FileIO.py
# 표준 입출력
print(10) # 숫자출력
print('Hello', 'Python') # 문자열 출력 (공백O)
print('Hello' + 'Python') # 문자열 출력 (공백X)
num = 20
print(num, 'Hello')
print(str(num) + 'Hello')


iVal = 10
sVal = 'Python'
print(iVal, sVal, sep='') # sep파라미터 활용
print(iVal, sVal, sep=',')
print(iVal, sVal, sep=', ', end='!!!') # end 파라미터
print('Hello') # end 파라미터가 없다면 자동 개행

# System.out.println() -> print()
# System.out.print()    -> print(end='')

import sys
print('Hello Python', file=sys.stdout) # 표준 출력
print('Hello Error', file=sys.stderr)   # 표준 에러 출력

f = open('/hello.txt', 'w')
print('Hello FileIO', file=f)
# python 기본경로 (/)-> 드라이브 경로


print('-------FileIO----------')
f = open('hello.txt', 'w', encoding='utf-8') # 쓰기전용
data = f.write('Hello Python IO\nWorld')
# 드라이브 경로 -> /hello.txt
# 프로젝트 기준 경로(06_FileIO.py) -> hello.txt
f.close()

# 1단계: 데이터 통로 open
ori_file = open('iotest/pepe.jpg', 'rb') # 읽기전용, 바이너리 모드

# 2단계: 작업 수행
data = ori_file.read()
ori_file.close()
cpy_file = open('iotest/pepe2.jpg', 'wb') # 쓰기전용, 바이너리 모드
cpy_file.write(data)

# 3단계: 데이터 통로 close
print(cpy_file.closed) # 통로가 닫혔는지 확인, False
cpy_file.close()
print(cpy_file.closed) # 통로가 닫혔는지 확인, True


#1
f= open('hello.txt', 'r' ,encoding='utf-8')
#2
data = f.read()
print(data)
#3
f.close()




















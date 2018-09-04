#control.py
# 들여쓰기 주의
#조건문

'''
num = 3
if (num % 2) == 0 :
    print('짝수입니다')
elif (num % 2) ==1 :
    print('홀수입니다')

else :
    print('잘못 입력 했습니다')
'''

# 3과 5의 공배수 인지 판단
num = 1500
if(num % 3 == 0) and (num % 5 ==0) :
    print('공배수입니다')
else :
    print('공배수가 아닙니다')

print('------조건 표현식------')
num = 3
print('even' if num % 2 == 0 else 'odd')
# [true 영역] if (조건식) else [false영역]

print('------반복문------')
strList = ['red', 'blue', 'green', 'yellow']
for s in strList :
    print(s)
tList = [('one',1), ('two',2), ('three',3)]
for data in tList :
    print('name:%s, value:%d' % data)
for name, value in tList :
    print('name:{0} , value:{1}'.format(name, value))
for idx, name in enumerate(strList) :
    print(idx, name)

print('-------break------------')
for i in range(1, 11) :
    if i >= 6:
        break
    print(i , end = ' ') # java : System.out.println(i + ' ')
print()

print('-------1000이하의 정수 중, 7과 11의 제일 큰  공배수-----')
# range(start, end, step)
#   start : 시작
#   end  : 끝 (미만)
#   step : 증감 수준
for i in range(1000,-1, -1):
    if i % 7 == 0 and i % 11 ==0:
        print(i, end=' ')
        break
print()

print('-------1~100 합-----')
result = 0
for i in range(1, 101):
    result += i
print(result)

print('--------while -------')
# while(조건식) :
#    구문1
# else :
#    구문2
# -> true 시 구문1 반복 수행
# -> false 시 구문 2 수행
# -> 단, break로 탈출시 else를 수행하지 않는다.

i = 1
result  = 0
while(i < 11):
    print(i, end = ' ')
    result += i
    if(i == 5):
        break
    i += 1
else:
    print('종료, 합계 : {0}'.format(result))

print('--------------------')


























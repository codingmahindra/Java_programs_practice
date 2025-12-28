'''
#first program 
S = input()
N = int(input())
C = input()
count = 0
for i in range (0,N):
    if S[i] == C:
        count += 1
print(count)  '''

'''
#second program 
H = int(input())
V = int(input())
Vh = int(input())
Hn = H *((V/Vh)**2)
print(Hn)
'''

'''
#third program
N = int(input())
A = list(map(int,input().split(',')))
s = " "
for i in A:
    if i%2 == 0:
        s += "even "
    else :
        s += "odd " 
print(s) 
'''   
def f(N,A):
    if N<2:
        return []
    A.sort()
    a = -1
    b = -1
    for i in range(0,N):
        for j in range(i+1,N):
            if A[i]+A[j] == 18:
                if((A[i]*A[j]) > a*b):
                    a = A[i]
                    b = A[j]
    if a == -1 or b == -1:
        return[]
    result = [a,b]
    result.sort(reverse = True)
    return result
N = int(input())
A = list(map(int,input().split(" ")))
print(f(N,A))


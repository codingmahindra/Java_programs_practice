#first program
def count(input1,input2,input3):
    c = 0
    for i in range(0,input2):
        if input1[i] == input3:
            c +=1
    return c
input1 = input()
input2 = int(input())
input3 = input()
print(count(input1,input2,input3))        
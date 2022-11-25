from random import random


def syscom(n,k):
    a=[]
    for i in range(n+1):
        a[i] = fct(n,i)

    for r in range(k):
        j = random(r)
        #a[j] popout 
        #for k個
        #每一個K當中去窮舉n的排列
        return

def factorial(n):
    p = 1
    for i in range(n):
        p = p * (i+1)
    return p

def fct(n, k):
    return factorial(n) / (factorial(k)*factorial(n-k))


syscom(5,3)
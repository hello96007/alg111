# 簡易爬山演算法 -- 針對單變數函數
def hillClimbing(f,x1,x2,x3,x4,x5):
    h=1
    while (True):
        fans=f(x1,x2,x3,x4,x5)
        #print("fans",fans)
        #if(5*x1+7*x2+9*x3+2*x4+1*x5<=250 and 4*x1+7*x2+3*x3+8*x4+5*x5<=211 and 18*x1+4*x2-9*x3+10*x4+12*x5<=285  and 5*x1+13*x2+16*x3+3*x4-7*x5<=315):                 
        print('x1={0:.5f} x2={1:.5f} x3={2:.5f} x4={3:.5f} x5={4:.5f} f(x)={5:.5f} '.format(x1,x2,x3,x4,x5,fans))
        if  f(x1+h, x2,x3,x4,x5)>= fans:
                x1 = x1+ h
        elif f(x1-h, x2,x3,x4,x5) >= fans:
                x1 = x1 - h
        elif f(x1,x2+h,x3,x4,x5) >= fans:
                x2 = x2 + h
        elif f(x1, x2-h,x3,x4,x5) >= fans:
                x2 = x2 - h
        elif f(x1, x2,x3+h,x4,x5) >= fans:
                x3 =x3  + h
        elif f(x1, x2,x3-h,x4,x5) >= fans:
                x3 = x3 - h
        elif f(x1, x2,x3,x4+h,x5 )>= fans:
                x4 = x4 + h
        elif f(x1, x2,x3,x4-h,x5 )>= fans:
                x4 = x4 - h
        elif f(x1, x2,x3,x4,x5+h )>= fans:
                x5 = x5 + h
        elif f(x1, x2,x3,x4,x5-h )>= fans:
                x5 = x5 - h
        else:
            break
    return 

# 高度函數
def f(x1,x2,x3,x4,x5):
    # return -1*(x*x-2*x+1)
   p1=0
   p2=0
   p3=0
   p4=0
   p = 1000
   score = 7*x1 + 8*x2 + 2*x3 + 9*x4 + 6*x5
   f1=5*x1+7*x2+9*x3+2*x4+1*x5
   if f1>250:
        p1 = p*(f1-250)
   else: print("沒事",x1,x2,x3,x4,x5)

   f2=4*x1+7*x2+3*x3+8*x4+5*x5
   if f2>211:
        p2 = p*(f2-211)
   else: print("沒事",x1,x2,x3,x4,x5)

   f3=18*x1+4*x2-9*x3+10*x4+12*x5
   if f3>285:
        p3 = p*(f3-285)
   else: print("沒事",x1,x2,x3,x4,x5)

   f4=5*x1+13*x2+16*x3+3*x4-7*x5
   if f4>315:
        p4 = p*(f4-315)
   else: print("沒事",x1,x2,x3,x4,x5)
   return score - p1 - p2 - p3 - p4
   
'''缺懲罰
1.跑超過 懲罰
2.跑到負數 懲罰
3.如果fi-限定值>0懲罰(因為超過限定值才會大於0)
4.東西在這裡：/Users/eggwu/Desktop/alg/A2-QA/integerProgramming/ipHillClimbing.p'''

hillClimbing(f,0,0,0,0,0) 


'''def height(x):
    p = 1000
    score = 7*x[1] + 8*x[2] + 2*x[3] + 9*x[4] + 6*x[5]
    f1 = 5*x[1]	+7*x[2]	+9*x[3] + 2*x[4] + 1*x[5]
    p1 = p*(f1-250) if f1>250 else 0 
    f2 = 18*x[1]+4*x[2]–9x3	+	10x4	+	12x5 #	≤	285
    p2 = p*(f2-285) if f2>285 else 0 
    f3 = 4x1	+	7x2	+	3x3	+	8x4	+	5x5	# ≤	211
    p3 = p*(f2-285) if f2>285 else 0 
    f4 = 5x1	+	13x2	+	16x3	+	3x4	–	7x5	≤	315
    p4 = p*(f2-285) if f2>285 else 0 
    return score - p1 - p2 - p3 - p4'''

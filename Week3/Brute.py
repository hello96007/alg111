#7x1 + 8x2 + 2x3 + 9x4 + 6x5
#5x1	+	7x2	+	9x3	+	2x4	+	1x5	≤	250
#18x1	+	4x2	–	9x3	+	10x4	+	12x5	≤	285
#4x1	+	7x2	+	3x3	+	8x4	+	5x5	≤	211
#5x1	+	13x2	+	16x3	+	3x4	–	7x5	≤	315


a1=0
a2=0
a3=0
a4=0
a5=0
#f1=5*x1+7*x2+9*x3+2*x4+1*x5
#f2=4*x1+7*x2+3*x3+8*x4+5*x5
#f3=18*x1+4*x2-9*x3+10*x4+12*x5
#f4=5*x1+13*x2+16*x3+3*x4-7*x5
#ans=7*x1+8*x2+2*x3+9*x4+6*x5
max=0
for x1 in range (-20,20):
    for x2 in range (-20,20):
        for x3 in range (-20,20):
            for x4 in range (-20,20):
                for x5 in range (-20,20):
                    #print("parameter",x1,x2,x3,x4,x5)
                    if(5*x1+7*x2+9*x3+2*x4+1*x5<=250 and 4*x1+7*x2+3*x3+8*x4+5*x5<=21 and 18*x1+4*x2-9*x3+10*x4+12*x5<=285 and 5*x1+13*x2+16*x3+3*x4-7*x5<=315):
                        ans=7*x1+8*x2+2*x3+9*x4+6*x5
                        #print("max",ans)
                        if(ans>max):
                            max=ans
                            a1=x1
                            a2=x2
                            a3=x3
                            a4=x4
                            a5=x5
                            #print("max",max)
                    #else:
                        #print("bad")
                        #print("error",a1,a2,a3,a4,a5)

print("max=",max,"num",a1,a2,a3,a4,a5)
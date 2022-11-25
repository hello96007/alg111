from ipData import *
a1=0
a2=0
a3=0
a4=0
a5=0
max=0
for x1 in range (0,50):
    for x2 in range (0,50):
        for x3 in range (0,50):
            for x4 in range (0,50):
                for x5 in range (0,50):
                    #print("parameter",x1,x2,x3,x4,x5)
                    if(coefs[1][1]*x1+coefs[1][2]*x2+9*x3+2*x4+1*x5<=250 and 4*x1+7*x2+3*x3+8*x4+5*x5<=211 and 18*x1+4*x2-9*x3+10*x4+12*x5<=285  and 5*x1+13*x2+16*x3+3*x4-7*x5<=315):
                        #print("good")
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

#coef[i][1]~coef[i][5]先運算
#max[i] 和 coef[1]
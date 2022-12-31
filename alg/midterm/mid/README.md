# 演算法期末報告
## [LeetCode-Swim in Rising Water(Hard)](https://leetcode.com/problems/swim-in-rising-water/description/)

# 聲明
- 1.以下程式全部原創(包含註解) 
- 2.該題目僅參考過中文版題目(英文很難理解)

# 題目說明:
- 1.有4格游泳池，只能往上下左右的泳池移動
- 2.數字代表水池的深度
- 3.現在開始下雨，每下一秒雨水池的水就會+1，所以深度為2的水池就要花兩秒的時間才能填滿
- 4.要從深度為0的水池到深度為2就要等2秒
- 5.主角要從最左上到最右下最少需要花幾秒的時間
        
# 解題方向
- 1.使用dijksrual algorithm(找鄰居邊的大小，取小)
- 2.找的方式要馬往下要馬往上不然就是往左往右，所以目前的值要跟他鄰居比距離的大小(取小的)
- 3.限制 到左邊到上面不能是0 到右邊到下面不能超過陣列的大小
- 4.沒有抵達終點(最右下)時不能停下來


# 程式碼
'''
class Solution:
    def swimInWater(self, grid: List[List[int]]) -> int:
        i = 0
        j = 0
        t= 0 #回傳時間的總值
        time = 0 #邊到邊要加的時間
        maxrow =len(grid)#陣列最大的列
        maxcol = len(grid[0])#陣列最大的行
        #找上面這兩個是為了取得陣列最右下的值mmax
        mmax = grid[maxrow-1][maxcol-1]
        print(mmax)
        nextpos = 0 #下一個位置的預設值，用來判斷是否該跳出迴圈(也就是到最後一個沒)
        #while(ans!=mmax):#ans為取的值
        while(nextpos!=mmax):#ans為取的值
            dis = 999 #距離大小每次都設最大，讓上下左右距離去換(反正上下左右一定會比999小)
            rec_i = 0
            rec_j = 0
            if(i-1>=0):#有在陣列裡面才找上
                print("找上",grid[i-1][j])
                if(dis>(abs(grid[i][j]-grid[i-1][j]))):#上的距離比目前最小的還小，記錄上的位置
                    dis = abs(grid[i][j]-grid[i-1][j])#找上的距離(預設最小)
                    rec_i =i-1 #紀錄上的i
                    rec_j = j #紀錄上的j
                    
               
            if(j-1>=0):#有在陣列裡面才找左
                print("找左",grid[i][j-1])
                if(dis>abs(grid[i][j]-grid[i][j-1])):#左的距離比目前最小的還小，記錄左的位置
                    dis = abs(grid[i][j]-grid[i][j-1]) #最小的距離是這個
                    rec_i =i #紀錄左的i
                    rec_j = j-1 #紀錄左的j
                    
                
            if(j+1<maxcol):#有在陣列裡面才找右
                print("找右",grid[i][j+1])
                if(dis>(abs(grid[i][j]-grid[i][j+1]))):#右的距離比目前最小的還小，記錄右的位置
                    dis = abs(grid[i][j]-grid[i][j+1]) #最小的距離是這個
                    rec_i =i #紀錄右的i
                    rec_j = j+1 #紀錄右的j
                
                
            if(i+1<maxrow):#有在陣列裡面才找下
                print("找下",grid[i+1][j]) 
                if(dis>(abs(grid[i][j]-grid[i+1][j]))):#下的距離比目前最小的還小，記錄下的位置
                    dis = abs(grid[i][j]-grid[i+1][j]) #最小的距離是這個
                    rec_i =i+1 #紀錄右的i
                    rec_j = j #紀錄右的j

            #下面這一段是檢查邊的距離是否小於0，如果小於0時間就不用往上加
            if((grid[rec_i][rec_j]-grid[i][j])<0):
                time =0
            else:
                time =grid[rec_i][rec_j]-grid[i][j]

            grid[i][j] = 999 #把目前的點設為最大，代表走過了
            i =rec_i #下一個值的i
            j= rec_j #下一個值的j
            nextpos = grid[i][j]
            print(t,"結束",nextpos,"i",i,"j",j,"dis",dis)   
            t=t+time
        return t
        
        #print((grid[i][j]) -(grid[0][j+1]))#右邊
        #print((grid[i][j]) -(grid[0][j-1]))#左邊
        #print((grid[i][j]) -(grid[i-1][j]))#上邊
        #print((grid[i][j]) -(grid[i+1][j]))#下邊
'''
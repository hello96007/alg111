def enqueue(a, o):
    a.insert(0, o) #從第一個位置放進去queue中

def dequeue(a):
    return a.pop() #從queue中最後一個位置取出來

'''g = { #  graph: 被搜尋的網路 #  n: neighbor (鄰居), v: visited (是否被訪問過) #有向圖 #之後畫一個題目出來 
    '1': {'n':['2','5'], 'v':0}, #1的鄰居是2和5
    '2': {'n':['3','4'], 'v':0},#2的鄰居是3和4
    '3': {'n':['4','5','6'], 'v':0},#3的鄰居是4和5和6
    '4': {'n':['5','6'], 'v':0},#4的鄰居是5和6
    '5': {'n':['6'], 'v':0},#5的鄰居是6
    '6': {'n':['7','8'], 'v':0},#6的鄰居是7
    '7': {'n':['8'], 'v':0},#7的鄰居是8
    '8': {'n':[], 'v':0} #8沒有鄰居

}'''

g = { #  graph: 被搜尋的網路 #  n: neighbor (鄰居), v: visited (是否被訪問過) #有向圖 #修改題目
    '1': {'n':['4','2','7'], 'v':0}, 
    '4': {'n':['9','8'], 'v':0},
    '9': {'n':['2','8'], 'v':0},
    '2': {'n':['7'], 'v':0},
    '7': {'n':['8'], 'v':0},
    '8': {'n':['1'], 'v':0} 
}

def init(g): #  初始化、設定 visited 為 0
    for i in g:
        g[i]['v'] = 0


def dfs(g, node): #  深度優先搜尋 #要放入stack的node

    if g[node]['v']!=0:           #  如果已訪問過，就不再訪問
        return  
    print(node, '=> ', end = '') #  否則、印出節點
    g[node]['v'] = 1              #  並設定該node已訪問,v=1;
    neighbors = g[node]['n']      #  取出鄰居節點,從鄰居的節點找下一個節點
    

    for n in neighbors:           #  對於每個鄰居逐一進行訪問
        dfs(g, n)               #運用遞迴呼叫的特性(stack)，逐一尋找


queue=['1'] #  BFS 用的 queue, 起始點為 1。

def bfs(g, q): #  廣度優先搜尋
    if len(q)==0:                 #  如果 queue 是空的就結束。
        return
    node = dequeue(q)             #  否則取出 queue 的最後一個節點。
    if g[node]['v'] == 0:         #  如果該節點尚未拜訪過。
        g[node]['v'] = 1          #    標示為已拜訪
    else:                         #  否則 (已訪問過)
        return                    #    不繼續搜尋，直接返回。
    print(node, '=> ', end = '')  #  印出節點
    neighbors = g[node]['n']      #  找出該節點的鄰居。
    for n in neighbors: #  對於每個鄰居
        if not g[n]['v']:         #  假如該鄰居還沒被拜訪過
            enqueue(q, n)         #    就放入 queue 中
    bfs(g, q)

#再加一個
print('dfs:', end = '')
init(g)
dfs(g, '1') #呼叫深度優先搜尋。
print('')

'''
dfs:1 => 2 => 3 => 4 => 5 => 6 => 
stack: 存在函數呼叫自動產生的堆疊中，並沒有一個外顯變數存放堆疊。
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
'''

print('bfs:', end = '')
init(g)
bfs(g, queue) # 呼叫廣度優先搜尋。
print('')

'''
bfs:1 => 2 => 5 => 3 => 4 => 6 => 
queue:
1
1 2 5
2 5 3 4
5 3 4 6
3 4 6
4 6
6
'''

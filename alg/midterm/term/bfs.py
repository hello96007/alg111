def enqueue(a, o):
    a.insert(0, o) #從第一個位置放進去queue中

def dequeue(a):
    return a.pop() #從queue中最後一個位置取出來

def init(g): #  初始化、設定 visited 為 0
    for i in g:
        g[i]['v'] = 0

g = { #  graph: 被搜尋的網路 #  n: neighbor (鄰居), v: visited (是否被訪問過) #有向圖 #修改題目
    '1': {'n':['4','2','7'], 'v':0}, 
    '4': {'n':['9','8'], 'v':0},
    '9': {'n':['2','8'], 'v':0},
    '2': {'n':['7'], 'v':0},
    '7': {'n':['8'], 'v':0},
    '8': {'n':['1'], 'v':0} 
}

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

print('bfs:', end = '')
init(g)
bfs(g,['1']) # 呼叫廣度優先搜尋。
print('')
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

print('dfs:', end = '')
init(g)
dfs(g, '1') #呼叫深度優先搜尋。
print('')
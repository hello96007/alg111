# 演算法期末報告

# 聲明
- 1.部分程式都是引用自他人，經過熟讀加以修改並註解 
- 2.沒有註解的部分
## 目錄
- BFS與DFS定義
- BFS與DFS程式碼
- BFS與DFS應用
- 其他補充

## BFS與DFS定義
- 1.BFS(Breadth-First Search)
- 從根節點開始尋找，透過queue的方式先找到每個節點的所有鄰居
- 時間複雜度為O(|V|+|E|)

- 2.DFS(Depth-First-Search)
- 一樣從根節點開始找，透過stack的方式找每個節點鄰居的下一個鄰居...(一直串下去)
- 時間複雜度O(|V|+|E|)


## BFS與DFS程式碼
1.BFS:

```
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
print('')```

2.DFS
```
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
```


## 參考資料
1.https://www.796t.com/content/1549064200.html
2.https://zh.wikipedia.org/wiki/广度优先搜索
3.https://zh.wikipedia.org/zh-tw/深度优先搜索
4.https://zh.wikipedia.org/zh-tw/迭代深化深度优先搜索



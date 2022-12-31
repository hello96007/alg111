# 演算法期末報告

# 聲明
- 1.部分程式都是引用自他人，經過熟讀加以修改並註解 
- 2.所有內容都是經過熟讀參考資料，再經過修改整理
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
#### 備註:參考 [陳鍾誠老師人工智慧課程](https://gitlab.com/cccnqu111/ai/-/blob/master/03-search/02-search/graph_search.py)
#### 備註: [bfs手寫筆記](https://github.com/hello96007/alg111/blob/main/alg/midterm/term/bfs.jpeg)
#### 備註: [dfs手寫筆記](https://github.com/hello96007/alg111/blob/main/alg/midterm/term/dfs.jpeg)
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
print('')
```


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



## BFS與DFS應用
#### 備註：參考CHATGPT(問題：DFS與BFS應用)，將其回答加以驗證
#### 參考資料：[BFS應用](https://www.guru99.com/breadth-first-search-bfs-graph-example.html)
#### 參考資料：[DFS應用](https://www.geeksforgeeks.org/depth-first-ordering-in-compiler-design/)
1.BFS
- 網路爬蟲
> 透過網頁內的內容(超連結)去觸及更多網頁，並將這些網頁結果整理處理。
- p2p網路架構
> 找尋網路節點的鄰居並向其索取資料，就能更快速找到資料。
- 網路廣播
> 將封包透過BFS來送達每一個節點。
- 導航
>找尋附近景點的美食及更多的美食:)

2.DFS
- 老鼠走迷宮
- 著色問題
> 連接二分途的應用
- 旅行推銷員問題
> 是否每一個節點都能走到而且不會經過重複的點
- 編譯器設計
> 分析語法

## 補充內容
- 1.迭代深化深度優先搜尋 （iterative deepening depth-first search (IDS or IDDFS))）
> 說明:一層一層的找尋，如果找到資料就停下來
- 2.最小生成樹(minimal spanning tree)
- (參考離散數學的圖論)
> - (1)Kruskal's algorithm
> - 搜尋每個節點間edge的priority,priority由小到大尋找,如果已經有edge連接兩個node,則該edge跳過，再找下一個edge。
> - (2)Prim's algorithm
> - 先尋找每個節點間edge的priority最小值，從最小值開始延伸尋找較小的priority。
- 3.Dijkstra's 與 Prim's的差別
> - 一個是找最短路徑，一個是找最小生成數

## 參考資料
1.https://www.796t.com/content/1549064200.html
2.https://zh.wikipedia.org/wiki/广度优先搜索
3.https://zh.wikipedia.org/zh-tw/深度优先搜索
4.https://zh.wikipedia.org/zh-tw/迭代深化深度优先搜索
5.https://www.guru99.com/breadth-first-search-bfs-graph-example.html
6.http://tw-csie-sprout.github.io/programming15spring/pages/uploads/presentations/week14/ID_DFS_HsinChu.pdf

## 後記：心得
```
    又這樣過了一學期，充實的一學期。課堂從最一開始的Big-o到最後的數學領域，當中也學到了lamda的寫法,
    當然最重要的還是許許多多演算法的方法。雖然有許多的課程我可能只吸收了一半，甚至還不到一半，但最重要的是
    我能了解到演算法與資料結構的關係是多麽緊密，以及整個數學系統的連結。
    最後的期末專案選擇了資料結構當中算是非常重要的BFS,DFS來當作題目，並做一些延伸與應用，加深自己的印象。

```


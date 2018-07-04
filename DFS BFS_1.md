## DFS BFS

- DFS (Stack(FILO) 이용 구현)

  - (Depth First Search : 깊이 우선 탐색)

  

- BFS(Queue(FOLI) 이용 구현)

  - (Breadth FIRST Search : 넓이(너비) 우선 탐색)



#### DFS에 좋은 Method

```java
	public static int[] parent;
	//최종 부모노드 찾는 method
    public static int find(int x) {
        if(x == parent[x]) {
            return x;
        } else {
            return parent[x] = find(parent[x]);
        }
    }
	//parent idx 배열을 만들어준 method
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if(x > y) {
            parent[x] = y;
        } else {
            parent[y] = x;
        }
    }
```

```java
//예제
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        parent = new int[n+1];
        for(int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for(int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            union(x,y);
        }
		
        int cnt = 0;
        for(int i = 2; i <= n; i++) {
            if(find(i)== find(1))
                ++cnt;
        }
        System.out.println(cnt);	
    }
```

```
//입력
7
6
1 2
2 3
1 5
5 2
5 6
4 7
```

```
//출력
4
```


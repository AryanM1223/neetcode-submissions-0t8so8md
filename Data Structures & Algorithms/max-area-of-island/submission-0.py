class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0
    
        rows , cols = len(grid),len(grid[0])
        visit = set();
        area = 0;
        maxArea = 0;

        def bfs(r,c):
            q = collections.deque()
            q.append((r,c))
            visit.add((r,c))
            area = 1;
            directions = [[0,1],[0,-1],[1,0],[-1,0]]
        
            while q:
                row,col = q.popleft()

                for dr,dc in directions:
                    r = row + dr
                    c = col + dc

                    if(r in range(rows) and c in range(cols) and 
                    (r,c) not in visit 
                    and grid[r][c] == 1):
                        q.append((r,c))
                        visit.add((r,c))
                        area += 1
            
            return area


        for r in range(rows):
            for c in range(cols):
                if(grid[r][c] == 1 and (r,c) not in visit):
                    area = bfs(r,c)
                    maxArea = max(maxArea,area)
    

    

        return maxArea
        
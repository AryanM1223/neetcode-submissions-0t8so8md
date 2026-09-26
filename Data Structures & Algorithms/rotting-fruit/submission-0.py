class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        fresh, time = 0, 0
        q = collections.deque()
        row, col = len(grid), len(grid[0])

        for r in range(row):
            for c in range(col):
                if grid[r][c] == 1:
                    fresh += 1
                if grid[r][c] == 2:
                    q.append((r, c))

        while q and fresh > 0:
            for i in range(len(q)):
                rows, cols = q.popleft()
                directions = [[1, 0], [0, 1], [-1, 0], [0, -1]]

                for dr, dc in directions:
                    nr = rows + dr
                    nc = cols + dc

                    if nr in range(row) and nc in range(col) and grid[nr][nc] == 1:
                        grid[nr][nc] = 2
                        q.append((nr, nc))
                        fresh -= 1

            time += 1

        return time if fresh == 0 else -1
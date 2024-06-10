import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;
            
            Point[] points = new Point[N];
            for (int i = 0; i < N; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                points[i] = new Point(x, y);
            }
            
            int maxCocircular = 1;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    List<Point> cocircularPoints = new ArrayList<>();
                    cocircularPoints.add(points[i]);
                    cocircularPoints.add(points[j]);
                    
                    for (int k = j + 1; k < N; k++) {
                        if (isCocircular(cocircularPoints, points[k])) {
                            cocircularPoints.add(points[k]);
                        }
                    }
                    
                    maxCocircular = Math.max(maxCocircular, cocircularPoints.size());
                }
            }
            
            System.out.println(maxCocircular);
        }
        
        scanner.close();
    }
    
    private static boolean isCocircular(List<Point> points, Point p) {
        if (points.size() == 1) return true;
        
        int x1 = points.get(0).x;
        int y1 = points.get(0).y;
        int x2 = points.get(1).x;
        int y2 = points.get(1).y;
        int x3 = p.x;
        int y3 = p.y;
        
        return (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) == 0;
    }
    
    static class Point {
        int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
 
    }
 
}
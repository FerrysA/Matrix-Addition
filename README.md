## Matrix-Addition (6kyu)
## 21.10.2022
## Сложение матриц 
## [ссылка на задание](https://www.codewars.com/kata/526233aefd4764272800036f)
## Код:
``` java
public static int[][] matrixAddition(int[][] a, int[][] b) {
        int n =a.length;

        for (int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        return a;
    }
```
## Понравивщееся решение (автор j.abejero)
``` java
 public static int[][] matrixAddition(int[][] a, int[][] b) {
  
  for(int i=0; i<a.length; i++){
    for(int j=0; j<a.length; j++){
      a[i][j]+=b[i][j];
    }
  }
    return a;
  }
    

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// cities and sales
    String[] cities={"Cape Town","Port Elizabeth","Pretoria"};
    String[] Electronics={"PS5","XBOX","SWICH"};
    int[][] Sales={{1000,2000,300},{2000,3000,4000},{1500,1100,1200}};
    // Calculate total
    int[] totalSales=new int[];
    for (int i=0;i<Sales.length;i++) {
        for (int j = 0; j < Sales[i].length; j++) {
            totalSales[i] += Sales[i][j];
        }
    }
            System.out.println("-----------------------------------------------------");
            System.out.println("GAMING CONSOLE REPORT");
            System.out.println("-----------------------------------------------------");
            System.out.printf("%-20s %18s %18s %-18s\n","","PS5","XBOX","SWICH");
            for(int a=0;a< Sales.length;a++){
                System.out.printf("%-20s",cities[a]);
                for(int b=0;b< Sales[a].length;b++){
                    System.out.printf("%-10s",Sales[a][b]);
                }
            }
    System.out.println("-----------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("-----------------------------------------------------");
    System.out.println("Cape Town             " +totalSales[0]);
    System.out.println("Port Elizabeth            "+totalSales[1]);
    System.out.println("Pretoria               "+totalSales[2]);
    
    System.out.println("-----------------------------------------------------");

        }



import java.util.Scanner;

public class javaCoreSlot1 {
    public static void main(String[] args) {
        //em mới làm được 12 bài
        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
//        Ex5();
//        Ex6();
//        Ex7();
//        Ex8();
//        Ex9();
//        Ex10();
//        Ex11();
//        Ex12();
    }

    private static void Ex12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    private static void Ex11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int result = (int)(Math.log(n) / Math.log(2));
        System.out.println(" Số tự nhiên lớn nhất < Log"+n+" base 2 :"+result);
    }

    private static void Ex10() {

            int i =0;
            int num =0;
            //Empty String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
            int total=0;
            for (i = 1; i <= n; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    total+=i;
                }
            }
            System.out.print("Tổng nguyên tố từ 1 đến "+n+" là:");
            System.out.println(total);

    }

    private static void Ex9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        int a1=a;
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        int b1=b;
        int i=0;
        int[] arr1= new int[2];
        int[] arr2= new int[2];
        while (a1!=0){
            int du=a1%10;
            a1/=10;
            arr1[i]=du;
            du=b1%10;
            b1/=10;
            arr2[i]=du;
            i++;
        }
        int check=0;
        loop:
        for (int j = 0; j <arr1.length-1 ; j++) {
            for (int k = 0; k < arr2.length; k++) {
                if(arr1[j]==arr2[k]){
                    System.out.println("("+a+","+b+")"+"=>True");
                    check=1;
                    break loop;
                }
            }

        }
        if (check == 0) {
            System.out.println("("+a+","+b+")"+"=>False");
        }
    }

    private static void Ex8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        String[] arr=str.split("\\s+");
        String rs="";
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
        }
        System.out.println("After edit:");
        for (String item:arr) {
            System.out.print(item+" ");
        }

    }

    private static void Ex7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        System.out.println("Các ước số của "+number+" là: ");
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i + "\t");
            }
        }
    }

    private static void Ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();
        String rs1 = new StringBuilder(s).reverse().toString();
        System.out.println(rs1);
    }

    private static void Ex5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A(Xa,Ya)");
        System.out.print("Xa:");int xa=sc.nextInt();
        System.out.print("Ya:");int ya=sc.nextInt();
        System.out.println("Enter B(Xb,Yb)");
        System.out.print("Xb:");int xb=sc.nextInt();
        System.out.print("Yb:");int yb=sc.nextInt();
        System.out.print("Độ dài đoạn thẳng AB:"+((xa-xb)*(xa-xb)+(ya-yb)*(ya-yb)));

    }

    private static void Ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a =sc.nextInt();
        int rs=0;
            while (a!=0){

                int z=a%10;
                a=a/10;
                rs+=z;
            }
            System.out.print("Total digit in this number:");
            System.out.print(rs);
        }
    //bai 3
    private static void Ex3() {
        System.out.println("Java Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
    }

    //bai 2
    private static void Ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a =sc.nextInt();
        System.out.print("1.To binary\n2.To decimal\nEnter option:");
        int option=sc.nextInt();
        String rs="";
        int rs2=0;
        int i=0;

        if (option==1){

            while (a!=0){

                int z=a%2;
                a=a/2;
                String r=String.valueOf(z);
                rs+=r;
            }
            String rs1 = new StringBuilder(rs).reverse().toString();
            System.out.print("After convert:");
            System.out.print(rs1);
        }

        else{
            while (a!=0){
                int z=a%10;
                a /= 10;
                rs2+=z*Math.pow(2,i);
                i+=1;
            }
            System.out.print("After convert:");
            System.out.print(rs2);

        }

    }

    //bai 1
    private static void Ex1() {
        for (int i = 0; i <15 ; i++) {
            if (i%2==0&&i<=8){
                for (int j = 0; j < 45; j++) {
                    if (j%2==0&&j<12){
                        System.out.print("*");
                    } else if (j%2!=0&&j<12) {
                        System.out.print(" ");
                    } else{
                        System.out.print("=");
                    }
                }
                System.out.println();
            } else if (i%2!=0&&i<8){
                for (int j = 0; j < 45; j++) {
                    if (j%2==0&&j<12||j==11){
                        System.out.print(" ");
                    } else if (j%2!=0&&j<12) {
                        System.out.print("*");
                    } else{
                        System.out.print("=");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < 45; j++) {
                    System.out.print("=");
                }
                System.out.println();
            }
        }
    }


}


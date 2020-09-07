import java.util.*;
class StudentDetails{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long phone;
        int marks[] = new int[6];
        String name,address;
        System.out.print("Enter Name : ");
        name = in.nextLine();
        System.out.print("Enter Address : ");
        address = in.nextLine();
        System.out.print("Enter Phone Number : ");
        phone = in.nextLong();
        for(int i=0;i<6;i++){
            System.out.print("Enter Marks(Out Of 15) in Subject-"+(i+1)+" : ");
            marks[i] = in.nextInt();
        }
        int total = 0;
        System.out.println("Details : \nName : "+name+"\nAddress : "+address+"\nPhone : "+phone);
        for(int i=0;i<6;i++){
            System.out.println("Marks in Subject-"+i+" : " + marks[i]);
            total+=marks[i];
        }
        System.out.println("Average Marks : " + total/6);
        System.out.println("Percentage : " + (total*100)/90 + "%");

    }
}




//op-

/*Enter Name : Siddhant Bose
Enter Address : siddhantbose333@gmail.com
Enter Phone Number : 9701401958
Enter Marks(Out Of 15) in Subject-1 : 12
Enter Marks(Out Of 15) in Subject-2 : 14
Enter Marks(Out Of 15) in Subject-3 : 15
Enter Marks(Out Of 15) in Subject-4 : 12
Enter Marks(Out Of 15) in Subject-5 : 11
Enter Marks(Out Of 15) in Subject-6 : 10
Details :
Name : Siddhant Bose
Address : siddhantbose333@gmail.com
Phone : 9701401958
Marks in Subject-0 : 12
Marks in Subject-1 : 14
Marks in Subject-2 : 15
Marks in Subject-3 : 12
Marks in Subject-4 : 11
Marks in Subject-5 : 10
Average Marks : 12
Percentage : 82%
Enter Name : Siddhant Bose
Enter Address : siddhantbose333@gmail.com
Enter Phone Number : 9701401958
Enter Marks(Out Of 15) in Subject-1 : 12
Enter Marks(Out Of 15) in Subject-2 : 14
Enter Marks(Out Of 15) in Subject-3 : 15
Enter Marks(Out Of 15) in Subject-4 : 12
Enter Marks(Out Of 15) in Subject-5 : 11
Enter Marks(Out Of 15) in Subject-6 : 10
Details :
Name : Siddhant Bose
Address : Siddhant Bose
Phone : 9701401958
Marks in Subject-0 : 12
Marks in Subject-1 : 14
Marks in Subject-2 : 15
Marks in Subject-3 : 12
Marks in Subject-4 : 11
Marks in Subject-5 : 10
Average Marks : 12
Percentage : 82%*/

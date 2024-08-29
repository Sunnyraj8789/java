import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//time complexity --->O(n^2)
//space complexity --->O(n)

public class jobScheduling {
    char id;
    int deadline,profit;
    public jobScheduling(){

    }
    public jobScheduling(char id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;

    }

    //function defination
    void printsequnces(ArrayList<jobScheduling> arr,int maxDeadline){
        int n=arr.size();

        //1. to sort the job in the decreasing order of profit
        //custom expression lambda expression
        Collections.sort(arr,(a,b)-> b.profit - a.profit);//---->nlogn

        
        //keep the track of the booked slot 
        boolean result[]=new boolean[maxDeadline];


        //to store the job ids
        char jobs[]=new char[maxDeadline];

    
        //2. to store the job id's according to the given deadline 
        //time ---->O(n^2)
        for(int i=0;i<n;i++){
            for(int j=Math.min(maxDeadline-1, arr.get(i).deadline-1);j>=0;j--){
                //if slot is available -false
                if(result[j]==false){
                    result[j]=true;
                    jobs[j]=arr.get(i).id;
                    break;
                }
            }
        }
        for(char id:jobs){
            System.out.println(id +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<jobScheduling> arr=new ArrayList<>();
        arr.add(new jobScheduling('1',5,55));
        arr.add(new jobScheduling('2',2,65));
        arr.add(new jobScheduling('3',7,75));
        arr.add(new jobScheduling('4',3,60));
        arr.add(new jobScheduling('5',2,70));
        arr.add(new jobScheduling('6',1,50));
        arr.add(new jobScheduling('7',4,85));
        arr.add(new jobScheduling('8',5,68));
        arr.add(new jobScheduling('9',3,45));
        System.out.println("job sequences to get the maximum profit");
        jobScheduling job=new jobScheduling();
        job.printsequnces(arr,7);
    }
}

                                      
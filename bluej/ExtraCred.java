
public class ExtraCred
{
    static void main(){
        int year = 1900;
        int month = 1;
        int day = 0;
        int days = 0;
        int[] monthList = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int count = 0;
        while(year<2001){
            days++;
            day++;
            if(year%4==0){
                monthList[2]=29;
            }else{
                monthList[2]=28;
            }
            if(day>6){
                day=0;
            }
            if(days>monthList[month]){
                days=1;
                month++;
            }
            if(day==0 && days==1 && year>1900){
                count++;
            }
            if(month>12){
                month=1;
                year++;
            }
        }
        System.out.println(count);
    }
}

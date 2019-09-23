import javax.swing.JOptionPane;
public class Test1
{
    public static void main(){
        int numSatellites = Integer.parseInt(JOptionPane.showInputDialog("Number of satillites to be analyzed: " ));
        int[] satellites = new int[numSatellites];

        for(int i=0;i<numSatellites;i++){
            satellites[i] = i +1;
        }
        int[] satelliteAltitude = new int[numSatellites];
        for(int i=0;i<numSatellites;i++){
            int height = (int)((Math.random()*195001)+5000);
            satelliteAltitude[i] = height;
        }
        String[] orbitLocation = new String[numSatellites];
        for(int i=0;i<numSatellites;i++){
         if(satelliteAltitude[i] < 10000){
             orbitLocation[i] = "not good";
            }
         else if(satelliteAltitude[i] < 50000){
             orbitLocation[i] = "low earth orbit";
            }
         else if(satelliteAltitude[i] < 150000){
             orbitLocation[i] = "high earth orbit";
            }
         else{
             orbitLocation[i] = "you're out of here";
            }
            
        }
        System.out.println("Satellites \t Satellite Altitude \t Orbit Location");
        for(int i=0;i<numSatellites;i++){
            System.out.println(satellites[i]+ "\t\t" + satelliteAltitude[i] + "\t\t" + orbitLocation[i]);
        }
    }
}

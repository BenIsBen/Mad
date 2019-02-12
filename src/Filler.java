public class Filler {
    public Filler() {
    }
    public void fillSpace(String x, String[] z){
        int fill = 0;
        String[] which = x.split("\\s+");
        String[] doop = new String[which.length];
        for(int i = 0; i < which.length; i++){
            if(which[i].equals("^")){
                doop[i] = z[fill];
                fill++;
            }else{
                doop[i] = which[i];
            }
        }
        String returner = "";
        for(int j = 0; j < doop.length; j++){
            String nextword = doop[j];
            returner+=nextword+" ";
        }
        System.out.println(returner);
    }
}

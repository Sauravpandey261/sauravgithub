class stringpercentage {
    public static void main(String[] args){
        String name="S@ur@v pandey is doing programming123e4r5";
        int up=0,lp=0,etc=0,digi=0;
        for(int i=0;i<=name.length()-1;i++){
            char ch=name.charAt(i);
            if(Character.isUpperCase(ch)){
                up++;
            }
            else if(Character.isLowerCase(ch)){
                lp++;
            }
            else if(Character.isDigit(ch)){
                digi++;
            }
            else{
                etc++;
            }
        }
            int total=lp+up+etc;
            float percU=((float)up/total)*100;
            float percL=((float)lp/total)*100;
            float percD=((float)digi/total)*100;
            float percE=((float)etc/total)*100;
            

        System.out.println("percentage of Upper case: "+ percU);
        System.out.println("percentage of lower case: "+ percL);
        System.out.println("percentage of digit case: "+ percD);
        System.out.println("percentage of etc case: "+ percE);
    }
}

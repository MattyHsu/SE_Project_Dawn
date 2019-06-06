import java.util.Vector;
import java.util.Random;



public class MapClass {

    Random rand=new Random();
    public static int unit =150;
    public static int size =100;

    public Vector<Prop> proplist;
    private Prop prop_sample;
   // public Vector<> rankrecord;
    public int[][] m;

    public MapClass () {

        proplist = new Vector<Prop>();
     //   rankrecord = new Vector<Role>();

        String st="1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000111111111111111111111111111111111111111100000000000000000011111000000000000000111111\n" +
                "1111110000000000111111111111111111111111111111111111111100000000000000000011111000000000000000111111\n" +
                "1111110000000000111111111111111111111111111111111111111100000000000000000011111000000000000000111111\n" +
                "1111110000000000111111111111111111111111111111111111111100000000000000000011111000000000000000111111\n" +
                "1111110000000000111111111111111111111111111111111111111100000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000011111000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000001111111111111111111111111111111111111111000000000000000000000000111111\n" +
                "1111110000000001111100000000001111111111111111111111111111111111111111000000000000000000000000111111\n" +
                "1111110000000001111100000000001111111111111111111111111111111111111111000000000000000000000000111111\n" +
                "1111110000000001111100000000001111111111111111111111111111111111111111000000000000000000000000111111\n" +
                "1111110000000001111100000000001111111111111111111111111111111111111111000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000001111100000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000111111111111111111111111111111111111111111111111110000000000000000000111111\n" +
                "1111110000000000000000000111111111111111111111111111111111111111111111111110000000000000000000111111\n" +
                "1111110000000000000000000111111111111111111111111111111111111111111111111110000000000000000000111111\n" +
                "1111110000000000000000000111111111111111111111111111111111111111111111111110000000000000000000111111\n" +
                "1111110000000000000000000111111111111111111111111111111111111111111111111110000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111110000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n" +
                "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n";
        m=new int[100][100];
        int row=0; int col=0;
        for (int i=0;i<st.length();i++) {
            char[] chr=st.toCharArray();
            switch (chr[i]){
                case '1':m[col][row]=1; row++; break;
                case '0':m[col][row]=0; row++; break;
                case  '\n' : row=0;col++;
            }
        }
        int proptype;
        int[] proposition = new int[2];
        int x,y;
        for (int i = 0; i <30; i++) { //构造prop的，测试生成30个
            proptype = rand.nextInt(4);
            prop_sample = new Prop(i,proptype);
            do {
                x = rand.nextInt(13200) + 900;
                y = rand.nextInt(13200) + 900;
            }while(!is_valid(x,y));
            proposition[0] = x;
            proposition[1] = y;
            prop_sample.setPropposition(proposition);
            proplist.add(prop_sample);
        }


    }


    private boolean is_valid(int x,int y){
        return (m[y/unit][x/unit]==0);
    }




}

import java.util.*;
class MapTest {
    public static void main( String[] args ) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put( "Number1", new Integer( 100 ) );
        map1.put( "Number2", new Integer( 200 ) );
        map1.put( "Number3", new Integer( 300 ) );

        List<Map> list = new ArrayList<>();
        list.add( map1 );
        list.add( map2 );

        HashMap resultMap = (HashMap) list.get( 0 );
        System.out.println( "Number: " + resultMap.get( "Number2" ) );
    }
} 
import java.util.*;

public class FMe1 {
    public static void main(String[] args) {
        List<String> lineItemIds = Arrays.asList(
                "lb3edgf5atrqgjgf357akawb4nqv4aj3svfjzlkfrocrjfiwvadq",
                "lmmex7g62szlqdbhapw4xjgrezvy7x2k3u5gtowatipamtynplua",
                "fvj7cdojynbwr6j6xmst2uymq43s3tlgsdsbpj7arv27j4vi2ssq",
                "2k2ygzehv2ow6gwqe65f6mjz5o62pmu62jwspznnrcli4odgbwnq",
                "2lztomqvcfq752m455s6k76p7b7cqyhp5fepxfd26xdgdbzkefga",
                "qsg6lnmmac4zpaipgwrsfkyzd2nx3smybqeu22szfhuabegekbia",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "lmmex7g62szlqdbhapw4xjgrezvy7x2k3u5gtowatipamtynplua",
                "kvhjhtcy4ckazzmktrtg2o2bapndekqr2ewb73ob552gdjupcmfa",
                "o6qhokyvkvikcxrnexzu4ab5ubgbyvw5jun3xal5a2iqi3o74jha",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "2lztomqvcfq752m455s6k76p7b7cqyhp5fepxfd26xdgdbzkefga",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq",
                "4tp4y2wmzdkbqh7jm54avio7rtyayhtxdlrhu7tgdjqh6n6giu6q",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "jyis57v6hcrecu6pgbvwomjjffqyb7cjvv7my6jxj5fc477nednq",
                "rjumjiggqf7epdt45vqixmzjkza5mrgemn4oz2urr2ebfdn57kjq",
                "lj6lrvwnszj4kvmuk7pzhiscdpr7vwrrzkd2yeifbp6torhwprha",
                "unwpwgxj667jgtngm2k2n5vqctayyuvctsifz2wzhstkh5t6lkwq",
                "ft3vo6isihz72pnwcjwwql7xvo4mn24zlxiftdxyjfg2gkvrhsqq",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "4tp4y2wmzdkbqh7jm54avio7rtyayhtxdlrhu7tgdjqh6n6giu6q",
                "sm3cqda3qw4ntdok2ytgikaacqcpwxuhaa6gubgz3ebnlqh7b5kq",
                "o6qhokyvkvikcxrnexzu4ab5ubgbyvw5jun3xal5a2iqi3o74jha",
                "kvhjhtcy4ckazzmktrtg2o2bapndekqr2ewb73ob552gdjupcmfa",
                "2lztomqvcfq752m455s6k76p7b7cqyhp5fepxfd26xdgdbzkefga",
                "tq5ovp343wd3gjin6mgauxnc223vynffg6l7heqt5jfhgame4inq",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "2uy5j6okzpab5tj6f3lk5zdcvqync4q3ucjvnm4et4ob7mfucjta",
                "mkln6kziatezyxmkf4lfqdjazgagzmjobb6wsyaxnaznwpseigca",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq",
                "lmmex7g62szlqdbhapw4xjgrezvy7x2k3u5gtowatipamtynplua",
                "6spr7cmjlhtzbt666k5bp775zep5ypbnikn2panpw7iqbdln34la",
                "niz7zlxnkwvdiuqyunc5yjsqugpav55e4j3ulnnmxir2tscs6ijq",
                "lb3edgf5atrqgjgf357akawb4nqv4aj3svfjzlkfrocrjfiwvadq",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "lb3edgf5atrqgjgf357akawb4nqv4aj3svfjzlkfrocrjfiwvadq",
                "2k2ygzehv2ow6gwqe65f6mjz5o62pmu62jwspznnrcli4odgbwnq",
                "qsg6lnmmac4zpaipgwrsfkyzd2nx3smybqeu22szfhuabegekbia",
                "4yru52l7h4vt2jfgnn5bhsejbcmzynfgghr2uey2totdinhn5fma",
                "lj6lrvwnszj4kvmuk7pzhiscdpr7vwrrzkd2yeifbp6torhwprha",
                "qsg6lnmmac4zpaipgwrsfkyzd2nx3smybqeu22szfhuabegekbia",
                "4yru52l7h4vt2jfgnn5bhsejbcmzynfgghr2uey2totdinhn5fma",
                "kvhjhtcy4ckazzmktrtg2o2bapndekqr2ewb73ob552gdjupcmfa",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "7pes6q65g2vowefitvotacdmsjf3qsfbd34dezyvebzy77gygh2a",
                "tq5ovp343wd3gjin6mgauxnc223vynffg6l7heqt5jfhgame4inq",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq",
                "tq5ovp343wd3gjin6mgauxnc223vynffg6l7heqt5jfhgame4inq",
                "jyis57v6hcrecu6pgbvwomjjffqyb7cjvv7my6jxj5fc477nednq",
                "rjumjiggqf7epdt45vqixmzjkza5mrgemn4oz2urr2ebfdn57kjq",
                "sm3cqda3qw4ntdok2ytgikaacqcpwxuhaa6gubgz3ebnlqh7b5kq",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq",
                "2k2ygzehv2ow6gwqe65f6mjz5o62pmu62jwspznnrcli4odgbwnq",
                "xqdckzvyzzoxn5gnf64fk4jut5irtyrbcxgxokejmwb2ieaufshq");

        List<Double> values = new ArrayList<>();

        values.add(0.0);
        values.add(6.061497915);
        values.add(1.641230052);
        values.add(0.045151235);
        values.add(0.0126711835);
        values.add(1.499992065);
        values.add(0.0);
        values.add(6.061497915);
        values.add(28.328571114);
        values.add(0.0);
        values.add(0.0);
        values.add(0.016622854);
        values.add(0.0);
        values.add(0.0);
        values.add(2.8461886211);
        values.add(0.0);
        values.add(0.013805073);
        values.add(0.0414900689);
        values.add(0.0);
        values.add(0.0);
        values.add(0.0191679465);
        values.add(0.0);
        values.add(0.0);
        values.add(0.0);
        values.add(2.8461886211);
        values.add(3.1277382955);
        values.add(0.0);
        values.add(9.967390463);
        values.add(0.016622854);
        values.add(0.0157647655);
        values.add(0.0);
        values.add(0.0093887025);
        values.add(0.0075873436);
        values.add(0.0);
        values.add(2.273770235);
        values.add(1.6841842542);
        values.add(0.0);
        values.add(0.0);
        values.add(0.0);
        values.add(0.0);
        values.add(0.1345253235);
        values.add(4.5168237015);
        values.add(0.0193062294);
        values.add(0.0);
        values.add(4.5168237015);
        values.add(0.0193062294);
        values.add(28.328571114);
        values.add(0.0);
        values.add(0.0);
        values.add(0.0351919095);
        values.add(0.0);
        values.add(0.0351919095);
        values.add(0.013805073);
        values.add(0.0414900689);
        values.add(3.1277382955);
        values.add(0.0);
        values.add(0.1345253235);
        values.add(0.0);

        System.out.println(lineItemIds.size());
        System.out.println(values.size());


        Map<String, Set<Double>> map = new HashMap<>();

        for (int i = 0; i < values.size(); i++) {
            map.putIfAbsent(lineItemIds.get(i), new HashSet<>());
            map.get(lineItemIds.get(i)).add(values.get(i));
        }

        double total = 0.0;
        for (String key : map.keySet()) {
            System.out.println(key + ":::" + map.get(key));
            for (double dd : map.get(key)) {
                total += dd;
            }
        }

        System.out.println(total);
    }


}

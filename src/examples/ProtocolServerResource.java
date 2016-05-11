package examples;

/**
 *
 * @author mustafa
 */
public class ProtocolServerResource {

    public static void resolveURL(String s) {
        String protocol;
        protocol = s.substring(0,s.indexOf(":"));
        String server;
        String tmp[];
        tmp = s.split("//");
        server = tmp[1].substring(0, tmp[1].indexOf('/'));
        String resource;
        resource = tmp[1].substring(tmp[1].indexOf('/'));
        
        
        System.out.printf("[protocol] = %s\n[server] = %s\n[resorce] = %s\n",protocol,server,resource);
        System.out.print("\"Hello\"");
    }

    public static void main(String[] args) {
        resolveURL("http://www.devbg.org/forum/index.php");
    }
}

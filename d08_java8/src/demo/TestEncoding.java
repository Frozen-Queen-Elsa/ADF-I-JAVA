
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class TestEncoding {

    public static void main(String[] args) {
        try {
            String s="Iris Seohyun";
            System.out.println("Original text + " + s);
            
// Encoding a string using Base64
            String sEncode = Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
            System.out.println("Encoded String (Basic) looks like this: " + sEncode);
// Decoding a string using Base64
            byte[] base64decodedBytes = Base64.getDecoder().decode(sEncode);
            System.out.println("Decoded String is : " + new String(base64decodedBytes, "utf-8"));

            sEncode = Base64.getUrlEncoder().encodeToString(s.getBytes("utf-8"));
            System.out.println("Encoded String (URL)  looks like this: " + sEncode);
            byte[] urldecode = Base64.getUrlDecoder().decode(sEncode);
            System.out.println("Decoded URL is:  " + new String(urldecode, "utf-8"));

            StringBuilder strBuild = new StringBuilder();
            for (int j = 0; j < 10; ++j) {
                strBuild.append(UUID.randomUUID().toString());
            }
            byte[] sampleMimeBytes = strBuild.toString().getBytes("utf-8");
            String sampleMimeEncoStr = Base64.getMimeEncoder().encodeToString(sampleMimeBytes);
            System.out.println("Encoded String (MIME) looks like this: " + sampleMimeEncoStr);
        } catch (UnsupportedEncodingException u) {
            System.out.println("Unsupported Encoding Error: " + u.getMessage());
        }

    }

}

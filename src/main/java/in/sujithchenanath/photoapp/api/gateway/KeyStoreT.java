/*
 * package in.sujithchenanath.photoapp.api.gateway;
 * 
 * import java.io.FileInputStream; import java.io.IOException; import
 * java.io.InputStream;
 * 
 * import java.security.Key; import java.security.KeyStore; import
 * java.security.KeyStoreException; import
 * java.security.NoSuchAlgorithmException; import
 * java.security.UnrecoverableKeyException; import
 * java.security.cert.CertificateException;
 * 
 * public class KeyStoreT {
 * 
 * public static void main(String[] args) throws KeyStoreException,
 * UnrecoverableKeyException, NoSuchAlgorithmException, CertificateException,
 * IOException { // TODO Auto-generated method stub KeyStore keyStore =
 * KeyStore.getInstance("JKS"); try (InputStream stream = new
 * FileInputStream("D:\\Springconfig\\apiEncryptionKey.jks")) {
 * keyStore.load(stream, "123456".toCharArray()); Key key =
 * keyStore.getKey("apiEncryptionKey", "123456".toCharArray());
 * System.out.println("Key: " + key); }
 * 
 * 
 * }
 * 
 * }
 */
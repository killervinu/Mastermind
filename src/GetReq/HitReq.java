package GetReq;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL; 
/*import org.json.JSONObject;*/
public class HitReq
{

	public static void main(String[] args)
	{
		     try
		     {
		    	 for(int i=0; i<10; i++)
		    	 {
		    		 HitReq.call_me();
		    		 Thread.sleep(30000); 
		         }
		     } 
		     catch (Exception e)
		     {
		         e.printStackTrace();
		     }
	}
			   
		public static void call_me() throws Exception {
		     String url = "http://redov.dx.am/doge/new/update.php/?id=DLUAwyt5uzoihZ8NHpqhzo8EMqtPddLwkt&tag=&ref=&t=0";
		     String url1= "http://redov.dx.am/doge/new/get.php/?id=DLUAwyt5uzoihZ8NHpqhzo8EMqtPddLwkt&tag=";
		     URL obj = new URL(url);
		     URL obj1= new URL(url1);
		     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		     HttpURLConnection con1 = (HttpURLConnection) obj1.openConnection();
		     // optional default is GET
		     con.setRequestMethod("GET");
		     con1.setRequestMethod("GET");
		     //add request header
		     con.setRequestProperty("User-Agent", "Mozilla/5.0");
		     con1.setRequestProperty("User-Agent", "Mozilla/5.0");
		     int responseCode = con.getResponseCode();
		     int responseCode1 = con1.getResponseCode();
		     /*System.out.println("\nSending 'GET' request to URL : " + url);
		     System.out.println("Response Code : " + responseCode);
		     System.out.println("\nSending 'GET' request to URL : " + url1);
		     System.out.println("Response Code : " + responseCode1);*/
		     BufferedReader in = new BufferedReader(
		             new InputStreamReader(con.getInputStream()));
		     String inputLine;
		     StringBuffer response = new StringBuffer();
		     while ((inputLine = in.readLine()) != null) {
		     	response.append(inputLine);
		     }
		     in.close();
		     //print in String
		     System.out.println(response.toString());
		   }
		
	}

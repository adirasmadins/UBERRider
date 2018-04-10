package usmanali.uberrider;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SAJIDCOMPUTERS on 11/1/2017.
 */

public class RetrofitClient {
    private static Retrofit retrofit=null;
    private static Retrofit retrofit_obj_for_Directions_api=null;
    public static Retrofit getClient(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl("https://fcm.googleapis.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
  public static Retrofit getDirectionClient(){
      if (retrofit_obj_for_Directions_api==null){
          retrofit_obj_for_Directions_api=new Retrofit.Builder()
                  .baseUrl("https://maps.googleapis.com/")
                  .addConverterFactory(GsonConverterFactory.create())
                  .build();
      }
      return retrofit_obj_for_Directions_api;
  }
}

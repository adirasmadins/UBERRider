package usmanali.uberrider;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import usmanali.uberrider.Model.fcm_response;
import usmanali.uberrider.Model.sender;

/**
 * Created by SAJIDCOMPUTERS on 11/8/2017.
 */

public interface FCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAbh-3on0:APA91bF_o2i6m07L4LHsJ2jjXxlZp1CHPF48_Ugwefl_ykOeum6uqiydg96Cudvi5K6khVtsH78lLxqNftiw0G3re7DQs39Ec-_lNFlXIptF2UgzUNrLVg29eIq7U0QF4u_dC1SRDJMj"

    })
    @POST("fcm/send")
    Call<fcm_response> send_message(@Body sender body);
}

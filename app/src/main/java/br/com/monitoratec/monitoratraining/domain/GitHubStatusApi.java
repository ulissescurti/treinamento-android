package br.com.monitoratec.monitoratraining.domain;

import br.com.monitoratec.monitoratraining.domain.entity.Status;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Interface da API GitHub Status.
 *
 * Created by ulissescurti on 1/9/17.
 */

public interface GitHubStatusApi {

    String BASE_URL = "https://status.github.com/api/";

    @GET("last-message.json")
    Call<Status> lastMessage();
}

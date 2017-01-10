package br.com.monitoratec.monitoratraining.domain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Entidade da API GitHub Status.
 *
 * @see <a href="https://status.github.com./api/last-message.json">Last Message</a>
 *
 * Created by ulissescurti on 1/9/17.
 */

public class Status {

    public String status;
    public String body;
    public String created_on;
}

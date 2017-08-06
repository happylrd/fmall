package io.happylrd.juno.core.net;

import java.util.Map;
import java.util.WeakHashMap;

import io.happylrd.juno.core.net.callback.IError;
import io.happylrd.juno.core.net.callback.IFailure;
import io.happylrd.juno.core.net.callback.IRequest;
import io.happylrd.juno.core.net.callback.ISuccess;
import okhttp3.RequestBody;

public class RestClient {

    private final String URL;
    private static final WeakHashMap<String, Object> PARAMS = RestCreator.getParams();
    private final IRequest REQUEST;
    private final ISuccess SUCCESS;
    private final IFailure FAILURE;
    private final IError ERROR;
    private final RequestBody BODY;

    public RestClient(String url,
                      Map<String, Object> params,
                      IRequest request,
                      ISuccess success,
                      IFailure failure,
                      IError error,
                      RequestBody body) {
        this.URL = url;
        PARAMS.putAll(params);
        this.REQUEST = request;
        this.SUCCESS = success;
        this.FAILURE = failure;
        this.ERROR = error;
        this.BODY = body;
    }

    public static RestClientBuilder builder() {
        return new RestClientBuilder();
    }
}

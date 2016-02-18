package fassetar.blogger.webapi.android;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.android.MainThreadExecutor;

public class BloggerApi {

    /**
     * Main Spotify Web API endpoint
     */
    public static final String BLOGGER_WEB_API_ENDPOINT = "https://api.spotify.com/v1";

    private final BloggerService mBloggerService;

    /**
     * Create instance of BloggerApi with given executors.
     *
     * @param httpExecutor executor for http request. Cannot be null.
     * @param callbackExecutor executor for callbacks. If null is passed than the same
     *                         thread that created the instance is used.
     */
    public BloggerApi(Executor httpExecutor, Executor callbackExecutor) {
        mBloggerService = init(httpExecutor, callbackExecutor);
    }

    private BloggerService init(Executor httpExecutor, Executor callbackExecutor) {

        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.BASIC)
                .setExecutors(httpExecutor, callbackExecutor)
                .setEndpoint(BLOGGER_WEB_API_ENDPOINT)
                .build();

         return restAdapter.create(BloggerService.class);
    }

    /**
     *  New instance of BloggerApi,
     *  with single thread executor both for http and callbacks.
     */
    public BloggerApi() {
        Executor httpExecutor = Executors.newSingleThreadExecutor();
        MainThreadExecutor callbackExecutor = new MainThreadExecutor();
        mBloggerService = init(httpExecutor, callbackExecutor);
    }

    /**
     * @return The BloggerApi instance
     */
    public BloggerService getService() {
        return mBloggerService;
    }
}

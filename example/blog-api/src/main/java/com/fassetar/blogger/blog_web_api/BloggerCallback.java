//package com.fassetar.blogger.blog_web_api;
//
//import retrofit.Callback;
//import retrofit.RetrofitError;
//
///**
// * A convenience object converting {@link retrofit.RetrofitError}s to {@link BloggerError}s
// * in the error callbacks.
// *
// * <pre>{@code
// * spotify.getMySavedTracks(new BloggerCallback<Pager<SavedTrack>>() {
// *     public void success(Pager&lt;SavedTrack&gt; savedTrackPager, Response response) {
// *         // handle successful response
// *     }
// *
// *     public void failure(BloggerError error) {
// *         // handle error
// *     }
// * });
// * }</pre>
// *
// * @param <T> expected response type
// * @see retrofit.Callback
// */
//public abstract class BloggerCallback<T> implements Callback<T> {
//    //public abstract void failure(BloggerError error);
//
////    @Override
////    public void failure(RetrofitError error) {
////        failure(BloggerError.fromRetrofitError(error));
////    }
//}

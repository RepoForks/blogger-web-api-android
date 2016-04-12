//package com.fassetar.blogger.blog_web_api;
//
//import com.fassetar.blogger.blog_web_api.models.*;
//import retrofit.RetrofitError;
//
//public class BloggerError extends Exception {
//
//    private final RetrofitError mRetrofitError;
//    private final ErrorDetails mErrorDetails;
//
//    public static BloggerError fromRetrofitError(RetrofitError error) {
//        ErrorResponse errorResponse = (ErrorResponse) error.getBodyAs(ErrorResponse.class);
//
//        if (errorResponse != null && errorResponse.error != null) {
//            String message = errorResponse.error.status + " " + errorResponse.error.message;
//            return new BloggerError(error, errorResponse.error, message);
//        } else {
//            return new BloggerError(error);
//        }
//    }
//
//    public BloggerError(RetrofitError retrofitError, ErrorDetails errorDetails, String message) {
//        super(message, retrofitError);
//        mRetrofitError = retrofitError;
//        mErrorDetails = errorDetails;
//    }
//
//    public BloggerError(RetrofitError retrofitError) {
//        super(retrofitError);
//        mRetrofitError = retrofitError;
//        mErrorDetails = null;
//    }
//
//    /**
//     * @return the original {@link retrofit.RetrofitError} that was returned for this request.
//     */
//    public RetrofitError getRetrofitError() {
//        return mRetrofitError;
//    }
//
//    /**
//     * @return true if there are {@link com.fassetar.blogger.blog_web_api.models.ErrorDetails}
//     * associated with this error. False otherwise.
//     */
//    public boolean hasErrorDetails() {
//        return mErrorDetails != null;
//    }
//
//    /**
//     * @return Details returned from the Web API associated with this error if present.
//     */
//    public ErrorDetails getErrorDetails() {
//        return mErrorDetails;
//    }
//}

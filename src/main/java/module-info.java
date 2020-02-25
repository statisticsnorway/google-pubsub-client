module no.ssb.gcloud.pubsub {
    requires gax;
    requires com.google.api.apicommon;
    requires google.cloud.pubsub;
    requires proto.google.cloud.pubsub.v1;
    requires com.google.auth.oauth2;
    requires com.google.auth;
    requires gax.grpc;
    requires grpc.api;

    exports no.ssb.pubsub;
}
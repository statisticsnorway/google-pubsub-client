module no.ssb.gcloud.pubsub {
    requires gax;
    requires com.google.api.apicommon;
    requires google.cloud.pubsub;
    requires proto.google.cloud.pubsub.v1;
    requires com.google.auth.oauth2;
    requires com.google.auth;
    requires gax.grpc.and.proto.google.common.protos;
    requires io.grpc;
    requires org.slf4j;

    exports no.ssb.pubsub;
}
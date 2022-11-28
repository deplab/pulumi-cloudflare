// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerRuleFixedResponse {
    private @Nullable String contentType;
    private @Nullable String location;
    private @Nullable String messageBody;
    private @Nullable Integer statusCode;

    private LoadBalancerRuleFixedResponse() {}
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> messageBody() {
        return Optional.ofNullable(this.messageBody);
    }
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerRuleFixedResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String location;
        private @Nullable String messageBody;
        private @Nullable Integer statusCode;
        public Builder() {}
        public Builder(LoadBalancerRuleFixedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.location = defaults.location;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder messageBody(@Nullable String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public LoadBalancerRuleFixedResponse build() {
            final var o = new LoadBalancerRuleFixedResponse();
            o.contentType = contentType;
            o.location = location;
            o.messageBody = messageBody;
            o.statusCode = statusCode;
            return o;
        }
    }
}

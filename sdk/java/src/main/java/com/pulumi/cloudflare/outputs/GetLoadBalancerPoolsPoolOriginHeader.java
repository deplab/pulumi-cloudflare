// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerPoolsPoolOriginHeader {
    private String header;
    private List<String> values;

    private GetLoadBalancerPoolsPoolOriginHeader() {}
    public String header() {
        return this.header;
    }
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerPoolsPoolOriginHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String header;
        private List<String> values;
        public Builder() {}
        public Builder(GetLoadBalancerPoolsPoolOriginHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder header(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetLoadBalancerPoolsPoolOriginHeader build() {
            final var o = new GetLoadBalancerPoolsPoolOriginHeader();
            o.header = header;
            o.values = values;
            return o;
        }
    }
}

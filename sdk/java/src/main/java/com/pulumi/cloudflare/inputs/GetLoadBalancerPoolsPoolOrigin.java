// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetLoadBalancerPoolsPoolOriginHeader;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadBalancerPoolsPoolOrigin extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerPoolsPoolOrigin Empty = new GetLoadBalancerPoolsPoolOrigin();

    @Import(name="address", required=true)
    private String address;

    public String address() {
        return this.address;
    }

    /**
     * Whether this pool is enabled. Disabled pools will not receive traffic and are excluded from health checks.
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return Whether this pool is enabled. Disabled pools will not receive traffic and are excluded from health checks.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="headers")
    private @Nullable List<GetLoadBalancerPoolsPoolOriginHeader> headers;

    public Optional<List<GetLoadBalancerPoolsPoolOriginHeader>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A regular expression matching the name of the Load Balancer pool to lookup.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return A regular expression matching the name of the Load Balancer pool to lookup.
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="weight")
    private @Nullable Double weight;

    public Optional<Double> weight() {
        return Optional.ofNullable(this.weight);
    }

    private GetLoadBalancerPoolsPoolOrigin() {}

    private GetLoadBalancerPoolsPoolOrigin(GetLoadBalancerPoolsPoolOrigin $) {
        this.address = $.address;
        this.enabled = $.enabled;
        this.headers = $.headers;
        this.name = $.name;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerPoolsPoolOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerPoolsPoolOrigin $;

        public Builder() {
            $ = new GetLoadBalancerPoolsPoolOrigin();
        }

        public Builder(GetLoadBalancerPoolsPoolOrigin defaults) {
            $ = new GetLoadBalancerPoolsPoolOrigin(Objects.requireNonNull(defaults));
        }

        public Builder address(String address) {
            $.address = address;
            return this;
        }

        /**
         * @param enabled Whether this pool is enabled. Disabled pools will not receive traffic and are excluded from health checks.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder headers(@Nullable List<GetLoadBalancerPoolsPoolOriginHeader> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(GetLoadBalancerPoolsPoolOriginHeader... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param name A regular expression matching the name of the Load Balancer pool to lookup.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder weight(@Nullable Double weight) {
            $.weight = weight;
            return this;
        }

        public GetLoadBalancerPoolsPoolOrigin build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

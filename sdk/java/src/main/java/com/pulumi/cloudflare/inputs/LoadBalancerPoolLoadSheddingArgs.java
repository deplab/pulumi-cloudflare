// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPoolLoadSheddingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPoolLoadSheddingArgs Empty = new LoadBalancerPoolLoadSheddingArgs();

    /**
     * Percent of traffic to shed 0 - 100.
     * 
     */
    @Import(name="defaultPercent")
    private @Nullable Output<Double> defaultPercent;

    /**
     * @return Percent of traffic to shed 0 - 100.
     * 
     */
    public Optional<Output<Double>> defaultPercent() {
        return Optional.ofNullable(this.defaultPercent);
    }

    /**
     * Method of shedding traffic &#34;&#34;, &#34;hash&#34; or &#34;random&#34;.
     * 
     */
    @Import(name="defaultPolicy")
    private @Nullable Output<String> defaultPolicy;

    /**
     * @return Method of shedding traffic &#34;&#34;, &#34;hash&#34; or &#34;random&#34;.
     * 
     */
    public Optional<Output<String>> defaultPolicy() {
        return Optional.ofNullable(this.defaultPolicy);
    }

    /**
     * Percent of session traffic to shed 0 - 100.
     * 
     */
    @Import(name="sessionPercent")
    private @Nullable Output<Double> sessionPercent;

    /**
     * @return Percent of session traffic to shed 0 - 100.
     * 
     */
    public Optional<Output<Double>> sessionPercent() {
        return Optional.ofNullable(this.sessionPercent);
    }

    /**
     * Method of shedding session traffic &#34;&#34; or &#34;hash&#34;.
     * 
     */
    @Import(name="sessionPolicy")
    private @Nullable Output<String> sessionPolicy;

    /**
     * @return Method of shedding session traffic &#34;&#34; or &#34;hash&#34;.
     * 
     */
    public Optional<Output<String>> sessionPolicy() {
        return Optional.ofNullable(this.sessionPolicy);
    }

    private LoadBalancerPoolLoadSheddingArgs() {}

    private LoadBalancerPoolLoadSheddingArgs(LoadBalancerPoolLoadSheddingArgs $) {
        this.defaultPercent = $.defaultPercent;
        this.defaultPolicy = $.defaultPolicy;
        this.sessionPercent = $.sessionPercent;
        this.sessionPolicy = $.sessionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPoolLoadSheddingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPoolLoadSheddingArgs $;

        public Builder() {
            $ = new LoadBalancerPoolLoadSheddingArgs();
        }

        public Builder(LoadBalancerPoolLoadSheddingArgs defaults) {
            $ = new LoadBalancerPoolLoadSheddingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultPercent Percent of traffic to shed 0 - 100.
         * 
         * @return builder
         * 
         */
        public Builder defaultPercent(@Nullable Output<Double> defaultPercent) {
            $.defaultPercent = defaultPercent;
            return this;
        }

        /**
         * @param defaultPercent Percent of traffic to shed 0 - 100.
         * 
         * @return builder
         * 
         */
        public Builder defaultPercent(Double defaultPercent) {
            return defaultPercent(Output.of(defaultPercent));
        }

        /**
         * @param defaultPolicy Method of shedding traffic &#34;&#34;, &#34;hash&#34; or &#34;random&#34;.
         * 
         * @return builder
         * 
         */
        public Builder defaultPolicy(@Nullable Output<String> defaultPolicy) {
            $.defaultPolicy = defaultPolicy;
            return this;
        }

        /**
         * @param defaultPolicy Method of shedding traffic &#34;&#34;, &#34;hash&#34; or &#34;random&#34;.
         * 
         * @return builder
         * 
         */
        public Builder defaultPolicy(String defaultPolicy) {
            return defaultPolicy(Output.of(defaultPolicy));
        }

        /**
         * @param sessionPercent Percent of session traffic to shed 0 - 100.
         * 
         * @return builder
         * 
         */
        public Builder sessionPercent(@Nullable Output<Double> sessionPercent) {
            $.sessionPercent = sessionPercent;
            return this;
        }

        /**
         * @param sessionPercent Percent of session traffic to shed 0 - 100.
         * 
         * @return builder
         * 
         */
        public Builder sessionPercent(Double sessionPercent) {
            return sessionPercent(Output.of(sessionPercent));
        }

        /**
         * @param sessionPolicy Method of shedding session traffic &#34;&#34; or &#34;hash&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sessionPolicy(@Nullable Output<String> sessionPolicy) {
            $.sessionPolicy = sessionPolicy;
            return this;
        }

        /**
         * @param sessionPolicy Method of shedding session traffic &#34;&#34; or &#34;hash&#34;.
         * 
         * @return builder
         * 
         */
        public Builder sessionPolicy(String sessionPolicy) {
            return sessionPolicy(Output.of(sessionPolicy));
        }

        public LoadBalancerPoolLoadSheddingArgs build() {
            return $;
        }
    }

}
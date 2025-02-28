// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PageRuleActionsForwardingUrl {
    /**
     * @return The status code to use for the redirection.
     * 
     */
    private Integer statusCode;
    /**
     * @return The URL to which the page rule should forward.
     * 
     */
    private String url;

    private PageRuleActionsForwardingUrl() {}
    /**
     * @return The status code to use for the redirection.
     * 
     */
    public Integer statusCode() {
        return this.statusCode;
    }
    /**
     * @return The URL to which the page rule should forward.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PageRuleActionsForwardingUrl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer statusCode;
        private String url;
        public Builder() {}
        public Builder(PageRuleActionsForwardingUrl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCode = defaults.statusCode;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder statusCode(Integer statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public PageRuleActionsForwardingUrl build() {
            final var o = new PageRuleActionsForwardingUrl();
            o.statusCode = statusCode;
            o.url = url;
            return o;
        }
    }
}

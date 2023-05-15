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
public final class ListItemRedirect {
    /**
     * @return Whether the redirect also matches subdomains of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String includeSubdomains;
    /**
     * @return Whether to preserve the path suffix when doing subpath matching. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String preservePathSuffix;
    /**
     * @return Whether the redirect target url should keep the query string of the request&#39;s url. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String preserveQueryString;
    /**
     * @return The source url of the redirect.
     * 
     */
    private String sourceUrl;
    /**
     * @return The status code to be used when redirecting a request.
     * 
     */
    private @Nullable Integer statusCode;
    /**
     * @return Whether the redirect also matches subpaths of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String subpathMatching;
    /**
     * @return The target url of the redirect.
     * 
     */
    private String targetUrl;

    private ListItemRedirect() {}
    /**
     * @return Whether the redirect also matches subdomains of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> includeSubdomains() {
        return Optional.ofNullable(this.includeSubdomains);
    }
    /**
     * @return Whether to preserve the path suffix when doing subpath matching. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> preservePathSuffix() {
        return Optional.ofNullable(this.preservePathSuffix);
    }
    /**
     * @return Whether the redirect target url should keep the query string of the request&#39;s url. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> preserveQueryString() {
        return Optional.ofNullable(this.preserveQueryString);
    }
    /**
     * @return The source url of the redirect.
     * 
     */
    public String sourceUrl() {
        return this.sourceUrl;
    }
    /**
     * @return The status code to be used when redirecting a request.
     * 
     */
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    /**
     * @return Whether the redirect also matches subpaths of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> subpathMatching() {
        return Optional.ofNullable(this.subpathMatching);
    }
    /**
     * @return The target url of the redirect.
     * 
     */
    public String targetUrl() {
        return this.targetUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListItemRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String includeSubdomains;
        private @Nullable String preservePathSuffix;
        private @Nullable String preserveQueryString;
        private String sourceUrl;
        private @Nullable Integer statusCode;
        private @Nullable String subpathMatching;
        private String targetUrl;
        public Builder() {}
        public Builder(ListItemRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.preservePathSuffix = defaults.preservePathSuffix;
    	      this.preserveQueryString = defaults.preserveQueryString;
    	      this.sourceUrl = defaults.sourceUrl;
    	      this.statusCode = defaults.statusCode;
    	      this.subpathMatching = defaults.subpathMatching;
    	      this.targetUrl = defaults.targetUrl;
        }

        @CustomType.Setter
        public Builder includeSubdomains(@Nullable String includeSubdomains) {
            this.includeSubdomains = includeSubdomains;
            return this;
        }
        @CustomType.Setter
        public Builder preservePathSuffix(@Nullable String preservePathSuffix) {
            this.preservePathSuffix = preservePathSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder preserveQueryString(@Nullable String preserveQueryString) {
            this.preserveQueryString = preserveQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        @CustomType.Setter
        public Builder subpathMatching(@Nullable String subpathMatching) {
            this.subpathMatching = subpathMatching;
            return this;
        }
        @CustomType.Setter
        public Builder targetUrl(String targetUrl) {
            this.targetUrl = Objects.requireNonNull(targetUrl);
            return this;
        }
        public ListItemRedirect build() {
            final var o = new ListItemRedirect();
            o.includeSubdomains = includeSubdomains;
            o.preservePathSuffix = preservePathSuffix;
            o.preserveQueryString = preserveQueryString;
            o.sourceUrl = sourceUrl;
            o.statusCode = statusCode;
            o.subpathMatching = subpathMatching;
            o.targetUrl = targetUrl;
            return o;
        }
    }
}
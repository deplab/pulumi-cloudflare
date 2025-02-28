// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessApplicationResult {
    /**
     * @return The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    private @Nullable String accountId;
    /**
     * @return Application Audience (AUD) Tag of the application.
     * 
     */
    private String aud;
    /**
     * @return The primary hostname and path that Access will secure. Must provide only one of `name`, `domain`.
     * 
     */
    private String domain;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Friendly name of the Access Application. Must provide only one of `name`, `domain`.
     * 
     */
    private String name;
    /**
     * @return The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    private @Nullable String zoneId;

    private GetAccessApplicationResult() {}
    /**
     * @return The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * @return Application Audience (AUD) Tag of the application.
     * 
     */
    public String aud() {
        return this.aud;
    }
    /**
     * @return The primary hostname and path that Access will secure. Must provide only one of `name`, `domain`.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Friendly name of the Access Application. Must provide only one of `name`, `domain`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessApplicationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountId;
        private String aud;
        private String domain;
        private String id;
        private String name;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetAccessApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.aud = defaults.aud;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder aud(String aud) {
            this.aud = Objects.requireNonNull(aud);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public GetAccessApplicationResult build() {
            final var o = new GetAccessApplicationResult();
            o.accountId = accountId;
            o.aud = aud;
            o.domain = domain;
            o.id = id;
            o.name = name;
            o.zoneId = zoneId;
            return o;
        }
    }
}
